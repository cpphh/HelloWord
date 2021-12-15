package serializable;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DocGhi {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		File dir = new File("ghifile");
		if(!dir.exists())
			dir.mkdir();

		File file = new File("ghifile/docghi.txt");
		if(!file.exists())
			file.createNewFile();
		
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
		System.out.println("Nhap van ban muon luu vao text!");
		String text = input.nextLine();
		dataOutputStream.writeBytes(text);
		dataOutputStream.writeBytes("\nok2\n");
		dataOutputStream.writeInt(4);
		dataOutputStream.writeDouble(6.3);
		fileOutputStream.close();
		dataOutputStream.close();
		System.out.println("Da luu vao file!");
		
		System.out.println("\nDoc file: ");
		FileInputStream fileInputStream = new FileInputStream(file);
		DataInputStream objectInputStream = new DataInputStream(fileInputStream);
		String s = objectInputStream.readLine();
		String s1 = objectInputStream.readLine();
		int i = objectInputStream.readInt();
		Double d = objectInputStream.readDouble();
		System.out.println( i +" "+ d +"\n"+ s + "\n" + s1);

	}

}
