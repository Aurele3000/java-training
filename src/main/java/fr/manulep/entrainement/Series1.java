package fr.manulep.entrainement;

import java.lang.reflect.Array;
import java.util.Arrays;

import com.google.common.primitives.Chars;

public class Series1 {

	private Series1() {
		throw new IllegalStateException("Test class");
	}

	public static String helloWorld(String name) {
		//1
		if ((name == null) || (name == "")) {
			return "Hello World";
			
		} else 
		    return "Hello " + name;			
	}

	public static String[] removeNullElements(String[] array) {
		// 2
		array = Arrays.stream(array)

				.filter(s -> (s != null && s.length() > 0))

				.toArray(String[]::new);

		return array;
	}

	public static int[] addElementToBeginning(int[] array, int element) {
		// 3
		return null;
	}

	public static int[] allElementsExceptFirstThree(int[] array) {
		// 4
		return null;
	}

	public static String getFirstHalf(String word) {
		// 5
		return null;
	}

	public static String[] selectElementsStartingWithA(String[] array) {
		// 6
		
		int c = 0;

		String[] motCommenceAvecA;

		for (String fruit : array) {

			if (fruit.charAt(0) == 'a') {
				c++; // c +=1
			}
		}

		motCommenceAvecA = new String[c];
		int i = 0;
		for (String fruit : array) {
			if (fruit.charAt(0) == 'a') {

				motCommenceAvecA[i] = fruit;
				i++;
			}
		}
		// System.out.println(Arrays.toString(motCommenceAvecA));

		return motCommenceAvecA;
	}

	public static String[] selectElementsStartingWithVowel(String[] array) {
		// 7
		
		int c = 0;

		String[] nomCommenceAvecVoyelle;
		for (String prenom : array) {

			if (prenom != null) {

				if (prenom.charAt(0) == 'a' || prenom.charAt(0) == 'e' || prenom.charAt(0) == 'i'
						|| prenom.charAt(0) == 'o' || prenom.charAt(0) == 'u') {

					c++;
				}
			}
		}
		nomCommenceAvecVoyelle = new String[c];

		int i = 0;

		for (String prenom : array) {

			if (prenom != null) {

				if (prenom.charAt(0) == 'a' || prenom.charAt(0) == 'e' || prenom.charAt(0) == 'i'
						|| prenom.charAt(0) == 'o' || prenom.charAt(0) == 'u') {

					nomCommenceAvecVoyelle[i] = prenom;

					i++;
				}
			}
		}
		System.out.println(Arrays.toString(nomCommenceAvecVoyelle));

		return nomCommenceAvecVoyelle;
	}

	public static String[] reverseOrderInArray(String[] array) {
		// 8
		
		for (int i = 0; i < array.length / 2; i++) {
			String fruits = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = fruits;
		}

		return array;
	}

	public static int[] insertElementInTheMiddleOfAnArray(int[] array, int element) {
		// 9
		return null;
	}

	public static String shortestWord(String text) {
		// 10
		
		String word = "", small = "";
		String[] words = new String[100];
		int length = 0;

		text = text + " ";

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) != ' ') {
				word = word + text.charAt(i);
			} else {
				words[length] = word;
				length++;
				word = "";
			}
		}
		small = words[0];

		for (int k = 0; k < length; k++) {

			if (small.length() > words[k].length())
				small = words[k];

		}
		System.out.println("Smallest word: " + small);

		return small;

	}

	public static String removeCapitals(String text) {
		// 11
		
		String textWithoutCapitals = "";

		for (int i = 0; i < text.length(); i++) {

			char letter = text.charAt(i);

			if (!Character.isUpperCase(letter)) {
				textWithoutCapitals += letter;
			}

		}

		return textWithoutCapitals;
	}

	public static long addingTwoNumbers(long number1, long number2) {
		// 12
		
		return number1 + number2;
	}

	public static long addingThreeNumbers(long number1, long number2, long number3) {
		// 13
		
		return number1 + number2 + number3;
	}

	public static long addingSeveralNumbers(final Integer... numbers) {
		// 14
		return -1;
	}

	public static float makeNegative(float number) {
		// 15
		
		float negativeNumber = 0;
		if (number > 0) {
			negativeNumber = 0 - number;
		} else {
			negativeNumber = number;
		}
		return negativeNumber;

	}

	public static boolean checkForSpecialCharacters(String string) {
		// 16
		return false;
	}

	public static boolean checkIfStringStartsWithConsonant(String word) {
		// 17
		return false;
	}

	public static String getDomainName(String email) {
		// 18
		return null;
	}

	public static int[] letterPosition(String name) {
		// 19
		
		String lowerCaseName = name.toLowerCase();

		char[] alphabet = { ' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
				'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

		int[] letterPosition = new int[lowerCaseName.length()];

		for (int i = 0; i < lowerCaseName.length(); i++) {

			char target = lowerCaseName.charAt(i);

			int index = Chars.indexOf(alphabet, target);

			letterPosition[i] = index;
		}

		return letterPosition;
	}

	public static boolean isPeer(int number) {
		// 20
		
		int nombre = number % 2;
		if (nombre == 0) {
			return true;
		} else {
			return false;

		}

	}

}
