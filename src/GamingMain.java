import java.util.Scanner;

public class GamingMain extends PlayGaming {

    public static void GamingMainMethod(int id) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" 1. O'yinni boshlash. ");
        System.out.println(" 2. Balansni ko'rish. ");
        System.out.println(" 0. Dasturdan chiqish. ");
        System.out.print(" >>> ");

        int n = scanner.nextInt();

        switch (n){
            case 0:
                System.out.println(" Dastur yopildi! ");
                return;


            case 1:
                System.out.println(" Play Gaming! ");
                PlayGamingMethod(id);
                break;


            case 2:
                System.out.println(" Sizning balansingizda " + UserBalance[id] + " ta olmos bor! ");
                break;


            default:
                System.out.println(" Siz mavjud bo'lmagan buyrug'ni tanladingiz! ");
                GamingMainMethod(id);
                break;
        }
        GamingMainMethod(id);
    }
}
