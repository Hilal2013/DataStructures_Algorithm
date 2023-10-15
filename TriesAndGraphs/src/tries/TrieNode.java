package tries;

import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;

public class TrieNode {

    public Map<Character, TrieNode> children=new HashMap<>();
    public boolean isWord=false; //app false //appl false //apple true


}
