import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Ex3 {

    public static void main(String[] args) {
        List<String> passWord = new ArrayList<>();
        passWord.add("bonjour");
        passWord.add("bonsoir");
        passWord.add("salut");
        passWord.add("au revoir");
        passWord.add("a bientot");

        Scanner sc = new Scanner(System.in);
        System.out.println("Ecrivez votre mot de passe");

        String mot = sc.nextLine();

        for (int i=0;i < passWord.size();i++) {
            if (mot.equals(passWord.get(i))) {
                System.out.println("mot de passe valide trouvé");
            }
        }

        System.out.println (passWord.indexOf(mot));




    }
}
