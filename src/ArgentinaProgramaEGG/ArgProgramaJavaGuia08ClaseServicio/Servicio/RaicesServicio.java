package ArgentinaProgramaEGG.ArgProgramaJavaGuia08ClaseServicio.Servicio;

import ArgentinaProgramaEGG.ArgProgramaJavaGuia08ClaseServicio.Entidades.Raices;

public class RaicesServicio {

    public double getDiscriminante(Raices raiz){
        double discriminante = Math.pow(raiz.getB(), 2) - 4 * raiz.getA() * raiz.getC();
        return discriminante;
    }
    public boolean tieneRaices(Raices raiz){
        /*devuelve un booleano indicando si tiene dos
        soluciones, para que esto ocurra, el discriminante debe ser mayor o
        igual que 0.*/
        double discriminante = getDiscriminante(raiz);
        if (discriminante>=0){
            return true;
        }else {
            return false;
        }
    }
    public boolean tieneRaiz(Raices raiz){
        /*devuelve un booleano indicando si tiene una
única solución, para que esto ocurra, el discriminante debe ser igual
que 0.*/
        double discriminante = getDiscriminante(raiz);
        if (discriminante==0){
            return true;
        }else {
            return false;
        }
    }
    public void obtenerRaices(Raices raiz){
        /*llama a tieneRaíces() y si devolvió́true,
imprime las 2 posibles soluciones.*/
        tieneRaices(raiz);
    }
}
