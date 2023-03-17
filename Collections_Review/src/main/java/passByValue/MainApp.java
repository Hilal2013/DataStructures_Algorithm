package passByValue;

public class MainApp {

    public static void main(String[] args) {

        int a = 10;//primitive it is not affecting original value
        String s = "John";//immutable //JOhn
        StringBuilder sb = new StringBuilder("John");
        Student student1 = new Student("Harry", "Wills", 15);
        System.out.println(student1);
        manipulateStudent(student1);
        System.out.println(student1);


    }

    private static void manipulateStudent(Student student) {
student.age=10;
    }

    public static void manipulateInt(int num){
        num++;//possible in method s

    }

    public static void manipulateStrBuilder (StringBuilder stringBuilder) {
        stringBuilder.append(" Doe");
        stringBuilder=null;
    }

    public static void manipulateStr (String str) {
str=str.concat(" Doe");
    }



}