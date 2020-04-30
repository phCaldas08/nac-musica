package br.com.fiap.model;

public class MusicaModel {
	
	private int id;
	private String nome;
	private String album;
	private String artista;
	private double duracao;
	private int anoLancamento;
	
	public MusicaModel(int id, String nome, String album, String artista, double duracao, int anoLancamento) {
		super();
		this.id = id;
		this.nome = nome;
		this.album = album;
		this.artista = artista;
		this.duracao = duracao;
		this.anoLancamento = anoLancamento;
	}
	
	public int getId() {
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
	public double getDuracao() {
		return duracao;
	}
	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}
	public int getAnoLancamento() {
		return anoLancamento;
	}
	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	
	

}
