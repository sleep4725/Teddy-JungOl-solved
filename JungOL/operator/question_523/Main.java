package JungOL.operator.question_523;
import java.util.Scanner;

/**
 * @author JunHyeon.Kim
 * @date 20230125
 */
public class Main {
    public static int isRightValueLarge(int leftValue, int rightValue) {
        if (leftValue <= rightValue) return 1;
        else return 0; 
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int leftValue = 0;
        int rightValue = 0;
        String[] signArry = new String[]{">", "<", ">=", "<="}; 
        
        leftValue = input.nextInt();
        rightValue = input.nextInt();

        int isRightLarge = isRightValueLarge(leftValue, rightValue);
        if (isRightLarge == 1) {
            for (int i = 0; i < signArry.length; i++) {
                if (i%2 == 0) {
                    System.out.println(leftValue + " " + signArry[i] + " " + rightValue + " --- " + 1);
                } else {
                    System.out.println(leftValue + " " + signArry[i] + " " + rightValue + " --- " + 0);
                }
            }
        } else {
            for (int i = 0; i < signArry.length; i++) {
                if (i%2 == 0) {
                    System.out.println(leftValue + " " + signArry[i] + " " + rightValue + " --- " + 0);
                } else {
                    System.out.println(leftValue + " " + signArry[i] + " " + rightValue + " --- " + 1);
                }
            } 
        }
    }
}
