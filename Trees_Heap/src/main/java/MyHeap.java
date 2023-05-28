import java.util.NoSuchElementException;

public class MyHeap {
    int[] items;
    int size;

    public MyHeap(int capacity) {
        this.items = new int[capacity];
        this.size = 0;
    }

    public int leftChildIndex(int index) {
        return 2 * index + 1;

    }

    public int rightChildIndex(int index) {
        return 2 * index + 2;

    }

    public int parentIndex(int index) {
        return (index - 1) / 2;

    }

    public boolean hasLeftChild(int index) {

//if any index less than size i have valid right or left child

        return leftChildIndex(index) < size;


    }

    public boolean hasRightChild(int index) {

//if any index less than size i have valid right or left child

        return rightChildIndex(index) < size;

    }

    public int largerChildIndex(int index) {
        //no child
        if (!hasLeftChild(index))
            return index;//completed property left-->right if there is no left child it means no child
            //if i have only one child//it means I have one left child no right child
        else if (!hasRightChild(index)) return leftChildIndex(index);
        else {
//            if(items[leftChildIndex(index)]>items[rightChildIndex(index)]) return leftChildIndex(index);
//            else return rightChildIndex(index);
            return items[leftChildIndex(index)] > items[rightChildIndex(index)] ? leftChildIndex(index) : rightChildIndex(index);

        }

    }

    public void swap(int first, int second) {
        int temp = items[first];
        items[first] = items[second];
        items[second] = temp;
    }

    public boolean isValidParent(int index) {
        if (!hasLeftChild(index)) return true;//means no child just parent so is valid
        else {
            boolean isValid = items[index] >= items[leftChildIndex(index)];
            if (hasRightChild(index)) {
                isValid = items[index] >= items[leftChildIndex(index)] && items[index] >= items[rightChildIndex(index)];

            }
            return isValid;
        }

    }

    public void insert(int value) {
        if (size == items.length) throw new IllegalStateException();
        else {
            items[size] = value;
            size++;
            //  items[size++]=value;
            bubbleUp();
        }

    }

    public void bubbleUp() {
        //int needs to start bottom from the last inserted element
        //calculate start point/index
        int index = size - 1;
        // while index >0 and child>parent
        // 1. swap child and parent
        // calculate next index = parent index
        while (index > 0 && items[index] > items[parentIndex(index)]) {
            swap(index, parentIndex(index));
            // assign index with the parent index
            index = parentIndex(index);//like current=current.next
        }
    }


    public int remove() {
        if (size == 0) throw new NoSuchElementException();//threre isno element to remove
        else {//if have more elements
            int result = items[0];//result=temp
            items[0] = items[--size];//item[0] will be last element//last element is that its index one less tha the sizeitems[--size]
            bubbleDown();
            return result;
        }
    }

    public void bubbleDown() {
        int index = 0;//im gonna start from index0 which is the root heap because i removed items 0 and i put last item
        int largerChildIndex;
        while (index <= size && !isValidParent(index)) {//if it isnot valid i need to swap
            largerChildIndex = largerChildIndex(index);
            swap(index, largerChildIndex);
            index = largerChildIndex;
        }
    }

    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(items[i] + ", ");
        }
        System.out.println();
    }

    public int peek() {
        if (size == 0) throw new NoSuchElementException();
        return items[0];
    }

    public void heapifySort(int[] array) {
        int index = array.length / 2 - 1;//start point
        while (index > 0) {
            if (items[largerChildIndex(index)] > items[index]) {//Compare the greatest of children with the parent//find larger greate
                bubbleUp();
            }
            index--;
        }

    }

}