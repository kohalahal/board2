package org.zerock.service;

import static org.junit.Assert.assertNotNull;

import java.util.Calendar;
import java.util.List;

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
public class BoardServiceTests {
	
	@Setter(onMethod_ = {@Autowired})
	private BoardService service;
	
	@Test
	public void testExist() {
		log.info(service);
		assertNotNull(service);
	}
	
	@Test
	public void testRegister() {
		BoardVO board = new BoardVO();
		board.setTitle("tt");
		board.setContent(Calendar.getInstance().toString());
		board.setWriter("ww");
		service.register(board);
		log.info("=================");
		log.info(board.getBno());
	}
	
	@Test
	public void testModify() {
		BoardVO board = new BoardVO();
		board.setTitle("tt");
		board.setContent(Calendar.getInstance().toString());
		board.setWriter("ww");
		board.setBno(1L);
		service.modify(board);
		
	}
	
	@Test
	public void testDelete() {
		log.info(service.remove(1000L));
		
	}
	
	@Test
	public void testRead() {
		log.info(service.get(1L));
		log.info(service.get(1000L));
	}
	
//	@Test
//	public void testGetList() {
//		List<BoardVO> list = service.getList();
//		log.info(list.size());
//		
//	}

}
