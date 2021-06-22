grammar Gram ;

primaryExpression :
  'this'
  |  objectLiteral
  |  ( '(' expression ')' )
  |  identifier
  |  arrayLiteral
  |  literal ;
literal : DECIMAL_LITERAL | STRING_LITERAL | BOOLEAN_LITERAL | NULL_LITERAL ;
identifier : IDENTIFIER_NAME ;
arrayLiteral : '[' ( ( elision )? ']' | elementList elision ']' | ( elementList )? ']' ) ;
elementList : ( elision )? assignmentExpression ( elision assignmentExpression )* ;
elision : ( ',' )+ ;
objectLiteral : '{' ( propertyNameAndValueList )? '}' ;
propertyNameAndValueList : propertyNameAndValue ( ',' propertyNameAndValue | ',' )* ;
propertyNameAndValue : propertyName ':' assignmentExpression ;
propertyName : identifier
  |  STRING_LITERAL
  |  DECIMAL_LITERAL ;
memberExpression : ( ( functionExpression | primaryExpression ) ( memberExpressionPart )* )
  |  allocationExpression ;
memberExpressionForIn : ( ( functionExpression | primaryExpression ) ( memberExpressionPart )* ) ;
allocationExpression : 'new' memberExpression ( arguments ( memberExpressionPart )* )* ;
memberExpressionPart : '[' expression ']'
  |  '.' identifier ;
callExpression : memberExpression arguments ( callExpressionPart )* ;
callExpressionForIn : memberExpressionForIn arguments ( callExpressionPart )* ;
callExpressionPart : arguments
  |  ( '[' expression ']' )
  |  ( '.' identifier ) ;
arguments : '(' ( argumentList )? ')' ;
argumentList : assignmentExpression ( ',' assignmentExpression )* ;
leftHandSideExpression : callExpression
  |  memberExpression ;
leftHandSideExpressionForIn : callExpressionForIn
  |  memberExpressionForIn ;
postfixExpression : leftHandSideExpression ( postfixOperator )? ;
postfixOperator : ( '++' | '--' ) ;



unaryExpression : postfixExpression | ( unaryOperator unaryExpression )+ ;
unaryOperator : 'delete' | 'void' | 'typeof' | '++' | '--' | '+' | '-' | '~' | '!' ;
multiplicativeExpression : unaryExpression ( multiplicativeOperator unaryExpression )* ;
multiplicativeOperator : ( '*' | '\\' | '%' ) ;
additiveExpression : multiplicativeExpression ( additiveOperator multiplicativeExpression )* ;
additiveOperator : ( '+' | '-' ) ;
shiftExpression : additiveExpression ( shiftOperator additiveExpression )* ;
shiftOperator : ( '<<' | '>>' | '>>>' ) ;
relationalExpression : shiftExpression ( relationalOperator shiftExpression )* ;
relationalOperator : ( '<' | '>' | '<=' | '>=' | 'instanceof' | 'in' ) ;
relationalExpressionNoIn:shiftExpression ( relationalNoInOperator shiftExpression )* ;
relationalNoInOperator : '<' | '>' | '<=' | '>=' | 'instanceof' ;
equalityExpression : relationalExpression ( equalityOperator relationalExpression )* ;
equalityExpressionNoIn : relationalExpressionNoIn ( equalityOperator relationalExpressionNoIn )* ;
equalityOperator : ( '==' | '!=' | '===' | '!==' ) ;
bitwiseANDExpression : equalityExpression ( bitwiseANDOperator equalityExpression )* ;
bitwiseANDExpressionNoIn : equalityExpressionNoIn ( bitwiseANDOperator equalityExpressionNoIn )* ;
bitwiseANDOperator : '&' ;
bitwiseXORExpression : bitwiseANDExpression ( bitwiseXOROperator bitwiseANDExpression )* ;
bitwiseXORExpressionNoIn : bitwiseANDExpressionNoIn ( bitwiseXOROperator bitwiseANDExpressionNoIn )* ;
bitwiseXOROperator : '^' ;
bitwiseORExpression : bitwiseXORExpression ( bitwiseOROperator bitwiseXORExpression )* ;
bitwiseORExpressionNoIn : bitwiseXORExpressionNoIn ( bitwiseOROperator bitwiseXORExpressionNoIn )* ;
bitwiseOROperator : '|' ;
logicalANDExpression : bitwiseORExpression ( logicalANDOperator bitwiseORExpression )* ;
logicalANDExpressionNoIn : bitwiseORExpressionNoIn ( logicalANDOperator bitwiseORExpressionNoIn )* ;
logicalANDOperator : '&&' ;
logicalORExpression : logicalANDExpression ( logicalOROperator logicalANDExpression )* ;
logicalORExpressionNoIn : logicalANDExpressionNoIn ( logicalOROperator logicalANDExpressionNoIn )* ;
logicalOROperator : '||' ;
conditionalExpression : logicalORExpression ( '?' assignmentExpression ':' assignmentExpression )? ;
conditionalExpressionNoIn : logicalORExpressionNoIn ( '?' assignmentExpression ':' assignmentExpressionNoIn )? ;
assignmentExpression : ( leftHandSideExpression assignmentOperator assignmentExpression | conditionalExpression ) ;
assignmentExpressionNoIn : ( leftHandSideExpression assignmentOperator assignmentExpressionNoIn | conditionalExpressionNoIn ) ;
assignmentOperator : ( '=' | '*=' | '\\=' | '%=' | '+=' | '-=' | '=' | '=' | '=' | '&=' | '^=' | '|=' ) ;
expression : assignmentExpression ( ',' assignmentExpression )* ;


expressionNoIn:assignmentExpressionNoIn ( ',' assignmentExpressionNoIn )* ;
statement: block
  |  variableStatement
  |  emptyStatement
  |  labelledStatement
  |  expressionStatement
  |  ifStatement
  |  iterationStatement
  |  continueStatement
  |  breakStatement
  |  returnStatement
  |  withStatement
  |  switchStatement
  |  throwStatement
  |  tryStatement ;
block:'{' ( statementList )? '}' ;

statementList  :  ( statement )+ ;
variableStatement  :  'var' variableDeclarationList ( ';' )? ;
variableDeclarationList    :  variableDeclaration ( ',' variableDeclaration )* ;
variableDeclarationListNoIn    :  variableDeclarationNoIn ( ',' variableDeclarationNoIn )* ;
variableDeclaration    :  identifier ( initialiser )? ;
variableDeclarationNoIn    :  identifier ( initialiserNoIn )? ;
initialiser    :  '=' assignmentExpression ;
initialiserNoIn    :  '=' assignmentExpressionNoIn ;
emptyStatement :  ';' ;
expressionStatement    :  expression ( ';' )? ;
ifStatement    :  'if' '(' expression ')' statement ( 'else' statement )? ;
iterationStatement :  ( 'do' statement 'while' '(' expression ')' ( ';' )? )
|  ( 'while' '(' expression ')' statement )
|  ( 'for' '(' ( expressionNoIn )? ';' ( expression )? ';' ( expression )? ')' statement )
|  ( 'for' '(' 'var' variableDeclarationList ';' ( expression )? ';' ( expression )? ')' statement )
|  ( 'for' '(' 'var' variableDeclarationNoIn 'in' expression ')' statement )
|  ( 'for' '(' leftHandSideExpressionForIn 'in' expression ')' statement ) ;

continueStatement :    'continue' ( identifier )? ( ';' )? ;
breakStatement :  'break' ( identifier )? ( ';' )? ;
returnStatement    :  'return' ( expression )? ( ';' )? ;
withStatement  :  'with' '(' expression ')' statement ;
switchStatement    :  'switch' '(' expression ')' caseBlock ;
caseBlock  :  '{' ( caseClauses )? ( '}' | defaultClause ( caseClauses )? '}' ) ;
caseClauses    :  ( caseClause )+ ;
caseClause :  ( ( 'case' expression ':' ) ) ( statementList )? ;
defaultClause :    ( ( 'default' ':' ) ) ( statementList )? ;

labelledStatement :    identifier ':' statement ;
throwStatement :  'throw' expression ( ';' )? ;
tryStatement : 'try' block ( ( xFinally | xCatch ( xFinally )? ) ) ;
xCatch :  'catch' '(' identifier ')' block ;
xFinally   :  'finally' block ;
functionDeclaration    :  'function' identifier ( '(' ( formalParameterList )? ')' ) functionBody ;
functionExpression :  'function' ( identifier )? ( '(' ( formalParameterList )? ')' ) functionBody ;
formalParameterList    :  identifier ( ',' identifier )* ;
functionBody   :  '{' ( sourceElements )? '}' ;

program : ( sourceElements )? EOF ;
sourceElements : ( sourceElement )+ ;
sourceElement :    functionDeclaration | statement ;

STRING_LITERAL: '"' .*? '"' ;
NULL_LITERAL : 'null' ;
BOOLEAN_LITERAL : 'true' | 'false' ;
DECIMAL_LITERAL : [0-9]+ ;
IDENTIFIER_NAME : ([a-z])+ ([a-z] | [A-Z] | [0-9])* ;