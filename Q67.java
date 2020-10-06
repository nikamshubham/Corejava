package JAVA;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.StreamCorruptedException;

public class Q67 {

	public static void main(String[] args) throws StreamCorruptedException {
		try {
			FileInputStream is = new FileInputStream("C:\\Users\\User\\Desktop\\CDAC\\JAVA\\core_java_workspace\\Assignment\\src\\JAVA\\abc.txt");
			ObjectInputStream ois = new ObjectInputStream(is);
			Q67 emp = (Q67) ois.readObject();
			ois.close();
			is.close();
			System.out.println(emp.toString());
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}

}