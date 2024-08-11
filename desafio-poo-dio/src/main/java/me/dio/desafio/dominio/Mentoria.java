package me.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

	private LocalDate localDate;

	public LocalDate getLocalDate() {
		return localDate;
	}
	
	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}

	@Override
	public String toString() {
		return "Mentoria [titulo=" + super.getTitulo() + ", descricao=" + super.getDescricao() + ", localDate=" + this.localDate + "]";
	}

	@Override
	public double calcularXp() {
		return Conteudo.XP_PADRAO + 20d;
	}
}
