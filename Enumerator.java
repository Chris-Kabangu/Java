 public class Enumerator {

  enum SEASONS {SPRING, AUTUMN, WINTER, SUMMER}
   
   public static void main(String[] args) {
   
    Main.SEASONS vacation = SEASONS.SUMMER;
    Main.SEASONS hybernation = SEASONS.WINTER;
    Main.SEASONS fall = SEASONS.AUTUMN;
    Main.SEASONS rainfalls = SEASONS.SPRING;
    System.out.println("I will go on vacation in " + vacation);
    System.out.println("Bats hybernate in " + hybernation);
    System.out.println("Leaves fall from the trees in " + fall);
    System.out.println("Flowers blossom in " + rainfalls);


                      
   }

} 
