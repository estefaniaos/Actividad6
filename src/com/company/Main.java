package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String nombre = "Alvaro";
        int[] calificaciones = new int[]{ 98, 69, 68, 98, 34 };

        int promedio;
        char calificacion;

        Alumno x = new Alumno();
        x.Alumno(nombre);
        promedio = x.getPromedio(calificaciones);
        calificacion = x.getCalificacion(promedio);

        x.printData();


        //System.out.println("El alumno " + x.alumno + "obtuvo un promedio de " + promedio + "con calificación de " + calificacion);

    }

}
