// Generated from /Users/garanya/Desktop/Учеба/Компиляторы/compilers/src/main/kotlin/mypackage/Gram.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramParser}.
 */
public interface GramListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(GramParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(GramParser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(GramParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(GramParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterList(GramParser.TypeParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterList(GramParser.TypeParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(GramParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(GramParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#constraint}.
	 * @param ctx the parse tree
	 */
	void enterConstraint(GramParser.ConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#constraint}.
	 * @param ctx the parse tree
	 */
	void exitConstraint(GramParser.ConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(GramParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(GramParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentList(GramParser.TypeArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentList(GramParser.TypeArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(GramParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(GramParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GramParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GramParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#primaryOrUnionType}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryOrUnionType(GramParser.PrimaryOrUnionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#primaryOrUnionType}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryOrUnionType(GramParser.PrimaryOrUnionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#primaryType}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryType(GramParser.PrimaryTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#primaryType}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryType(GramParser.PrimaryTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#parenthesizedType}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedType(GramParser.ParenthesizedTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#parenthesizedType}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedType(GramParser.ParenthesizedTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#predefinedType}.
	 * @param ctx the parse tree
	 */
	void enterPredefinedType(GramParser.PredefinedTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#predefinedType}.
	 * @param ctx the parse tree
	 */
	void exitPredefinedType(GramParser.PredefinedTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#typeReference}.
	 * @param ctx the parse tree
	 */
	void enterTypeReference(GramParser.TypeReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#typeReference}.
	 * @param ctx the parse tree
	 */
	void exitTypeReference(GramParser.TypeReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(GramParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(GramParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#objectType}.
	 * @param ctx the parse tree
	 */
	void enterObjectType(GramParser.ObjectTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#objectType}.
	 * @param ctx the parse tree
	 */
	void exitObjectType(GramParser.ObjectTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#typeBody}.
	 * @param ctx the parse tree
	 */
	void enterTypeBody(GramParser.TypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#typeBody}.
	 * @param ctx the parse tree
	 */
	void exitTypeBody(GramParser.TypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#typeMemberList}.
	 * @param ctx the parse tree
	 */
	void enterTypeMemberList(GramParser.TypeMemberListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#typeMemberList}.
	 * @param ctx the parse tree
	 */
	void exitTypeMemberList(GramParser.TypeMemberListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#typeMember}.
	 * @param ctx the parse tree
	 */
	void enterTypeMember(GramParser.TypeMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#typeMember}.
	 * @param ctx the parse tree
	 */
	void exitTypeMember(GramParser.TypeMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#functionType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionType(GramParser.FunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#functionType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionType(GramParser.FunctionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#typeQuery}.
	 * @param ctx the parse tree
	 */
	void enterTypeQuery(GramParser.TypeQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#typeQuery}.
	 * @param ctx the parse tree
	 */
	void exitTypeQuery(GramParser.TypeQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#typeQueryExpression}.
	 * @param ctx the parse tree
	 */
	void enterTypeQueryExpression(GramParser.TypeQueryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#typeQueryExpression}.
	 * @param ctx the parse tree
	 */
	void exitTypeQueryExpression(GramParser.TypeQueryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#propertySignature}.
	 * @param ctx the parse tree
	 */
	void enterPropertySignature(GramParser.PropertySignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#propertySignature}.
	 * @param ctx the parse tree
	 */
	void exitPropertySignature(GramParser.PropertySignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void enterPropertyName(GramParser.PropertyNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void exitPropertyName(GramParser.PropertyNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#identifierName}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierName(GramParser.IdentifierNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#identifierName}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierName(GramParser.IdentifierNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#callSignature}.
	 * @param ctx the parse tree
	 */
	void enterCallSignature(GramParser.CallSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#callSignature}.
	 * @param ctx the parse tree
	 */
	void exitCallSignature(GramParser.CallSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(GramParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(GramParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#requiredParameterList}.
	 * @param ctx the parse tree
	 */
	void enterRequiredParameterList(GramParser.RequiredParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#requiredParameterList}.
	 * @param ctx the parse tree
	 */
	void exitRequiredParameterList(GramParser.RequiredParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#requiredParameter}.
	 * @param ctx the parse tree
	 */
	void enterRequiredParameter(GramParser.RequiredParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#requiredParameter}.
	 * @param ctx the parse tree
	 */
	void exitRequiredParameter(GramParser.RequiredParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#optionalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterOptionalParameterList(GramParser.OptionalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#optionalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitOptionalParameterList(GramParser.OptionalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#optionalParameter}.
	 * @param ctx the parse tree
	 */
	void enterOptionalParameter(GramParser.OptionalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#optionalParameter}.
	 * @param ctx the parse tree
	 */
	void exitOptionalParameter(GramParser.OptionalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#restParameter}.
	 * @param ctx the parse tree
	 */
	void enterRestParameter(GramParser.RestParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#restParameter}.
	 * @param ctx the parse tree
	 */
	void exitRestParameter(GramParser.RestParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#constructSignature}.
	 * @param ctx the parse tree
	 */
	void enterConstructSignature(GramParser.ConstructSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#constructSignature}.
	 * @param ctx the parse tree
	 */
	void exitConstructSignature(GramParser.ConstructSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#indexSignature}.
	 * @param ctx the parse tree
	 */
	void enterIndexSignature(GramParser.IndexSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#indexSignature}.
	 * @param ctx the parse tree
	 */
	void exitIndexSignature(GramParser.IndexSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#methodSignature}.
	 * @param ctx the parse tree
	 */
	void enterMethodSignature(GramParser.MethodSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#methodSignature}.
	 * @param ctx the parse tree
	 */
	void exitMethodSignature(GramParser.MethodSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#typeAliasDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeAliasDeclaration(GramParser.TypeAliasDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#typeAliasDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeAliasDeclaration(GramParser.TypeAliasDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertyAssignment(GramParser.PropertyAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertyAssignment(GramParser.PropertyAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#getAccessor}.
	 * @param ctx the parse tree
	 */
	void enterGetAccessor(GramParser.GetAccessorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#getAccessor}.
	 * @param ctx the parse tree
	 */
	void exitGetAccessor(GramParser.GetAccessorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#setAccessor}.
	 * @param ctx the parse tree
	 */
	void enterSetAccessor(GramParser.SetAccessorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#setAccessor}.
	 * @param ctx the parse tree
	 */
	void exitSetAccessor(GramParser.SetAccessorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#elementList}.
	 * @param ctx the parse tree
	 */
	void enterElementList(GramParser.ElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#elementList}.
	 * @param ctx the parse tree
	 */
	void exitElementList(GramParser.ElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#elision}.
	 * @param ctx the parse tree
	 */
	void enterElision(GramParser.ElisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#elision}.
	 * @param ctx the parse tree
	 */
	void exitElision(GramParser.ElisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#spreadElement}.
	 * @param ctx the parse tree
	 */
	void enterSpreadElement(GramParser.SpreadElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#spreadElement}.
	 * @param ctx the parse tree
	 */
	void exitSpreadElement(GramParser.SpreadElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#callExpression}.
	 * @param ctx the parse tree
	 */
	void enterCallExpression(GramParser.CallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#callExpression}.
	 * @param ctx the parse tree
	 */
	void exitCallExpression(GramParser.CallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#functionExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpression(GramParser.FunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#functionExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpression(GramParser.FunctionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#arrowFunctionExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunctionExpression(GramParser.ArrowFunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#arrowFunctionExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunctionExpression(GramParser.ArrowFunctionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(GramParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(GramParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#arrowFormalParameters}.
	 * @param ctx the parse tree
	 */
	void enterArrowFormalParameters(GramParser.ArrowFormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#arrowFormalParameters}.
	 * @param ctx the parse tree
	 */
	void exitArrowFormalParameters(GramParser.ArrowFormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(GramParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(GramParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(GramParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(GramParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(GramParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(GramParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#simpleVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSimpleVariableDeclaration(GramParser.SimpleVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#simpleVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSimpleVariableDeclaration(GramParser.SimpleVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterTypeAnnotation(GramParser.TypeAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitTypeAnnotation(GramParser.TypeAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#destructuringVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDestructuringVariableDeclaration(GramParser.DestructuringVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#destructuringVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDestructuringVariableDeclaration(GramParser.DestructuringVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#bindingPattern}.
	 * @param ctx the parse tree
	 */
	void enterBindingPattern(GramParser.BindingPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#bindingPattern}.
	 * @param ctx the parse tree
	 */
	void exitBindingPattern(GramParser.BindingPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#objectBindingPattern}.
	 * @param ctx the parse tree
	 */
	void enterObjectBindingPattern(GramParser.ObjectBindingPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#objectBindingPattern}.
	 * @param ctx the parse tree
	 */
	void exitObjectBindingPattern(GramParser.ObjectBindingPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#bindingPropertyList}.
	 * @param ctx the parse tree
	 */
	void enterBindingPropertyList(GramParser.BindingPropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#bindingPropertyList}.
	 * @param ctx the parse tree
	 */
	void exitBindingPropertyList(GramParser.BindingPropertyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#bindingProperty}.
	 * @param ctx the parse tree
	 */
	void enterBindingProperty(GramParser.BindingPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#bindingProperty}.
	 * @param ctx the parse tree
	 */
	void exitBindingProperty(GramParser.BindingPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#arrayBindingPattern}.
	 * @param ctx the parse tree
	 */
	void enterArrayBindingPattern(GramParser.ArrayBindingPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#arrayBindingPattern}.
	 * @param ctx the parse tree
	 */
	void exitArrayBindingPattern(GramParser.ArrayBindingPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#bindingElementList}.
	 * @param ctx the parse tree
	 */
	void enterBindingElementList(GramParser.BindingElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#bindingElementList}.
	 * @param ctx the parse tree
	 */
	void exitBindingElementList(GramParser.BindingElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#bindingElement}.
	 * @param ctx the parse tree
	 */
	void enterBindingElement(GramParser.BindingElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#bindingElement}.
	 * @param ctx the parse tree
	 */
	void exitBindingElement(GramParser.BindingElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#bindingRestElement}.
	 * @param ctx the parse tree
	 */
	void enterBindingRestElement(GramParser.BindingRestElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#bindingRestElement}.
	 * @param ctx the parse tree
	 */
	void exitBindingRestElement(GramParser.BindingRestElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(GramParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(GramParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#functionOverloads}.
	 * @param ctx the parse tree
	 */
	void enterFunctionOverloads(GramParser.FunctionOverloadsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#functionOverloads}.
	 * @param ctx the parse tree
	 */
	void exitFunctionOverloads(GramParser.FunctionOverloadsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#functionOverload}.
	 * @param ctx the parse tree
	 */
	void enterFunctionOverload(GramParser.FunctionOverloadContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#functionOverload}.
	 * @param ctx the parse tree
	 */
	void exitFunctionOverload(GramParser.FunctionOverloadContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#functionImplementation}.
	 * @param ctx the parse tree
	 */
	void enterFunctionImplementation(GramParser.FunctionImplementationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#functionImplementation}.
	 * @param ctx the parse tree
	 */
	void exitFunctionImplementation(GramParser.FunctionImplementationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(GramParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(GramParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#interfaceExtendsClause}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceExtendsClause(GramParser.InterfaceExtendsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#interfaceExtendsClause}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceExtendsClause(GramParser.InterfaceExtendsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#classOrInterfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceTypeList(GramParser.ClassOrInterfaceTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#classOrInterfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceTypeList(GramParser.ClassOrInterfaceTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(GramParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(GramParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(GramParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(GramParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#classHeritage}.
	 * @param ctx the parse tree
	 */
	void enterClassHeritage(GramParser.ClassHeritageContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#classHeritage}.
	 * @param ctx the parse tree
	 */
	void exitClassHeritage(GramParser.ClassHeritageContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#classExtendsClause}.
	 * @param ctx the parse tree
	 */
	void enterClassExtendsClause(GramParser.ClassExtendsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#classExtendsClause}.
	 * @param ctx the parse tree
	 */
	void exitClassExtendsClause(GramParser.ClassExtendsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(GramParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(GramParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#implementsClause}.
	 * @param ctx the parse tree
	 */
	void enterImplementsClause(GramParser.ImplementsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#implementsClause}.
	 * @param ctx the parse tree
	 */
	void exitImplementsClause(GramParser.ImplementsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(GramParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(GramParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#classElements}.
	 * @param ctx the parse tree
	 */
	void enterClassElements(GramParser.ClassElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#classElements}.
	 * @param ctx the parse tree
	 */
	void exitClassElements(GramParser.ClassElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#classElement}.
	 * @param ctx the parse tree
	 */
	void enterClassElement(GramParser.ClassElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#classElement}.
	 * @param ctx the parse tree
	 */
	void exitClassElement(GramParser.ClassElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(GramParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(GramParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#constructorOverloads}.
	 * @param ctx the parse tree
	 */
	void enterConstructorOverloads(GramParser.ConstructorOverloadsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#constructorOverloads}.
	 * @param ctx the parse tree
	 */
	void exitConstructorOverloads(GramParser.ConstructorOverloadsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#constructorOverload}.
	 * @param ctx the parse tree
	 */
	void enterConstructorOverload(GramParser.ConstructorOverloadContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#constructorOverload}.
	 * @param ctx the parse tree
	 */
	void exitConstructorOverload(GramParser.ConstructorOverloadContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#constructorImplementation}.
	 * @param ctx the parse tree
	 */
	void enterConstructorImplementation(GramParser.ConstructorImplementationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#constructorImplementation}.
	 * @param ctx the parse tree
	 */
	void exitConstructorImplementation(GramParser.ConstructorImplementationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#propertyMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPropertyMemberDeclaration(GramParser.PropertyMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#propertyMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPropertyMemberDeclaration(GramParser.PropertyMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#memberVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberVariableDeclaration(GramParser.MemberVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#memberVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberVariableDeclaration(GramParser.MemberVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#memberFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberFunctionDeclaration(GramParser.MemberFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#memberFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberFunctionDeclaration(GramParser.MemberFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#memberFunctionOverloads}.
	 * @param ctx the parse tree
	 */
	void enterMemberFunctionOverloads(GramParser.MemberFunctionOverloadsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#memberFunctionOverloads}.
	 * @param ctx the parse tree
	 */
	void exitMemberFunctionOverloads(GramParser.MemberFunctionOverloadsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#memberFunctionOverload}.
	 * @param ctx the parse tree
	 */
	void enterMemberFunctionOverload(GramParser.MemberFunctionOverloadContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#memberFunctionOverload}.
	 * @param ctx the parse tree
	 */
	void exitMemberFunctionOverload(GramParser.MemberFunctionOverloadContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#memberFunctionImplementation}.
	 * @param ctx the parse tree
	 */
	void enterMemberFunctionImplementation(GramParser.MemberFunctionImplementationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#memberFunctionImplementation}.
	 * @param ctx the parse tree
	 */
	void exitMemberFunctionImplementation(GramParser.MemberFunctionImplementationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#memberAccessorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccessorDeclaration(GramParser.MemberAccessorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#memberAccessorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccessorDeclaration(GramParser.MemberAccessorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#indexMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterIndexMemberDeclaration(GramParser.IndexMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#indexMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitIndexMemberDeclaration(GramParser.IndexMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(GramParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(GramParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#functionStatementList}.
	 * @param ctx the parse tree
	 */
	void enterFunctionStatementList(GramParser.FunctionStatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#functionStatementList}.
	 * @param ctx the parse tree
	 */
	void exitFunctionStatementList(GramParser.FunctionStatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(GramParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(GramParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#statementListItem}.
	 * @param ctx the parse tree
	 */
	void enterStatementListItem(GramParser.StatementListItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#statementListItem}.
	 * @param ctx the parse tree
	 */
	void exitStatementListItem(GramParser.StatementListItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GramParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GramParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(GramParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(GramParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(GramParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(GramParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(GramParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(GramParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(GramParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(GramParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#hoistableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterHoistableDeclaration(GramParser.HoistableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#hoistableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitHoistableDeclaration(GramParser.HoistableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#lexicalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLexicalDeclaration(GramParser.LexicalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#lexicalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLexicalDeclaration(GramParser.LexicalDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#letOrConst}.
	 * @param ctx the parse tree
	 */
	void enterLetOrConst(GramParser.LetOrConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#letOrConst}.
	 * @param ctx the parse tree
	 */
	void exitLetOrConst(GramParser.LetOrConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#bindingList}.
	 * @param ctx the parse tree
	 */
	void enterBindingList(GramParser.BindingListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#bindingList}.
	 * @param ctx the parse tree
	 */
	void exitBindingList(GramParser.BindingListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#lexicalBinding}.
	 * @param ctx the parse tree
	 */
	void enterLexicalBinding(GramParser.LexicalBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#lexicalBinding}.
	 * @param ctx the parse tree
	 */
	void exitLexicalBinding(GramParser.LexicalBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(GramParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(GramParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(GramParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(GramParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#leftHandSideExpression}.
	 * @param ctx the parse tree
	 */
	void enterLeftHandSideExpression(GramParser.LeftHandSideExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#leftHandSideExpression}.
	 * @param ctx the parse tree
	 */
	void exitLeftHandSideExpression(GramParser.LeftHandSideExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#bindingIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterBindingIdentifier(GramParser.BindingIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#bindingIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitBindingIdentifier(GramParser.BindingIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunction(GramParser.ArrowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunction(GramParser.ArrowFunctionContext ctx);
}