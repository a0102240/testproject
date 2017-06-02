package mybatis.service;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;
import java24.board.infc.IServiceBoard;
import java24.board.model.ModelArticle;
import java24.board.model.ModelAttachFile;
import java24.board.model.ModelBoard;
import java24.board.model.ModelComments;

public class ServiceBoardTest {
    // SLF4J Logging
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private static IServiceBoard service = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        try {
            // classpath를 이용한 설정 파일 로딩
            ApplicationContext context = new ClassPathXmlApplicationContext("/java24/board/ApplicationContext.xml");

            // file을 이용한 설정 파일 로딩
            // java.io.File log4jfile = new java.io.File("file:src/main/resources/ApplicationContext.xml");
            //ApplicationContext context = new
            //                  ClassPathXmlApplicationContext(log4jfile.getAbsolutePath());

            service = context.getBean("service",IServiceBoard.class);

        } catch (Exception e) {
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
        ModelArticle article = new ModelArticle();
        article.setBoardcd("free");
        article.setArticleno(5);
        String searchWord = "test";
        List<ModelArticle> result = service.getNextArticle(article, searchWord);
        assertSame(result.size(), 1);
    }
    
    @Test
    public void testGetPrevArticle() {
        ModelArticle article = new ModelArticle();
        article.setBoardcd("free");
        article.setArticleno(5);
        String searchWord = "test";
        List<ModelArticle> result = service.getPrevArticle(article, searchWord);
        assertSame(result.size(), 1);
    }
    
    @Test
    public void testGetAttachFile() {
        int attachFileNo = 1;
        List<ModelAttachFile> result = service.getAttachFile(attachFileNo);
        assertSame(result, 1);
    }

    @Test
    public void testGetAttachFileList() {
        int articleNo = 1;
        List<ModelAttachFile> result= service.getAttachFileList(articleNo);
        assertSame(result.size(),1);
    }
    
    @Test
    public void testInsertAttachFile() {
        ModelAttachFile attachFile = new ModelAttachFile();
        attachFile.setFilename("test");
        attachFile.setFiletype("jpg");
        attachFile.setFilesize(100);
        int result = service.insertAttachFile(attachFile);
        assertSame(result, 1);
    }
    
    @Test
    public void testDeleteAttachFile() {
        ModelAttachFile attachFile = new ModelAttachFile();
        attachFile.setAttachfileno(1);
        int result = service.deleteAttachFile(attachFile);
        assertSame(result, 1);
    }
    
    @Test
    public void testGetComment() {
        int commentNo = 1;
        List<ModelComments> result= service.getComment(commentNo);
        assertSame(result.size(),1);
    }
    
    @Test
    public void testGetCommentList() {
        int articleNo = 1;
        List<ModelComments> result= service.getCommentList(articleNo);
        assertSame(result.size(),1);
    }
    
    @Test
    public void testInsertComment() {
        ModelComments comments=new ModelComments();
        comments.setArticleno(2);
        comments.setEmail("1004@naver.com");
        comments.setMemo("test");
        int result = service.insertComment(comments);
        assertSame(result, 1);
    }
    
    @Test
    public void testUpdateComment() {
        ModelComments updateValue = new ModelComments();
        updateValue.setMemo("test");

        ModelComments searchValue = new ModelComments();
        searchValue.setCommentno(1);

        int result = service.updateComment(updateValue, searchValue);
        assertSame(result, 1);
    }
    
    @Test
    public void testDeleteComment() {
        ModelComments comments=new ModelComments();
        comments.setCommentno(1);
        int result = service.deleteComment(comments);
        assertSame(result, 1);
    }
}