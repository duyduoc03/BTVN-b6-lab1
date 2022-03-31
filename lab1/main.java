package sesstion6.lab1;

public class main {
    public static void main(String args[]){
        QuanLySinhVien qlsv = new QuanLySinhVien();
        qlsv.AddStudent("SV01","Lê Duy Được","16-12-2003","Mỹ Đình - Hà Nội",9.9);
        qlsv.AddStudent("SV02","Mai Văn Thiện","19-02-2003","Mỹ Đình - Hà Nội",1.5);
        qlsv.AddStudent("SV03","Đỗ Minh Quang","01-01-2003","Trần Duy Hưng - Hà Nội",4);
        qlsv.AddStudent("SV04","Nguyễn Văn ABC","01-01-2000","gdshs - Hà Nội",1);

        //Add
        System.out.println("In:");
        for (StudentList pn: qlsv.List){
            System.out.println("\t" + pn.id + "\n\t" + pn.name + "\n\t" + pn.dateofBirth + "\n\t" + pn.address + "\n\t" + pn.gpa);
        }
        //Edit
        qlsv.EditStudent("SV04","ABC");
        System.out.println("Update Student SV04:");
        for (StudentList pn: qlsv.List){
            System.out.println("\t" + pn.id + "\n\t" + pn.name + "\n\t" + pn.dateofBirth + "\n\t" + pn.address + "\n\t" + pn.gpa);
        }
        //xoá
        qlsv.DeleteStudent("SV04");
        System.out.println("Xoá Student SV04:");
        for (StudentList pn: qlsv.List){
            System.out.println("\t" + pn.id + "\n\t" + pn.name + "\n\t" + pn.dateofBirth + "\n\t" + pn.address + "\n\t" + pn.gpa);
        }
        // sắp xếp theo điểm
    }
}
