import java.util.Random;

/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    private double[] points;
    private int[] goals;
    private final int NUM_OF_PARTICIPANTS = 2;
    
    /**
     * Constructor for objects of class Game
     */
    public Game(Team team1, Team team2)
    {
        points = new double[NUM_OF_PARTICIPANTS];
        goals = new int[NUM_OF_PARTICIPANTS];
    }
    
    public double getPoints(int index)
    {
        if (index >= 0 && index < NUM_OF_PARTICIPANTS) return points[index];
        return points[0];   
    }

    public int getGoals(int index)
    {
        if (index >= 0 && index < NUM_OF_PARTICIPANTS){
        return goals[index];
    }
        else {
            return goals[0];
        }
    }

    public void play()
    {
        Random random = new Random();
        goals[0] = random.nextInt(6); goals[1] = random.nextInt(6);
        if (goals[0] == goals[1]){
            if (random.nextInt() % 2 == 0){
                goals[0] += 1;
                points[0] += 1.5;
                
                points[1] += 0.5;
            }
            else{
                goals[1] += 1;
                points[1] += 1.5;
                
                points[0] += 0.5;
            }
        }
        else{
            if (goals[0] > goals[1]){
                points[0] += 2.0;
            }
            else{
                points[1] += 2.0;
            }
        }
        points[0] = goals[0] * 0.1; points[1] = goals[1] * 0.1;
    }
}
