public class Part1 {
    public static void main(String[] args){
        int n = 0;

        while (n <= 13) {
            if (n < 13) {
                System.out.print(n + "; ");
            }
            else if (n == 13){System.out.print(n + ".\n");}
            n++;
        }

        do {
            n--; // it's 14
            if (n > 0) {
                System.out.print(n + "; ");
            }
            else if (n == 0) { //not necessary here, but if you want it foolproof, I feel like it's better this way
                System.out.print(n + ".\n");
            }

        }
        while (n >= 0);

        for (int i = 0; i <= 13; i++) {
            System.out.println("Line " + i + ":");
            for (int i2 = 13; i2 >= 0; i2--) {
               System.out.print(i2 + " ");
            }
            System.out.print("\n");
        }
        n = 0;

        for (char a: "Some sting".toCharArray() ) {
            n++;
            System.out.print("char " + n + " = " + a + "\n");
        }
    }
}
