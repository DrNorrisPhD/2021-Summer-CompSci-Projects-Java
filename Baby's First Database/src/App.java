import java.util.*;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sortType = new Scanner(System.in);
        String[] arr = getInputs();
        int[] arrNoLett = getNumInputs(getInputs());
        System.out.println("1. Word Order\n2. Number Order\n3. Exit");
        String incel = sortType.nextLine();
        if (incel.equals("1")) {
            String sortedArray[] = sortInsertion(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.println(sortedArray[i]);
            }
        }
        if (incel.equals("2")) {
            String[] sortedArray = sortSelection(arrNoLett, arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.println(sortedArray[i]);
            }
        } else {
            System.exit(0);
        }
        sortType.close();
    }

    static String[] sortInsertion(String[] s) {
        String a = "";
        for (int i = 0; i < s.length; i++) {
            for (int j = i + 1; j < s.length; j++) {
                if (s[i].compareToIgnoreCase(s[j]) > 0) {
                    a = s[i];
                    s[i] = s[j];
                    s[j] = a;
                }
            }
        }
        return s;
    }

    static String[] sortSelection(int[] r, String[] s) {
        for (int i = 0; i < r.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < r.length; j++) {
                if (r[smallest] > r[j]) {
                    smallest = j;
                }
            }
            if (smallest != i) {
                int a = r[i];
                String b = s[i];
                r[i] = r[smallest];
                s[i] = s[smallest];
                r[smallest] = a;
                s[smallest] = b;
            }
        }
        return s;
    }

    static String[] getInputs() throws Exception {
        Scanner scan = new Scanner(new File("inputs.txt"));
        int size = 0;
        while (scan.hasNextLine()) {
            size++;
            scan.nextLine();
        }
        String[] words = new String[size];
        scan.close();
        scan = new Scanner(new File("inputs.txt"));
        int count = 0;
        while (scan.hasNextLine()) {
            words[count] = scan.nextLine();
            count++;
        }
        scan.close();
        return words;
    }

    static int[] getNumInputs(String[] word) throws Exception {
        String[] words = word;
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[^\\d.]", "");
        }
        int[] numbers = Arrays.stream(words).mapToInt(Integer::parseInt).toArray();
        return numbers;
    }
}