import java.util.ArrayList;

/**
 * Write a description of class Team here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Team
{
    Player[] players;
    Coach coach;
    float points;
    int goals;
    String country;
    
    /**
     * Constructor for objects of class Team
     */
    public Team(String country)
    {
        players = new Player[17];
        coach = new Coach();
        this.country = country;
    }
    
    public float getPoints()
    {
        return points;
    }
    
    public int getGoals()
    {
        return goals;
    }
    
    public void addGoals(int goals)
    {
        this.goals += goals;
    }
    
    public void addPoints(float points)
    {
        this.points += points;
    }

}
