package com.mycompany.ejercicio3;
import javax.swing.*;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        String seleccion = JOptionPane.showInputDialog(
        null,
        "Digite su nombre:","");
        
        System.out.println("El usuario ha escrito "+seleccion);
    }
}
