package serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

import list.ArrayList;

public class Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private transient int id;//Dung transient khi khong muon luu gia tri cua ID vào file
	private String ten;
	
	public Person(int id, String ten) {
		super();
		this.id = id;
		this.ten = ten;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", ten=" + ten + "]";
	}


	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Person person = new Person(2,"cuong");
		
		File dir = new File("ghifile");
		if(!dir.exists())
			dir.mkdir();
		
		File file = new File("ghifile/demo.txt");
		if(!file.exists())
			file.createNewFile();
		
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(person);
		fileOutputStream.close();
		objectOutputStream.close();
		
		FileInputStream fileInputStream = new FileInputStream(file);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		Person person1=(Person) objectInputStream.readObject();

		System.out.println(person1.toString());
		
	}
}
