package br.com.tech4me.testeprova.Service;

import java.util.List;
import java.util.Optional;

import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tech4me.testeprova.Model.Musica;
import br.com.tech4me.testeprova.Repository.MusicaRepository;
import br.com.tech4me.testeprova.shared.MusicaDTO;

@Service
public class MusicaServiceImpl implements MusicaService{
    @Autowired
    private MusicaRepository repositorio;
    
    @Override
    public MusicaDTO adcMusica(Musica musica) {
         repositorio.save(musica);
         
         return new ModelMapper().map(musica, MusicaDTO.class);
    }

    @Override
    public List<MusicaDTO> obterTodas() {
        List<Musica> music = repositorio.findAll();
        return music.stream()
        .map(p -> new ModelMapper().map(p, MusicaDTO.class))
        .collect(Collectors.toList());
    }

    @Override
    public Optional<MusicaDTO> obterPorId(String id) {
        Optional<Musica> music = repositorio.findById(id); 
        if(music.isPresent()){
            return Optional.of(new ModelMapper().map(music.get(), MusicaDTO.class));
        }
        return Optional.empty();
    }

    @Override
    public void removerMusica(String id) {
        
         repositorio.deleteById(id);
        
    }

    @Override
    public MusicaDTO atualizarMusica(String id, Musica musicaAtt) {
        musicaAtt.setId(id);
        repositorio.save(musicaAtt);
        return new ModelMapper().map(musicaAtt, MusicaDTO.class);
    }

  
    

}
