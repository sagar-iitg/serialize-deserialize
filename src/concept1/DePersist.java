package concept1;
import java.io.*;


class DePersist{
    public static void main(String[] args)throws Exception{
        FileInputStream f=new FileInputStream("file1.txt");
        BufferedInputStream bf=new BufferedInputStream(f);
        ObjectInputStream in=new ObjectInputStream(bf);
        Student s=(Student)in.readObject();
        System.out.println(s.id+" "+s.name+" "+s.age);
        in.close();
    }
}