import java.util.Scanner;

public class improvedDialogue {
    public static void main(String[] args){
        boolean userWishesToContinue = true;
        while (userWishesToContinue) {
            System.out.print("please enter a string: ");
            Scanner someString = new Scanner(System.in);
            String userString = someString.nextLine();
            String userStringReversed = "";
            for (int i = userString.length() - 1; i >= 0; i--) {
                userStringReversed += userString.charAt(i);
            }
            System.out.println("Here is your string reversed: " + userStringReversed + "\n" +
                    "Do you wish to continue? Type Y for yes, N for no");
            Scanner yesOrNo = new Scanner(System.in);
            String userYesOrNo = yesOrNo.next(); // should be enough
            userYesOrNo = userYesOrNo.toUpperCase();
            if (userYesOrNo.equals("Y")) {}
            else {
                System.out.println("I'll take it as a no");
                userWishesToContinue = false;
            }
        }
    }
}
