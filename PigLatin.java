import java.util.*;
import java.io.*;
public class PigLatin {

  public static String pigLatinSimple(String s) {
    if (s.length() < 1) return s;
    char start = s.charAt(0);
    String vowels = "aeiou";
    String finale;
    if (vowels.contains(start+"") || s.length() < 2) {
      finale = s + "hay";
    } else {
      finale = (s.substring(1, s.length()) + s.charAt(0) + "ay");
    }
    return finale.toLowerCase();
  }

  public static String pigLatin(String s) {
    if (s.length() < 1) return s;
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
    return finale.toLowerCase();
  }

  public static String pigLatinBest(String s) {
    if (s.length() < 1) return s;
    return s + "hay";
  }

  public static void main( String[]args ) throws FileNotFoundException {

      // Scanner n = new Scanner( System.in );
      // String lines = "";
      // while (n.hasNextLine()) {
      //   String pigLatinLine = "";
      //   Scanner m = new Scanner( n.nextLine() );
      //   while (m.hasNext()) {
      //     String word = pigLatinSimple(m.next());
      //     pigLatinLine += word + " ";
      //   }
      //   lines += pigLatinLine.substring(0, pigLatinLine.length() - 1) + "\n";
      // }
      // System.out.println(lines);
      System.out.println("mock  --> " + pigLatinSimple("mock"));
      System.out.println("pie   --> " + pigLatinSimple("pie"));
      System.out.println("david --> " + pigLatinSimple("david"));
      System.out.println("aaron --> " + pigLatinSimple("aaron"));
      System.out.println();
      System.out.println("the   --> " + pigLatin("the"));
      System.out.println("check --> " + pigLatin("check"));
      System.out.println("skee  --> " + pigLatin("skee"));
      System.out.println("emu   --> " + pigLatin("emu"));
      System.out.println("grade --> " + pigLatin("grade"));



  }
}
