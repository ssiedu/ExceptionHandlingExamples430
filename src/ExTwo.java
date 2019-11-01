public class ExTwo {
     public static void main(String[] args) {
        int x=0, y=0, z=0;
        try{
            x=Integer.parseInt(args[0]);
            y=Integer.parseInt(args[1]);
            z=x/y;
        }catch(Exception e){
            System.out.println("Handling In Catch");
            System.out.println(args[2]);
        }finally{
            System.out.println("INSIDE FINALLY BLOCK");
        }
        
        System.out.println("Result : "+z);
        System.out.println("End-of-Main");
    }
}
