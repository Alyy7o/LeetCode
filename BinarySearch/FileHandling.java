import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class FileHandling {
    public static void main(String[] args) {
        
        // Create File
        // try{
            
        //     File myFile = new File("new.txt");
        //     myFile.createNewFile();
        // }
        // catch(Exception e){
        //     System.out.println("Unable to create");
        // }

        // Write in file
        // try{
        //     FileWriter fileWrite = new FileWriter("new.txt");
        //     fileWrite.write("This is my new File\nI am writing here");
        //     fileWrite.close();
        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }

        // Read a file
        // try{
        //     File read = new File("new.txt");
        //     Scanner sc = new Scanner(read);

        //     while(sc.hasNextLine()){
        //         System.out.println(sc.nextLine());
        //     }
        //     sc.close();
        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }

        // Delete file
        File del = new File("new.txt");
        if(del.delete()){
            System.out.println(del.getName() + " Deleted");
        }
        else{
            System.out.println("Error");
        }
    }
}
