/*
static final int ALPHABET_SIZE = 26;

    // trie node
    static class TrieNode {
        TrieNode[] children = new TrieNode[ALPHABET_SIZE];

        // isEndOfWord is true if the node represents
        // end of a word
        boolean isEndOfWord;

        TrieNode() {
            isEndOfWord = false;
            for (int i = 0; i < ALPHABET_SIZE; i++) children[i] = null;
        }
    };
*/
//Function to insert string into TRIE.
static void insert(TrieNode root, String key) 
{
    // Your code here
    TrieNode t = root;
    for(int i=0;i<key.length();i++){
        if(t.children[key.charAt(i) - 'a'] == null){
            t.children[key.charAt(i) - 'a'] = new TrieNode();
        }
        t = t.children[key.charAt(i) - 'a'];
        if(i == key.length()-1){
            t.isEndOfWord = true;
        }
    }
}

//Function to use TRIE data structure and search the given string.
static boolean search(TrieNode root, String key)
{
    // Your code here
    TrieNode t = root;
    for(int i=0;i<key.length();i++){
        if(t.children[key.charAt(i) - 'a'] == null){
            return false;
        }
        t = t.children[key.charAt(i) - 'a'];
        if(i == key.length()-1 && t.isEndOfWord){
         return true;   
        }
    }
    return false;
}
