package questionsss;
import java.io.*;

class Student implements Serializable {
	int id;
	String name;
	
	Student(int id,String name){
		this.id = id;
		this.name = name;
	}
}

public class OOP1 {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("app.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Student s = (Student) ois.readObject();
		System.out.print(s.id + " , " + s.name);
		
		ois.close();
		fis.close();
	}
}
