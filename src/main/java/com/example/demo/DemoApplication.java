package com.example.demo;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(DemoApplication.class, args);

		UserRepository ur = context.getBean(UserRepository.class);
		User user=new User();
		user.setName("Pushpak");
		user.setCity("amt");

		User user1=new User();
		user1.setName("sunny");
		user1.setCity("bmt");

		User user2=new User();
		user2.setName("bunny");
		user2.setCity("cmt");

		//Saving Single User
//		User userr =  ur.save(user);
//		ur.save(user1);
//		ur.save(user2);

		//Saving Multiple User
//		List<User> list = List.of(user,user1,user2);
//		Iterable<User> users = ur.saveAll(list);
//		users.forEach(x-> System.out.println(x));
//		System.out.println(user1);

//Reading Sungle User
//		Optional<User> userss = ur.findById(202);
//		User user3 = userss.get();
//		System.out.println(user3);

   //Reading Multiple Users
		Iterable<User> allusers = ur.findAll();
		allusers.forEach(y-> System.out.println(y));

		System.out.println("--------------------------------------------------");

		for(User uu:allusers) {
			System.out.println(uu);
		}
	}

}
