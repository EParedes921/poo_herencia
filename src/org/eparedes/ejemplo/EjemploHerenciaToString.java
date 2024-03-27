package org.eparedes.ejemplo;

import org.eparedes.pooherencia.Alumno;
import org.eparedes.pooherencia.AlumnoInternacional;
import org.eparedes.pooherencia.Persona;
import org.eparedes.pooherencia.Profesor;

public class EjemploHerenciaToString {
    public static void main(String[] args) {

        System.out.println("============ Creando la instancia de la clase Alumno =============");
        Alumno alumno = new Alumno("Edwar", "Paredes", 25, "Instituto Nacional");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematicas(4.9);
        alumno.setEmail("edwar@gmail.com");

        System.out.println("============ Creando la instancia de la clase AlumnoInternacional =============");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("Peter", "Gosling", "Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematicas(6.5);
        alumnoInt.setEmail("peter@gmail.com");

        System.out.println("============ Creando la instancia de la clase Profesor =============");
        Profesor profesor = new Profesor("Luci", "Perez", "Matemáticas");
        profesor.setEdad(37);
        profesor.setEmail("luci@gmail.com");

        System.out.println(" ========= - ========= ");

        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);

    }

    public static void imprimir(Persona persona){
        System.out.println(" ==================================== ");
        System.out.println(persona);
    }
}
