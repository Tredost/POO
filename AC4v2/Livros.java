public class Livros {
        String titulo;
        String autor;
        boolean reservado;

        public Livros(String titulo, String autor) {
            this.titulo = titulo;
            this.autor = autor;
        }

        public void reservar() {
            if (!reservado) {
                reservado = true;
                System.out.println("O eBook '" + titulo + "' foi reservado!");
            }
            else {
                System.out.println("O eBook '" + titulo + "' já está reservado!");
            }
        }

        public void cancelarReserva() {
            if (reservado) {
                reservado = false;
                System.out.println("A reserva do eBook '" + titulo + "' foi cancelada!");
            }
            else {
                System.out.println("O eBook '" + titulo + " não foi reservado ainda!");
            }
        }
    }

