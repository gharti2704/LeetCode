import java.util.*;
import easy.TwoSum;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      var twoSum = new TwoSum();
      var result = twoSum.findTwoSum(new int [] {2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString((int[]) result));
    }
}