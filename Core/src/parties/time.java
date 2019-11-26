package parties;

public class time {
	public static void main(String[] args) {
		String intime = "2 hrs 30 mins";
		String[] split = intime.replace("hrs", "").replace("mins", "").replace("  ", " ").split(" ");
		for(String s : split)
		System.out.println(s);
	}
}
