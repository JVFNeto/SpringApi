package com.Api.Spring.Models;


import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Data//lombok
@Entity//jpa
public class Cliente {


    @Id//jpa
    @GeneratedValue(strategy = GenerationType.IDENTITY)// delegamos a responsabilidade ao banco de dados de fazer esse ID
    private Long id;


   @NotNull
    private String nome;


    //lombok faz o trabalho das linhas abaixo (get e set) (hashcode e equals)
}
