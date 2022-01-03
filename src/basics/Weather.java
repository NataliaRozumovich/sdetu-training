package basics;

public class Weather {
    public static void main (String[] args) {
        // This program will give suggestions of what to wear based on the weather (temperature)

        int temperature = 65;
        String sunCondition = "Overcast";

        if (temperature  > 80) {
            System.out.println("It's pleasant. Wear shorts and t-shorts");
        }
        else if ((temperature > 60) && (sunCondition == "Sunny")) {
          System.out.println ("It's a litter cooler. Perhaps wear a long sleeve and jeans");
          System.out.println("Wear a hat to keep the sun out of your eyes.");
        }
        else  if ((temperature >50) || (sunCondition == "Overcast")){
            System.out.println ("This is a cold day, make sure to wear warmer clothes");
        }
        else {
            System.out.println("Looks like a cool day. Bring a sweater");
        }

    }
}
