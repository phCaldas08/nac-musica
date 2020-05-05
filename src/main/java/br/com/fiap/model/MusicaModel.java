package br.com.fiap.model;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class MusicaModel {
	
	private Integer id;
	
	@NotNull
	@NotEmpty
	private String nome;
	@NotNull
	@NotEmpty
	private String album;
	@Size(min = 1, max = 100)
	private String artista;
	@DecimalMin(value = "0.01", message = "A musica deve ter mais de 1 segundo")
	private Double duracao;	
	private Integer anoLancamento;
	private String estilo;
	
	public MusicaModel(Integer id, String nome, String album, String artista, Double duracao, Integer anoLancamento, String estilo) {
		super();
		this.id = id;
		this.nome = nome;
		this.album = album;
		this.artista = artista;
		this.duracao = duracao;
		this.anoLancamento = anoLancamento;
		this.estilo=estilo;
	}
	
	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public Double getDuracao() {
		return duracao;
	}
	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}
	public Integer getAnoLancamento() {
		return anoLancamento;
	}
	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	
	

}
