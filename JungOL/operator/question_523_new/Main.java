package JungOL.operator.question_523_new;
import java.util.Scanner;

/**
 * @author JunHyeon.Kim
 * @date 20230125
 */
public class Main {

    public static boolean isRightValueLarge(int leftValue, int rightValue) {
        if (leftValue <= rightValue) return true;
        else return false; 
    }
    public static void resultPrint(int leftValue, int rightValue, int boolArr[]) {
        String[] signArry = new String[]{">", "<", ">=", "<="};

        for (int i = 0; i < boolArr.length; i++) {
            System.out.println(leftValue + " " + signArry[i] + " " + rightValue + " --- " + boolArr[i]);
        }
        
    }
    public static void main(String[] args) {
        // > < >= <=
        Scanner input = new Scanner(System.in);

        int leftValue = 0;
        int rightValue = 0;
        
        int[] boolArr = new int[4];
        
        leftValue = input.nextInt();
        rightValue = input.nextInt();

        boolean bData = isRightValueLarge(leftValue, rightValue);
        if (bData) {
            for (int i = 1; i < boolArr.length; i = i+2) {
                boolArr[i] = 1;
            }
        } else {
            for (int i = 0; i < boolArr.length; i = i+2) {
                boolArr[i] = 1;
            } 
        }

        resultPrint(leftValue, rightValue, boolArr);
    }
}
