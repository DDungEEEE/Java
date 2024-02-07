package jpa;

import jakarta.persistence.EntityManager;
import jpa.member.Member;
import jpa.service.MemberService;
import jpa.service.MemberServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class JpaConfig {

    EntityManager em;

    @Autowired
    public JpaConfig(EntityManager em){
        this.em = em;
    }

    @Bean
    public MemberService memberService(){
        return new MemberServiceImpl(em);
    }


}
