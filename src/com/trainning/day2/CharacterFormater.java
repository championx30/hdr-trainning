package com.trainning.day2;

public class CharacterFormater {

	public static char[] format(char[] name) {
		name = trim(name);
		char[] result = new char[name.length];
		result[0] = toUpperCase(name[0]);
		int lastInsert = 1;
		for (int i = 1; i < result.length; i++) {
			if (isAlphabetic(name[i - 1]) && isAlphabetic(name[i])) {
				result[lastInsert++] = toLowerCase(name[i]);
			} else if (isWhitespace(name[i - 1]) && isAlphabetic(name[i])) {
				result[lastInsert++] = toUpperCase(name[i]);
			} else if (isWhitespace(name[i - 1]) && isWhitespace(name[i])) {
				continue;
			} else
				result[lastInsert++] = name[i];
		}
		return result;
	}

	public static char[] trim(char[] name) {
		int len = name.length;
		int startIndex = 0;
		while ((startIndex < len) && (name[startIndex] <= ' ')) {
			startIndex++;
		}
		while ((startIndex < len) && (name[len - 1] <= ' ')) {
			len--;
		}
		char[] result = new char[len - startIndex];
		int start = startIndex;
		for (int i = 0; i < len - start; i++) {
			result[i] = name[startIndex++];
		}
		return ((startIndex > 0) || (len < name.length)) ? result : name;
	}

	public static char toUpperCase(char ch) {
		if (isAlphabetic(ch) && isUpperCase(ch))
			return ch;
		return (char) (ch - 32);
	}

	public static char toLowerCase(char ch) {
		if (isAlphabetic(ch) && !isUpperCase(ch))
			return ch;
		return (char) (ch + 32);
	}

	public static boolean isUpperCase(char ch) {
		if ((ch < 65) || (ch > 90)) {
			return false;
		}
		return true;
	}

	public static boolean isWhitespace(char ch) {
		if ((ch == ' ') || (ch == '\t'))
			return true;
		return false;
	}

	public static boolean isAlphabetic(char ch) {
		if (((ch >= 65) && (ch <= 90)) || ((ch >= 97) && (ch <= 122))) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		char[] name1 = "NGUYEN vAn A            ".toCharArray();
		System.out.println(format(name1));

		char[] name2 = "             NGUYEN vAn A".toCharArray();
		System.out.println(format(name2));

		char[] name3 = "             NGUYEN                      vAn A".toCharArray();
		System.out.println(format(name3));

		char[] name4 = "              nGuYEN                      vAn                        A                          "
				.toCharArray();
		System.out.println(format(name4));
	}
}
