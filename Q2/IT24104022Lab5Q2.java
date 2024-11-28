import java.util.Scanner;

public class IT24104022Lab5Q2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String prize;
        int newMemberCount;
        
        System.out.print("Enter the number of newMembers: ");
        newMemberCount = input.nextInt();

        int newMemberCounter = 1;

        if (newMemberCount == 1) {
            prize = "Pen";
        } else if (newMemberCount == 3) {
            prize = "Umbrella";
        } else if (newMemberCount == 5) {
            prize = "Book";
        } else if (newMemberCount == 7) {
            prize = "TravelBag";
        } else {
            prize = "NoPrize";
        }

        System.out.println("newMember " + newMemberCounter + " gets a " + prize);

        newMemberCounter++;

        input.close();
    }
}
