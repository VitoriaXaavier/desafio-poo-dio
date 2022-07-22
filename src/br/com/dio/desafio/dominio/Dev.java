package br.com.dio.desafio.dominio;

import org.jetbrains.annotations.NotNull;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<conteudo> conteudosIncritos = new LinkedHashSet<>();
    private Set<conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(@NotNull Bootcamp bootcamp){
        this.conteudosIncritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsIncritos().add(this);
    }

    public void progredir()
    {
        Optional<conteudo> conteudo = this.conteudosIncritos.stream().findFirst();
        if (conteudo.isPresent())
        {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosIncritos.remove(conteudo.get());
        }
        else
        {
            System.err.println("Você não está matriculado em nenhum conteudo!");
        }
    }

    public double calcularTotalXp()
    {
        return this.conteudosConcluidos.stream().mapToDouble(conteudo::calcularXp).sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<conteudo> getConteudosIncritos() {
        return conteudosIncritos;
    }

    public void setConteudosIncritos(Set<conteudo> conteudosIncritos) {
        this.conteudosIncritos = conteudosIncritos;
    }

    public Set<conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosIncritos, dev.conteudosIncritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosIncritos, conteudosConcluidos);
    }

}
