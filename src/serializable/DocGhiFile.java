package serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DocGhiFile {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		List<Person> list = new ArrayList<Person>();
		list.add(new Person(2,"cuong"));
		list.add(new Person(3,"duy"));
		list.add(new Person(1,"tuan"));
		list.add(new Person(4,"tung"));
		
		File file = new File("filedemo.txt");
		if(!file.exists())
			file.createNewFile();
		
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(list);
		fileOutputStream.close();
		objectOutputStream.close();
		
		List<Person> list1 = new ArrayList<Person>();
		FileInputStream fileInputStream = new FileInputStream(file);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		list1=(ArrayList<Person>) objectInputStream.readObject();

		System.out.println(list1.size());
		for(Person p : list1)
			System.out.println(p.toString());

	}

}
