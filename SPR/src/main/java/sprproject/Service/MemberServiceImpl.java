package sprproject.Service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import sprproject.member.Member;
import sprproject.repository.MemberRepository;

import java.util.List;
import java.util.Optional;

@Transactional
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository;

    @Override
    public Member save(Member member) {
        memberRepository.save(member);
        return member;
    }

    @Override
    public Optional<Member> findByUserName(String userName) {
        return memberRepository.findByUserName(userName);
    }

    @Override
    public List<Member> findAll() {
        return memberRepository.findAll();
    }
}
