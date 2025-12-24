package org.uam.model;

public abstract class Usuario {
    private String nombre;
    private String apellido;
    private String sexo;
    private boolean activo;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public abstract void getRol();

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public boolean estaActivo(){
       return activo;
    }

    public boolean isActivo() {
        return activo;
    }
}

class UsuarioAdministrativo extends Adulto {
    private String area;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public void getRol() {
        System.out.println("Administrativo");
    }
}
class UsuarioContabilidad extends Adulto{
    private String cargo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void getRol() {
        System.out.println("Contabilidad");
    }
}
class Estudiante extends Adulto {
    private byte anioCursando;

    public byte getAnioCursando() {
        return anioCursando;
    }

    public void setAnioCursando(byte anioCursando) {
        this.anioCursando = anioCursando;
    }

    @Override
    public void getRol() {
        System.out.println("Estudiante");
    }

    @Override
    public boolean estaActivo() {
        //si estudiante no egresado, si estudiante no ha retirado matricula
        return super.estaActivo();
    }
}

class EmailService {
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void sendEmail(String msg) {
        System.out.println("Enviando email: " + email);
    }
}

class Infante extends Usuario {
    private int edad;
    private String nombrePadre;
    private String nombreMadre;

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {}

    @Override
    public void getRol() {

    }
}



class Adulto extends Usuario {

    private String cedula;

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public void getRol() {
        System.out.println("Adulto");
    }
}