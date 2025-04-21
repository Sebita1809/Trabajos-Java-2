package Practico5;

public class main {
    public static void main(String[]args){

        Usuario usuario1 = new Usuario(1, "Matias" , "matias123@gmail.com");
        Usuario usuario2 = new Usuario(2, "Federico", "fedesuarez@gmail.com");
        Tecnico tecnico1 = new Tecnico(1, "Marcos", "especialista en redes");
        Tecnico tecnico2 = new Tecnico(2, "Juan", "ingeniero en sistemas");
        SistemaSoporte ticket1 = new SistemaSoporte("tengo problemas con mi celular", tecnico1);
        SistemaSoporte ticket2 = new SistemaSoporte("no puedo entrar a mi computadora", usuario2, tecnico2);

        System.out.println(ticket1);
        ticket1.cerrarTicket(0);
        System.out.println(ticket1);

    }
}
