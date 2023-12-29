import java.util.Random;

public class Ex2Tri {

    public static void main(String[] args) {

        Random rd = new Random();
        int nbr = rd.nextInt(10);

        System.out.println("la taille du tableau est :"+nbr);
        int[] tab = new int[nbr];




        for (int i = 0; i < tab.length; i++) {
            tab[i] = rd.nextInt(100);

        }

        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }

        for ( int i =0;i<=tab.length-1;i++){
            for(int j=1;j<=tab.length-1;j++ ){
                if(tab[i]>tab[j]){
                    int x= tab[j];
                    tab[j]=tab[i];
                    tab[i]=x;
                }
            }
        }

        System.out.println("*********************************************************");
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);}
    }
}
