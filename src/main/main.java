package main;

import javax.swing.JOptionPane;
import vista.Login;

public class Main {

    public static void main(String[] args) {
        
        Login ventana = new Login();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        
        /*try{
            Login ventana = new Login();
            ventana.setVisible(true);
            ventana.setLocationRelativeTo(null);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un problema al iniciar");
            System.out.println("Error: " + e.getMessage());
        }*/
    }

}
