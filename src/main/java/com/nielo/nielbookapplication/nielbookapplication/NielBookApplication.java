package com.nielo.nielbookapplication.nielbookapplication;

import com.nielo.nielbookapplication.nielbookapplication.model.UserInfo;
import com.nielo.nielbookapplication.nielbookapplication.model.UserRole;
import com.nielo.nielbookapplication.nielbookapplication.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class NielBookApplication {

//	@Autowired
//	private PasswordEncoder passwordEncoder;
//
//	@Autowired
//	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(NielBookApplication.class, args);
	}

//	@PostConstruct
//	protected void init() {
//		Set<UserRole> roleList = new HashSet<>();
//		roleList.add(createRole("USER"));
//		roleList.add(createRole("ADMIN"));
//		UserInfo user = new UserInfo();
//		user.setUsername("niel");
//		user.setPassword(passwordEncoder.encode("password"));
//		user.setRoles(roleList);
//		userRepository.save(user);
//	}
//
//	private UserRole createRole(String name) {
//		UserRole role = new UserRole();
//		role.setName(name);
//		return role;
//	}
}
