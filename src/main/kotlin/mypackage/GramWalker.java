package mypackage;

public class GramWalker extends GramBaseListener {
    public void enterR(GramParser.RContext ctx ) {
        System.out.println( "Entering R : " + ctx.ID().getText() );
    }

    public void exitR(GramParser.RContext ctx ) {
        System.out.println( "Exiting R" );
    }
}
