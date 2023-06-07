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
            root = newNode;
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

    public void remove(Long rgm){
        root = remove(root, rgm);
    }

    private Node remove(Node node, Long rgm){
        // se não encontrar
        if(node == null){
            System.out.println("Aluno não encontrado");
            return null;
        }
        // se o rgm for menor que o rgm do nó atual, continua a busca no lado esquerdo da árvore
        if (rgm < node.getStudent().getRgm()){
            node.setLeft(remove(node.getLeft(), rgm));
        }
        // se o rgm for maior que o rgm do nó atual, continua a busca no lado direito da árvore
        else if (rgm > node.getStudent().getRgm()){
            node.setRight(remove(node.getRight(), rgm));
        }
        // se o rgm for igual ao rgm do nó atual, encontrou o nó a ser removido
        else {
            // se o nó não tiver filhos
            if (node.getLeft() == null && node.getRight() == null){
                return null;
            }
            // se o nó tiver apenas um filho à direita
            else if (node.getLeft() == null){
                return node.getRight();
            }
            // se o nó tiver apenas um filho à esquerda
            else if (node.getRight() == null){
                return node.getLeft();
            }
            // se o nó tiver dois filhos
            else {
                Node next = findNext(node.getRight());
                node.setStudent(next.getStudent());
                node.setRight(remove(node.getRight(), next.getStudent().getRgm()));
            }
        }
        return node;
    }

    private Node findNext(Node node){
        if(node.getLeft() != null){
            return findNext(node.getLeft());
        }
        return node;
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
