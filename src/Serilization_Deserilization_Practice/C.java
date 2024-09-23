package Serilization_Deserilization_Practice;
import java.io.*;

public class C {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("E:\\Filehandling\\A.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			A a1 = (A) ois.readObject();
			System.out.println(a1.name);
			System.out.println(a1.pswd);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
