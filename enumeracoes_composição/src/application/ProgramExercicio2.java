package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class ProgramExercicio2 {

	public static void main(String[] args) throws ParseException { //criado exceção
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); //formatado a data em dia mes ano hora min seg
		
		Comment c1 = new Comment("Tenha uma boa viagem!");//criado objeto 1 com o nome c1
		Comment c2 = new Comment("Isso é bem Legal!");//criado objeto 2 com o nome c2
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),//criado a variavel post com o SimpleDateFormat com a data 1
				"Viajando para a Nova Zelandia", //após o titulo (pode pular linha para ficar facilitado a leitura)
				"Eu estou indo visitar esse pais maravilhoso!", //o conteudo do post
				12); //e a quantidade de likes
		p1.addComment(c1); //adicionado o comentario 1
		p1.addComment(c2); //adcionado o comentario 2
		
		System.out.println(p1); //printado na tela o 1 post
		
		Comment c3 = new Comment("Boa Noite"); //repetido do mesmo jeito do post 1
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
