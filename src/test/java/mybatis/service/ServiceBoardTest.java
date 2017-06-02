package mybatis.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java23.mybatis.infc.IServiceBook;
import java23.mybatis.model.ModelBook;
import java24.board.infc.IServiceBoard;
import java24.board.model.ModelBoard;

public class ServiceBoardTest {
    
    private static IServiceBoard service =null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        try {
            ApplicationContext context = new ClassPathXmlApplicationContext( "java24/board/ApplicationContext.xml");
            
            service = context.getBean("serviceboard", IServiceBoard.class);
            
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
    
    @Test
    public void testGetBoardName() {
        ModelBoard board=new ModelBoard();
        String boardcd = "data";
        String result = service.getBoardName(boardcd);
        assertSame(result,"자료실");
    }
    
    @Test
    public void testGetBoardOne() {
    }
    
    @Test
    public void testGetBoardList() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testGetBoardListResultMap() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testInsertBoard() {
        ModelBoard board=new ModelBoard();
        board.setBoardcd("aa");
        int result= service.insertBoard(board);
        assertSame(result, 1);
    }
    
    @Test
    public void testUpdateBoard() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testDeleteBoard() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testGetBoardSearch() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testGetBoardPaging() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testInsertBoardList() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testGetArticleTotalRecord() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testGetArticleList() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testGetArticle() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testInsertArticle() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testUpdateArticle() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testDeleteArticle() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testIncreaseHit() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testGetNextArticle() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testGetPrevArticle() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testGetAttachFile() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testInsertAttachFile() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testDeleteAttachFile() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testGetComment() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testGetCommentList() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testInsertComment() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testUpdateComment() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testDeleteComment() {
        fail("Not yet implemented");
    }
}
