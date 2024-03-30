package modelo;

public class Usuario {
    private String mail;
    private String contraseña;
    
    public Usuario(){}
    
    public Usuario(String mail, String contraseña){
        this.mail = mail;
        this.contraseña = contraseña;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Usuario{" + "mail=" + mail + ", contrase\u00f1a=" + contraseña + '}';
    }
    
}
