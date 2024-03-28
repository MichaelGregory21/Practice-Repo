
/**
 * Write a description of class Tournament here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tournament
{
    // instance variables - replace the example below with your own
    private final int NUM_OF_GROUPS = 4;
    private final int NUM_OF_TEAMS = 5;

    Group[] groups;
    
    /**
     * Constructor for objects of class Tournament
     */
    public Tournament()
    {
        groups = new Group[NUM_OF_GROUPS];
    }
    
    public void hockeyCupSetup()
    {
        for (int i = 0; i < NUM_OF_GROUPS; i++){
            for (int k = 0; k < NUM_OF_TEAMS; k++){
                groups[i].addTeam("country: " + (k+1));
            }
        }
    }
}
