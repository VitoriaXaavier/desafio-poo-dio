import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.conteudo;
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Mentoria;


public class main {
    public main(String[] args) {
        curso curso1 = new curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de java");
        mentoria1.setDescricao("Descrição mentoria java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java");
        bootcamp.setDescricao("Descrição bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev = new Dev();
        dev.setNome("Vitoria");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Vitoria" + dev.getConteudosIncritos());
        System.out.println("-");

        dev.progredir();
        System.out.println("Conteudos inscritos Vitoria" + dev.getConteudosIncritos());
        System.out.println("-");
        System.out.println("Conteudos concluidos Vitoria" + dev.getConteudosConcluidos());
        System.out.println("-");
        System.out.println("XP " + dev.calcularTotalXp());
        System.out.println("-");

        Dev dev2 = new Dev();
        dev2.setNome("Andre");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Andre" + dev2.getConteudosIncritos());
        System.out.println("-");

        dev2.progredir();
        System.out.println("Conteudos inscritos Andre" + dev2.getConteudosIncritos());
        System.out.println("-");
        System.out.println("Conteudos concluidos Andre" + dev2.getConteudosConcluidos());
        System.out.println("-");
        System.out.println("XP " + dev.calcularTotalXp());




    }
}
