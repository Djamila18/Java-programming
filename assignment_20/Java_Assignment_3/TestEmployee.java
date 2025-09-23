package Java_Assignment_3;

public class TestEmployee {
    public static void main(String []args){
        Employee e1= new Employee();
        Employee e2= new Employee();
        Employee e3= new Employee();

        e1.insertInfo(100, "djamila", 100000);
        e2.insertInfo(200, "sandrine",350000);
        e3.insertInfo(300, "Niyigena",40000);

        e1.display();
        e2.display();
        e3.display();
    }
}
