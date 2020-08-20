package encapsulation;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.setNameLastName("Fazli Kuzhan");
      System.out.println("Name & LastName :"+h1.getNameLastName());
      System.out.println("age : "+h1.getAge()+" years");
      h1.setDate("01/07/2020");
      System.out.println("Date :"+h1.getDate());
      System.out.println("Adress :"+h1.getAdress()); 
      h1.setWeight(98f);
      System.out.println("Weight :"+h1.getWeight()+" kg");
      h1.setHeight(1.75f);
      System.out.println("Height :"+h1.getHeight()+" cm");
   
     
        h1.setBmi(calculateBmi(h1));
     System.out.println("Bmi :"+h1.getBmi());
    }
    
    public static float calculateBmi(Human h1){
    	float result= h1.getWeight()/(h1.getHeight()*h1.getHeight());
       
        if(result<=18.5) {
        	System.out.println("ZAYIF ==> Biraz kilo almalisiniz");
        }else if(result>18.5 && result<=25) {
        	System.out.println("NORMAL ==> formdasiniz");
        }else if(result>25 && result<=30) {
        	System.out.println("asiri kilolu ==> biraz zayiflamalisiniz");
        }else {
        	System.out.println("obez ==> acilen zayiflamalisiniz");
        }
        return  result;
    }

}
