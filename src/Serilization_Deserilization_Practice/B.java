package Serilization_Deserilization_Practice;
import java.io.*;

public class B {
	
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("E:\\Filehandling\\A.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			A a1 = new A();
			oos.writeObject(a1);
			
			oos.close();
			fos.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
