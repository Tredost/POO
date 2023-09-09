public class Livro {
        String titulo;
        String autor;
        boolean reservado;

        public Livro(String titulo, String autor) {
            this.titulo = titulo;
            this.autor = autor;
        }

        public void reservar() {
            if (!reservado) {
                reservado = true;
                System.out.println(titulo + " foi reservado!");
            }
            else {
                System.out.println(titulo + " já está reservado!");
            }
        }

        public void cancelarReserva() {
            if (reservado) {
                reservado = false;
                System.out.println("A reserva de '" + titulo + "'' foi cancelada!");
            }
            else {
                System.out.println(titulo + " não foi reservado ainda!");
            }
        }
    }

