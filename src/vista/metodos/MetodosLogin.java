package vista.metodos;

import javax.swing.JOptionPane;

public class MetodosLogin {
    
    public MetodosLogin(){}
    
    public boolean validacionCampo(String usuario, String password){
        if(usuario.isEmpty() || password.isEmpty()) return false;
        return true;
    }
    
    /*
        No es la forma de validar un usuario (estoy probando)
    */
    public boolean validacionUsuario(String usuario){
        int cont = 0;
        int index = 0;
        for(int i = 0; i < usuario.length(); i++){
            if(usuario.charAt(i) == '@'){
                cont = 1;
                index = i;
                break;
            }
        }
        
        if(cont == 1){
            for (int i = index; i < usuario.length(); i++) {
                if(usuario.charAt(i) == '.'){
                    cont = 2;
                    break;
                }
            }
        }
        
        System.out.println(cont);
        if(cont == 2) return true;
        else return false;
    }
    
    public void validacionInicioSesion(String usuario, String password){
        if(validacionCampo(usuario, password)){
            if(validacionUsuario(usuario)){
                System.out.println(usuario + " " + password);
                if(usuario.equals("alumno@ulp.edu.ar") && password.equals("12345678"))
                    JOptionPane.showMessageDialog(null, "Bienvenido usuario " + usuario + "!!");
                else JOptionPane.showMessageDialog(null, "Usuario y/o contraseña incorrectos");
            }else JOptionPane.showMessageDialog(null, "Email con formato incorrecto, ingrese un formato de email valido : usuario@servidor.xxx");
        }else JOptionPane.showMessageDialog(null, "Faltan campos por rellenar");
    }
}
