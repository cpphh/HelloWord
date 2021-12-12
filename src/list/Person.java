package list;

public class Person implements Comparable<Person>{
	private int id;
	private String ten;
	

	public Person(int id, String ten) {
		this.id = id;
		this.ten = ten;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", ten=" + ten + "]";
	}

	@Override
	public int compareTo(Person o) {
		//return this.getTen().compareTo(o.getTen());
		if(this.getId() > o.getId())
			return 1;
		else if(this.getId() < o.getId())
			return -1;
		else return 0;
	}
	
	@Override
	public boolean equals(Object obj) {
		return (obj instanceof Person)? (((Person) obj).getId()==this.id)&&(((Person) obj).getTen()==this.ten):false;
	}
	@Override
	public int hashCode() {
		return this.id;
	}
}
