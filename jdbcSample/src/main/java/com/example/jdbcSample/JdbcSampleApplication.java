package com.example.jdbcSample;

import com.example.jdbcSample.entity.Member;
import com.example.jdbcSample.repository.MemberCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdbcSampleApplication {

	public static void main(String[] args) {

		SpringApplication.run(JdbcSampleApplication.class, args).getBean(JdbcSampleApplication.class).execute();
	}

	@Autowired
	MemberCrudRepository repository;

	private void execute(){
		executeInsert();
		executeSelect();
	}

	private void executeInsert() {
		Member member = new Member(null,"lee soon sin");
		member = repository.save(member);
		System.out.println(member);
	}

	private void executeSelect() {
		System.out.println("select all data");
		Iterable<Member> members = repository.findAll();
		for(Member member : members){
			System.out.println(member);
		}
	}
}
