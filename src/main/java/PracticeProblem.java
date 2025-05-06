public class PracticeProblem {

	public static void main(String args[]) {

		Cow cow = new Cow("billybob", 20, 230.0);
		Cow cow2 = new Cow("", 0, 0);
		Cow cow3 = new Cow("billybob", 20, 230.0);
		System.out.println(cow.equals(cow));
		System.out.println(cow.equals(null));
		System.out.println(cow.equals(cow3));
	}

}
