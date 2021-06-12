package br.com.tech4me.testeprova.Model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("musica")
public class Musica {
    @Id
    private String id;
    
    @NotBlank(message = "Use caracteres válidos")
    @NotEmpty(message = "Campo obrigatório")
    private String titulo;
    
    @NotBlank(message = "Use caracteres válidos")
    @NotEmpty(message = "Campo obrigatório")
    private String artista;

    @NotBlank(message = "Use caracteres válidos")
    @NotEmpty(message = "Campo obrigatório")
    private String album;
    
    @NotBlank(message = "Use caracteres válidos")
    @NotEmpty(message = "Campo obrigatório")
    private String genero;
    
    private int anoLancamento;
    
    @NotBlank(message = "Use caracteres válidos")
    @NotEmpty(message = "Campo obrigatório")
    private String compositor;
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getArtista() {
        return artista;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getAnoLancamento() {
        return anoLancamento;
    }
    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
    public String getCompositor() {
        return compositor;
    }
    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return "Música \nTitulo:" + titulo + "Artista:" + artista + "Álbum:" + album + 
        "Gênero:" + genero + "Ano de Lançamento:" + anoLancamento + "Compositor:" + compositor;
    }
    
}
