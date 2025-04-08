package Practico5;

import java.util.Date;

public class TicketSoporte {

    private int id;
    private static int contador = 0;
    private String descripcion;
    private String estado;
    private Date fechaCreacion;
    private Tecnico tecnico;
    private Usuario usuario;

    public TicketSoporte(String descripcion, Tecnico tecnico) {
        this.id = contador;
        this.estado = "abierto";
        this.descripcion = descripcion;
        this.tecnico = tecnico;
        contador++;
    }

    public TicketSoporte(String descripcion, Usuario usuario, Tecnico tecnico) {
        this.id = contador;
        this.descripcion = descripcion;
        this.estado = "abierto";
        this.usuario = usuario;
        this.tecnico = tecnico;
        contador++;
    }

    public int getId() {
        return id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return  "\n----------------------"+
                "\nTicketSoporte{" +
                "\nID=" + id +
                "\nDescripcion='" + descripcion + '\'' +
                "\nEstado='" + estado + '\'' +
                "\nFechaCreacion=" + fechaCreacion +
                ", \nTecnico=" + tecnico +
                ", \nUsuario=" + usuario + '}';
    }
}
