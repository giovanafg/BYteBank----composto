package bytebank;

public class TestaBanco {

    public static void main(String[] args) {
        Cliente giovana = new Cliente();
        giovana.nome = "Giovana Fernandes Gomes";
        giovana.cpf = "050.445.030-10";
        giovana.profissao = "Programadora";

        Conta contaDaGi = new Conta();
        contaDaGi.deposita(200);

        contaDaGi.titular = giovana;
        System.out.println(contaDaGi.titular.nome);
    }
}
