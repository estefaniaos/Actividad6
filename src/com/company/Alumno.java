package com.company;

public class Alumno {
    String alumno;
    int[] calificaciones = new int[5];
    int promedio;
    char calificacion;

    public void Alumno(){
        this.alumno = "";
        this.promedio = 0;
        for (int i = 0; i<calificaciones.length; i++){
            this.calificaciones[i] = 0;
        }
        this.calificacion = ' ';
    }

    public void Alumno(String name){
        this.alumno = name;
    }

    public int getPromedio(int [] cals){
        int promedio;
        int total = 0;

        for(int i = 0; i < cals.length; i++){
            this.calificaciones[i] = cals[i];
            total += this.calificaciones[i];
        }

        promedio = total / 5;
        this.promedio = promedio;

        return promedio;
    }

    public char getCalificacion(int promedio){
        char calificacion;

        if(promedio <= 50){
            calificacion = 'F';
        }else if(promedio < 61){
            calificacion = 'E';
        }else if(promedio < 71){
            calificacion = 'D';
        }else if(promedio < 81){
            calificacion = 'C';
        }else if(promedio < 91){
            calificacion = 'B';
        }else{
            calificacion = 'A';
        }

        this.calificacion = calificacion;
        return calificacion;
    }

    public void printData(){
        System.out.println("Nombre del estudiante: " + this.alumno);
        for(int i = 0; i < this.calificaciones.length; i++) {
            System.out.println("Calificación " + i + ": " + this.calificaciones[i]);
        }
        System.out.println("Promedio: " + this.promedio);
        System.out.println("Calificación: " + this.calificacion);
    }
}
