package serializable;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DocGhi {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("docghi.txt");
		if(!file.exists())
			file.createNewFile();
		
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
		dataOutputStream.writeBytes("cuong dinh\nok\n");
		dataOutputStream.writeInt(4);
		dataOutputStream.writeDouble(6.3);
		fileOutputStream.close();
		dataOutputStream.close();
		
		FileInputStream fileInputStream = new FileInputStream(file);
		DataInputStream objectInputStream = new DataInputStream(fileInputStream);
		String s = objectInputStream.readLine();
		String s1 = objectInputStream.readLine();
		int i = objectInputStream.readInt();
		Double d = objectInputStream.readDouble();
		System.out.println( i +" "+ d + s + "\n" + s1);

	}

}
