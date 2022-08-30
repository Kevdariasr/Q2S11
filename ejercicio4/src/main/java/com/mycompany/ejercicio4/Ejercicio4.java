package com.mycompany.ejercicio4;
import javax.swing.*;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        Object seleccion = JOptionPane.showInputDialog(
        
        null,
        "Seleccione una opcion: ",
        "Seleccione su estado civil",
        JOptionPane.QUESTION_MESSAGE,
        null,
        
        new Object[]{"Casado/a", "Soltero/a", "Divorciado/a" , "Otro"},
        "Otro");
                  
      
        System.out.println("El usuario ha elegido "+seleccion);
    }
}
