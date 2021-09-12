import javax.swing.JOptionPane;

public class TestaDDD {

    public static void main(String[] args) {
        // Criamos aqui duas variáveis para DDD uma int outra string
        int ddd;
        String strDdd;
        // Vamos ler aqui a variável DDD que é integer
        ddd = Integer.parseInt(JOptionPane.showInputDialog("Digite o DDD de sua cidade: "));
        // Vamos ler aqui a variável DDD que é string
        strDdd = JOptionPane.showInputDialog(("Digite o DDD de sua cidade: "));

        SegundoExemplo se = new SegundoExemplo();
        // Vamos imprimir primeiro o DDD int com mascara
        JOptionPane.showMessageDialog(null,"DDD int com máscara: " + se.retornaDddMascara(ddd));
        // Vamos imprimir agora o DDD string com mascara
        JOptionPane.showMessageDialog(null,"DDD string com máscara: " + se.retornaDddMascara(strDdd));
    }
}
