package Utils;

import java.util.Random;

public class StringOperations {

	public String randomStringGenerator(int n) {

		// chose a Character random from this String
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";

		// create StringBuffer size of AlphaNumericString
		StringBuilder sb = new StringBuilder(n);

		for (int i = 0; i < n; i++) {

			// generate a random number between
			// 0 to AlphaNumericString variable length
			int index = (int) (AlphaNumericString.length() * Math.random());

			// add Character one by one in end of sb
			sb.append(AlphaNumericString.charAt(index));
		}

		return sb.toString();
	}

	public static int randomInteger(int size) {
		//int b = (int)(Math.random()*(max-min+1)+min);
		Random rnd =new Random();
		 StringBuffer sb=new StringBuffer(size);
		 for(int i=1;i<=size;i++)
		 {
			 sb.append(rnd.nextInt(10));
		 }
		 System.out.println(sb.toString());
		 return Integer.parseInt(sb.toString());
	}

}
