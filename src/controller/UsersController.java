package controller;

import java.util.List;

import model.User;

import org.hibernate.Session;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.validator.ValidationMessage;
import dao.UserDao;

@Resource
public class UsersController {
	
	private final UserDao userDao;
	private final Session session;
	private final Result result;
	private final Validator validator;
	
	public UsersController(UserDao userDao, Result result, Session session, Validator validator){
		this.userDao=userDao;
		this.session=session;
		this.result=result;
		this.validator=validator;
	}
	

	@Post
	@Path("/users")
	public void add(User user){
		userDao.salvar(user);
		result.include("mensagem", "Usuário adicionado com sucesso!");
		result.redirectTo(UsersController.class).list();
	}

	
	@Get
	@Path("/users/{id}")
	public User view(Long id){
		return userDao.load(id);
	}
	
	@Path("/users/delete/{id}")
	public void delete(Long id){
		userDao.remove(id);
		result.include("mensagem", "Usuário excluído com sucesso!");
		result.redirectTo(UsersController.class).list();
	}
	
	@Put
	@Path("/users")
	public void edit(User user){
		userDao.update(user);
		result.include("mensagem", "Usuário alterado com sucesso!");
		result.redirectTo(UsersController.class).list();
	}
	
	@Path("/")
	public List<User> list(){
		return userDao.listaTodos();
	}

}
