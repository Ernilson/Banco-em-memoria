package br.com.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import br.com.security.model.Role;
import br.com.security.model.User;
import br.com.security.repository.RoleRepository;
import br.com.security.repository.UserRepository;

@Component
public class Initializer implements ApplicationListener<ContextRefreshedEvent>{

	@Autowired
	private RoleRepository rp;
	
	@Autowired
	private UserRepository ur;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
		Role r = new Role();
		
		r.setNome("Admin");
		
		Role r2 = new Role();
		
		r2.setNome("Teste");
		
		rp.save(r);
		rp.save(r2);
		
		User u = new User();
		
		u.setNome("Convidado");
		u.setEmail("convidado@gmail.com");
		u.setRole(r);
		
		// User u2 = new User();
		
	//	u2.setNome("Teste2");
	///	u2.setEmail("teste@teste");
	//	u2.setRole(r2);
		ur.save(u);
	//	ur.save(u2);
		
	}

}
