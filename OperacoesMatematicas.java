public class OperacoesMatematicas {
    private int a;
    private int b;
    public void calcularSomaEProduto(int a, int b){
        this.a = a;
        this.b = b;
        int soma = a + b;
        int produto = a * b;
        System.out.println(soma + "  " + produto);
    }
}
