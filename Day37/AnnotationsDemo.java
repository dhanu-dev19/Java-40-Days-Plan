package Day37;

import java.lang.annotation.RetentionPolicy;
//import java.lang.reflect.Method;

//Annotations are starts with @ like @override the methods to reduce time

@Retention(RetentionPolicy.RUNTIME)

public class AnnotationsDemo {

  @MyCustomAnnotation(value = 10)

  public void sayHello()
  {
    System.out.println("my custom annotation");

  }


  /*public static void main(String[] args) {
     AnnotationsDemo custobj = new AnnotationsDemo();
     Method methodval =(Method) custobj.sayHello();

     MyCustomAnnotation myCustomAnnotation = methodval.getAnnotation(MyCustomAnnotation.class);
     System.out.println(myCustomAnnotation);

  }*/

}
