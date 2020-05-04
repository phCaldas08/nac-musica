package br.com.fiap.model;

public class MusicaModel {
	
	private Integer id;
	private String nome;
	private String album;
	private String artista;
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
	
	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
}
