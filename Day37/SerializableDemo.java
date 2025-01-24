package Day37;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {

 //It is also called security purpose
// private static final long serialVersionID = 1L;

 private String name;
 private int age;
 private String address;

 public Student(String name,
  int age,
  String address){
    this.name = name;
    this.age = age;
    this.address = address;
  }

  public void setName(String name){
    this.name = name;
  }

  public void setAge(int age)
  {
    this.age = age;
  }

  public void setAddress(String address)
  {
    this.address = address;
  }
  public String getName(){
    return name;
  }

  public int getAge(){
    return age;
  }

  public String getAddress()
  {
    return address;
  }

  public String toString()
  {
    return("Student name is "+this.getName()+
      ", age is:"+this.getAge()+" and address is: "+this.getAddress());
  }

}

public class SerializableDemo {
  public static void main(String[] args) throws ClassNotFoundException {
      Student student = new Student("Darshan", 20, "K R Pet");

      String filename = "C:\\Users\\Dhanush\\OneDrive\\Desktop\\Javaprograms\\Day37\\Test.txt";

      FileOutputStream fileOut = null;
      ObjectOutputStream objOut = null;


      //Serialization
      try{
        fileOut = new FileOutputStream(filename);
        objOut = new ObjectOutputStream(fileOut);
        objOut.writeObject(student);

        objOut.close();
        fileOut.close();
        System.out.println("Object has been Serialized: \n"+student);
      } catch(IOException ex){
        System.out.println("IoException is caught");
      }

      //Deserialization
      FileInputStream fileIn = null;
      ObjectInputStream objIn = null;

      try{
        fileIn = new FileInputStream(filename);
        objIn = new ObjectInputStream(fileIn);

        Student object = (Student) objIn.readObject();

        System.out.println("Object has been deserialized: \n"+object);
         fileIn.close();
         objIn.close();
      }
      catch(IOException ex){
        System.out.println("IOException is caught");
      }
    }
}
