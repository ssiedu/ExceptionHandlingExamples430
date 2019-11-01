
public class ExOne {
    public static void main(String[] args) {
        //this main method will accept two nos from Command Line Args
        //will divide the first number by second one
        int x=0, y=0, z=0;
        try{
            x=Integer.parseInt(args[0]);
            y=Integer.parseInt(args[1]);
            z=x/y;
        }catch(NumberFormatException e){
            System.out.println("Invalid Numbers");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Insufficient Values");
        }catch(ArithmeticException e){
            z=x/2;
        }catch(Exception e){
            System.out.println("Unknown Error");
        }
        
        System.out.println("Result : "+z);
        System.out.println("End-of-Main");
    }
}
