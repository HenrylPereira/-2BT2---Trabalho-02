public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(1, "Thiago");
        Pessoa pessoa2 = new Pessoa(2, "Clebão");
        PessoaDAO pessoaDAO = new PessoaDAO();
    
    
        pessoaDAO.add(pessoa1);
        pessoaDAO.add(pessoa2);
        System.out.println(pessoaDAO.getAll());

        pessoaDAO.delete(pessoa1);
        System.out.println(pessoaDAO.getAll());
    }
}
