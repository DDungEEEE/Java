package jpa.service;

import jpa.member.Member;

public interface MemberService {
    public void join(Member member);

    public Member findById(String id);
}
