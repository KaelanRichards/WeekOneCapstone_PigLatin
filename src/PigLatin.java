import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String cont = "y";
		
		while (cont.equalsIgnoreCase("y")) {
			System.out.println("Please enter a sentence");
			String userSentence = scan.nextLine();
			
			
			userSentence = userSentence.toLowerCase();
			String[] wordsSplit = userSentence.split(" ");
			
			if (!userSentence.matches("[0-9]+")) {
				for (String word: wordsSplit) {
					if (word.startsWith("a") || word.startsWith("e") || word.startsWith("i") || word.startsWith("o") || word.startsWith("u"))
	                    System.out.print(word + "way ");
					else if (word.charAt(1) == 'h' || word.charAt(1) == 't' || word.charAt(1) == 'l') {
						String word1 = word.substring(0, 2);
						
						String word2 = word.substring(2);
						String word3 = word2.concat(word1);
						System.out.print(word3 + "ay ");
						
					}
					else {
						String word4 = word.substring(0, 1);
						String word5 = word.substring(1) + word4;
					System.out.print(word5 + "ay ");
					
					}	
				}		
			} else {
				System.out.println(userSentence);
			}
			
			System.out.println("");
			System.out.println("would you like to continue?");
			cont = scan.next();
		}
		
		scan.close();
	}
}



