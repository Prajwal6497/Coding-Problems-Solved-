class WordCount{
	public static void main(String[] args){
		String s = "hello! World, \n Welcome to the \t\n\n  Programming world";

		System.out.println(wordCount(s));
	}

	static int wordCount(String s){
		String[] str = s.split("\\s+");

		return str.length;
	}
}
