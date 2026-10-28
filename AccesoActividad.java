public class AccesoActividad {

    public static void main(String[] args) {
        int edad = 20;
        boolean inscripcionActiva = true;
        boolean documentoPresentado = true;

        boolean esMayorEdad = edad >= 18;
        boolean cumpleInscripcionYDocumento = inscripcionActiva && documentoPresentado;
        boolean cumpleTresRequisitos = esMayorEdad && inscripcionActiva && documentoPresentado;

        System.out.println("¿Es mayor de edad?: " + esMayorEdad);
        System.out.println("¿Cumple inscripción y documento?: " + cumpleInscripcionYDocumento);
        System.out.println("¿Cumple los tres requisitos?: " + cumpleTresRequisitos);
    }
}