public class Example {
 
  public static void main(String[] args) {
    // Your amazing code goes here...
    System.out.println("we are making a new PEZ Dispenser");
    System.out.printf("Fun FACT: There are %d PEZ allowed in every dispenser %n",
                     PezDispenser.MAX_PEZ);
    PezDispenser dispenser = new PezDispenser("Yoda");
    System.out.printf("The dispenser is %s \n",
                     dispenser.getCharacterName()
                     );
    
    if (dispenser.isEmpty()) {
      System.out.println("Dispenser is empty");
    }
    
    System.out.println("Filling the dispenser with delicious PEZ...");
    dispenser.fill();
    if (!dispenser.isEmpty()) {
      System.out.println("The dispenser is full");
    }
    
    while (dispenser.dispense()) {
      System.out.println("CHOMP!");
    }
    
    if (dispenser.isEmpty()) {
      System.out.println("Ate all the pez");
    }
    dispenser.fill(4);
    dispenser.fill(2);
    while (dispenser.dispense()) {
      System.out.println("CHOMP!!");
    }
    try {
      dispenser.fill(400);
      System.out.println("This line will never happen");
    } catch (IllegalArgumentException iae) {
      System.out.println("STOP!");
      System.out.printf("The error was %s \n",
                       iae.getMessage());
    }
    
    
  }

}