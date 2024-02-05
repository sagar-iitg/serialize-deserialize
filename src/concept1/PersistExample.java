package concept1;

import java.io.*;

class PersistExample{
    public static void main(String args[])throws Exception{
        Student s1 =new Student(211,"ravi",22);//creating object
        //writing object into file
        FileOutputStream f=new FileOutputStream("file1.txt");
        BufferedOutputStream x=new BufferedOutputStream(f);
        ObjectOutputStream out=new ObjectOutputStream(x);
        out.writeObject(s1);
        out.flush();
        out.close();
        f.close();
        System.out.println("success");
    }
}