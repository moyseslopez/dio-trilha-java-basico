package me.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("cursoTitulo1");
		curso1.setDescricao("descricaoCurso1");
		curso1.setCargaHoraria(10);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("cursoTitulo2");
		curso2.setDescricao("descricaoCurso2");
		curso2.setCargaHoraria(20);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoriaTitulo");
		mentoria.setDescricao("mentoriaDescricao");
		mentoria.setLocalDate(LocalDate.now());

		//System.out.println(curso);
		//System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("BootcampNome");
		bootcamp.setDescricao("BootcampDescricao");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev dev1 = new Dev();
		dev1.setNome("Dev1");
		dev1.inscreverBootcamtp(bootcamp);
		System.out.println("Conteudos Inscritos: " + dev1.getConteudosInscritos());
		dev1.progredir();
		dev1.progredir();
		dev1.progredir();
		System.out.println("Conteudos Inscritos: " + dev1.getConteudosInscritos());
		System.out.println("Conteudos Concluidos: " + dev1.getConteudosConcluidos());
		System.out.println("XP: " + dev1.calcularXp());
		
		System.out.println("\n--------------------------------------------\n");
		
		Dev dev2 = new Dev();
		dev2.setNome("Dev2");
		dev2.inscreverBootcamtp(bootcamp);
		System.out.println("Conteudos Inscritos: " + dev2.getConteudosInscritos());
		dev2.progredir();
		System.out.println("Conteudos Inscritos: " + dev2.getConteudosInscritos());
		System.out.println("Conteudos Concluidos: " + dev2.getConteudosConcluidos());
		System.out.println("XP: " + dev2.calcularXp());
	}
}
