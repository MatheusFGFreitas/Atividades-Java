package entities;

public class Comment {
	
	private String text;//criado string text
	
	public Comment() {//criado argumento em branco Comment
		
	}

	public Comment(String text) {//criado por generate constructor using fields
		this.text = text;
	}

	public String getText() {//pelo getters and setters
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	
	
}
