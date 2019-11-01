
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExSix {

    
    public static void doIt() throws ClassNotFoundException{
        Class.forName("abcd");
    }
    public static void openFile(String fname){
        //opening the file to read
        try{
        FileReader fr=new FileReader(fname);
        System.out.println("File Opened Successfully");
        }catch(FileNotFoundException ex){
            System.out.println("File Is Not Available");
        }
        
        
    }
    
    public static void divide(int a, int b){
        if(b!=0){
        System.out.println("DIVISION : "+(a/b));
        }
    }
    
    
    
    public static void main(String args[]) throws FileNotFoundException, IOException{
        divide(100,20);
        openFile("d:/data/info1.txt");
        
        FileReader fr=new FileReader("abc");
        fr.read();
        
            
        
    }
}
