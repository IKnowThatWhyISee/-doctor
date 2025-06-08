package view;

public class PrintResults {

    public static String results;

    public void displayMenu() {
        System.out.println("========= Doctor Management =========");
        System.out.println("1. Add Doctor");
        System.out.println("2. Update Doctor");
        System.out.println("3. Delete Doctor");
        System.out.println("4. Search Doctor");
        System.out.println("5. Display Doctor Info");
        System.out.println("6. Exit");

    }

    public void PrintResults() {
        System.out.println(results);
    }
    
    public void displayHeader(){
                System.out.printf("%-10s%-15s%-25s%-20s\n", "Code", "Name",
                "Specialization", "Availability");
    }
}
