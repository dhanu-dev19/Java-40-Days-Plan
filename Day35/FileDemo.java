package Day35;

import java.io.File;

public class FileDemo {

    static  void Print(String s)
    {
        System.out.println(s);
    }

    public static void main(String[] args) {
        File f1 = new File("\\OneDrive\\Documents");

        Print("File name: "+f1.getName());
        Print("Path:"+f1.getPath());
        Print("Abs path:"+f1.getAbsolutePath());
        Print("Parent:"+f1.getParent());
        Print(f1.exists()?"true":"False");
        Print(f1.canWrite()? "Writable":"is not Writable");
        Print(f1.canRead()? "Readable":"is not readable");

    }
}
