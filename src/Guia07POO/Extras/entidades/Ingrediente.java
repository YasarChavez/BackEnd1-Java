package Guia07POO.Extras.entidades;

public class Ingrediente {
    private String ingredienteD1;
    private String ingredienteD2;
    private String ingredienteD3;

    public Ingrediente(String ingredienteD1, String ingredienteD2, String ingredienteD3) {
        this.ingredienteD1 = ingredienteD1;
        this.ingredienteD2 = ingredienteD2;
        this.ingredienteD3 = ingredienteD3;
    }

    public String getIngredienteD1() {
        return ingredienteD1;
    }

    public void setIngredienteD1(String ingredienteD1) {
        this.ingredienteD1 = ingredienteD1;
    }

    public String getIngredienteD2() {
        return ingredienteD2;
    }

    public void setIngredienteD2(String ingredienteD2) {
        this.ingredienteD2 = ingredienteD2;
    }

    public String getIngredienteD3() {
        return ingredienteD3;
    }

    public void setIngredienteD3(String ingredienteD3) {
        this.ingredienteD3 = ingredienteD3;
    }
}
