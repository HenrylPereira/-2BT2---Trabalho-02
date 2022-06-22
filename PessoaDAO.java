import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class PessoaDAO{
    HashMap<Integer, Pessoa> pessoas = new HashMap<Integer, Pessoa>();

    public Pessoa getById(int id){
        return pessoas.get(id);
    }

    public List<Pessoa> getAll(){
        ArrayList<Pessoa>lista = new ArrayList<>();
        lista.addAll(pessoas.values());
        return lista;
    }

    public void add(Pessoa pessoa){
        pessoas.put(pessoa.getId(), pessoa);
    }

    public void delete(Pessoa pessoa){
        pessoas.remove(pessoa.getId(), pessoa.getNome());
    }
}
