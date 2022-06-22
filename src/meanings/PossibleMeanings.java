package meanings;

public class PossibleMeanings {

	public static void main(String[] args) {
		
	String a = "Apple: a fruit, a tech firm";
	String b = "Table:an object,contains rows and columns when used in context of computers";
	String c = "Orange:a fruit";
	
	String [] result1 = a.split(":");
	System.out.println(result1[0]);
	
	String rightSideA = result1[1];
	String[] definition = rightSideA.split(",");
	System.out.println(definition[0]);
	System.out.println(definition[1]);
	
	String [] result2 = b.split(":");
	System.out.println(result2[0]);
	
	String rightSideB = result2[1];
	String[] definition1 = rightSideB.split(",");
	System.out.println(definition1[0]);
	System.out.println(definition1[1]);
	
	String [] result3 = c.split(":");
	System.out.println(result3[0]);
	
	String rightSideC = result3[1];
	String[] definition2 = rightSideC.split(",");
	System.out.println(definition2[0]);
	
	
	}

}
