import java.util.ArrayList;
  import java.util.Scanner;

  // Class to represent a single item in the menu
  class MenuItem {
      private String name;
      private double price;

      public MenuItem(String name, double price) {
          this.name = name;
          this.price = price;
      }

      public String getName() { return name; }
      public double getPrice() { return price; }
  }

  public class RestaurantBill {
      private static ArrayList<MenuItem> items = new ArrayList<>();
      private static Scanner scanner = new Scanner(System.in);

      public static void main(String[] args) {
          System.out.println("--- Welcome to the Restaurant System ---");
          System.out.print("Enter the restaurant name: ");
          String restaurantName = scanner.nextLine();

          boolean addingItems = true;

          while (addingItems) {
              System.out.print("\nEnter item name (or type 'done' to finish): ");
              String input = scanner.nextLine();

              if (input.equalsIgnoreCase("done")) {
                  addingItems = false;
              } else {
                  System.out.print("Enter the price for " + input + ": ");
                  double price = scanner.nextDouble();
                  scanner.nextLine(); // Consume the leftover newline character

                  // Add item to our list
                  items.add(new MenuItem(input, price));
              }
          }

          generateBill(restaurantName);
      }

      public static void generateBill(String restaurantName) {
          double total = 0;
          System.out.println("\n================================");
          System.out.println("        " + restaurantName.toUpperCase());
          System.out.println("================================");
          System.out.printf("%-20s %-10s\n", "Item Name", "Price");
          System.out.println("----------------------------------");


          for (MenuItem item : items) {
              System.out.printf("%-20s rs%.2f\n", item.getName(), item.getPrice());
              total += item.getPrice();
          }

          System.out.println("----------------------------------");
          System.out.printf("TOTAL AMOUNT: %.2f\n", total);
          System.out.println("================================");
          System.out.println("   Thank you for dining with us!   ");
      }
  }
