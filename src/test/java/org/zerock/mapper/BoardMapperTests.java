package org.zerock.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
	
	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;
	
//	@Test
//	public void testGetList() {
//		mapper.getList().forEach(board->log.info(board));
//	}
	
//	@Test
//	public void testInsert() {
//		BoardVO board = new BoardVO();
//		board.setTitle("인서트타이틀");
//		board.setContent("인서트콘텐츠");
//		board.setWriter("인서트롸이터");
//		mapper.insert(board);
//		
//		log.info(board);
//	}
	
//	@Test
//	public void testInsertSelectKey() {
//		BoardVO board = new BoardVO();
//		board.setTitle("인서트키타이틀");
//		board.setContent("인서트키콘텐츠");
//		board.setWriter("인서트키롸이터");
//		mapper.insertSelectKey(board);
//		
//		log.info(board);
//	}
	
//	@Test
//	public void testRead() {
//		BoardVO board = mapper.read(1L);
//		
//		log.info(board);
//		
//	}
	
//	@Test
//	public void testDelete() {
//		log.info("delete count:"+mapper.delete(1111L));
//	}
	
	@Test
	public void testUpdate() {
		BoardVO board = new BoardVO();
		board.setBno(1L);
		board.setTitle("업뎃");
		board.setContent("업뎃");
		board.setWriter("업뎃");
		
		log.info("update count:"+mapper.update(board));
	}

}
