package com.chaitu.springboot.mydiary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.chaitu.springboot.mydiary.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {
	
	@Query(value="select * from mydiaryusers where username=:username LIMIT 1",nativeQuery=true)//named parameter
	public User findByUserName(String username);//findByusername
}
