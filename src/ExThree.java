
import java.io.FileReader;


public class ExThree {
    public static void main(String[] args) {

        try(FileReader fr=new FileReader("e:/data/info.txt")){
            char ch[]=new char[15];
            fr.read(ch);
            System.out.println(ch);
        }catch(Exception e){
            System.out.println("Some Problem");
        }
        
        
        /*
        FileReader fr=null;
        try{
            fr=new FileReader("e:/data/info.txt");
            char ch[]=new char[15];
            fr.read(ch);
            System.out.println(ch);
            
        }catch(Exception e){
            System.out.println("Some Problem");
        }finally{
            try{
            fr.close();
            }catch(Exception e){}
        }
        */
    }
}
