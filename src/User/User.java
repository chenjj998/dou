package User;


public class User {
	private int id;
	private String author;
	private String imgsrc;
	private String title;
	private String describe;
	private String climn;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getImgsrc() {
		return imgsrc;
	}
	public void setImgsrc(String imgsrc) {
		this.imgsrc = imgsrc;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public String getClimn() {
		return climn;
	}
	public void setClimn(String climn) {
		this.climn = climn;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(int id, String author, String imgsrc, String title, String describe, String climn) {
		this.id = id;
		this.author = author;
		this.imgsrc = imgsrc;
		this.title = title;
		this.describe = describe;
		this.climn = climn;
	}
	
}
