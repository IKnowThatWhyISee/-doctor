package p0055;

import controller.DoctorManament;
import static controller.DoctorManament.AddDoctor;
import static controller.DoctorManament.DeleteDoctor;
import static controller.DoctorManament.UpdateDoctor;
import dto.DoctorDTO;
import java.util.ArrayList;
import static utils.Validation.getChoice;

public class P0055 {

    public static void main(String[] args) {
        DoctorManament controller = new DoctorManament();
        ArrayList<DoctorDTO> doc = new ArrayList<>();
        
        while (true) {
            controller.showMenu();
            int choice = getChoice(constant.Message.MSG_OPTION_MESSAGE, 1, 6);
            switch (choice) {
                case 1:
                    System.out.println("--------- Add Doctor ---------");
                    AddDoctor(doc);
                    break;
                case 2:
                    System.out.println("--------- Update Doctor ---------");
                    UpdateDoctor(doc);
                    break;
                case 3:
                    System.out.println("--------- Delete Doctor ---------");
                    DeleteDoctor(doc);
                    break;
                case 4:
                    System.out.println("--------- Search Doctor --------");
                    controller.searchDoctor(doc);
                    break;
                case 5:
                    controller.PrintDoctorInfo(doc);
                    break;
                case 6:
                    return;
            }
        }

    }

}
