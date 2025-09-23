package Java_Assignment_3;

public class TestStudent4 {
    public static void main(String[] args){
        Student s1= new Student(200,"Djamila");
        Student s2= new Student(300, "Sumaya");
        s1.insertRecord(200, "djamila");
        s2.insertRecord(300, "Sumaya");

        //Display info
        s1.displayInformation();
        s2.displayInformation();
    }
    }

