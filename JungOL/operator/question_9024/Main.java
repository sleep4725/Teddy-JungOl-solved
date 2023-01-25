package JungOL.operator.question_9024;
import java.util.Scanner;

/**
 * @author JunHyeon.Kim
 * @date 20230125
 */
public class Main {

    public static int largeBOrC(int b, int c) {
        return (b >= c) ? 1:0;
    }
    public static int largeAOrB(int a, int b) {
        return (a > b) ? 1:0;
    }
    public static void resultPrint(int[] result) {
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i != result.length - 1) {
                System.out.print(" ");
            } else {
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[4];
        int aData = 0;
        int bData = 0;
        int cData = 0;
        
        aData = input.nextInt();
        bData = input.nextInt();
        cData = input.nextInt();
        
        int result0 = largeAOrB(aData, bData);
        int result1 = largeBOrC(bData, cData);
        // 1 2 2 

        if (result0 == 1) { // case) a > b
            arr[0] = 1;
            arr[2] = 0;
            if (result1 == 1) { // case) b > c
                arr[1] = 1;
                arr[3] = 0;
            } else { // case) b <= c
                arr[1] = 0;
                arr[3] = 1;
            }
        } else { // case) a <= b
            arr[0] = 0;
            arr[2] = 1;
            if (result1 == 1) { // case) b > c
                arr[1] = 1;
                arr[3] = 0;
            } else { // case) b <= c
                arr[1] = 0;
                arr[3] = 1;
            }
        }

        resultPrint(arr);
    }
}