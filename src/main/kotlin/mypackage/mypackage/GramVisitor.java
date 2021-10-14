// Generated from /Users/stroom/GitHub/compilers/src/main/kotlin/Gram.g4 by ANTLR 4.9.1
package mypackage;
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
	 * Visit a parse tree produced by {@link GramParser#translationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslationUnit(GramParser.TranslationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#topLevelDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopLevelDeclaration(GramParser.TopLevelDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#protocolList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocolList(GramParser.ProtocolListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#protocolName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocolName(GramParser.ProtocolNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(GramParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#blockType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockType(GramParser.BlockTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#dictionaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionaryExpression(GramParser.DictionaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#dictionaryPair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionaryPair(GramParser.DictionaryPairContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#arrayExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpression(GramParser.ArrayExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#blockParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockParameters(GramParser.BlockParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#typeVariableDeclaratorOrName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVariableDeclaratorOrName(GramParser.TypeVariableDeclaratorOrNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#blockExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockExpression(GramParser.BlockExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#messageExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageExpression(GramParser.MessageExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#receiver}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiver(GramParser.ReceiverContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#messageSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageSelector(GramParser.MessageSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#keywordArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeywordArgument(GramParser.KeywordArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#keywordArgumentType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeywordArgumentType(GramParser.KeywordArgumentTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#selectorExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorExpression(GramParser.SelectorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#selectorName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorName(GramParser.SelectorNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#protocolExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocolExpression(GramParser.ProtocolExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#encodeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncodeExpression(GramParser.EncodeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#typeVariableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVariableDeclarator(GramParser.TypeVariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(GramParser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#tryBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryBlock(GramParser.TryBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#catchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchStatement(GramParser.CatchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynchronizedStatement(GramParser.SynchronizedStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#autoreleaseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutoreleaseStatement(GramParser.AutoreleaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(GramParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(GramParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#functionSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSignature(GramParser.FunctionSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(GramParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#attributeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeName(GramParser.AttributeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#attributeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeParameters(GramParser.AttributeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#attributeParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeParameterList(GramParser.AttributeParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#attributeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeParameter(GramParser.AttributeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#attributeParameterAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeParameterAssignment(GramParser.AttributeParameterAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(GramParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#functionCallExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpression(GramParser.FunctionCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(GramParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(GramParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#typedefDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedefDeclaration(GramParser.TypedefDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#typeDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaratorList(GramParser.TypeDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#typeDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclarator(GramParser.TypeDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifiers(GramParser.DeclarationSpecifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#attributeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeSpecifier(GramParser.AttributeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclaratorList(GramParser.InitDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#initDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclarator(GramParser.InitDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecifierQualifierList(GramParser.SpecifierQualifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#ibOutletQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIbOutletQualifier(GramParser.IbOutletQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#arcBehaviourSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArcBehaviourSpecifier(GramParser.ArcBehaviourSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#nullabilitySpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullabilitySpecifier(GramParser.NullabilitySpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageClassSpecifier(GramParser.StorageClassSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#typePrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypePrefix(GramParser.TypePrefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#typeQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQualifier(GramParser.TypeQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#protocolQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocolQualifier(GramParser.ProtocolQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifier(GramParser.TypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#typeofExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeofExpression(GramParser.TypeofExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#enumSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumSpecifier(GramParser.EnumSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#enumeratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeratorList(GramParser.EnumeratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#enumerator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerator(GramParser.EnumeratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#enumeratorIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeratorIdentifier(GramParser.EnumeratorIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#directDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectDeclarator(GramParser.DirectDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#declaratorSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaratorSuffix(GramParser.DeclaratorSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(GramParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#pointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer(GramParser.PointerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(GramParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#structInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructInitializer(GramParser.StructInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#initializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializerList(GramParser.InitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(GramParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractDeclarator(GramParser.AbstractDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#abstractDeclaratorSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractDeclaratorSuffix(GramParser.AbstractDeclaratorSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#parameterDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclarationList(GramParser.ParameterDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration(GramParser.ParameterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator(GramParser.DeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(GramParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(GramParser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#rangeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeExpression(GramParser.RangeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(GramParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#selectionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionStatement(GramParser.SelectionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(GramParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#switchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlock(GramParser.SwitchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#switchSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchSection(GramParser.SwitchSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(GramParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatement(GramParser.IterationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(GramParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#doStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(GramParser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(GramParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#forLoopInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoopInitializer(GramParser.ForLoopInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#forInStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInStatement(GramParser.ForInStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStatement(GramParser.JumpStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressions(GramParser.ExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(GramParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(GramParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(GramParser.CastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(GramParser.InitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(GramParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(GramParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(GramParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(GramParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#postfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix(GramParser.PostfixContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentExpressionList(GramParser.ArgumentExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#argumentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentExpression(GramParser.ArgumentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(GramParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(GramParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(GramParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(GramParser.IdentifierContext ctx);
}