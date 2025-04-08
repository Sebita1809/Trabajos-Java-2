package Practico5;

import java.util.ArrayList;

public class SistemaSoporte {

    private static int ticketsCerrados;
    private static int ticketsAbiertos;
    private static ArrayList<TicketSoporte> tickets = new ArrayList<>();
    private String descripcion;
    private Usuario usuario;
    private Tecnico tecnico;

    public SistemaSoporte(String descripcion, Usuario usuario, Tecnico tecnico) {
        this.descripcion = descripcion;
        this.usuario = usuario;
        this.tecnico = tecnico;
        crearTicket(descripcion, usuario, tecnico);
    }

    public SistemaSoporte(String descripcion, Tecnico tecnico) {
        this.descripcion = descripcion;
        this.tecnico = tecnico;
        this.usuario = null;
        crearTicket(descripcion, usuario, tecnico);
    }

    public void crearTicket(String descripcion, Usuario usuario, Tecnico tecnico){
        if(usuario == null){
          TicketSoporte ticket = new TicketSoporte(descripcion, tecnico);
          tickets.add(ticket);
          if (ticket.getEstado().toLowerCase() == "abierto"){
              ticketsAbiertos++;
          }
        } else {
            TicketSoporte ticket = new TicketSoporte(descripcion, usuario, tecnico);
            tickets.add(ticket);
            if (ticket.getEstado().toLowerCase() == "abierto"){
                ticketsAbiertos++;
            }
        }
    }
    public void cerrarTicket(int id){
        for(TicketSoporte ticket : tickets){
            if (ticket.getId() == id){
                ticket.setEstado("cerrado");
                ticketsAbiertos--;
                ticketsCerrados++;
            }
        }
    }
    @Override
    public String toString() {
        return "\nSistemaSoporte{" +
                "tickets=" + tickets +
                "\n---------------------" +
                "\nCantidad de tickets abiertos: " + ticketsAbiertos +
                "\nCantidad de tickets cerrados: " + ticketsCerrados;
    }
}
