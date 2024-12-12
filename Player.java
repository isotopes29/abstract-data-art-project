import org.code.theater.*;
import org.code.media.*;

/**
 * Represents a Player with a name, draft year, team, and jr team
 */
public class Player {

  private String name;     // first and last name of player
  private int year;         // year drafted
  private String team;   // team drafted to
  private String jr;     // junior team

  /** Constructor */
  public Player(String name, int year, String team, String jr) {
    this.name = name;
    this.year = year;
    this.team = team;
    this.jr = jr;
  }

  /** Accessor Method for name */
  public String getName() {
    return name;
  }
  
  /** Accessor Method for year */
  public int getYear() {
    return year;
  }

  public String getTeam(){
    return team;
  }

  public String getJr(){
    return jr;
  }
  
  /** toString Method override */
  public String toString() {
    return name + " was drafted in " + year + " by the " + team + " from " + jr;
  }
  
}
