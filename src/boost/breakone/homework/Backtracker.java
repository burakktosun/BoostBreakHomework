package boost.breakone.homework;

import java.util.Scanner;



public class Backtracker {

 
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        String kelime;
        System.out.println("kelime:");
        kelime=oku.nextLine();
     
        for(int i=kelime.length()-1; i>=0; i--) //i'yi kelime uzunluğu kadar tanımlıyoruz.
        {
            System.out.print(kelime.charAt(i));
        }
     
    }
 

}