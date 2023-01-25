package JungOL.operator.question_9066;

public class Main {

    public static void main(String[] args) {
        int aData = (int)"A".charAt(0);
        int zData = (int)"Z".charAt(0);
        
        for (int i = zData; i >= aData; i--) {
            System.out.print((char)i);
            if (i != aData) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
