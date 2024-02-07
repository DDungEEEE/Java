package sprproject.memberservicetest;

import jakarta.transaction.Transactional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sprproject.Service.MemberService;
import sprproject.member.Member;
import sprproject.repository.MemberRepository;

@SpringBootTest
public class MemberServiceJPATest {

    @Autowired
    MemberService memberService;
    @Autowired
    MemberRepository memberRepository;

    @Test
    @DisplayName("회원가입 테스트")
    void join(){
        Member member = new Member();
        member.setUsername("wonik");
        member.setId("park");
        member.setAge(10);

        memberService.save(member);
    }

    @Test
    @DisplayName("회원 조회")
    void 조회(){
        System.out.println("회원의 정보는 " + memberService.findAll());
    }
}
