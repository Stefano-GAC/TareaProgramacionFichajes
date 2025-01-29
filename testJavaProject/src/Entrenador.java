public class Entrenador {
    private String nombreEntrenador;
    private Formacion formacionPreferida;

    public Entrenador(String nombreEntrenador, Formacion formacionPreferida) {
        this.nombreEntrenador = nombreEntrenador;
        this.formacionPreferida = formacionPreferida;
    }

    public String getNombreEntrenador() {
        return nombreEntrenador;
    }

    public void setNombreEntrenador(String nombreEntrenador) {
        this.nombreEntrenador = nombreEntrenador;
    }

    public Formacion getFormacionPreferida() {
        return formacionPreferida;
    }

    public void setFormacionPreferida(Formacion formacionPreferida) {
        this.formacionPreferida = formacionPreferida;
    }
}
