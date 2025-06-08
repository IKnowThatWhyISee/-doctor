package utils;

import dto.DoctorDTO;
import java.util.ArrayList;
import java.util.Scanner;

public class Validation {

    public static Scanner sc = new Scanner(System.in);

    public static String checkStringInput(String msg) {
        System.out.println(msg);
        while (true) {
            try {
                String result = sc.nextLine();
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Re-input");
            }
        }
    }
    
    public static String checkString() {
        while (true) {
            try {
                String result = sc.nextLine();
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Re-input");
            }
        }
    }

    public static int isInteger(String msg) {
        System.out.println(msg);
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Re-input");
            }
        }
    }

    public static int getChoice(String msg, int min, int max) {
        System.out.println(msg);
        while (true) {
            try {
                int n = Integer.parseInt(sc.nextLine());
                if (n >= min && n <= max) {
                    return n;
                }
                System.out.println("Number must be in range " + min + " - " + max);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number!");
            }
        }

    }

    public static boolean checkCodeExist(ArrayList<DoctorDTO> ld, String code) {
        //check from first to last list doctor
        for (DoctorDTO doctor : ld) {
            if (code.equalsIgnoreCase(doctor.getCode())) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkInputYN(String result) {
        //loop until user input correct
        while (true) {
            //return true if user input y/Y
            if (result.equalsIgnoreCase("Y")) {
                return true;
            }
            //return false if user input n/N
            if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Please input y/Y or n/N.");
            System.out.print("Enter again: ");
        }
    }

}
