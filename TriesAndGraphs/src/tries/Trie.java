package tries;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class Trie {
    TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        //starting point root in tree
        TrieNode currNode=root;
        // i need to put word character by character
        char[] arr = word.toCharArray();
        for (char c : arr) {
           if(!currNode.children.containsKey(c)) {
               //i need to insert that char
               currNode.children.put(c,new TrieNode());
           }
           currNode=currNode.children.get(c);
        }
        currNode.isWord=true;


    }

    public boolean search(String word) {
        TrieNode currNode=root;

        char[] arr = word.toCharArray();
        for (char c : arr) {
            if(!currNode.children.containsKey(c)) return false;
            currNode=currNode.children.get(c);
        }
        return  currNode.isWord;
    }

    public boolean startsWith(String prefix) {
        TrieNode currNode=root;
        char[] arr = prefix.toCharArray();
        for (char c : arr) {
            if(!currNode.children.containsKey(c)) return false;
            currNode=currNode.children.get(c);
        }
        return true;
    }


}
