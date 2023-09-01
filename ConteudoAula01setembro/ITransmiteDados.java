public interface ITransmiteDados {
    
    //Métodos em interface são abstratos por padrão (não precisa explicitar) 
    void enviaJson();
    String recebeMensagem(String protocolo);

}
