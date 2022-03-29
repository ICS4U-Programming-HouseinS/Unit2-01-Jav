import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseTheString {

  public static String reverser(String originalString) {
    if (!originalString.equals("")) {
      return reverser(originalString.substring(0 + 1)) + originalString.substring(0, 1);
    } else {
      return (originalString);
    }
  }

  public static void main(String[] args) throws Exception {
    List<String> listOfWords
        = new ArrayList<String>();
    
    File myObj = new File("Words.txt");
    Scanner myReader = new Scanner(myObj);
    while (myReader.hasNextLine()) {
      String data = myReader.nextLine();
      listOfWords.add(data);
    }
      
    String[] arrayOfWords
       = listOfWords.toArray(new String[listOfWords.size()]);
       
    for (int i = 0; i < arrayOfWords.length; i++) {
      System.out.print(reverser(arrayOfWords[i]));
    }
  }
}