public class SegundoExemplo {
    // criamos aqui uma string que será o DDD formatado
    String dddComMascara;
    // criamos aqui um método que retorna o DDD formatado
    // recebendo um DDD do tipo int
    String retornaDddMascara(int ddd) {
        dddComMascara = "(" + ddd + ")";
        return dddComMascara;
    }
    // criamos aqui um método que retorna o DDD formatado
    // recebendo um DDD do tipo string
    String retornaDddMascara(String ddd) {
        dddComMascara = "(" + ddd + ")";
        return dddComMascara;
    }

}
