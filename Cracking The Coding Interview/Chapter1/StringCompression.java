
public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "aaabbbbbbbcffffffffffffjjjjjjjjjjjjjjjjjjoooooooooo";

		String output = "Input String : "+input+" \nCompressed String : "+compress(input);
		System.out.println(output);
	}

	private static String compress(String input) {
		// TODO Auto-generated method stub
		if (input.length() < 2)
			return input;
		int count = 0;

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < input.length() - 1; i++) {
			count++;
			char ch = input.charAt(i);
			if (input.charAt(i + 1) != ch) {
				sb.append(ch + "" + count);
				count = 0;
			}

		}
		String output = sb.append(input.charAt(input.length() - 1) + "" + ++count).toString();

		if (output.length() > input.length())
			return input;
		else
			return output;
		// return sb.toString();
	}

}
