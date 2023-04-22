package ArgentinaProgramaEGG.ArgProgramaJavaGuia09ClasesUtilidad.Servicios;

import ArgentinaProgramaEGG.ArgProgramaJavaGuia09ClasesUtilidad.Entidades.Fracciones;

public class FraccionesService {
    public int calcularMcm(Fracciones fraccionesobj) {
        int den1 = fraccionesobj.getDenominador1();
        int den2 = fraccionesobj.getDenominador2();
        int mcm= den1* den2;

        return mcm;
    }

    public void sumarFracciones(Fracciones fraccionesobj) {
        int num1 = fraccionesobj.getNumerador1();
        int num2 = fraccionesobj.getNumerador2();
        int den1 = fraccionesobj.getDenominador1();
        int den2 = fraccionesobj.getDenominador2();
        int mcm = calcularMcm(fraccionesobj);
        int numSuma = ((mcm / den1) * num1 )+ ((mcm / den2) * num2);
        int denSuma = mcm;
        System.out.println(numSuma+"/"+denSuma);
    }

    public void restaFracciones(Fracciones fraccionesobj) {
        int num1 = fraccionesobj.getNumerador1();
        int num2 = fraccionesobj.getNumerador2();
        int den1 = fraccionesobj.getDenominador1();
        int den2 = fraccionesobj.getDenominador2();
        int mcm = calcularMcm(fraccionesobj);
        int numSuma = ((mcm / den1) * num1 )- ((mcm / den2) * num2);
        int denSuma = mcm;
        System.out.println(numSuma+"/"+denSuma);
    }
    public void multFracciones(Fracciones fraccionesobj) {
        double numeradorMul = fraccionesobj.getNumerador1() * fraccionesobj.getNumerador2();
        double denominadorMul = fraccionesobj.getDenominador1() * fraccionesobj.getDenominador2();
        System.out.println(numeradorMul + "/" + denominadorMul);
    }

    public void divFracciones(Fracciones fraccionesobj) {
        double numeradorDiv = fraccionesobj.getNumerador1() * fraccionesobj.getDenominador2();
        double denominadorDiv = fraccionesobj.getDenominador1() * fraccionesobj.getNumerador2();
        System.out.println(numeradorDiv + "/" + denominadorDiv);
    }
}
