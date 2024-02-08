package jpa.service;

import jakarta.persistence.EntityManager;
import jpa.member.Member;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
public class MemberServiceImpl implements MemberService{

    private final EntityManager em ;

   public void join(Member member){
       em.persist(member);
   }

    @Override
    public Member findById(String id) {
        return em.find(Member.class, id);
    }
}
