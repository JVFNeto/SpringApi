package com.Api.Spring.Controllers;


import com.Api.Spring.Models.Cliente;
import com.Api.Spring.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {


    @Autowired// injetar uma instancia de cliente repository aqui automaticamente
    private ClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> listar(){

        return clienteRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente adicionar(@RequestBody Cliente cliente ){
        return clienteRepository.save(cliente);
    }
}
