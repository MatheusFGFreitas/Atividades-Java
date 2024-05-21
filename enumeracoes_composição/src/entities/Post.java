package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); //formatando a data em
																					//dia mes ano hora min seg
																					//para o programa principal
	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	
	private List<Comment> comments = new ArrayList<>(); //criado um ArrayList para List
	
	public Post() {	//criado argumento em branco
	}

	public Post(Date moment, String title, String content, Integer likes) {//criado generate using fields
		this.moment = moment;											//porém não colocado List no construtor
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Date getMoment() {//getters and setters
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment> getComments() {
		return comments;
	}
	
	//public void setComments(List<Comment> comments){
		//this.comments = comments;
	//}
	//não se pode ter um metodo que recebe outra lista pra trocar a lista, então é apagado e utilizado o add e remove
	
	public void addComment(Comment comment) {
		comments.add(comment);
	}
	
	public void removeComment(Comment comment) {
		comments.remove(comment);
	}
	
	public String toString() { //feito um toString
		StringBuilder sb = new StringBuilder(); //porem utilizado um StringBuilder para não ficar pesado o programa
												//e mais facilitado a inserção
		sb.append(title + "\n"); //sb.append seria mais uma parte adicionada no toString
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(moment) + "\n");
		sb.append(content + "\n");
		sb.append("comments: \n");
		for (Comment c : comments) { //criado um laço de repetição para cada comentário inserido
			sb.append(c.getText() + "\n");
		}
		return sb.toString(); //para retornar ao programa principal formatado como toString
	}
	
}
