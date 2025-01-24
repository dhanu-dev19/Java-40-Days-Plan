package Day37;


enum Color {
  RED("red"), GREEN("green"), BLUE("blue"); //It helps to get abbrevations like Eg: WHO ("World Health Organization")

  private String value;

  Color(String value)  //Constructor for assign the values to the enums
  {
    this.value = value;
  }
  public String getValue()  //It helps to get the values of Enums
  {
   return value;
  }

}

public class EnumColor {
 public static void main(String[] args) {

  Color colorobj = Color.RED;

  System.out.println("Red Enum name: "+colorobj.name());
  System.out.println("Red Enum Value:  "+colorobj.getValue());

  for(Color color: Color.values()){
    System.out.println("Enum value:"+color.name());

 }
}
}
