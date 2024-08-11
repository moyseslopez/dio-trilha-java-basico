package me.dio.desafio.dominio;

public class Curso extends Conteudo {

	private int cargaHoraria;
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	@Override
	public String toString() {
		return "Curso [titulo=" + super.getTitulo() + ", descricao=" + super.getDescricao() + ", cargaHoraria=" + this.cargaHoraria + "]";
	}

	@Override
	public double calcularXp() {
		return Conteudo.XP_PADRAO * this.cargaHoraria;
	}

}
