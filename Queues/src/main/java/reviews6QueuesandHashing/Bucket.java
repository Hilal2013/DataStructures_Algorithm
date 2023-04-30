package reviews6QueuesandHashing;

import java.util.LinkedList;

public class Bucket {
    LinkedList<KeyValue<Integer,Integer>> bucket;

    public Bucket() {
        this.bucket = new LinkedList<KeyValue<Integer,Integer>>();
    }
    public Integer get(int key){
        for(KeyValue<Integer,Integer> pair:bucket ){
          if(pair.key.equals(key))  return pair.value;
        }
        return -1;
    }
    public void update(int key,int value) {
        //if element exists update it//if no such element and put
        boolean found = false;
        for (KeyValue<Integer, Integer> pair : bucket) {
            if (pair.key.equals(key)) {
                pair.value = value;
            }
            ;
            found = true;
        }
        if (!found) {
            this.bucket.add(new KeyValue<>(key, value));
        }
    }
    public void remove(int key) {
        //if element exists update it//if no such element and put
        boolean found = false;
        for (KeyValue<Integer, Integer> pair : bucket) {
            if (pair.key.equals(key)) {
                this.bucket.remove(pair);
                break;
            }

        }
    }}
