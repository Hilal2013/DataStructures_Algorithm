public class UserListApp {

    public static void main(String[] args) {
        UserLinkedList list=new UserLinkedList();
        list.insertLast(new UserNode("Carol","Smith"));
        list.insertLast(new UserNode("Jack", "Reacher"));
        list.insertLast(new UserNode("John", "Miller"));
list.printNames();
list.deleteByName("Jack");
list.printNames();
list.insertFirst(new UserNode("Mike","Reel"));
        list.printNames();
    list.insertMiddle(new UserNode("Marry", "Reacher"),2);
        list.printNames();

    }
}
