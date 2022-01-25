
/**
 * This class is reponsible for creating and
 * linking all the Locations in the game to
 * form a 2D or 3D network
 *
 *  [Room1 - [Hallway] - Room2]
 *  [Room3 - [Hallway] - Room4]
 *  [Room5 - [Hallway] - Room6]
 *  [Room7 - [Hallway] - Room8]
 *             
 * @author Tayyib Fazal
 * @version 2021-08-22
 */
public class Map
{
    // Need to add a list of exits
    
    private Location Hallway, Room1, Room2, Room3, Room4, Room5, Room6, Room7, Room8;

    private Location currentLocation;

    /**
     * Constructor for objects of class Map
     */
    public Map()
    {
        createLocations();
    }

    /**
     * Create all the Locations and link their exits together.
     * Set the current location to the outside.
     * Both locations need to have been created before
     * their exists are linked.
     */
    private void createLocations()
    {
        createRoom1();
        createRoom2();
        createRoom3();
        createRoom4();
        createRoom5();
        createRoom6();
        createRoom7();
        createRoom8();
        createHallway();
        
        currentLocation = Room1;  // start game in the Hallway
    }
    
    
    
    /**
     * Create the first Room and link it to the Hallway
     */
    private void createRoom1()
    {
        Room1 = new Location("The first room of the dungeon");
    }
    
    /**
     * Create the second Room and link it to the Hallway
     */
    private void createRoom2()
    {
        Room2 = new Location("The second room of the dungeon");
    }
    
    /**
     * Create the third room linked to the Hallway
     */
    private void createRoom3()
    {
        Room3 = new Location("The third room of the dungeon");
    }
    
    /**
     * Create the fourth room linked to the Hallway
     */
    private void createRoom4()
    {
        Room4 = new Location("The fourth room of the dungeon");
    }
    
    /**
     * Create the fifth room and link it to the Hallway
     */
    private void createRoom5()
    {
        // create the Locations
        Room5 = new Location("The fifth room of the dungeon");
        
    }
    
    /**
     * Create the sixth room and link it to the Hallway
     */
    private void createRoom6()
    {
        //create the Locations
        Room6 = new Location("The sixth room of the dungeon");
    }
    
    /**
     * Create the seventh room and link it to the Hallway
     */
    private void createRoom7()
    {
        // create the Locations
        Room7 = new Location("The seventh room of the dungeon");
    }
    
    /**
     * Create the eighth room and link it to the Hallway
     */
    private void createRoom8()
    {
        // create the Locations
        Room8 = new Location("The eighth room of the dungeon");
        
    }
    
    /**
     * Create the Hallway and set exits to every other room
     */
    private void createHallway()
    {
        Hallway= new Location("Hallway of the dungeon.");
        Hallway.setExit("room1",Room1);
        Hallway.setExit("room3",Room3);
        Hallway.setExit("room5",Room5);
        Hallway.setExit("room7",Room7);
        Hallway.setExit("room2",Room2);
        Hallway.setExit("room4",Room4);
        Hallway.setExit("room6",Room6);
        Hallway.setExit("room8",Room8);
        Room1.setExit("east", Hallway);
        Room2.setExit("west", Hallway);
        Room3.setExit("east", Hallway);
        Room4.setExit("west", Hallway);
        Room5.setExit("east", Hallway);
        Room6.setExit("west", Hallway);
        Room7.setExit("east", Hallway);
        Room8.setExit("east", Hallway);
    }
    
    public Location getCurrentLocation()
    {
        return currentLocation;
    }
    
    public void enterLocation(Location nextLocation)
    {
        currentLocation = nextLocation;
    }
}
