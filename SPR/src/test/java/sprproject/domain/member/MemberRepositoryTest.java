package sprproject.domain.member;

import org.assertj.core.api.Assert;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import sprproject.domain.member.Member;
import sprproject.domain.member.MemberRepository;

import java.util.List;

@SpringBootTest
class MemberRepositoryTest {

    MemberRepository memberRepository  = MemberRepository.getInstance();

    @AfterEach
    void clearAll(){
        memberRepository.clearStore();
    }

    @Test
    @DisplayName("회원가입")
    void join(){
        //given
        Member member = new Member("hello", 20);
        memberRepository.save(member);

        //when
        Member savedMember = memberRepository.findById(member.getId());
        Assertions.assertThat(member).isEqualTo(savedMember);

    }

    @Test
    void findAAll(){
        //given
        Member member1 = new Member("SON", 1);
        Member member2 = new Member("SON2", 2);
        //when
        memberRepository.save(member1);
        memberRepository.save(member2);

        List<Member> result = memberRepository.findAll();
        //then
        Assertions.assertThat(2).isEqualTo(result.size());
        Assertions.assertThat(result).contains(member1,member2);

    }

}