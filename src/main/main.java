package main;

import javax.swing.JOptionPane;
import vista.Login;

public class Main {

    public static void main(String[] args) {
        try{
            Login ventana = new Login();
            ventana.setVisible(true);
            ventana.setLocationRelativeTo(null);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un problema al iniciar");
        }
    }

}
