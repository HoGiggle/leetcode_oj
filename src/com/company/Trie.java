package com.company;

/**
 * Created by MrHu on 2015/8/22.
 */
class TrieNode {
    // Initialize your data structure here.
    boolean isWord;
    TrieNode []nodes;

    public TrieNode() {
        isWord = false;
        nodes = new TrieNode[26];
    }
}

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        TrieNode tmp = root;
        for (int i = 0; i < word.length(); i++){
            int index = word.charAt(i)-'a';
            if (tmp.nodes[index] == null){
                tmp.nodes[index] = new TrieNode();
            }
            tmp = tmp.nodes[index];
        }
        tmp.isWord = true;
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        TrieNode tmp = root;
        for (int i = 0; i < word.length(); i++){
            int index = word.charAt(i)-'a';
            if (tmp.nodes[index] == null) return false;
            tmp = tmp.nodes[index];
        }
        return tmp.isWord;
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        TrieNode tmp = root;
        for (int i = 0; i < prefix.length(); i++){
            int index = prefix.charAt(i)-'a';
            if (tmp.nodes[index] == null) return false;
            tmp = tmp.nodes[index];
        }
        return true;
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("hello");
        trie.insert("word");
        trie.insert("world");
        System.out.println(trie.search("word"));
        System.out.println(trie.search("work"));
        System.out.println(trie.startsWith("wor"));
        System.out.println(trie.startsWith("word"));
        System.out.println(trie.startsWith("woll"));

    }
}

// Your Trie object will be instantiated and called as such:
// Trie trie = new Trie();
// trie.insert("somestring");
// trie.search("key");
