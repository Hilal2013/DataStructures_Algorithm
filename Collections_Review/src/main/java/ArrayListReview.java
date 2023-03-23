import java.sql.SQLOutput;
import java.util.*;

public class ArrayListReview {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Jack"));
        students.add(new Student(2, "Julia"));
        students.add(new Student(3, "Mike"));
        students.add(new Student(4, "Mary"));

        //iteration on ArrayList
        //1.for loop with get(index)
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
         //2.Iterator
        //Forward Iteration
        System.out.println("Printing with iterator..............");
        Iterator iter = students.listIterator();
        while (iter.hasNext()) {//i cannot jump into specific element
            System.out.println(iter.next());
        }

        //Backwars Iteration
        System.out.println("Printing Backwards with iterator..............");
//public interface ListIterator<E> extends Iterator<E>
//Iterator has hasNext
//ListIterator has hasNext plus hasPrevious// to access hasPrevious cast it
//to use hasPrevious() method //you need to qualifier there are different implementations
//which one do you want to use
        while (((ListIterator<?>) iter).hasPrevious()) {//this will start from last
            System.out.println(((ListIterator<?>) iter).previous());
        }
        //or
        ListIterator iter1 = students.listIterator();
        while (iter1.hasPrevious()) {
            System.out.println(iter1.hasPrevious());
        }
// 3. for each loop
        System.out.println("Printing with for_each loop..............");
        for (Student student : students) {
            System.out.println(student);
        }

// 4. Lambda
        System.out.println("Printing with Lambda function loop..............");
students.forEach(System.out::println);//students.forEach(student-> System.out.println(student));

        // Sorting Elements in List using comparator interface
        System.out.println("Sorting with Comparator Interface by Id Desc......");
Collections.sort(students,new sortByIdDesc());
        System.out.println(students);
        //[Student{id=4, name='Mary'}, Student{id=3, name='Mike'}, Student{id=2, name='Julia'}, Student{id=1, name='Jack'}]
        students.forEach(System.out::println);

        System.out.println("Sorting with Comparator Interface by Name Desc......");
        Collections.sort(students, new sortByNameDesc());
        students.forEach(student-> System.out.println(student));

    }
    //  implementations of  Comparator
static class sortByIdDesc implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {//template
            return o2.getId()- o1.getId();
        }
    }
    static class sortByNameDesc implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {//template
            return o2.getName().compareTo(o1.getName());
        }
    }

}
