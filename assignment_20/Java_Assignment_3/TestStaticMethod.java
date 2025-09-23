package Java_Assignment_3;

public class TestStaticMethod {
    public static void main(String[]args){
        Student.changeCollege();
        Student s1= new Student(100, "djamillah chance");
        Student s2= new Student(200, "Niyigena djamila");
        Student s3= new Student(300, "lucky");

        System.out.println("id: "+s1.id + " Name: "+s1.name +" "+"College: "+Student.college);
        System.out.println("id: "+s2.id + " Name: "+s2.name+" "+"College: "+Student.college);
        System.out.println("id: "+s3.id + " Name: "+s3.name+" "+"College: "+Student.college);

    }
}
