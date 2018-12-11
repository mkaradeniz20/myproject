

import java.util.Scanner;


public class Odev1a {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=0;
        
        System.out.println("Faktöriyelini Almak İstediğiniz Sayıyı Giriniz");
        int faktoriyel=1;
       int sayi=scanner.nextInt();
        
        for (int i = 1; i <= sayi; i++) {
            
            if(sayi==0){
                faktoriyel=1;
            }

            faktoriyel*=i;
               
        }
        
        
     System.out.println(faktoriyel);

        
        
        
        
        
        
    }
    
    
    
}
