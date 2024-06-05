package application;
import java.io.File;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: "); // registra o caminho do diretorio
        String strPath = sc.nextLine();

        File path = new File(strPath); // instancia o caminho do diretorio
        File[] folders = path.listFiles(File::isDirectory); // guarda no vetor e filtra apenas os diretorios

        System.out.println("FOLDERS:");

        for (File folder : folders) {
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile); // guarda no vetor e filtra apenas os arquivos
        System.out.println();
        System.out.println("FILES:");

        for (File file : files) {
            System.out.println(file);
        }

        boolean success = new File(strPath + "\\subdir").mkdir();
        System.out.println("Directory created successfully: " + success);
        sc.close();
    }
}