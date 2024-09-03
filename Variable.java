
public class Variable{
    int a=20; //Thuis is an instance variable
    static int b=10; //This is a static variable
    public static void localmethod(){
        int c=15; //This is a local variable
        System.out.println("the local variable"+c);
        }
         public void instancemethod(){
            //Accessing instance variable
            System.out.println(a);
            //Accessing static variable
            System.out.println(b);
    }
    //Static Method
    public static void staticmethod(){
        //Accessing static variable
        System.out.println(b);
        //Note: Can't access instance variable directly in a static method
        //System.out.println(instance); 
        //This would cause an error
        
    }
    public static void main(String []args){
        //creation of an object
        Variable Yvette=new Variable();
        //Calling instancemethod
        Yvette.instancemethod();
        //calling staticmethod
        localmethod();
        staticmethod();
    }
}