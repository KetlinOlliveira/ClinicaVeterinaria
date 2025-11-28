package br.com.projetovet.entity;
import java.time.LocalDate;
import lombok.Data;

@Data
public abstract class pessoa {
    private String cpf;
    private String nome;
    private LocalDate nascimento;

    public pessoa() {
        super();
    }



}
