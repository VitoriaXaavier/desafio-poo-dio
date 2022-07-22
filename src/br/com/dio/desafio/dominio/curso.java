package br.com.dio.desafio.dominio;

public class curso extends conteudo {

   private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XpPadrao * cargaHoraria;
    }

    public curso() {
    }



    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao()+ '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
