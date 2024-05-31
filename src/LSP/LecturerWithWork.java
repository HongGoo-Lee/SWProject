package LSP;

public class LecturerWithWork extends Lecturer {
    public LecturerWithWork() {
        lecturer = "직업이 있는 강사";
        charge = 45000;
    }

    @Override
    public void lecturerInfo() {
        System.out.println(lecturer);
        System.out.println("강사료: " + charge + "원\n");
    }
}
