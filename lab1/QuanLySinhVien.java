package sesstion6.lab1;

import sesstion4.Assignment4.DSLH;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class QuanLySinhVien {
    public ArrayList<StudentList> List = new ArrayList<>();

    public void AddStudent(String id, String name, String dateofBirth, String address, double gpa){
        for(StudentList p:List){
            if(p.id == id){
                for(String s:p.name){
                    if(s == name) return;
                }
                p.name.add(name);
                return;
            }
        }
        List.add(new StudentList(id,name,dateofBirth,address,gpa));
    }
    public void EditStudent(String id, String name) {
        for(StudentList p:List){
            if(p.id == id){
                p.name.removeAll(p.name);
                p.name.add(name);
                return;
            }
        }
    }
    public void DeleteStudent(String id) {
        for(StudentList p:List){
            if(p.id == id){
                List.remove(p);
                return;
            }
        }
    }
    public void sort(){
        Collections.sort(List, new Comparator<StudentList>(){
            public int compare(StudentList o1, StudentList o2){
                return o1.name.compareTo(o2.name);
            }
        });
        for (StudentList p:List){
            System.out.println("\t "+p.name);
        }
    }

}
