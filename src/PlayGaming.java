import java.util.Random;
import java.util.Scanner;

public class PlayGaming extends UserInformationBaza {

    public static void PlayGamingMethod(int id) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int a = random.nextInt(99);
        int b = random.nextInt(99);

        int ishora = random.nextInt(3) + 1;

        int natija;

        System.out.println(" Sizga ixtiyoriy sonlar berilgan bo'lsin! ");
        System.out.println(" a = " + a);
        System.out.println(" b = " + b);

        switch (ishora) {
            case 1:
                System.out.print(" S = a + b = ");
                natija = scanner.nextInt();
                if (natija == (a + b)) {
                    System.out.println(" Uraaa sizning javobingiz to'g'ri!");
                    System.out.println(" Siz 1 ta \uD83D\uDC8E olmosga ega bo'ldingiz! ");
                    UserBalance[id] = UserBalance[id] + 1;
                } else {
                    System.out.println(" Ming afsus siz to'g'ri javob bermadingiz!");
                    System.out.println(" Sizning balansingizdan 2 ta \uD83D\uDC8E olmosga qirqib olindi! ");
                    UserBalance[id] = UserBalance[id] - 2;
                }
                break;

            case 2:
                System.out.print(" S = a - b = ");
                natija = scanner.nextInt();
                if (natija == (a - b)) {
                    System.out.println(" Uraaa sizning javobingiz to'g'ri!");
                    System.out.println(" Siz 1 ta \uD83D\uDC8E olmosga ega bo'ldingiz! ");
                    UserBalance[id] = UserBalance[id] + 1;
                } else {
                    System.out.println(" Ming afsus siz to'g'ri javob bermadingiz!");
                    System.out.println(" Sizning balansingizdan 2 ta \uD83D\uDC8E olmosga qirqib olindi! ");
                    UserBalance[id] = UserBalance[id] - 2;
                }
                break;


            case 3:
                System.out.print(" S = a * b = ");
                natija = scanner.nextInt();
                if (natija == (a * b)) {
                    System.out.println(" Uraaa sizning javobingiz to'g'ri!");
                    System.out.println(" Siz 1 ta \uD83D\uDC8E olmosga ega bo'ldingiz! ");
                    UserBalance[id] = UserBalance[id] + 1;
                } else {
                    System.out.println(" Ming afsus siz to'g'ri javob bermadingiz!");
                    System.out.println(" Sizning balansingizdan 2 ta \uD83D\uDC8E olmosga qirqib olindi! ");
                    UserBalance[id] = UserBalance[id] - 2;
                }
                break;
        }

    }
}
