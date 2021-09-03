public class TestaAtleta {
    public static void main(String[] args) {
       Atleta atletaUm = new Atleta("José Júnior", "M", "20/06/2002", 1.80, 100, 200,  "1:00:30");
       atletaUm.IMC();
       atletaUm.apresentar();
       Atleta atletaDois = new Atleta();
       atletaDois.setNome("Júnior José");
       atletaDois.setSexo("M");
       atletaDois.setDataNascimento("21/06/2003");
       atletaDois.setAltura(1.70);
       atletaDois.setPeso(80);
       atletaDois.setModalidade(200);
       atletaDois.setRecorde("1:55:98");
       atletaDois.IMC();
       atletaDois.apresentar();
    }
}
