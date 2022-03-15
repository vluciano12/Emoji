 // Emoji Builder Scaffold Code

import bridges.games.NonBlockingGame;
import bridges.base.NamedColor;
import bridges.base.NamedSymbol;

public class EmojiBuilder extends NonBlockingGame {
    // Grid must be less than 1024 cells total. The largest square grid is 32 x 32

    // class (static) variables -- numRows, numCols
    private static int numRows = 10; // change the numRows dimension if you would like
    //YOUR LINE OF CODE HERE:
    private static int numCols = 10;
    // constructor
    public EmojiBuilder(int assid, String login, String apiKey, int numRows, int numCols) {
        super(assid, login, apiKey, numRows, numCols);
        // set game title
        setTitle("Give you emoji a title");
        // Set a description which will show under the title
        setDescription("Give your emoji a description");
        // start method
        start();
    }

    //main method
    public static void main(String args[]) {
        // Create an EmojiBuilder object -- Don't forget to fill in your assignment number, username, and apiKey
        // (numRows and numCols values are passed in from the class variables above)
        EmojiBuilder emoji = new EmojiBuilder(1, "cluciano", "621674606631", numRows, numCols);
        emoji.initialize();
        
    }

    // initialize
    public void initialize() {
        // Use nested loops to set the background color of your emoji
        /*
        **********
        *!!!**!!!*
        ***!****!*
        ***!****!*
        **********
        *!********
        **!!!!!!!*
        **!@@@@@!*
        **!!!!!!**
        **********
        */
        for(int row = 0; row < 1; row++){
            for(int col = 0; col < 10; col++){
                setBGColor(row,col, NamedColor.yellow);
            }
        }
        setBGColor(1,0, NamedColor.yellow);
        for(int row = 1; row < 1; row++){
            for(int col = 1; col < 4; col++){
                setBGColor(row,col, NamedColor.black);
            }
        }
        setBGColor(1,4, NamedColor.yellow);
        setBGColor(1,5, NamedColor.yellow);
        setBGColor(1,6, NamedColor.black);
        setBGColor(1,7, NamedColor.black);
        setBGColor(1,8, NamedColor.black);
        setBGColor(1,9, NamedColor.yellow);
        
        setBGColor(2,0, NamedColor.yellow);
        setBGColor(2,1, NamedColor.yellow);
        setBGColor(2,2, NamedColor.yellow);
        setBGColor(2,3, NamedColor.black);
        setBGColor(2,4, NamedColor.yellow);
        setBGColor(2,5, NamedColor.yellow);
        setBGColor(2,6, NamedColor.yellow);
        setBGColor(2,7, NamedColor.yellow);
        setBGColor(2,8, NamedColor.black);
        setBGColor(2,9, NamedColor.yellow);
        
        setBGColor(3,0, NamedColor.yellow);
        setBGColor(3,1, NamedColor.yellow);
        setBGColor(3,2, NamedColor.yellow);
        setBGColor(3,3, NamedColor.black);
        setBGColor(3,4, NamedColor.yellow);
        setBGColor(3,5, NamedColor.yellow);
        setBGColor(3,6, NamedColor.yellow);
        setBGColor(3,7, NamedColor.yellow);
        setBGColor(3,8, NamedColor.black);
        setBGColor(3,9, NamedColor.yellow);
        
        for(int row = 4; row < 5; row++){
            for(int col = 0; col < 10; col++){
                setBGColor(row,col, NamedColor.yellow);
            }
        }
        
        setBGColor(5,0, NamedColor.yellow);
        setBGColor(5,1, NamedColor.black);
        for(int row = 5; row < 6; row++){
            for(int col = 2; col < 10; col++){
                setBGColor(row,col, NamedColor.yellow);
            }
        }
        
        setBGColor(6,0, NamedColor.yellow);
        setBGColor(6,1, NamedColor.yellow);
        for(int row = 6; row < 7; row++){
            for(int col = 2; col < 9; col++){
                setBGColor(row,col, NamedColor.black);
            }
        }
        setBGColor(6,9, NamedColor.yellow);
        
        setBGColor(7,0, NamedColor.yellow);
        setBGColor(7,1, NamedColor.yellow);
        setBGColor(7,2, NamedColor.black);
        for(int row = 7; row < 8; row++){
            for(int col = 3; col < 8; col++){
                setBGColor(row,col, NamedColor.red);
            }
        }
        setBGColor(7,8, NamedColor.black);
    }

    // gameloop
    public void gameLoop() {
        // Since we are drawing only once (this is not a game yet),
        // we do not need any code inside the gameLoop() method.
    }
} // end class