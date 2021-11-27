import java.util.Scanner;

public class JobOffer { 
  
   public static void main(String[] args) {

      Scanner developer = new Scanner(System.in);
      System.out.println("What is your name?");
      String name = developer.nextLine();
      System.out.println("true or false, do you know Java?");
      boolean java = developer.nextBoolean();
      System.out.println("true or false, Do you know Python?");
      boolean python = developer.nextBoolean();
      System.out.println("How many years of experience do you have in Java?");
      int javaExperience = developer.nextInt();
      System.out.println("How many years of experience do you have in Python?");
      int pythonExperience = developer.nextInt();

      if(java == true &&  javaExperience >= 1 || python == true && pythonExperience >= 3){
         System.out.println(name + ", we are pleased to inform you that you are hired!!!");
      } else {
         System.out.println("Sorry, we cannot hire you");
      }

      developer.close();

      
     }  
}      
                       
   

   



