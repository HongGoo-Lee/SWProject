package LSP;

public class LecturerNomal extends Lecturer{
    public LecturerNomal(){
        lecturer = "일반 강사";
    }
    public void lecturerInfo(){
        System.out.println(lecturer);
        System.out.println("강사료:" + charge+"원\n");
    }
    
}
