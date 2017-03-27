package autre;


public class Main { //second commit

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String adresse = "1831 Beverly Place #9D";
		String pattern = "([0-9a-zA-Z ,\\.])*";
		
		System.out.println(adresse.matches(pattern));
		System.out.println(Thread.currentThread().getId());

	}

}
