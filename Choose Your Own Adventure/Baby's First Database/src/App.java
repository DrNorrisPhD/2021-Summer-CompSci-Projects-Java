import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;

public class App {  
    public static void main(String a[]){    
        Scanner sortType = new Scanner(System.in);
        File input = new File("input.txt");
        Scanner inputs = new Scanner(input);
        String line0 = inputs.nextLine();
        String line1 = inputs.nextLine();
        String line2 = inputs.nextLine();
        String line3 = inputs.nextLine();
        inputs.close();
        sort(line0, line1, line2, line3);
    }
    static void sort(String a, String b, String c,String d){
        char e = a.charAt(0);
        char f = b.charAt(0);
        char g = c.charAt(0);
        char h = d.charAt(0);
    }
}