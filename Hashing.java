
public class Hashing {
	private int id;
	private String message;

	public Hashing(int id, String message) {
		super();
		this.id = id;
		this.message = message;
	}

	public Hashing() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hashing other = (Hashing) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public static void main(String[] args) {
		Hashing myhash=new Hashing(1, "GD");
		System.out.println(myhash);
		Hashing myhash2=new Hashing(1, "GD");
		System.out.println(myhash2);
		
		System.out.println(myhash.equals(myhash2));
		System.out.println(myhash==myhash2);
	}
}
