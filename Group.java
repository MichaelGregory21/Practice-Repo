import java.util.ArrayList;

/**
 * Write a description of class Group here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Group
{
    private ArrayList<Team> teams;
    private ArrayList<Game> games;

    /**
     * Constructor for objects of class Group
     */
    public Group()
    {
        teams = new ArrayList<Team>();
    }

    public void addMatch(Team team1, Team team2){
        Game game = new Game(team1, team2);
        games.add(game);
    }
    
    public void addTeam(String country)
    {
        teams.add(new Team(country));
    }
    
    public void randomGames() 
    {
        for (int i = 0; i < (teams.size() -1); i++)
        {
            for (int j = 1; j < teams.size(); j++){
                addMatch(teams.get(i), teams.get(j));
            }
        }
    }
    
    public void canculateStanding()
    {
        
    }
}
