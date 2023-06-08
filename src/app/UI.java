package app;

import java.util.Scanner;

import tree.BinaryTree;

public class UI {
    public static void printHeader(){
        System.out.println("Equipe:");
        System.out.println("João Pedro Soares");
        System.out.println("Luiz Filipe de Matos Ramos");
        System.out.println("Maria Vitória Berto");
        System.out.println("Rafael Benitez");
        System.out.println();
        System.out.println("Professor: Leandro Santana");
        System.out.println("Disciplina: Estrutura de Dados I");
    }

    public static void printOptions(Scanner sc, BinaryTree tree){
        System.out.println("             Árvore Binária");

        System.out.println("""
            1 - INSERIR - fornecer RGM e Nome
            2 - REMOVER UM NÓ - fornecer o RGM a remover
            3 - PESQUISAR - fornecer o RGM a pesquisar
            4 - ESVAZIAR A ÁRVORE
            5 - EXIBIR A ÁRVORE - três opções: PRÉ, IN ou PÓS
            0 - SAIR
                """);
        System.out.println();
        System.out.print("Opção: ");
        int op = sc.nextInt();
        sc.nextLine();
        executeOptions(op, sc, tree);
    }


    public static void executeOptions(int op, Scanner sc, BinaryTree tree){
        switch (op) {
            case 1:
                insert(sc, tree);
                break;
            
            case 2:
                remove(sc, tree);
                break;
            case 3:
                search(sc, tree);
            break;
            case 4:
                emptyTree(sc, tree);
                break;
            case 5:
                show(sc, tree);
                break;
            
            default:
                System.out.println("Opção Inválida!");
                confirmBackToMenu(sc, tree);
                break;
            case 0:
                System.out.println("Saindo... Obrigado por usar nosso programa!");
                break;
        }
    }

    private static void insert(Scanner sc, BinaryTree tree) {

        confirmBackToMenu(sc, tree);
    }

    private static void remove(Scanner sc, BinaryTree tree) {
        
        confirmBackToMenu(sc, tree);
    }
    
    private static void search(Scanner sc, BinaryTree tree) {
        
        confirmBackToMenu(sc, tree);
    }

    
    private static void emptyTree(Scanner sc, BinaryTree tree) {

        confirmBackToMenu(sc, tree);
    }

    private static void show(Scanner sc, BinaryTree tree) {

        confirmBackToMenu(sc, tree);
    }

    private static void confirmBackToMenu(Scanner sc, BinaryTree tree){
        System.out.println("Pressione ENTER para voltar ao menu");
        sc.nextLine();
        printOptions(sc, tree);
    }
}
