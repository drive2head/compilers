// Generated from /Users/garanya/Desktop/Учеба/Компиляторы/compilers/src/main/kotlin/mypackage/Gram.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GramParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GramVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GramParser#r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR(GramParser.RContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(GramParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#typeParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterList(GramParser.TypeParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(GramParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint(GramParser.ConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(GramParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#typeArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentList(GramParser.TypeArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(GramParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(GramParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#primaryOrUnionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryOrUnionType(GramParser.PrimaryOrUnionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#primaryType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryType(GramParser.PrimaryTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#parenthesizedType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedType(GramParser.ParenthesizedTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#predefinedType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredefinedType(GramParser.PredefinedTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#typeReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeReference(GramParser.TypeReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(GramParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#objectType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectType(GramParser.ObjectTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#typeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBody(GramParser.TypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#typeMemberList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeMemberList(GramParser.TypeMemberListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#typeMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeMember(GramParser.TypeMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#functionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionType(GramParser.FunctionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#typeQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQuery(GramParser.TypeQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#typeQueryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQueryExpression(GramParser.TypeQueryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#propertySignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertySignature(GramParser.PropertySignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#propertyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyName(GramParser.PropertyNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#identifierName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierName(GramParser.IdentifierNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#callSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallSignature(GramParser.CallSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(GramParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#requiredParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequiredParameterList(GramParser.RequiredParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#requiredParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequiredParameter(GramParser.RequiredParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#optionalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalParameterList(GramParser.OptionalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#optionalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalParameter(GramParser.OptionalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#restParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestParameter(GramParser.RestParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#constructSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructSignature(GramParser.ConstructSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#indexSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexSignature(GramParser.IndexSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#methodSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodSignature(GramParser.MethodSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#typeAliasDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAliasDeclaration(GramParser.TypeAliasDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyAssignment(GramParser.PropertyAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#getAccessor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetAccessor(GramParser.GetAccessorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#setAccessor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetAccessor(GramParser.SetAccessorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#elementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementList(GramParser.ElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#elision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElision(GramParser.ElisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#spreadElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpreadElement(GramParser.SpreadElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#callExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExpression(GramParser.CallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#functionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExpression(GramParser.FunctionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#arrowFunctionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunctionExpression(GramParser.ArrowFunctionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(GramParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#arrowFormalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFormalParameters(GramParser.ArrowFormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(GramParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(GramParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(GramParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#simpleVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleVariableDeclaration(GramParser.SimpleVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#typeAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAnnotation(GramParser.TypeAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#destructuringVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestructuringVariableDeclaration(GramParser.DestructuringVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#bindingPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBindingPattern(GramParser.BindingPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#objectBindingPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectBindingPattern(GramParser.ObjectBindingPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#bindingPropertyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBindingPropertyList(GramParser.BindingPropertyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#bindingProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBindingProperty(GramParser.BindingPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#arrayBindingPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayBindingPattern(GramParser.ArrayBindingPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#bindingElementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBindingElementList(GramParser.BindingElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#bindingElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBindingElement(GramParser.BindingElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#bindingRestElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBindingRestElement(GramParser.BindingRestElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(GramParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#functionOverloads}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionOverloads(GramParser.FunctionOverloadsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#functionOverload}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionOverload(GramParser.FunctionOverloadContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#functionImplementation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionImplementation(GramParser.FunctionImplementationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(GramParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#interfaceExtendsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceExtendsClause(GramParser.InterfaceExtendsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#classOrInterfaceTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceTypeList(GramParser.ClassOrInterfaceTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(GramParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(GramParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#classHeritage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassHeritage(GramParser.ClassHeritageContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#classExtendsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassExtendsClause(GramParser.ClassExtendsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(GramParser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#implementsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplementsClause(GramParser.ImplementsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(GramParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#classElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassElements(GramParser.ClassElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#classElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassElement(GramParser.ClassElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(GramParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#constructorOverloads}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorOverloads(GramParser.ConstructorOverloadsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#constructorOverload}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorOverload(GramParser.ConstructorOverloadContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#constructorImplementation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorImplementation(GramParser.ConstructorImplementationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#propertyMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyMemberDeclaration(GramParser.PropertyMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#memberVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberVariableDeclaration(GramParser.MemberVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#memberFunctionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberFunctionDeclaration(GramParser.MemberFunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#memberFunctionOverloads}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberFunctionOverloads(GramParser.MemberFunctionOverloadsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#memberFunctionOverload}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberFunctionOverload(GramParser.MemberFunctionOverloadContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#memberFunctionImplementation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberFunctionImplementation(GramParser.MemberFunctionImplementationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#memberAccessorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAccessorDeclaration(GramParser.MemberAccessorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#indexMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexMemberDeclaration(GramParser.IndexMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(GramParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#functionStatementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionStatementList(GramParser.FunctionStatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(GramParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#statementListItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementListItem(GramParser.StatementListItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(GramParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(GramParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(GramParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(GramParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(GramParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#hoistableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHoistableDeclaration(GramParser.HoistableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#lexicalDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexicalDeclaration(GramParser.LexicalDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#letOrConst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetOrConst(GramParser.LetOrConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#bindingList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBindingList(GramParser.BindingListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#lexicalBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexicalBinding(GramParser.LexicalBindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(GramParser.InitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(GramParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#leftHandSideExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftHandSideExpression(GramParser.LeftHandSideExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#bindingIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBindingIdentifier(GramParser.BindingIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#arrowFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunction(GramParser.ArrowFunctionContext ctx);
}