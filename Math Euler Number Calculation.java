//16253502
//Mehmet KARADENİZ
import java.util.Scanner;


public class Odev1b {
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=0;
        
       
        float faktoriyel=1;
         float e=1;
         System.out.println("Pozitif Bir Sayi Giriniz");
       int sayi=scanner.nextInt();
        if(sayi<0){
            System.out.println("Lütfen Pozitif Bir Sayi Giriniz");
            sayi=scanner.nextInt();
        }
        for (int i = 1; i <= sayi; i++) {
            
            if(sayi==0){
                e=1;
            }
         
            faktoriyel*=i;
               
            e+=(1/faktoriyel);
        }
     System.out.println(e);
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
}
