import java.util.Scanner;
public class Ustlusayi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n,k ;
        System.out.println("Taban alınacak sayı:");
        n = input.nextInt();
        System.out.println("Üst alınacak sayı:");
        k = input.nextInt();
        int total=1;
        for (int i =1; i<=k ; i++){
            total *= n ;
            if (i<k){
                continue;
            }
else {System.out.println("Sonucunuz:" +total );}


        }





    }


}
