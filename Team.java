import java.util.ArrayList;

/**
 * Write a description of class Team here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Team
{
    Person[] players;
    Person coach;
    float points;
    int goals;
    
    /**
     * Constructor for objects of class Team
     */
    public Team()
    {
        players = new Person[17];
        coach = new Person();
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
