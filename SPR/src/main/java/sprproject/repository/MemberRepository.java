package sprproject.repository;

import sprproject.member.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    public Member save(Member member);
    public Optional<Member> findByUserName(String userName);
    public List<Member> findAll();

}
