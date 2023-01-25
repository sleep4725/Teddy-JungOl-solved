package JungOL.operator.question_523_v2;
import java.util.Scanner;

/**
 * @author JunHyeon.Kim
 * @date 20230125
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int xData = 0;
        int yData = 0;
        /* 
        4 > 5 --- 0
        4 < 5 --- 1
        4 >= 5 --- 0
        4 <= 5 --- 1
        */
        xData = input.nextInt();
        yData = input.nextInt();
        int result1 = (xData > yData) ? 1:0;
        int result2 = (xData < yData) ? 1:0;
        int result3 = (xData >= yData) ? 1:0;
        int result4 = (xData <= yData) ? 1:0;

        System.out.printf("%d > %d --- %d\n", xData, yData, result1);
        System.out.printf("%d < %d --- %d\n", xData, yData, result2);
        System.out.printf("%d >= %d --- %d\n", xData, yData, result3);
        System.out.printf("%d <= %d --- %d\n", xData, yData, result4);
    }
}
