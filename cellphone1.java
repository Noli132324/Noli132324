import java.util.Scanner;
public class cellphone1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of cellphones: ");
        int numCellphones = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        cellphone[] cellphones = new cellphone[numCellphones];

        for (int i = 0; i < numCellphones; i++) {
            System.out.println("Enter details for cellphone " + (i + 1) + ":");
            
            System.out.print("Brand: ");
            String brand = scanner.nextLine();
            
            System.out.print("Version: ");
            int version = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            
            System.out.print("Storage: ");
            int storage = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            
            cellphones[i] = new cellphone(brand, version, storage);

            System.out.println("Enter details for Smartphone " + (i + 1) + ":");
            String details =scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();
            
            System.out.print("Model: ");
            int model = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            
            System.out.print("Color: ");
            String color = scanner.nextLine();
            scanner.nextLine();
        }
        
        System.out.println("\nDetails of the entered cellphones:");
        
        for (int i = 0; i < numCellphones; i++) {
            System.out.println("Cellphone " + (i + 1) + ":");
            System.out.println("Brand: " + cellphones[i].getBrand());
            System.out.println("Version: " + cellphones[i].getVersion());
            System.out.println("Storage: " + cellphones[i].getStorage() + "\n");           
        }
    }
}

