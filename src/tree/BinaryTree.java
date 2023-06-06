package tree;

import entities.Student;

public class BinaryTree {
    private Node root;


    public BinaryTree() {
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void insert(Student student){
        Node newNode = new Node(student);
        insert(root, newNode);
    }

    private void insert(Node node, Node newNode){

        if (root == null){
            root = node;
        }else {
            if (newNode.getStudent().getRgm() < node.getStudent().getRgm()){
                if (node.getLeft() == null){
                    node.setLeft(newNode);
                }else{
                    insert(node.getLeft(), newNode);
                }
            } else if (newNode.getStudent().getRgm() > node.getStudent().getRgm()) {
                if (node.getRight() == null){
                    node.setRight(newNode);
                }else {
                    insert(node.getRight(), newNode);
                }
            }
        }
    }

    private void remove(Node node, Long rgm){
        
    }

    public Student search(Long rgm){
        return null;
    }

    private Student search(Node node, Long rgm){
        return null;
    }

    public void emptyTree(){
        
    }

    private void emptyTree(Node node){
        
    }

    public void printTreeInOrder(){
        
    }

    private void printTreeInOrder(Node node){
        
    }

    public void printTreePreOrder(){
        
    }

    private void printTreePreOrder(Node node){
        
    }

    public void printTreePostOrder(){
        
    }

    private void printTreePostOrder(Node node){
        
    }
    
}
