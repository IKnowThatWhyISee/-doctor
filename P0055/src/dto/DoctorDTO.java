package dto;

public class DoctorDTO {

    private  String code;
    private  String name;
    private  String Specialization;
    private  int Availability;

    public DoctorDTO() {
    }

    public DoctorDTO(String code, String name, String Specialization, int Availability) {
        this.code = code;
        this.name = name;
        this.Specialization = Specialization;
        this.Availability = Availability;
    }

    public  String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String Specialization) {
        this.Specialization = Specialization;
    }

    public  int getAvailability() {
        return Availability;
    }

    public void setAvailability(int Availability) {
        this.Availability = Availability;
    }

}
