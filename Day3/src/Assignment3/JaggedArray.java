package Assignment3;

public class JaggedArray {
	
	public static void main(String[] args) {
		String[][] stringArray = new String[4][];
		
		stringArray[0] = new String[]{"Tony", "JAVA", "C", "C++"};
		stringArray[1] = new String[] {"Thomas", "JAVA", "UNIX"};
		stringArray[2] = new String[] {"Dinil", "Linux", "Oracle"};
		stringArray[3] = new String[] {"Delvin", "RDBMS", "C#", "Oracle"};
		
			for(int j = 0; j < stringArray[3].length; j++){
				System.out.println(stringArray[3][j]);
			}
		
	}
		
}
