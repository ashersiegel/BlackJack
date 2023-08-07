public class Game 
{
    private static Dealer d;
    
    public static void main(String[] args)
    {
        Game g = new Game(d);
        d = new Dealer(g);
    }
    /**
     * @param dealer passes an instance of dealer created through so the dealer is in this game
     * initalizes instance varible d as the dealer passed through
     **/
    public Game(Dealer dealer){
        d = dealer;
    }
}