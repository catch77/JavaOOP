import model.Student;

public class main {
    public static void main(String args[]) {
        Student student = new Student();
        student.setName("AA");
        student.setAge(11);
        student.setNumber("123456");
        student.setSex("female");

        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getNumber());
        System.out.println(student.getSex());
    }
}
