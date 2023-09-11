public class Condicional {
    public static void main(String[] args) {

        int anoDeLancamento = 2022;          //conctenação
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoplano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo! ");
        } else {
            System.out.println("Filme retro que vale a pena assistir! ");
        }

        if (incluidoNoplano && tipoPlano.equals("plus")){
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pegar");
        }
    }
}
