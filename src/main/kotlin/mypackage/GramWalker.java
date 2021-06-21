
public class GramWalker extends GramBaseListener {
    public void enterR(GramParser.ProgContext ctx ) {
//        System.out.println( "Entering R : " + ctx.Identifier().getText() );
    }

    public void exitR(GramParser.ProgContext ctx ) {
        System.out.println( "Exiting R" );
    }
}
