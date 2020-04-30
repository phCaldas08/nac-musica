package br.com.fiap.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import br.com.fiap.model.MusicaModel;

public class MusicaRepository {
	
	private static MusicaRepository instance;
	
	public static MusicaRepository getInstance() {
		if(instance == null)
			instance = new MusicaRepository();
		
		return instance;
	}
	
	private HashMap<Integer, MusicaModel> mapMusicas;
	
	private MusicaRepository() {
		mapMusicas = new HashMap<>();
		
		mapMusicas.put(1, new MusicaModel(
					1,
					"Parabens",
					"Xuxa so para baixinhos 2",
					"Xuxa",
					3.15,
					1512
				));
		
		mapMusicas.put(2, new MusicaModel(
				2,
				"Dancando com o xuxucao",
				"Xuxa so para baixinhos 4",
				"Xuxa",
				3.15,
				1514
			));
		
		mapMusicas.put(3, new MusicaModel(
				3,
				"Atrevessando a rua",
				"Xuxa so para baixinhos 7",
				"Xuxa",
				3.15,
				1517
			));
		
		mapMusicas.put(4, new MusicaModel(
				4,
				"Cabeca, ombros, joelhos e pe",
				"Xuxa so para baixinhos 5",
				"Xuxa",
				3.15,
				1515
			));
		
		mapMusicas.put(5, new MusicaModel(
				5,
				"Ilari Ilari E",
				"Xuxa so para baixinhos 2",
				"Xuxa",
				3.15,
				1512
			));
	}
	
	public List<MusicaModel> findAll(){
		return new ArrayList<MusicaModel>(mapMusicas.values());
	}
	
	public  MusicaModel findById(int id) {
		return mapMusicas.get(id);
	}
	
	public void update(MusicaModel musica) {
		mapMusicas.put(musica.getId(), musica);
	}
	
	public void insert(MusicaModel musica) {
		musica.setId(1);
		
		if(!mapMusicas.isEmpty())
			musica.setId(mapMusicas.keySet().stream().max(Integer::compareTo).get() + 1);
		
		this.update(musica);
		
	}
	
	public void delete(int id) {
		mapMusicas.remove(id);
	}

}
