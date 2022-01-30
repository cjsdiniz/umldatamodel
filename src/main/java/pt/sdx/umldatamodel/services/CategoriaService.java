package pt.sdx.umldatamodel.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pt.sdx.umldatamodel.domain.Categoria;
import pt.sdx.umldatamodel.repositories.CategoriaRepository;

@Service
public class CategoriaService{

    @Autowired
    private CategoriaRepository repo;

    public Categoria busca(Integer id){
        Optional<Categoria> obj = repo.findById(id);
        return obj.orElse(null);
    }
}
