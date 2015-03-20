package dao;

import generic.Dao;

import java.util.List;

import model.User;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.caelum.vraptor.ioc.Component;

@Component
public class UserDao extends Dao<User>{
	
	public UserDao(Session session){
		super(session, User.class);
	}
	
	public void salvar (User user){
		Transaction transaction = this.session.beginTransaction();  
        this.session.save(user);  
        transaction.commit();  
        
	}
	
	public void remove(Long id){
		Transaction transaction = this.session.beginTransaction(); 
		this.session.delete((User)this.session.load(User.class, id));
		this.session.flush();
		transaction.commit();  
	}
	
	public User load(Long id){
		return(User)this.session.load(User.class, id);
	}
	
	public void update(User user){
		Transaction transaction = this.session.beginTransaction(); 
		this.session.update(user);
		this.session.flush();
		transaction.commit(); 
	}
	
	public List<User> listaTodos(){
		return session.createCriteria(User.class).list();
	}
	
}
