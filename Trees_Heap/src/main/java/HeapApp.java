public class HeapApp {
    public static void main(String[] args) {
        MyHeap heap=new MyHeap(10);
        heap.insert(61);
        heap.insert(120);
        heap.insert(52);
        heap.insert(45);
        heap.insert(81);
        heap.printHeap();//120, 81, 52, 45, 61,//max 120
        heap.remove();
        heap.printHeap();//81, 61, 52, 45,
        heap.insert(130);
        heap.printHeap();//130, 81, 52, 45, 61,
        heap.remove();
        heap.printHeap();//81, 61, 52, 45,
     //   int[] numbers={1,2,5,6,8,21,0};
        int[] numbers={5,8,6,8,8,2,1,5,7,6,7,4};
        MyHeap heap2=new MyHeap(numbers);

        heap2.printHeap();

    }
}
