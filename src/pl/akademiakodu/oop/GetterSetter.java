package pl.akademiakodu.oop;



public class GetterSetter {
 
 
	 private String title;
	 private int pages; 
	 private String author;
	
	public GetterSetter() {
		this("Brak tytu³u");
	}

	public GetterSetter(String title){
		this(title, "Nie znam autora", 0);
	}
	
	public GetterSetter(String title, String author, int pages) {
		this.title = title;
		this.author = author;
		this.pages = pages;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		if(pages == 0) return;
		this.pages = pages;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	} 
	 
	 
	
	
}
