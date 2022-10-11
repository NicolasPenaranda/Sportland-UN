package proyecto_estructura_datos;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Cuenta implements Comparable<Cuenta>{
    
    protected boolean tipoCuenta;
    private String correo;
    private String usuario;
    private String clave;
    private LocalDateTime fechaCreacion;
    private DateTimeFormatter formater;
    
    public Cuenta(String correo, String usuario, String clave) {
        this.correo = correo;
        this.usuario = usuario;
        this.clave = clave;
        this.fechaCreacion = LocalDateTime.now();
        this.formater = DateTimeFormatter.ofPattern("dd/MM/yyyy"); ;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public DateTimeFormatter getFormater() {
        return formater;
    }

    public void setFormater(DateTimeFormatter formater) {
        this.formater = formater;
    }

    @Override
    public String toString() {
        return correo + "," + usuario + "," + clave + "," + tipoCuenta + "," + fechaCreacion;
    }

    @Override
    public boolean equals(Object o){
        Cuenta _o = (Cuenta) o;
        boolean usuariosIguales,clavesIguales,correosIguales;
        usuariosIguales = _o.getUsuario().equals(usuario);
        clavesIguales = _o.getClave().equals(clave);
        correosIguales = _o.getCorreo().equals(correo);
        return usuariosIguales && clavesIguales || correosIguales && clavesIguales;
    }
    
    @Override
    public int compareTo(Cuenta o) {
        boolean usuariosIguales,clavesIguales,correosIguales;
        usuariosIguales = o.getUsuario().equals(usuario);
        clavesIguales = o.getClave().equals(clave);
        correosIguales = o.getCorreo().equals(correo);
//        System.out.println("Usuario O: " + o);
//        System.out.println("This.usuario: " + this.toString());
//        System.out.println("");
        if(usuariosIguales && clavesIguales || correosIguales && clavesIguales){
//            System.out.println("");
            return 0;
        }
        if(usuariosIguales || correosIguales && !clavesIguales){
            return 1;
        }
        return -1;
    }

    
    
}
