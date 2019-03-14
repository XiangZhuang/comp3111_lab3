package lab2.ex1;

public class Book {
	private String[] chapters;
	private static final int DEFAULT_CHAPTERS = 10;
	
	public Book() {
		chapters = new String[DEFAULT_CHAPTERS];
		for(int i = 0; i < chapters.length; i++)
			chapters[i] = "Chapter" + i;
	}
	
	public Book(String[] arg) {
		chapters = new String[arg.length];
		for(int i = 0; i < chapters.length; i++)
			chapters[i] = arg[i];
	}
	
	public String getChapter(int i) {
		if(i < 1 || i > chapters.length) {
			return "No such Chapter";
		}
		return chapters[i - 1];
	}
	
	public String[] getChapters() {
		return chapters;
	}
}
