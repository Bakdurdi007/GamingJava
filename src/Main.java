import java.util.Scanner;

public class Main extends UserInformationBaza{
    public static int counts = 0;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print(" Familyangizni kirting: ");
        String userLastName = scanner.nextLine();

        System.out.print(" Ismingizni kirting: ");
        String userFirstName = scanner.nextLine();

        UserFirstName.add(userFirstName);
        UserLastName.add(userLastName);
        UserBalance[counts] = 0;

        GamingMain.GamingMainMethod(counts);

        counts++;

    }
}
