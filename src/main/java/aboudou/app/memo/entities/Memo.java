package aboudou.app.memo.entities;

import java.io.Serializable;

public class Memo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String title;
	private String category;
	private String description;
	
	public Memo() {
		super();
		
	}

	//Full constructors
	public Memo(String title, String category, String description) {
		super();
		this.title = title;
		this.category = category;
		this.description = description;
	}

	//Getters and setters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Memo [title=" + title + ", category=" + category + ", description=" + description + "]";
	}
	
	
	
	
	
}
