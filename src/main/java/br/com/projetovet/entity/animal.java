package br.com.projetovet.entity;
import java.time.LocalDate;
import lombok.Data;

@Data
public class animal {
    
    private Long id;
    private String nome;
    private String cor;
    private String raca;
    private LocalDate dataNascimento;

    public animal(Long id, String nome, String cor, String raca, LocalDate dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.cor = cor;
        this.raca = raca;
        this.dataNascimento = dataNascimento;
    }


}
