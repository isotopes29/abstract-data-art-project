import org.code.theater.*;

public class TheaterRunner {
  public static void main(String[] args) {
// establish lsits from txt files
String[] namesArray = FileReader.toStringArray("names.txt");
int[] yearsArray = FileReader.toIntArray("year.txt");
String[] teamsArray = FileReader.toStringArray("team.txt");
String[] jrsArray = FileReader.toStringArray("juniorteam.txt");
  DataScene scene = new DataScene(namesArray, yearsArray, teamsArray, jrsArray);
  // make scene and draw it
    scene.drawScene(namesArray, yearsArray, teamsArray, jrsArray);
// play
    Theater.playScenes(scene);
    
    
  }
}
