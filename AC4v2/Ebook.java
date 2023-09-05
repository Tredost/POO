public class Ebook extends Livros{
    String formato;

        public Ebook(String titulo, String autor, String formato) {
            super(titulo,autor);
            this.formato = formato;
            this.reservado = false;
        }
}
