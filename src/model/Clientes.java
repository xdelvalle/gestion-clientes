package model;

public class Clientes implements java.io.Serializable {

    private int id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String edad;
    private String sexo;
    private String direccionTipo;
    private String direccion;
    private String telefono;
    private String movil;
    private String email;
    private String comentarios;
    private String fechaNacimiento;

    public Clientes() {
    }

    public Clientes(String nombre, String apellido1, String apellido2, String edad, String sexo, String direccionTipo, String direccion, String telefono, String movil, String email, String comentarios, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
        this.sexo = sexo;
        this.direccionTipo = direccionTipo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.movil = movil;
        this.email = email;
        this.comentarios = comentarios;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return this.apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return this.apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getEdad() {
        return this.edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDireccionTipo() {
        return this.direccionTipo;
    }

    public void setDireccionTipo(String direccionTipo) {
        this.direccionTipo = direccionTipo;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMovil() {
        return this.movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getComentarios() {
        return this.comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Clientes [id=" + id + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", edad="
               + edad + ", sexo=" + sexo + ", direccionTipo=" + direccionTipo + ", direccion=" + direccion + ", telefono=" + telefono
               + ", movil=" + movil + ", email=" + email + ", comentarios=" + comentarios + ", fechaNacimiento=" + fechaNacimiento
               + "]";
    }
}
