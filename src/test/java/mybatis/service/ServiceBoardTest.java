package mybatis.service;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java23.mybatis.model.ModelBook;

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
    public void testGetBoardName() { // success
        String boardcd = "data";
        String result = service.getBoardName(boardcd);
        assertEquals(result,"자료실");
    }
    
    @Test
    public void testGetBoardOne() {  // success
        ModelBoard board=new ModelBoard();
        String boardcd = "data";
        List<ModelBoard> result= service.getBoardOne(boardcd);
        assertEquals(result,"data");
    }
    
    @Test
    public void testGetBoardList() {  // success
        List<ModelBoard> result = service.getBoardList();
        assertSame(result.size(), 4); // board 갯수 확인
    }
    
    @Test
    public void testGetBoardListResultMap() {  // success
        List<ModelBoard> result = service.getBoardListResultMap();
        assertSame(result.size(), 4); // board 갯수 확인
     }
    
    @Test
    public void testInsertBoard() {  // success
        ModelBoard board= new ModelBoard();
        board.setBoardcd("ff");
        board.setBoardnm("ff");
        board.setUseYN(true);
        board.setBoardnm("ff");
        int result = service.insertBoard(board);
        assertEquals(result, 1);
    }
    
    @Test
    public void testUpdateBoard() {  // success
      
      ModelBoard updateValue=new ModelBoard();
      updateValue.setBoardnm("자유게시");
      updateValue.setUseYN(true);

      ModelBoard searchValue=new ModelBoard();
      searchValue.setBoardcd("free");
      
      int result=service.updateBoard(updateValue, searchValue);
      assertSame(result, 1);
      }
    
    @Test
    public void testDeleteBoard() {  // success
        ModelBoard board = new ModelBoard();
        board.setBoardcd("ff");
        int result = service.deleteBoard(board);
        assertSame(result, 1);
    }
    
    @Test
    public void testGetBoardSearch() {  // success
        ModelBoard board = new ModelBoard();
        board.setBoardcd("free");
        List<ModelBoard> result = service.getBoardSearch(board);
        assertSame(result.size(), 1);
    }
    
    @Test
    public void testGetBoardPaging() {  // success
        String boardcd = "free";
        String searchWord = "자유";
        int start = 1;
        int end = 10;
        List<ModelBoard> result = service.getBoardPaging(boardcd, searchWord, start, end);
        assertSame(result.size(), 1);
    }
    
    @Test
    public void testInsertBoardList() {  // success
        ModelBoard board = new ModelBoard();
        board.setBoardcd("info");
        board.setBoardnm("공지사항");
        board.setUseYN(true);
        int result = service.insertBoard(board);
        assertSame(result, 1);
    }
    
    @Test
    public void testGetArticleTotalRecord() {  // success
        ModelArticle article = new ModelArticle();
        String boardcd = "free";
        String searchWord = "10";
        int result = service.getArticleTotalRecord(boardcd, searchWord);
        assertSame(result, 1);
    }
    
    @Test
    public void testGetArticleList() {  // success
        String boardcd = "free";
        String searchWord = "test";
        int start = 1;
        int end = 10;
        List<ModelArticle> result = service.getArticleList(boardcd, searchWord, start, end);
        assertSame(result.size(), 10);
    }
    
    @Test
    public void testGetArticle() {  // success
        int articleNo = 7;
        List<ModelArticle> result = service.getArticle(articleNo);
        assertSame(result.size(), 1);
    }
    
    @Test
    public void testInsertArticle() {  // success
        ModelArticle article = new ModelArticle();
        article.setBoardcd("free");
        article.setTitle("article test 15");
        article.setContent("article test 15");
        article.setEmail("test@naver.com");
        int result = service.insertArticle(article);
        assertSame(result, 1);
    }
    
    @Test
    public void testUpdateArticle() {  // success
        ModelArticle updateValue = new ModelArticle();
        updateValue.setTitle("update test");
        updateValue.setUseYN(true);

        ModelArticle searchValue = new ModelArticle();
        searchValue.setTitle("article test 10");
        searchValue.setUseYN(true);

        int result = service.updateArticle(updateValue, searchValue);
        assertSame(result, 1);
    }
    
    @Test
    public void testDeleteArticle() {  // success
        ModelArticle article = new ModelArticle();
        article.setArticleno(16);  // Article 마지막글
        int result = service.deleteArticle(article);
        assertSame(result, 1);
    }
    
    @Test
    public void testIncreaseHit() {  // success
        int articleNo = 1;
        int result = service.increaseHit(articleNo);
        assertSame(result, 1);
    }
    
    @Test
    public void testGetNextArticle() {  // success
        ModelArticle article = new ModelArticle();
        article.setBoardcd("free");
        article.setArticleno(5);
        String searchWord = "test";
        List<ModelArticle> result = service.getNextArticle(article, searchWord);
        assertSame(result.size(), 1);
    }
    
    @Test
    public void testGetPrevArticle() {  // success
        ModelArticle article = new ModelArticle();
        article.setBoardcd("free");
        article.setArticleno(5);
        String searchWord = "test";
        List<ModelArticle> result = service.getPrevArticle(article, searchWord);
        assertSame(result.size(), 1);
    }
    
    @Test
    public void testGetAttachFile() {  // success
        int attachFileNo = 1;
        List<ModelAttachFile> result = service.getAttachFile(attachFileNo);
        assertSame(result.size(), 1);
    }

    @Test
    public void testGetAttachFileList() {  // success
        int articleNo = 1;
        List<ModelAttachFile> result = service.getAttachFileList(articleNo);
        assertSame(result.size(), 6);  // Attachfile 레코드수 확인
    }
    
    @Test
    public void testInsertAttachFile() {  // success
        ModelAttachFile attachFile = new ModelAttachFile();
        attachFile.setFilename("test");
        attachFile.setFiletype("jpg");
        attachFile.setFilesize(100);
        attachFile.setUseYN(true);
        int result = service.insertAttachFile(attachFile);
        assertSame(result, 1);
    }
    
    @Test
    public void testDeleteAttachFile() {  // success
        ModelAttachFile attachFile = new ModelAttachFile();
        attachFile.setAttachfileno(8); // AttachFile 마지막 글
        int result = service.deleteAttachFile(attachFile);
        assertSame(result, 1);
    }
    
    @Test
    public void testGetComment() {  // success
        int commentNo = 2;
        List<ModelComments> result= service.getComment(commentNo);
        assertSame(result.size(),1);
    }
    
    @Test
    public void testGetCommentList() {  // success
        int articleNo = 2;
        List<ModelComments> result= service.getCommentList(articleNo);
        assertSame(result.size(),1);
    }
    
    @Test
    public void testInsertComment() {  // success
        ModelComments comments=new ModelComments();
        comments.setArticleno(3);
        comments.setEmail("test@naver.com");
        comments.setMemo("test");
        int result = service.insertComment(comments);
        assertSame(result, 1);
    }
    
    @Test
    public void testUpdateComment() {  // success
        ModelComments updateValue = new ModelComments();
        updateValue.setMemo("test");
        updateValue.setUseYN(true);

        ModelComments searchValue = new ModelComments();
        searchValue.setCommentno(4);

        int result = service.updateComment(updateValue, searchValue);
        assertSame(result, 1);
    }
    
    @Test
    public void testDeleteComment() {  // success
        ModelComments comments=new ModelComments();
        comments.setCommentno(4);  // commentno 확인
        int result = service.deleteComment(comments);
        assertSame(result, 1);
    }
}