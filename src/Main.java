import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        System.out.println(devCamila.getNome());
        devCamila.inscreverBootcamp(bootcamp);
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("Conteudos Inscritos" + devCamila.getConteudosInscritos());
        System.out.println("*---*");
        System.out.println("Conteudos Concluidos" + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());
        System.out.println("*-----*");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        System.out.println(devJoao.getNome());
        devJoao.inscreverBootcamp(bootcamp);
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteudos Inscritos" + devJoao.getConteudosInscritos());
        System.out.println("*---*");
        System.out.println("Conteudos Concluidos" + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());

    }

}
