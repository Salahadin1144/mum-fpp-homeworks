package stringStream;

public class StringCOncatination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sentence = new StringBuilder();
		for(String s: args) {
			sentence.append(s).append(" ");
		}
		sentence.deleteCharAt(sentence.length()-1);
		sentence.append(".");
		System.out.println(sentence.toString());
	}

}
