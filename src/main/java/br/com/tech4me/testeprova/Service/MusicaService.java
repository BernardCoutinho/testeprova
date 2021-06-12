package br.com.tech4me.testeprova.Service;

import java.util.List;
import java.util.Optional;

import br.com.tech4me.testeprova.Model.Musica;
import br.com.tech4me.testeprova.shared.MusicaDTO;


public interface MusicaService {
    
     MusicaDTO adcMusica(Musica musica);
    
     List<MusicaDTO> obterTodas();

     Optional<MusicaDTO> obterPorId(String id);
     
     void removerMusica(String id);
     
     MusicaDTO atualizarMusica(String id, Musica musica);
    
}
