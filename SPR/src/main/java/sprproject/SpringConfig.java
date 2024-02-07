package sprproject;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sprproject.Service.MemberService;
import sprproject.Service.MemberServiceImpl;
import sprproject.repository.JpaMemberRepository;
import sprproject.repository.MemberRepository;

@Configuration
public class SpringConfig {


    private EntityManager em;

    @Autowired
    public SpringConfig(EntityManager em){
        this.em = em;
    }

   @Bean
    public MemberService memberService(){
       return new MemberServiceImpl(memberRepository());
   }

   @Bean
    public MemberRepository memberRepository(){
       return new JpaMemberRepository(em);
   }


}