package com.mycompany.eje5confirm;
import javax.swing.*;
public class Eje5confirm {

    public static void main(String[] args) {
       
    int confirmado = JOptionPane.showConfirmDialog(
    null,
            
    "¿Aceptas salir?");
    if (JOptionPane.OK_OPTION == confirmado)
        
        System.out.println("Confirmado borrando...");
    else
        System.out.println("No borrar... ");

    }
}
