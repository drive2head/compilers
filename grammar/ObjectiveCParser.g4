/*
Objective-C grammar.
The MIT License (MIT).
Copyright (c) 2016-2017, Alex Petuschak (alex@swiftify.io).
Copyright (c) 2016-2017, Ivan Kochurkin (kvanttt@gmail.com).
Converted to ANTLR 4 by Terence Parr; added @property and a few others.
Updated June 2014, Carlos Mejia.  Fix try-catch, add support for @( @{ @[ and blocks
June 2008 Cedric Cuche
Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:
The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.
THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
*/

parser grammar ObjectiveCParser;

options { tokenVocab=ObjectiveCLexer; }

translationUnit
    : topLevelDeclaration* EOF
    ;

topLevelDeclaration
    : functionDeclaration
    | declaration
    | functionDefinition
    ;

protocolList
    : protocolName (',' protocolName)*
    ;

protocolName
    : LT protocolList GT
    | ('__covariant' | '__contravariant')?  identifier
    ;

selector
    : identifier
    | 'return'
    ;

blockType
    : nullabilitySpecifier? typeSpecifier nullabilitySpecifier? LP '^' (nullabilitySpecifier | typeSpecifier)? RP blockParameters?
    ;

dictionaryExpression
    : '@' '{' (dictionaryPair (',' dictionaryPair)* ','?)? '}'
    ;

dictionaryPair
    : castExpression ':' expression
    ;

arrayExpression
    : '@' '[' (expressions ','?)? ']'
    ;

blockParameters
    : LP ((typeVariableDeclaratorOrName | 'void') (',' typeVariableDeclaratorOrName)*)? RP
    ;

typeVariableDeclaratorOrName
    : typeVariableDeclarator
    | typeName
    ;

blockExpression
    : '^' typeSpecifier? nullabilitySpecifier? blockParameters? block
    ;

messageExpression
    : '[' receiver messageSelector ']'
    ;

receiver
    : expression
    | typeSpecifier
    ;

messageSelector
    : selector
    | keywordArgument+
    ;

keywordArgument
    : selector? ':' keywordArgumentType (',' keywordArgumentType)*
    ;

keywordArgumentType
    : expressions nullabilitySpecifier? ('{' initializerList '}')?
    ;

selectorExpression
    : '@selector' LP selectorName RP
    ;

selectorName
    : selector
    | (selector? ':')+
    ;

protocolExpression
    : '@protocol' LP protocolName RP
    ;

encodeExpression
    : '@encode' LP typeName RP
    ;

typeVariableDeclarator
    : declarationSpecifiers declarator
    ;

throwStatement
    : '@throw' LP identifier RP
    | '@throw' expression
    ;

tryBlock
    : '@try' tryStatement=block catchStatement* ('@finally' finallyStatement=block)?
    ;

catchStatement
    : '@catch' LP typeVariableDeclarator RP block
    ;

synchronizedStatement
    : '@synchronized' LP expression RP block
    ;

autoreleaseStatement
    : '@autoreleasepool' block
    ;

functionDeclaration
    : functionSignature ';'
    ;

functionDefinition
    : functionSignature block
    ;

functionSignature
    : declarationSpecifiers? identifier (LP parameterList? RP) attributeSpecifier?
    ;

attribute
    : attributeName attributeParameters?
    ;

attributeName
    : 'const'
    | identifier
    ;

attributeParameters
    : LP attributeParameterList? RP
    ;

attributeParameterList
    : attributeParameter (',' attributeParameter)*
    ;

attributeParameter
    : attribute
    | constant
    | stringLiteral
    | attributeParameterAssignment
    ;

attributeParameterAssignment
    : attributeName '=' (constant | attributeName | stringLiteral)
    ;

declaration
    : functionCallExpression
    | enumDeclaration
    | varDeclaration
    | typedefDeclaration
    ;

functionCallExpression
    : attributeSpecifier? identifier attributeSpecifier? LP directDeclarator RP ';'
    ;

enumDeclaration
    : attributeSpecifier? TYPEDEF? enumSpecifier identifier? ';'
    ;

varDeclaration
    : (declarationSpecifiers initDeclaratorList | declarationSpecifiers) ';'
    ;

typedefDeclaration
    : attributeSpecifier? TYPEDEF (declarationSpecifiers typeDeclaratorList | declarationSpecifiers) ';'
    ;

typeDeclaratorList
    : typeDeclarator (',' typeDeclarator)*
    ;

typeDeclarator
    : pointer? directDeclarator
    ;

declarationSpecifiers
    : (storageClassSpecifier
    | attributeSpecifier
    | arcBehaviourSpecifier
    | ibOutletQualifier
    | typePrefix
    | typeQualifier
//    | typeSpecifier)+
    | typeSpecifier)
    ;

attributeSpecifier
    : '__attribute__' LP LP attribute (',' attribute)* RP RP
    ;

initDeclaratorList
    : initDeclarator (',' initDeclarator)*
    ;

initDeclarator
    : declarator ('=' initializer)?
    ;

specifierQualifierList
    : (arcBehaviourSpecifier
    | nullabilitySpecifier
    | ibOutletQualifier
    | typePrefix
    | typeQualifier
    | typeSpecifier)+
    ;

ibOutletQualifier
    : IB_OUTLET_COLLECTION LP identifier RP
    | IB_OUTLET
    ;

arcBehaviourSpecifier
    : WEAK_QUALIFIER
    | STRONG_QUALIFIER
    | AUTORELEASING_QUALIFIER
    | UNSAFE_UNRETAINED_QUALIFIER
    ;

nullabilitySpecifier
    : NULL_UNSPECIFIED
    | NULLABLE
    | NONNULL
    | NULL_RESETTABLE
    ;

storageClassSpecifier
    : AUTO
    | REGISTER
    | STATIC
    | EXTERN
    ;

typePrefix
    : BRIDGE
    | BRIDGE_TRANSFER
    | BRIDGE_RETAINED
    | BLOCK
    | INLINE
    | NS_INLINE
    | KINDOF
    ;

typeQualifier
    : CONST
    | VOLATILE
    | RESTRICT
    | protocolQualifier
    ;

protocolQualifier
    : 'in'
    | 'out'
    | 'inout'
    | 'bycopy'
    | 'byref'
    | 'oneway'
    ;

typeSpecifier
    : 'void'
    | 'char'
    | 'short'
    | 'int'
    | 'long'
    | 'float'
    | 'double'
    | 'signed'
    | 'unsigned'
    | typeofExpression
    | identifier pointer?
    ;

typeofExpression
    : TYPEOF (LP expression RP)
    ;

enumSpecifier
    : 'enum' (identifier? ':' typeName)? (identifier ('{' enumeratorList '}')? | '{' enumeratorList '}')
    | ('NS_OPTIONS' | 'NS_ENUM') LP typeName ',' identifier RP '{' enumeratorList '}'
    ;

enumeratorList
    : enumerator (',' enumerator)* ','?
    ;

enumerator
    : enumeratorIdentifier ('=' expression)?
    ;

enumeratorIdentifier
    : identifier
    | 'default'
    ;

directDeclarator
    : (identifier | LP declarator RP) declaratorSuffix*
    | LP '^' nullabilitySpecifier? identifier? RP blockParameters
    ;

declaratorSuffix
    : '[' constantExpression? ']'
    ;

parameterList
    : parameterDeclarationList (',' '...')?
    ;

pointer
    : '*' declarationSpecifiers? pointer?
    ;

arrayInitializer
    : '{' (expressions ','?)? '}'
    ;

structInitializer
    : '{' ('.' expression (',' '.' expression)* ','?)? '}'
    ;

initializerList
    : initializer (',' initializer)* ','?
    ;

typeName
    : specifierQualifierList abstractDeclarator?
    | blockType
    ;

abstractDeclarator
    : pointer abstractDeclarator?
    | LP abstractDeclarator? RP abstractDeclaratorSuffix+
    | ('[' constantExpression? ']')+
    ;

abstractDeclaratorSuffix
    : '[' constantExpression? ']'
    | LP parameterDeclarationList? RP
    ;

parameterDeclarationList
    : parameterDeclaration (',' parameterDeclaration)*
    ;

parameterDeclaration
    : declarationSpecifiers declarator
    | 'void'
    ;

declarator
    : pointer? directDeclarator
    ;

statement
    : labeledStatement ';'?
    | block ';'?
    | conditionStatement ';'?
    | iterationStatement ';'?
    | jumpStatement ';'?
    | synchronizedStatement ';'?
    | autoreleaseStatement ';'?
    | throwStatement ';'?
    | tryBlock ';'?
    | expressions ';'?
    | ';'
    ;

labeledStatement
    : identifier ':' statement
    ;

rangeExpression
    :  constantExpression ('...' constantExpression)?
    ;

block
    : '{' (declaration | statement)* '}'
    ;

conditionStatement
    : IF LP expression RP ifBody=statement (ELSE elseBody=statement)?
    | switchStatement
    ;

switchStatement
    : 'switch' LP expression RP switchBlock
    ;

switchBlock
    : '{' switchSection* '}'
    ;

switchSection
    : switchLabel+ statement+
    ;

switchLabel
    : 'case' (rangeExpression | LP rangeExpression RP) ':'
    | 'default' ':'
    ;

iterationStatement
    : whileStatement
    | doStatement
    | forStatement
    | forInStatement
    ;

whileStatement
    : 'while' LP expression RP statement
    ;

doStatement
    : 'do' statement 'while' LP expression RP ';'
    ;

forStatement
    : 'for' LP forLoopInitializer? ';' expression? ';' expressions? RP statement
    ;

forLoopInitializer
    : declarationSpecifiers initDeclaratorList
    | expressions
    ;

forInStatement
    : 'for' LP typeVariableDeclarator 'in' expression? RP statement
    ;

jumpStatement
    : GOTO identifier
    | CONTINUE
    | BREAK
    | RETURN expression?
    ;

expressions
    : expression (',' expression)*
    ;

expression
    : castExpression

    | expression op=(MUL | DIV | MOD) expression
    | expression op=(ADD | SUB) expression
    | expression (LT LT | GT GT) expression
    | expression op=(LE | GE | LT | GT) expression
    | expression op=(NOTEQUAL | EQUAL) expression
    | expression op=BITAND expression
    | expression op=BITXOR expression
    | expression op=BITOR expression
    | expression op=AND expression
    | expression op=OR expression

    | expression QUESTION trueExpression=expression? COLON falseExpression=expression
    | LP block RP

    | unaryExpression assignmentOperator assignmentExpression=expression
    ;

assignmentOperator
    : '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|='
    ;

castExpression
    : unaryExpression
    | (LP typeName RP) (castExpression | initializer)
    ;

initializer
    : expression
    | arrayInitializer
    | structInitializer
    ;

constantExpression
    : identifier
    | constant
    ;

unaryExpression
    : postfixExpression
    | op=(INC | DEC) unaryExpression
    | unaryOperator castExpression
    ;

unaryOperator
    : '&'
    | '*'
    | '+'
    | '-'
    | '~'
    | BANG
    ;

functionCall: primaryExpression LP argumentExpressionList? RP;

functionCallWithFunctionCallsArgs: primaryExpression LP argumentExpressionListWithFunctionCalls RP;

postfixExpression
    :
    functionCallWithFunctionCallsArgs
    | functionCall
    | primaryExpression postfix*
    | postfixExpression (DOT | STRUCTACCESS) identifier postfix*  // TODO: get rid of property and postfix expression.
    ;

postfix
    : LBRACK expression RBRACK
    | LP argumentExpressionList? RP
    | LP (COMMA | macroArguments+=~RP)+ RP
    | op=(INC | DEC)
    ;

argumentExpressionList
    : argumentExpression (',' argumentExpression)*
    ;

argumentExpressionListWithFunctionCalls:
    functionCall (',' argumentExpression)*
    | argumentExpression (',' argumentExpression)* (',' functionCall)+ (',' argumentExpression)* ;

argumentExpression
    : expression
    | typeSpecifier
    ;

primaryExpression
    : identifier
    | constant
    | stringLiteral
    | LP expression RP
    | messageExpression
    | selectorExpression
    | protocolExpression
    | encodeExpression
    | dictionaryExpression
    | arrayExpression
    | blockExpression
    ;

constant
    : HEX_LITERAL
    | OCTAL_LITERAL
    | BINARY_LITERAL
    | ('+' | '-')? DECIMAL_LITERAL
    | ('+' | '-')? FLOATING_POINT_LITERAL
    | CHARACTER_LITERAL
    | NIL
    | NULL_
    | YES
    | NO
    | TRUE
    | FALSE
    ;

stringLiteral
    : (STRING_START (STRING_VALUE | STRING_NEWLINE)* STRING_END)+
    ;

identifier
    : IDENTIFIER
    | BOOL
    | Class
    | BYCOPY
    | BYREF
    | ID
    | IMP
    | IN
    | INOUT
    | ONEWAY
    | OUT
    | PROTOCOL_
    | SEL
    | SELF
    | SUPER
    | ATOMIC
    | NONATOMIC
    | RETAIN

    | AUTORELEASING_QUALIFIER
    | BLOCK
    | BRIDGE_RETAINED
    | BRIDGE_TRANSFER
    | COVARIANT
    | CONTRAVARIANT
    | DEPRECATED
    | KINDOF
    | UNUSED

    | NS_INLINE
    | NS_ENUM
    | NS_OPTIONS

    | NULL_UNSPECIFIED
    | NULLABLE
    | NONNULL
    | NULL_RESETTABLE

    | ASSIGN
    | COPY
    | GETTER
    | SETTER
    | STRONG
    | READONLY
    | READWRITE
    | WEAK
    | UNSAFE_UNRETAINED

    | IB_OUTLET
    | IB_OUTLET_COLLECTION
    | IB_INSPECTABLE
    | IB_DESIGNABLE
    ;