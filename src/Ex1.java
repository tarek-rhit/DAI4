import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        System.out.println("Donner le nombre d'étudiants");
        Scanner sc = new Scanner(System.in);
        int nbre = sc.nextInt();
        System.out.println("Le nombre d'étudiants est :" + nbre);

        int notes[] = new int[nbre];

        int i = 0;
        for (i = 0; i < notes.length; i++) {
            System.out.println("Ecrire la note de l'étudiant n°" + (i + 1));
            notes[i] = sc.nextInt();

        }



        int j, s = 0;

        for (j = 0; j < notes.length; j++) {
            s = s + notes[j];
        }
        System.out.println("La somme des notes est : " + s);
        float Moy = (float)s / notes.length;
        System.out.println("La moyenne generale de la classe est :" + Moy);


        int max = notes[0], min = notes[0];

        for (int k = 0; k < notes.length; k++) {

                if (notes[k] > max) {
                    max = notes[k];
                }else
                min = notes[k];

        }
        System.out.println("La note Maximale est :" + max);

        System.out.println("La note minimale est :" + min);
    }
}
