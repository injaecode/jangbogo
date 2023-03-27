package com.jangbogo.repository;

import com.jangbogo.domain.Member;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {


    boolean existsByEmail(String email);
    boolean existsByNickName(String nickName);
    
    Optional<Member> findBynickName(String nickName);

}
