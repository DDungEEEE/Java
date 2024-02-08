package jpa;

import jpa.member.Member;
import jpa.service.MemberService;
import jpa.service.MemberServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Test1 {

    @Autowired
    MemberService test;

    @Test
    void 회원가입(){


        Member member = new Member();

        member.setId("prabbit2");
        member.setAge(25);
        member.setUsername("son");

        test.join(member);
    }

    @Test
    void findByName(){
        String id = "prabbit2";
        System.out.println("찾은 아이디는 : " + test.findById(id));
    }
}
