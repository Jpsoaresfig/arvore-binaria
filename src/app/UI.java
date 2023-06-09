package app;

import java.util.Scanner;

import entities.Student;
import tree.BinaryTree;

public class UI {
    public static void printHeader() {
        System.out.println("Equipe:");
        System.out.println("João Pedro Soares");
        System.out.println("Luiz Filipe de Matos Ramos");
        System.out.println("Maria Vitória Berto");
        System.out.println("Rafael Benitez");
        System.out.println();
        System.out.println("Professor: Leandro Santana");
        System.out.println("Disciplina: Estrutura de Dados I");
    }

    public static void printOptions(Scanner sc, BinaryTree tree) {
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

    public static void executeOptions(int op, Scanner sc, BinaryTree tree) {
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
        System.out.print("Digite o RGM a remover: ");
        Long rgm = sc.nextLong();
        sc.nextLine();

        Student removedStudent = tree.search(rgm);
        if (removedStudent != null) {
            System.out.println("Tem certeza que deseja remover o estudante " + removedStudent.getName() + "? (S/N)");
            System.out.print("Opção: ");
            String confirm = sc.nextLine();

            if (confirm.equalsIgnoreCase("S")) {
                tree.remove(rgm);
            } else {
                System.out.println("Operação cancelada!");
            }

        } else {
            System.out.println("Estudante não encontrado.");
        }

        confirmBackToMenu(sc, tree);
    }

    private static void search(Scanner sc, BinaryTree tree) {

        System.out.print("Digite o RGM a pesquisar: ");
        Long rgm = sc.nextLong();
        sc.nextLine();

        // Chama a função search e obtém o Student correspondente
        Student foundStudent = tree.search(rgm);

        if (foundStudent != null) {
            System.out.println("Estudante encontrado: " + foundStudent.getName());
        } else {
            System.out.println("Estudante não encontrado.");
        }

        confirmBackToMenu(sc, tree);
    }

    private static void emptyTree(Scanner sc, BinaryTree tree) {
        System.out.println("Tem certeza que deseja esvaziar a árvore? (S/N)");
        System.out.print("Opção: ");
        String confirm = sc.nextLine();
        if (confirm.equalsIgnoreCase("S")) {
            tree.setRoot(null);
            System.out.println("Árvore esvaziada com sucesso!");
        } else {
            System.out.println("Operação cancelada!");
        }
        confirmBackToMenu(sc, tree);
    }

    private static void show(Scanner sc, BinaryTree tree) {

        if (tree.getRoot() == null) {
            System.out.println("A árvore não existe.");
        }
        else {

            System.out.println("1 - Mostrar em ordem \n2 - Mostrar em pré-ordem \n3 - Mostrar em pós-ordem:");
            int op = sc.nextInt();
            sc.nextLine();
            switch(op){
                case 1:
                    tree.printTreeInOrder();
                    break;
                case 2:
                    tree.printTreePreOrder();
                    break;
                case 3:
                    tree.printTreePostOrder();
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    show(sc, tree);
                    break;
        }
    }

        confirmBackToMenu(sc, tree);
    }

    private static void confirmBackToMenu(Scanner sc, BinaryTree tree) {
        System.out.println("Pressione ENTER para voltar ao menu");
        sc.nextLine();
        printOptions(sc, tree);
    }
}
