import java.util.*;
import java.io.*;
public class MakeStars {
  public static void main( String[]args ) throws FileNotFoundException {

      Scanner n = new Scanner( System.in );
      String lines = "";
      while (n.hasNextLine()) {
        String starLine = "";
        Scanner m = new Scanner( n.nextLine() );
        while (m.hasNext()) {
          String word = "";
          int beep = m.next().length();
          for (int i = 0; i < beep; i++) {
            word += "*";
          }
          starLine += word + " ";
        }
        lines += starLine.substring(0, starLine.length() - 1) + "\n";
      }
      System.out.println(lines);

  }
}
