package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date date;
    private String titulo;
    private String descricao;
    private Integer curtidas;

    private List<Comentario> comentarios = new ArrayList<>();

    public Post(Date date, String titulo, String descricao, Integer curtidas) {
        this.date = date;
        this.titulo = titulo;
        this.descricao = descricao;
        this.curtidas = curtidas;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(Integer curtidas) {
        this.curtidas = curtidas;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void addComentario(Comentario comentario) {
        this.comentarios.add(comentario);
    }

    public void removeComentario(Comentario comentario) {
        this.comentarios.remove(comentario);
    }

    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder();
       sb.append(titulo + "\n");
       sb.append(curtidas);
       sb.append(" Curtidas - ");
       sb.append(sdf.format(date)+ "\n");
       sb.append(descricao + "\n");
       for (Comentario comentario : comentarios) {
           sb.append(comentario.getTexto());
       }
       return sb.toString();
    }
}
