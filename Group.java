import java.util.ArrayList;

/**
 * Write a description of class Group here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Group
{
    private final int NUM_OF_TEAMS = 5;
    private Team[] teams;
    private ArrayList<Game> games;

    /**
     * Constructor for objects of class Group
     */
    public Group()
    {
        teams = new Team[NUM_OF_TEAMS];
    }

    public void randomGames() {
        for (int i = 0; i < (NUM_OF_TEAMS -1); i++)
        {
            for (int j = 1; j < NUM_OF_TEAMS; j++){
                Game game = new Game(teams[i], teams[j]);
                games.add(game);
            }
        }
    }
    
    public void canculateStanding()
    {
        
    }
}
