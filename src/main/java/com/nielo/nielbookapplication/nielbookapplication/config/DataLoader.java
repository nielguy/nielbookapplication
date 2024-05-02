package com.nielo.nielbookapplication.nielbookapplication.config;

import com.nielo.nielbookapplication.nielbookapplication.model.UserInfo;
import com.nielo.nielbookapplication.nielbookapplication.model.UserRole;
import com.nielo.nielbookapplication.nielbookapplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

public class DataLoader implements CommandLineRunner {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    @Autowired
    public DataLoader(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository=userRepository;
        this.passwordEncoder=passwordEncoder;
    }

    @Override
    public void run(String... args) throws Exception {

        Set<UserRole> roleList = new HashSet<>();
		roleList.add(createRole("USER"));
		roleList.add(createRole("ADMIN"));
		UserInfo user = new UserInfo();
		user.setUsername("niel");
		user.setPassword(passwordEncoder.encode("password"));
		user.setRoles(roleList);
		userRepository.save(user);
    }

    private UserRole createRole(String name) {
		UserRole role = new UserRole();
		role.setName(name);
		return role;
	}
}
