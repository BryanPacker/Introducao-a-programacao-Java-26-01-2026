package Un5.Ex;

public class Uni5Exe02 {
    public static void main(String[] args) {
        int im = 0;
        int ip = 0;
        for (int i = 1; i <= 100 ; i++) {
            if (i % 2 == 0) {
                ip+=i;
            }
            else{
                im+=i;
            }
        }
        System.out.println(im);
        System.out.println(ip);
    }
}
