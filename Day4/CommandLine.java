package Day4;

public class CommandLine {
  public static void main(String[] args) 
  {
    for(int index = 0; index < args.length; index++)
    {
       System.out.println("Args["+index+"]:"+args[index]);
    }
  }
}
