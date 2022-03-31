package sesstion6.lab1;

import java.util.ArrayList;

public class StudentList {
    public String id,dateofBirth,address;
    public double gpa;
    public ArrayList<String> name = new ArrayList<>();

    public StudentList(String id, String name, String dateofBirth, String address, double gpa){
        this.id = id;
        this.name.add(name);
        this.dateofBirth = dateofBirth;
        this.address = address;
        this.gpa = gpa;
    }
}
