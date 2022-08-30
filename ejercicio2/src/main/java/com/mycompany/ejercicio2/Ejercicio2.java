package com.mycompany.ejercicio2;
import javax.swing.*;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        int seleccion = JOptionPane.showOptionDialog(
        
         null, 
         "Seleccione la Opcion",
         "Selector de opciones",
         JOptionPane.YES_NO_CANCEL_OPTION,
         JOptionPane.QUESTION_MESSAGE,
         null,
         new Object[]{"opcion 1", "Opcion 2", "Opcion 3"},
  
         "Opcion 2");
        
        if(seleccion != -1)
       
            System.out.println("Selecciona Opcion"+ (seleccion+1));
    }
}
