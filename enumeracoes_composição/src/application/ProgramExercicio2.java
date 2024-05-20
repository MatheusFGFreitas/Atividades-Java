package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class ProgramExercicio2 {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		
		Comment c1 = new Comment("Tenha uma boa viagem!");
		Comment c2 = new Comment("Isso é bem Legal!");
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),
				"Viajando para a Nova Zelandia",
				"Eu estou indo visitar esse pais maravilhoso!",
				12);
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);
		
		Comment c3 = new Comment("Boa Noite");
		Comment c4 = new Comment("Que a força esteja contigo");
		Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"),
				"Boa noite pessoal",
				"Vejo vocês amanhã",
				12);
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p2);

	}

}
