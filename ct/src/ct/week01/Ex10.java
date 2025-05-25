package ct.week01;



/*

 * 문자열

 */

public class Ex10 {

	public static void main(String[] args) {

		String s = "Good Morning";

		System.out.println("charAt : " + s.charAt(7));

		System.out.println("startsWith : " + s.startsWith("good"));

		System.out.println("endsWith :" + s.endsWith("good"));

		System.out.println("equals : " + s.equals("good mornng"));

		

		System.out.println("indexOf : " + s.indexOf("Mor"));

		System.out.println("indexOf : " + s.indexOf("n"));

		System.out.println("lastIndexOf : " + s.lastIndexOf("n"));

		

		System.out.println("length : " + s.length());

		

		System.out.println("replace : " + s.replace("Good", "a"));

		System.out.println("replace : " + s.replace("o", "a"));

		System.out.println("replace : " + s.replace("[Good]", "a"));

		System.out.println("replaceFirst : " + s.replaceFirst("o", "a"));

		

		System.out.println("replaceAll : " + s.replaceAll("Good", "a"));

		System.out.println("replaceAll : " + s.replaceAll("[Good]", "a"));

		System.out.println("replaceAll : " + s.replaceAll("[^G]", "a"));

		System.out.println("replaceAll : " + s.replaceAll("^[G]", "a"));

		System.out.println("replaceAll : " + s.replaceAll("[G]$", "a"));

	}

}