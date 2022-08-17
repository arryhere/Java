import java.util.Scanner;

public class jc_05_02_switch_case {

  public static void switchCase(Scanner sc) {

    System.out.print("Enter your Weekday (Sunday - Monday) : ");
    String day = sc.next();
    day = day.trim();
    day = Character.toUpperCase(day.charAt(0)) + day.substring(1).toLowerCase();

    switch (day) {
      case "Sunday":
        System.out.printf("The day is - %s\n", day);
        break;
      case "Monday":
        System.out.printf("The day is - %s\n", day);
        break;
      case "Tuesday":
        System.out.printf("The day is - %s\n", day);
        break;
      case "Wednesday":
        System.out.printf("The day is - %s\n", day);
        break;
      case "Thrusday":
        System.out.printf("The day is - %s\n", day);
        break;
      case "Friday":
        System.out.printf("The day is - %s\n", day);
        break;
      case "Saturday":
        System.out.printf("The day is - %s\n", day);
        break;
      default:
        System.out.printf("Not a valid day - %s\n", day);
        break;
    }
  }

  public static void newSwitchCase(Scanner sc) {

    System.out.print("Enter any planet in Solar System : ");
    String planet = sc.next();
    planet = planet.trim();
    planet = Character.toUpperCase(planet.charAt(0)) + planet.substring(1).toLowerCase();

    switch (planet) {
      case "Mercury" -> System.out.printf("The planet is - %s\n", planet);
      case "Venus" -> System.out.printf("The planet is - %s\n", planet);
      case "Earth" -> System.out.printf("The planet is - %s\n", planet);
      case "Mars" -> System.out.printf("The planet is - %s\n", planet);
      case "Jupiter" -> System.out.printf("The planet is - %s\n", planet);
      case "Saturn" -> System.out.printf("The planet is - %s\n", planet);
      case "Uranus" -> System.out.printf("The planet is - %s\n", planet);
      case "Neptune" -> System.out.printf("The planet is - %s\n", planet);
      default -> System.out.printf("Not a valid planet - %s\n", planet);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    switchCase(sc);
    newSwitchCase(sc);

    sc.close();
  }
}
