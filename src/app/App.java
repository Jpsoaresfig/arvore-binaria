package app;

import java.util.Scanner;

import tree.BinaryTree;
import tree.ReadFile;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        ReadFile.read(tree);

        UI.printHeader();

        UI.printOptions(sc, tree);
        
        sc.close(); 
    }
}
