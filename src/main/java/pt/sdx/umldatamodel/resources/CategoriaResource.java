package pt.sdx.umldatamodel.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.sdx.umldatamodel.domain.Categoria;
import pt.sdx.umldatamodel.services.CategoriaService;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

    @Autowired
    private CategoriaService service;

    @GetMapping
    public List<Categoria> listar() {
        Categoria cat1 = new Categoria(1, "Informática");
        Categoria cat2 = new Categoria(2, "Escritório");

        List<Categoria> lista = new ArrayList<>();
        lista.add(cat1);
        lista.add(cat2);

        return lista;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> find(@PathVariable Integer id) {

        Categoria obj = service.busca(id);
        return ResponseEntity.ok(obj);
    }

}
