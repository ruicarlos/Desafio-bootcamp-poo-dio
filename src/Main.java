import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do Curso Java");
        curso1.setCargaHorario(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Oracle");
        curso2.setDescricao("Descrição do Curso Oracle");
        curso2.setCargaHorario(40);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição da Mentoria");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Inter Developer");
        bootcamp.setDescricao("Descrição do Bootcampo Inter Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);


        Dev devRui = new Dev();
        devRui.setNome("Rui Carlos");
        devRui.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos que "+devRui.getNome()+ " está inscritos " + devRui.getConteudosInscritos());
        devRui.progredir();
        System.out.println(" ;-) ");
        System.out.println("Conteudos que "+devRui.getNome()+ " está inscritos " + devRui.getConteudosInscritos());
        System.out.println("Conteudos que "+devRui.getNome()+ " Concluiu " + devRui.getConteudosConcluidos());
        System.out.println("XP :" +devRui.calcularTotalXp());


        System.out.println();
        System.out.println("----------");
        System.out.println();

        Dev devGrazy = new Dev();
        devGrazy.setNome("Graziele");
        devGrazy.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos que "+devGrazy.getNome()+ " está inscritos "  + devGrazy.getConteudosInscritos());
        devGrazy.progredir();
        devGrazy.progredir();
        System.out.println(" ;-) ");
        System.out.println("Conteudos que "+devGrazy.getNome()+ " está inscritos "  + devGrazy.getConteudosInscritos());
        System.out.println("Conteudos que "+devGrazy.getNome()+ " Concluiu "  + devGrazy.getConteudosConcluidos());
        System.out.println("XP :" +devGrazy.calcularTotalXp());








    }
}