import org.code.theater.*;
import org.code.media.*;

/**
 * Represents a Scene to be played in the Theater using data from
 * a choses dataset
 */
public class DataScene extends Scene {

String[] names;
int[] years;
String[] teams;
String[] jrs;

  public DataScene(String[] names, int[] years, String[] teams, String[] jrs){
    this.names = names;
    this.years = years;
    this.teams = teams;
    this.jrs = jrs;

  }

  public void drawScene(String[] names, int[] years, String[] teams, String[] jrs){
    for (int i = 0; i < names.length; i++){
      // changes background depending on team
      if (teams[i].equals( "Buffalo Sabres") || teams[i].equals("New York Rangers") || teams[i].equals("Toronto Maple Leafs") || teams[i].equals("Tampa Bay Lightning") || teams[i].equals("St. Louis Blues") || teams[i].equals("Columbus Blue Jackets") || teams[i].equals("Quebec Nordiques") || teams[i].equals("Winnipeg Jets") || teams[i].equals("Colorado Rockies")){
        clear("blue");
      } else if (teams[i].equals("New Jersey Devils") || teams[i].equals("Florida Panthers") || teams[i].equals("Colorado Avalanche") || teams[i].equals("Chicago Blackhawks") || teams[i].equals("Washington Capitals") || teams[i].equals("Ottawa Senators") || teams[i].equals("Detroit Red Wings") || teams[i].equals("Montreal Canadiens")){
        clear("red");
      } else if (teams[i].equals( "Edmonton Oilers") || teams[i].equals("New York Islanders") || teams[i].equals("Atlanta Thrashers") || teams[i].equals("Philadelphia Flyers")){
        clear("orange");
      } else if (teams[i].equals("Pittsburgh Penguins") || teams[i].equals("Boston Bruins")){
        clear("yellow");
      } else if (teams[i].equals("Minnesota North Stars")){
        clear("green");
      } else{
        clear("gray");
      }
      // writes name, team, previous team
      drawText(names[i], 65, 50);
      drawText(teams[i], 65, 100);
      drawText(jrs[i], 65, 150);
      pause(.73);
        }
      

      
  }
  
}
