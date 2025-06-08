package model;

public class Doctor {
    private String code;
    private String name;
    private String Specialization;
    private int Availability;

    public Doctor() {
    }

    public Doctor(String code, String name, String Specialization, int Availability) {
        this.code = code;
        this.name = name;
        this.Specialization = Specialization;
        this.Availability = Availability;
    }
    
    
}
