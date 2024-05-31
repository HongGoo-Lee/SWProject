package SRP;

public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        Grade grade = new Grade();

        course.course_registration();
        course.timetable();
        course.course_list();

        grade.grade_insert();
        grade.grade_check();
        grade.total_grade();
    }
}