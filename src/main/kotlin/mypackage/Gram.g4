grammar Gram ;
//r  : 'hello' ID ;         // match keyword hello followed by an identifier
//ID : [a-z]+ ;             // match lower-case identifiers
//WS : [ \t\r\n]+ -> skip ;
//start: r;

//r: SimpleVariableDeclaration ;

SimpleVariableDeclaration :
    Identifier TypeAnnotation? Initializer? ;

Identifier          : IdentifierName ;
IdentifierName      : [a-z]+ ([a-z] | [0-9])* ;

IdentifierReference :
    Identifier ;

BindingIdentifier :
    Identifier ;

LabelIdentifier :
    Identifier ;

//PrimaryExpression :
//    'this'
//    | IdentifierReference
//    | Literal
//    | ArrayLiteral
//    | ObjectLiteral
//    | FunctionExpression
//    | ClassExpression
//    | TemplateLiteral
//    ;

//Literal :
//    NullLiteral
//    | BooleanLiteral
//    | NumericLiteral
//    | StringLiteral ;

Initializer :
    '=' AssignmentExpression ;

AssignmentExpression :
    ([0-9])+ ;
//    ConditionalExpression
//    YieldExpression
//    ArrowFunction
//    LeftHandSideExpression '=' AssignmentExpression
//    LeftHandSideExpression AssignmentOperator AssignmentExpression
//    ;

//LeftHandSideExpression :
//     NewExpression;

TypeAnnotation :
    ':' Type ;

Type :
    PrimaryOrUnionType
//    | FunctionType
//    | ConstructorType
    ;

PrimaryOrUnionType :
    PrimaryType ;
//    UnionType


PrimaryType : // not full
//    ParenthesizedType
    PredefinedType ;

PredefinedType :
    'any'
    | 'number'
    | 'boolean'
    | 'string'
    | 'void' ;

//WS : [ \t\r\n]+ -> skip ;

init: Initializer;

prog: SimpleVariableDeclaration;

