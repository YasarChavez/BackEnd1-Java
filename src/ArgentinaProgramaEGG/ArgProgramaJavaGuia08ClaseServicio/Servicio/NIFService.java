package ArgentinaProgramaEGG.ArgProgramaJavaGuia08ClaseServicio.Servicio;

import ArgentinaProgramaEGG.ArgProgramaJavaGuia08ClaseServicio.Entidades.NIF;

import java.util.Scanner;

public class NIFService {
    public NIF crearNif() {
        char[] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        Scanner leer = new Scanner(System.in);
    /*le pide al usuario el DNI y con ese DNI calcula la
letra que le corresponderá. Una vez calculado, le asigna la letra que
le corresponde según*/
        System.out.println("Ingrese el DNI:");
        long DNI = leer.nextLong();
        double resto = DNI%23;
        char letra = letras[(int) resto];
        return new NIF(DNI,letra);
    }
    public void mostrar(NIF nif){
        /*que nos permita mostrar el NIF (ocho dígitos, un
guion y la letra en mayúscula; por ejemplo: 00395469-F).*/
        System.out.println(nif.getDNI()+"-"+ nif.getLetra());
    }
}
