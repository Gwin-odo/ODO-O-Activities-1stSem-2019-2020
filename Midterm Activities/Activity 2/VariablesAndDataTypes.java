public class VariablesAndDataTypes {

  public static void main (String [] args) {
  
    String sentence = "The temperature in Baguio City has warmed throughout the years.";
    boolean g = false;
    char letter = 'A';
    float firstCelsius = 16;
    double secondCelsius  = 23.5;
    byte hours = 24;
    short days = 7;
    int week = 4;
    long month = 12;
    if (g) { 
      System.out.println(sentence + "\n\t" + letter + " " + "recent news article that the City has been averaging " + firstCelsius + " degrees celsius at dawn and " + secondCelsius + " at noon." + "\n\t\t" + "Regardless, lowlanders still feel cold " + hours + "hours a day, " + days + " days a week, " + week + " weeks per month, " + month + " months each year.");
    }
    else {
      System.out.println("The boolean was changed to a False value");
    }
  }
}    
    