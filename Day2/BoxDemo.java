package Day2;

class DemoClassObject {
  double height;
  double width;
  double depth;
}
 class BoxDemo{
  public static void main(String[] args) {
    
    //Firstly we create a single copy of objects.
    //Here We create two Copies of DemoClassObject it won't affect one object 
    //have no effect to another intance variable.
    //Note:new operator dynamically allocates memory for an object
    DemoClassObject object1 = new DemoClassObject();
    DemoClassObject object2 = new DemoClassObject();

    object1.height = 10;
    object1.width = 10;
    object1.depth = 20;
    int vol1 = (int)(object1.height*object1.depth*object1.width);

    //Second copy of instance variable of DemoClassObject
    object2.height = 5.0;
    object2.width = 4.5;
    object2.depth = 7.8;
    double vol2 = object2.height*object2.width*object2.depth;

    System.out.println("Volume 1 is:"+vol1);
    System.out.println("Volume 2 is:"+vol2);

     //Assigning Object Reference variable
    System.out.println("Without Referance object1:"+object1.height);
    object1 = object2;
    System.out.println("Object1 reference to Object2:"+object1.height);
    System.out.println("Object1 reference to Object2:"+object1.width);
    System.out.println("Object1 reference to Object2:"+object1.depth);

    //Note:Thus any changes made to the 'Object 2' will affect the 'Object1' which is referring.
    
  }

}
