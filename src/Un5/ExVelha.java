package Un5;

public class ExVelha {
    public static void main(String[] args) {
        for (int i = 0; i <=2 ; i++) {
                if (i==0) {
                    System.out.print(" _ ");
                    System.out.print("_ ");
                    System.out.print("_ ");
                    System.out.println("");
                }
            for (int j = 0; j <= 2; j++) {
                if (j==0) {
                    System.out.print("|");
                } 
                System.out.print("_");
                System.out.print("|");
            }
            System.out.println("");
        }
        // for (int i = 1; i < 10; i++) {
        //     if (i%3 == 0) {
        //         System.out.println("");
        //     }
        //     else{
        //         System.out.print("_");
        //         System.out.print("|");
        //         System.out.print("_");
        //         System.out.print("|");
        //     }
        // }
    }
}
