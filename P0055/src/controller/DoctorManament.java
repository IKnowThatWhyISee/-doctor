package controller;

import dto.DoctorDTO;
import java.util.ArrayList;
import java.util.Scanner;
import static utils.Validation.*;
import static utils.Validation.isInteger;

public class DoctorManament {

    private final view.PrintResults DoctorView = new view.PrintResults();

    public static Scanner sc = new Scanner(System.in);

    public void showMenu() {
        DoctorView.displayMenu();
    }

    public static void AddDoctor(ArrayList<DoctorDTO> doc) {
        DoctorDTO newdoc = new DoctorDTO();
        newdoc.setCode(checkStringInput(constant.Message.MSG_CODE_MESSAGE));
        if (!doc.isEmpty()) {
            for (int i = 0; i < doc.size(); i++) {
                if (checkCodeExist(doc, newdoc.getCode())) {
                    System.out.println("Doctor code has been exist");
                    return;
                }
            }
        }
        newdoc.setName(checkStringInput(constant.Message.MSG_NAME_MESSAGE));
        newdoc.setSpecialization(checkStringInput(constant.Message.MSG_Specialization_MESSAGE));
        newdoc.setAvailability(isInteger(constant.Message.MSG_AVAILABILITY_MESSAGE));
        doc.add(newdoc);
        String confirm = checkStringInput(constant.Message.MSG_CONFIRMATION_MESSAGE);
        if(!checkInputYN(confirm)){
            return;
        }
            
    }

    public static void UpdateDoctor(ArrayList<DoctorDTO> doc) {
        DoctorDTO newdoc = new DoctorDTO();
        newdoc.setCode(checkStringInput(constant.Message.MSG_CODE_MESSAGE));
        if (!doc.isEmpty()) {
            for (int i = 0; i < doc.size(); i++) {
                if (checkCodeExist(doc, newdoc.getCode())) {
                    doc.remove(i);
                    newdoc.setName(checkStringInput(constant.Message.MSG_NAME_MESSAGE));
                    newdoc.setSpecialization(checkStringInput(constant.Message.MSG_Specialization_MESSAGE));
                    newdoc.setAvailability(isInteger(constant.Message.MSG_AVAILABILITY_MESSAGE));
                    doc.add(i, newdoc);
                } else if (i == doc.size() - 1 && !checkCodeExist(doc, newdoc.getCode())) {
                    System.out.println("Doctor code does not exist");
                }
            }
        } else {
            System.out.println("List empty.");
        }

    }

    public static void DeleteDoctor(ArrayList<DoctorDTO> doc) {
        DoctorDTO newdoc = new DoctorDTO();
        newdoc.setCode(checkStringInput(constant.Message.MSG_CODE_MESSAGE));
        if (!doc.isEmpty()) {
            for (int i = 0; i < doc.size(); i++) {
                if (checkCodeExist(doc, newdoc.getCode())) {
                    doc.remove(i);
                } else if (i == doc.size() - 1 && !checkCodeExist(doc, newdoc.getCode())) {
                    System.out.println("Doctor code does not exist");
                }
            }
        } else {
            System.out.println("List empty.");
        }

    }

    public void PrintDoctorInfo(ArrayList<DoctorDTO> doc) {
        DoctorView.displayHeader();
        for (int i = 0; i < doc.size(); i++) {
            System.out.println(String.format("%-10s%-15s%-25s%-20s\n", doc.get(i).getCode(), doc.get(i).getName(), doc.get(i).getSpecialization(), doc.get(i).getAvailability()));
        }
    }

    public static ArrayList<DoctorDTO> listFoundByName(ArrayList<DoctorDTO> ld, String name) {
        ArrayList<DoctorDTO> listFoundByName = new ArrayList<>();
        for (DoctorDTO doctor : ld) {
            if (doctor.getName().contains(name)) {
                listFoundByName.add(doctor);
            }
        }
        return listFoundByName;
    }

    public static void searchDoctor(ArrayList<DoctorDTO> ld) {
        String nameSearch = checkStringInput(constant.Message.MSG_NAME_MESSAGE);
        ArrayList<DoctorDTO> listFoundByName = listFoundByName(ld, nameSearch);
        if (listFoundByName.isEmpty()) {
            System.err.println("No Result.");
        } else {
            System.out.printf("%-10s%-15s%-25s%-20s\n", "Code", "Name",
                    "Specialization", "Availability");
            for (DoctorDTO doctor : listFoundByName) {
                System.out.printf("%-10s%-15s%-25s%-20d\n", doctor.getCode(),
                        doctor.getName(), doctor.getSpecialization(),
                        doctor.getAvailability());
            }
        }
    }


}
