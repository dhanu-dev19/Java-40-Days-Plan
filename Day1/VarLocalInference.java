package Day1;

public class VarLocalInference {
  public static void main(String[] args) {
   var name = "Dhanush";
   System.out.println(name);
   /*var number;
     number = 10;  Note: Var Cannot use without Intailizer.*/
     var num = 10;
     System.out.println(num);
     var ch = 'c';
     System.out.println(ch);
     var decimal = 453.34D;
     System.out.println(decimal); 

     var num1 = 10;
     int num2 = 20;
     int result = num1+num2;//Compiler Automatically infer the type of var no need to casting.
     System.out.println(result);

//Note: We can use Var as variable beacuse it not predefined identifier.
     int var = 10;
     System.out.println(var);

     //Var: illegal to use following cases.
     //1.class name.
     //2.Cannot be used in Constructor.
     //3.cannot be used in method parameters,return types.
     //3.Cannot be used as array initialize directly'
     //4. var can be used only to declare local variables.

     //Restrictions!!!
     //1.Only one variable can be declared and intialize
     //2.cannot be used null as initilizer.
     //3.we cannot array intial like this:var Array = {1,2,3};
     
     //We can declare an array.
     var array = new int[10]; // valid

     

     //var[] array = new int[10]; Invalid
     //var array[] = new int[10]; invalid



      
  }
}
