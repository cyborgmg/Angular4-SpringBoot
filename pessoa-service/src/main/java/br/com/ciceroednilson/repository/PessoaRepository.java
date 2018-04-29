package br.com.ciceroednilson.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import br.com.ciceroednilson.model.PessoaModel;
 
/*public interface PessoaRepository extends Repository<PessoaModel, Integer>{
 
	public void save(PessoaModel pessoa);
 
	public void delete(PessoaModel pessoa);
 
	public List<PessoaModel> findAll();
 
	public PessoaModel findOne(Integer id);
}*/

public interface PessoaRepository extends CrudRepository<PessoaModel, Integer> {

}
