package com.mysite.sbb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyByte;
import static org.mockito.ArgumentMatchers.intThat;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mysite.sbb.answer.Answer;
import com.mysite.sbb.answer.AnswerRepository;
import com.mysite.sbb.question.Question;
import com.mysite.sbb.question.QuestionRepostiory;
import com.mysite.sbb.question.QuestionService;

import jakarta.transaction.Transactional;
import net.bytebuddy.asm.Advice.This;

@SpringBootTest
class SbbApplicationTests {
	@Autowired
	private QuestionService questionService;
	
	@Autowired
	private QuestionRepostiory questionRepostiory;
	
	@Autowired AnswerRepository answerRepository;

//	@Test
//	void testJpa() {
	// 질문 등록하기
//		 Question q1 = new Question(); q1.setSubject("sbb가 무엇인가요?");
//		 q1.setContent("sbb에 대해서 알고 싶습니다."); q1.setCreateDate(LocalDateTime.now());
//		 this.questionRepostiory.save(q1);
//		 
//		 Question q2 = new Question(); q2.setSubject("스프링 부트 모델 질문입니다.");
//		 q2.setContent("id는 자동으로 생성되나요?"); q2.setCreateDate(LocalDateTime.now());
//		 this.questionRepostiory.save(q2);
//	}

//	@Test
//	void testJpa() {
//		// 질문 조회하기
//		List<Question> all = this.questionRepostiory.findAll();
//		assertEquals(2, all.size());
//
//		Question q = all.get(0);
//		assertEquals("sbb가 무엇인가요?", q.getSubject());
//	}
	
//	@Test
//	void testJpa() {
//		//findById
//		Optional<Question> oq = this.questionRepostiory.findById(1);
//		if (oq.isPresent()) {
//			Question question = oq.get();
//			assertEquals("sbb가 무엇인가요?", question.getSubject());
//		}
//	}
	
//	@Test
//	void testJpa() {
//		//findBySubject
//		Question question = this.questionRepostiory.findBySubject("sbb가 무엇인가요?");
//		assertEquals(1, question.getId());
//	}
	
//	@Test
//	void testJpa() {
//		//findBySubjectAndContent
//		Question q = this.questionRepostiory.findBySubjectAndContent("sbb가 무엇인가요?",
//				"sbb에 대해서 알고 싶습니다.");
//		assertEquals(1, q.getId());
//	}
	
//	@Test
//	void testJpa() {
//		//findBySubjectLike
//		List<Question> qList = this.questionRepostiory.findBySubjectLike("sbb%");
//		Question q = qList.get(0);
//		assertEquals("sbb가 무엇인가요?", q.getSubject());
//		
//	}
	
//	@Test
//	void testJpa() {
//		//질문 데이터 수정하기
//		Optional<Question> oq= this.questionRepostiory.findById(1);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
//		q.setSubject("수정된 제목");
//		this.questionRepostiory.save(q);
//	}
	
//	@Test
//	void testJpa() {
//		//질문 데이터 삭제하기
//		assertEquals(2, this.questionRepostiory.count());
//		Optional<Question> oq= this.questionRepostiory.findById(1);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
//		this.questionRepostiory.delete(q);
//		assertEquals(1, this.questionRepostiory.count());
//	}
	


//	@Test
//	void testJpa() {
//		//답변 데이터 저장하기
//		Optional<Question> oq = this.questionRepostiory.findById(2);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
//				
//		Answer a = new Answer();
//		a.setContent("네 자동으로 생성됩니다.");
//		a.setQuestion(q);
//		a.setCreateDate(LocalDateTime.now());
//		this.answerRepository.save(a);
//	}
	
//	@Test
//	void testJpa() {
//		//답변 데이터 조회하기
//		Optional<Answer> oa = this.answerRepository.findById(1);
//		assertTrue(oa.isPresent());
//		Answer answer = oa.get();
//		assertEquals(2, answer.getQuestion().getId());
//	}
	
	@Test
	void testJpa() {
		for(int i=1; i<=300; i++) {
			String subject = String.format("테스트 데이터입니다:[%03d]", i);
			String content = "내용 없음";
			this.questionService.create(subject, content);
		}
	}
}
