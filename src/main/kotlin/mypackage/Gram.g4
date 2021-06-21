grammar Gram ;
//WS : [ \t\r\n]+ -> skip ;

//// A1. Types

typeParameters :
	'<' typeParameterList '>' ;

typeParameterList :
	typeParameter
	| typeParameterList ',' typeParameter ;

typeParameter :
	identifier constraint? ;

constraint :
	'extends' type ;

typeArguments :
	'<' typeArgumentList '>' ;

typeArgumentList :
	typeArgument
	| typeArgumentList ',' typeArgument ;

typeArgument :
	type ;

type :
	primaryOrUnionType
	| functionType
//	| constructorType
	;

primaryOrUnionType :
	primaryType
	| unionType
	;

primaryType :
	parenthesizedType
	| predefinedType
	| typeReference
	| objectType
	| arrayType
//	| tupleType
	| typeQuery
	;

parenthesizedType :
	'(' type ')' ;

predefinedType :
	'any'
	| 'number'
	| 'boolean'
	| 'string'
	| 'void'
	;

typeReference :
	typeName typeArguments? ;

typeName :
	identifier ;

objectType :
	'{'   typeBody?   '}' ;

typeBody :
	typeMemberList ';'? ;

typeMemberList :
	typeMember
	| typeMemberList ';' typeMember
	;

typeMember :
	propertySignature
	| callSignature
	| constructSignature
	| indexSignature
	| methodSignature
	;

arrayType :
	primaryType '[' ']' ;

unionType :
	primaryOrUnionType '|' primaryType ;

functionType :
	typeParameters? '(' parameterList? ')' '=>' type ;

typeQuery :
	'typeof' typeQueryExpression ;

typeQueryExpression :
	identifier
	| typeQueryExpression '.' identifierName ;

propertySignature :
	propertyName '?'? typeAnnotation? ;

propertyName :
	identifierName
	| StringLiteral
	| NumericLiteral ;

callSignature :
	typeParameters? '(' parameterList? ')' typeAnnotation? ;

parameterList :
	requiredParameterList
	| optionalParameterList
	| restParameter
	| requiredParameterList ',' optionalParameterList
	| requiredParameterList ',' restParameter
	| optionalParameterList ',' restParameter
	| requiredParameterList ',' optionalParameterList ',' restParameter ;

requiredParameterList :
	requiredParameter
	| requiredParameterList ',' requiredParameter ;

requiredParameter :
	AccessibilityModifier? identifier typeAnnotation?
	| identifier ':' StringLiteral ;

AccessibilityModifier :
	'public'
	| 'private'
	| 'protected' ;

optionalParameterList :
	optionalParameter
	| optionalParameterList ',' optionalParameter ;

optionalParameter :
	AccessibilityModifier? identifier '?' typeAnnotation?
	| AccessibilityModifier? identifier typeAnnotation? initializer
	| identifier '?' ':' StringLiteral ;

restParameter :
	'...' identifier typeAnnotation? ;

constructSignature :
	'new' typeParameters? '(' parameterList? ')' typeAnnotation? ;

indexSignature :
	'[' identifier ':' 'string' ']' typeAnnotation
	| '[' identifier ':' 'number' ']' typeAnnotation ;

methodSignature :
	propertyName   '?'?   callSignature ;

typeAliasDeclaration :
	'type' identifier '=' type ';' ;

///// A2. Expressions
propertyAssignment : // (Modified)
	propertyName ':' arrowFunctionExpression
	| propertyName callSignature '{' functionBody '}'
	| getAccessor
	| setAccessor ;

getAccessor :
	'get' propertyName '(' ')' typeAnnotation? '{' functionBody '}' ;

setAccessor:
	'set' propertyName '(' identifier typeAnnotation? ')' '{' functionBody '}' ;

elementList : // (Modified)
	elision?  assignmentExpression
	| elision?  spreadElement
	| elementList ',' elision? assignmentExpression
	| elementList ',' elision? spreadElement ;

elision :		// несколько подряд идущих запятых? шта?
	',' |
	elision ',' ;


spreadElement :
	'...' assignmentExpression ;

callExpression : // (Modified)
//	'super' '(' argumentList? ')'
    'super' '(' ')' // бич варик
	| 'super' '.' identifierName ;

functionExpression : // (Modified)
	'function' identifier? callSignature '{' functionBody '}' ;

// assignmentExpression : // (Modified)
//	arrowFunctionExpression ;
// // МОДИФАЙД БЛЭТ (заменили в TS части assignmentExpression на arrowFunctionExpression сразу)

arrowFunctionExpression :
	arrowFormalParameters '=>' block
	| arrowFormalParameters '=>' arrowFunctionExpression ;

block : '{' statementList? '}' ;

arrowFormalParameters :
	callSignature
	| identifier ;

arguments : // (Modified)
//	typeArguments? '(' argumentList? ')' ;
    typeArguments? '(' ')' ; // бич варик

unaryExpression : // (Modified)
	'<' type '>' unaryExpression ;

//// A3 - A6
variableDeclaration :
    simpleVariableDeclaration
    | destructuringVariableDeclaration ;

simpleVariableDeclaration :
    identifier typeAnnotation? initializer? ;

typeAnnotation :
    ':' type ;

destructuringVariableDeclaration :
    bindingPattern typeAnnotation? initializer ;

bindingPattern :
    objectBindingPattern
    | arrayBindingPattern ;

objectBindingPattern :
    '{' '}'
    | '{' bindingPropertyList ','? '}' ;

bindingPropertyList :
    bindingProperty
    | bindingPropertyList ',' bindingProperty ;

bindingProperty :
    identifier initializer?
    | propertyName ':' identifier initializer?
    | propertyName ':' bindingPattern initializer? ;

arrayBindingPattern :
    '[' elision? bindingRestElement? ']'
    | '[' bindingElementList ']'
    | '[' bindingElementList ',' elision? bindingRestElement? ']';

bindingElementList :
    elision? bindingElement
    | bindingElementList ',' elision? bindingElement ;

bindingElement :
    identifier initializer?
    | bindingPattern initializer? ;

bindingRestElement :
    '...' identifier ;

functionDeclaration :
    functionOverloads? functionImplementation ;

functionOverloads :
    functionOverload
    | functionOverloads functionOverload ;

functionOverload :
    'function' identifier callSignature ';' ;

functionImplementation :
    'function' identifier callSignature '{' functionBody '}' ;

interfaceDeclaration :
    'interface' identifier typeParameters? interfaceExtendsClause? objectType ;

interfaceExtendsClause :
    'extends' classOrInterfaceTypeList ;

classOrInterfaceTypeList :
    classOrInterfaceType
    | classOrInterfaceTypeList ',' classOrInterfaceType ;

classOrInterfaceType :
    typeReference ;


classDeclaration :
    'class' identifier typeParameters? classHeritage '{' classBody '}' ;

classHeritage :
    classExtendsClause? implementsClause? ;

classExtendsClause :
    'extends'  classType ;

classType :
    typeReference ;

implementsClause :
    'implements' classOrInterfaceTypeList ;

classBody :
    classElements? ;

classElements:
    classElement
    | classElements classElement ;

classElement:
    constructorDeclaration
    | propertyMemberDeclaration
    | indexMemberDeclaration ;

constructorDeclaration:
    constructorOverloads? constructorImplementation ;

constructorOverloads:
    constructorOverload
    | constructorOverloads constructorOverload ;

constructorOverload:
    AccessibilityModifier? 'constructor' '(' parameterList? ')' ';' ;

constructorImplementation:
    AccessibilityModifier? 'constructor' '(' parameterList? ')' '{' functionBody '}' ;

propertyMemberDeclaration:
    memberVariableDeclaration
    | memberFunctionDeclaration
    | memberAccessorDeclaration ;

memberVariableDeclaration:
    AccessibilityModifier? 'static'? propertyName typeAnnotation? initializer? ';' ;

memberFunctionDeclaration:
    memberFunctionOverloads? memberFunctionImplementation ;

memberFunctionOverloads:
    memberFunctionOverload
    | memberFunctionOverloads memberFunctionOverload ;

memberFunctionOverload:
    AccessibilityModifier? 'static'? propertyName callSignature ';' ;

memberFunctionImplementation:
    AccessibilityModifier? 'static'? propertyName callSignature '{' functionBody '}' ;

memberAccessorDeclaration:
    AccessibilityModifier? 'static'? getAccessor
    | AccessibilityModifier? 'static'? setAccessor ;

indexMemberDeclaration:
    indexSignature ';' ;

/////////// ES6

identifier :
//	identifierName | ~ReservedWord ; // ??
    identifierName ;

identifierName :
	identifierStart
	| identifierName identifierPart
	;

identifierStart :
    UnicodeIDStart
    | '$'
    | '_'
    | '\\' UnicodeEscapeSequence ;

identifierPart :
	| UnicodeIDContinue
	| '$'
	| '_'
	| '\\' UnicodeEscapeSequence
//	<ZWNJ>
//	<ZWJ>
    ;

ReservedWord :
	| Keyword
//	| FutureReservedWord
	| NullLiteral
	| BooleanLiteral
	;

Keyword :
	'break'
	| 'do'
	| 'in'
	| 'typeof'
	| 'case'
	| 'else'
	| 'instanceof'
	| 'var'
	| 'catch'
	| 'export'
	| 'new'
	| 'void'
	| 'class'
	| 'extends'
	| 'return'
	| 'while'
	| 'const'
	| 'finally'
	| 'super'
	| 'with'
	| 'continue'
	| 'for'
	| 'switch'
	| 'yield'
	| 'debugger'
	| 'function'
	| 'this'
	| 'default'
	| 'if'
	| 'throw'
	| 'delete'
	| 'import'
	| 'try'
	;

NullLiteral : 'null' ;
BooleanLiteral : 'true' | 'false' ;

functionBody : functionStatementList ;

functionStatementList : statementList? ;

statementList :
	statementListItem |
	statementList statementListItem ;

statementListItem :
	statement |
	declaration ;

statement :
	blockStatement |
//	variableStatement[?Yield] // это var a = 1 (вроде устаревшее, зачем брать?)
//	emptyStatement // нам это надо?
	expressionStatement |
//	IfStatement[?Yield, ?Return]
//	BreakableStatement[?Yield, ?Return]
//	ContinueStatement[?Yield]
//	BreakStatement[?Yield]
//	[+Return] ReturnStatement[?Yield]
//	WithStatement[?Yield, ?Return]
//	LabelledStatement[?Yield, ?Return]
//	ThrowStatement[?Yield]
//	TryStatement[?Yield, ?Return]
//	DebuggerStatement
    ;

blockStatement : block ;

expressionStatement :
    'function' expression ';' |
    'class' expression ';' |
    'let' expression ';' ;

expression :
	assignmentExpression |
	expression ',' assignmentExpression ;


declaration :
	hoistableDeclaration |
	classDeclaration |
	lexicalDeclaration ;

hoistableDeclaration : functionDeclaration ;

lexicalDeclaration :
	LetOrConst bindingList ';' ;

LetOrConst : 'let' | 'const' ;

bindingList :
	lexicalBinding |
	bindingList ',' lexicalBinding ;

lexicalBinding :
	bindingIdentifier initializer? |
	bindingPattern initializer ;

initializer :
	'=' assignmentExpression;

assignmentExpression :
	ConditionalExpression
	| YieldExpression
	| ArrowFunction
	| LeftHandSideExpression '=' AssignmentExpression
	| LeftHandSideExpression AssignmentOperator AssignmentExpression ;

bindingIdentifier : identifier ;







