import java.util.*;
import java.io.*;
public class PigLatin {

  public static String pigLatinSimple(String s) {
    if (s.length() < 1) return s;
    s = s.toLowerCase();
    char start = s.charAt(0);
    String vowels = "aeiou";
    String finale;
    if (vowels.contains(start+"") || s.length() < 2) {
      finale = s + "hay";
    } else {
      finale = (s.substring(1, s.length()) + s.charAt(0) + "ay");
    }
    return finale;
  }

  public static String pigLatin(String s) {
    if (s.length() < 1) return s;
    s = s.toLowerCase();
    char start = s.charAt(0);
    String vowels = "aeiou";
    String[] dig = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    ArrayList<String> digraphs = new  ArrayList<String>();
    Collections.addAll(digraphs, dig);
    String finale;
    if (vowels.contains(start+"") || s.length() < 2) {
      finale = s + "hay";
    } else if ( digraphs.contains(s.substring(0, 2)) && s.length() > 2 ) {
      finale = (s.substring(2, s.length()) + s.substring(0, 2) + "ay");
    } else {
      finale = (s.substring(1, s.length()) + s.charAt(0) + "ay");
    }
    return finale;
  }

  public static String pigLatinBest(String s) {
    if (s.length() < 1) return s;
    s = s.toLowerCase();
    String start = s.charAt(0) + "";
    String regchars = "abcdefghijklmnopqrstuvwxyz1234567890";
    if (!(  regchars.substring(0, 26).contains( s.charAt(0)+"" )  )) return s;
    if (! (regchars.contains( s.charAt(s.length()-1)+"" )) ) {
      return ( pigLatin( s.substring(0, s.length()-1) ) + s.charAt(s.length()-1) );
    } else {
      return pigLatin(s);
    }
  }

  public static void main( String[]args ) throws FileNotFoundException {

      Scanner n = new Scanner( System.in );
      String lines = "";
      while (n.hasNextLine()) {
        String pigLatinLine = "";
        Scanner m = new Scanner( n.nextLine() );
        while (m.hasNext()) {
          String word = pigLatinBest(m.next());
          pigLatinLine += word + " ";
        }
        lines += pigLatinLine.substring(0, pigLatinLine.length() - 1) + "\n";
        if (n.hasNextLine() == false) lines = lines.substring(0, lines.length()-1);
      }
      System.out.println(lines);



  }
}
