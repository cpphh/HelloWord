package list;

public class Nguoi {

	private int id;
	private String ten;
	private int tuoi;
	
	public Nguoi(int id, String ten, int tuoi) {
		super();
		this.id = id;
		this.ten = ten;
		this.tuoi = tuoi;
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
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	@Override
	public String toString() {
		return "Nguoi [id=" + id + ", ten=" + ten + ", tuoi=" + tuoi + "]";
	}
	
	
}
