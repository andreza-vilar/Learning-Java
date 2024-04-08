package application;

import entities.Comentario;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comentario comentarioInicial = new Comentario("Tenha uma boa viagem!");
        Comentario comentarioFinal = new Comentario("Que bacana!");

        Post post = new Post(
                sdf.parse("21/06/2018 13:05:44"),
                "Viajando para New Zealand",
                "Estou indo visitar esse maravilhoso país!",
                12);


        post.addComentario(comentarioInicial);
        post.addComentario(comentarioFinal);


        Post post2 = new Post(
                sdf.parse("12/07/2018 11:05:39"),
                "Aula muito legal",
                "Estou estudando spring boot",
                25);


        System.out.println(post);
        System.out.println();
        System.out.println(post2);

    }
}