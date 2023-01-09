package listusages;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(9);
        list.add(1);
        list.add(0);
        list.add(12);
        list.add(-2);
        list.add(-9);
        list.add(14);
        System.out.println("List :" + list);

        int result = calculateAverage(list);
        System.out.println("Average : " + result);

        // List<Integer> resultList = doSquare(list);
        // System.out.println("Squares : " + resultList);

        List<Integer> positives = onlyPositive(list);
        System.out.println("Positives : " + positives);

    }

    public static int calculateAverage(List<Integer> list) {

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
           sum += list.get(i);
        }
        return sum / list.size();
    }

    public static List<Integer> doSquare(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
          int currentElement = list.get(i);
          int square = currentElement * currentElement;
          list.set(i, square);
        }
        return list;
    }
    public static List<Integer> onlyPositive(List<Integer> list) {
        for (int i = 0; i < list.size();) {
            if(list.get(i) < 0) {
                list.remove(i);
            }
            else  {
                i++;
            }
        }
        return list;
    }

    //return two numbers
    public static List<Integer>calkulateSumSquares(List<Integer> list) {
     //1. sum of squares of positive numbers
        // 2. sum of squares of negative numbers
        int positivesSquaresSum = 0;
        int negativesSquareSum = 0;
        for (int i = 0; i < list.size(); i++) {
           int element = list.get(i);
           if (element >= 0) {
               positivesSquaresSum += element * element;
           }
           else  {
               negativesSquareSum += element * element;
           }
        }
        // java 8
//        List<Integer> result = new ArrayList<>();
//        result.add(positivesSquaresSum);
//       result.add(negativesSquareSum);
//        return result;

        // java 9+
        return List.of(positivesSquaresSum, negativesSquareSum);
    }
}
