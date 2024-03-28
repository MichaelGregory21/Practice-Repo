
/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    float[] points;
    int[] goals;
    final int NUM_OF_PARTICIPANTS = 2;
    
    /**
     * Constructor for objects of class Game
     */
    public Game(Team team1, Team team2)
    {
        points = new float[NUM_OF_PARTICIPANTS];
        goals = new int[NUM_OF_PARTICIPANTS];
    }
    
    public float getPoints(int index)
    {
        if (index >= 0 && index < NUM_OF_PARTICIPANTS) return points[index];
        return points[0];   
    }

    public int getGoal(int index)
    {
        if (index >= 0 && index < NUM_OF_PARTICIPANTS){
        return goals[index];
    }
        else {
            return goals[0];
        }
    }
    
    private void setPoints(int team1Points, int team2Points)
    {
        this.points[0] = team1Points;
        this.points[1] = team2Points;
    }
    
    private void setGoals(int team1Goals, int team2Goals)
    {
        this.goals[0] = team1Goals;
        this.goals[1] = team2Goals;
    }
    
    
}
