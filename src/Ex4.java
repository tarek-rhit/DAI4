import java.net.SocketOption;

public class Ex4 {

    public static void main(String[] args) {

        int tab1[]={-9,19,2,33,2,33};
        int tab2[]={12,1,3};
        int tab3[]=new int[6];


            for(int i=0; i<10; i++){
                tab3[i] = tab1[i] + tab2[i] ;
            }
        System.out.println(tab3);

        }

}


