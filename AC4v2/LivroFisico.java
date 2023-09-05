public class LivroFisico extends Livros{
        boolean emprestado;

        public LivroFisico(String titulo, String autor) {
            super(titulo,autor);
            this.reservado = false;
            this.emprestado = false;
        }


        public void emprestar() {
            if (!emprestado && reservado) {
                emprestado = true;
                System.out.println("O livro '" + titulo + "' foi emprestado!");
            }
            else if (!emprestado && !reservado){
                System.out.println("É necessário reservar o livro primeiro!");
            }
            else {
                System.out.println("O livro '" + titulo + "' já está emprestado!");
            }
        }

        public void devolver() {
            if (emprestado) {
                emprestado = false;
                System.out.println("O livro '" + titulo + "' foi devolvido!");
            }
            else {
                System.out.println("O livro '" + titulo + "' já está na biblioteca!");
            }
        }
    }
