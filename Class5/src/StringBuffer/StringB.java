package StringBuffer;

public class StringB {
	public static void main(String[] args) {
		String str1 = new String("IMCS");
		System.out.println(str1.hashCode());
		String str2 = new String("IMCS");
		System.out.println(str2.hashCode());
		str1 = str1 + "";
		System.out.println(str1.hashCode());
		
		
		StringBuffer stringBuffer = new StringBuffer("IMCS");
		System.out.println(stringBuffer.hashCode());
		stringBuffer.append("Irving");
		System.out.println(stringBuffer.hashCode());
		
	}
	 
}
