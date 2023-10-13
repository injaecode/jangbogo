package com.jangbogo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jangbogo.domain.board.Answer;
import com.jangbogo.domain.member.entity.Member;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long> {

	List<Answer> findByName(Member member);

}
