import org.college.University;

public class College1 extends University {

	public static void main(String[] args) {
		College1 col = new College1();
		col.pg();
		col.ug();

	}

	@Override
	public void ug() {
	System.out.println("UG");
		
	}

}
