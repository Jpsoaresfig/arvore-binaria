package tree;

import java.io.BufferedReader;
import java.io.FileReader;

import entities.Student;

public class ReadFile {

    public static void read(BinaryTree tree){

        try(BufferedReader br = new BufferedReader(new FileReader("src/files/alunos.txt"))){

            String line;

            while((line = br.readLine()) != null){

                String[] fields = line.split(",");

                String name = fields[0];
                Long rgm = Long.parseLong(fields[1]);


                Student student = new Student(name, rgm);
                tree.insert(student);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}