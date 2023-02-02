package JungOL.str2.question_9118;
import java.util.Scanner;

/**
 * @author JunHyeon.Kim
 */
public class Main {
    
    public static final int LENGTH_SIZE = 5;
    public static void dataPrint(String[] argData) {
        for (int i = 0; i < LENGTH_SIZE; i++) {
            System.out.println(argData[i]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] strData = new String[LENGTH_SIZE];

        for (int i = 0; i < LENGTH_SIZE; i++) {
            strData[i] = input.next();
        }
        dataPrint(strData);
    }
}
