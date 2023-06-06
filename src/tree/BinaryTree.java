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

    public void insert(Student student) {
        
    }

    private void insert(Node node, Student student) {
        
    }

    public void remove(Long rgm) {
        
    }

    private void remove(Node node, Long rgm) {
        
    }
    
    public Student search(Long rgm) { // recebe um RGm e retorna o student
        return search(root, rgm);
    }
    
    private Student search(Node node, Long rgm) {
        if (node == null || node.getStudent().getRgm().equals(rgm)) { // verifica duas condições: se o nó é nulo ou se encontrou o RGm
            return node != null ? node.getStudent() : null; // retorna o estudante caso encontrado, caso contrário retorna null
        }
    
        if (rgm < node.getStudent().getRgm()) {
            return search(node.getLeft(), rgm); // continua a busca no lado esquerdo da árvore
        } else {
            return search(node.getRight(), rgm); // continua a busca no lado direito da árvore
        }
    }
    
    public void emptyTree() {
        
    }

    private void emptyTree(Node node) {
        
    }

    public void printTreeInOrder() {
        
    }

    private void printTreeInOrder(Node node) {
        
    }

    public void printTreePreOrder() {
        
    }

    private void printTreePreOrder(Node node) {
        
    }

    public void printTreePostOrder() {
        
    }

    private void printTreePostOrder(Node node) {
        
    }
}
