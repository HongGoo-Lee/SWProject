package LSP;

public class LecturerAtGS extends Lecturer {
    public LecturerAtGS() {
        lecturer = "대학원 강사";
        charge = 180000;
    }

    @Override
    public void lecturerInfo() {
        System.out.println(lecturer);
        System.out.println("강사료: " + charge + "원\n");
    }
}
