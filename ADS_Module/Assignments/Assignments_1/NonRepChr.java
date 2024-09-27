class NonRepChr {
    public static void main(String[] args) {
	String string = "Hello Programming";
    System. out.println("The string is: " + string);
		char s[] = string.toCharArray();
        int i = 0;
        System.out.print("The duplicate characters in the string are: ");
        for (i = 0; i < s.length; i++) {
            int count = 1;
            if (s[i] == '0')
                continue;
            int j = i + 1;
            for (j = i + 1; j < s.length; j++) {
                if (s[i] == s[j]) {
                count++;
                s[j] = '0';
}
}

            if (count == 1) {
            System.out.print(s[i] + " ");
}
}
}

}