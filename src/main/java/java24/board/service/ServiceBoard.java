package java24.board.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.List;
import java24.board.Log4jTest;
import java24.board.dao.DaoBoard;
import java24.board.infc.IServiceBoard;
import java24.board.model.ModelArticle;
import java24.board.model.ModelAttachFile;
import java24.board.model.ModelBoard;
import java24.board.model.ModelComments;

@Service("service")

public class ServiceBoard implements IServiceBoard{
    private static Logger log= LoggerFactory.getLogger(Log4jTest.class);
    
    @Autowired
    @Qualifier("daoboard")
    private DaoBoard dao;
    
    @Override
    public String getBoardName(String boardcd) {
        String result = "";
        try {
        result = dao.getBoardName(boardcd);
        } catch (Exception e) {
            log.error( "getBoardName " + e.getMessage() );
        }
        return result;
    }

    @Override
    public List<ModelBoard> getBoardOne(String boardcd) {
        List<ModelBoard> result = null;
        try {
        result = dao.getBoardOne(boardcd);
        } catch (Exception e) {
            log.error( "getBoardOne " + e.getMessage() );
        }
        return result;
    }

    @Override
    public List<ModelBoard> getBoardList() {
        List<ModelBoard> result = null;
        try {
        result = dao.getBoardList();
        } catch (Exception e) {
            log.error( "getBoardList " + e.getMessage() );
        }
        return result;
    }
    

    @Override
    public List<ModelBoard> getBoardListResultMap() {
        List<ModelBoard> result = null;
        try {
        result = dao.getBoardListResultMap();
        } catch (Exception e) {
            log.error( "getBoardListResultMap " + e.getMessage() );
        }
        return result;
    }

    @Override
    public int insertBoard(ModelBoard board) {
        int result = -1;
        try {
        result = dao.insertBoard(board);
        } catch (Exception e) {
            log.error( "insertBoard " + e.getMessage() );
        }
        return result;
    }

    @Override
    public int updateBoard(ModelBoard updateValue, ModelBoard searchValue) {
        int result =-1;
        try {
            result=dao.updateBoard(updateValue, searchValue);
        } catch (Exception e) {
            log.error( "updateBoard " + e.getMessage() );
        }
        return result;
    }

    @Override
    public int deleteBoard(ModelBoard board) {
        int result =-1;
        try {
            result=dao.deleteBoard(board);
        } catch (Exception e) {
            log.error( "deleteBoard " + e.getMessage() );
        }
        return result;
    }
    
    @Override
    public List<ModelBoard> getBoardSearch(ModelBoard board) {
        List<ModelBoard> result = null;
        try {
        result = dao.getBoardSearch(board);
        } catch (Exception e) {
            log.error( "getBoardSearch " + e.getMessage() );
        }
        return result;
    }    

    @Override
    public List<ModelBoard> getBoardPaging(String boardcd,String searchWord) {
        List<ModelBoard> result = null;
        try {
        result = dao.getBoardPaging(boardcd,searchWord);
        } catch (Exception e) {
            log.error( "getBoardPaging " + e.getMessage() );
        }
        return result;
    }

    @Override
    public int insertBoardList(ModelBoard item) {
        int result =-1;
        try {
            result=dao.insertBoardList(item);
        } catch (Exception e) {
            log.error( "insertBoardList " + e.getMessage() );
        }
        return result;
    }
    

    @Override
    public int getArticleTotalRecord(int boardcd) {
        int result =-1;
        try {
            result=dao.getArticleTotalRecord(boardcd);
        } catch (Exception e) {
            log.error( "getArticleTotalRecord " + e.getMessage() );
        }
        return result;
    }

    @Override
    public List<ModelArticle> getArticleList(ModelArticle boardcd,ModelArticle searchWord, ModelArticle start, ModelArticle end) {
        List<ModelArticle> result=null;
        try {
        result=dao.getArticleList(boardcd, searchWord, start, end);
        } catch (Exception e) {    
            log.error( "getArticleTotalRecord " + e.getMessage() );
        }
        return result;
    }

    @Override
    public List<ModelArticle> getArticle(int articleNo) {
        List<ModelArticle> result=null;
        try {
        result=dao.getArticle(articleNo);
        } catch (Exception e) {    
            log.error( "getArticle " + e.getMessage() );
        }
        return result;
    }

    @Override
    public int insertArticle(ModelArticle article) {
        int result =-1;
        try {
            result=dao.insertArticle(article);
        } catch (Exception e) {
            log.error( "insertArticle " + e.getMessage() );
        }
        return result;
    }
    

    @Override
    public int updateArticle(ModelArticle updateValue, ModelArticle searchValue) {
        int result =-1;
        try {
            result=dao.updateArticle(updateValue,searchValue);
        } catch (Exception e) {
            log.error( "updateArticle " + e.getMessage() );
        }
        return result;
    
    }

    @Override
    public int deleteArticle(ModelArticle article) {
        int result =-1;
        try {
            result=dao.deleteArticle(article);
        } catch (Exception e) {
            log.error( "deleteArticle " + e.getMessage() );
        }
        return result;
    
    }
   
    @Override
    public int increaseHit(int articleNo) {
        int result =-1;
        try {
            result=dao.increaseHit(articleNo);
        } catch (Exception e) {
            log.error( "increaseHit " + e.getMessage() );
        }
        return result;
    }

    @Override
    public List<ModelArticle> getNextArticle(ModelArticle article, String searchWord) {
        List<ModelArticle> result = null;
        try {
            result = dao.getNextArticle(article, searchWord);
        } catch (Exception e) {
            log.error( "getNextArticle " + e.getMessage() );
        }
        return result;
    }

    @Override
    public List<ModelArticle> getPrevArticle(ModelArticle article, String searchWord) {
        List<ModelArticle> result = null;
        try {
            result = dao.getPrevArticle(article, searchWord);
        } catch (Exception e) {
            log.error( "getPrevArticle " + e.getMessage() );
        }
        return result;
    }

    @Override
    public List<ModelAttachFile> getAttachFile(int attachFileNo) {
        List<ModelAttachFile> result = null;
        try {
            result = dao.getAttachFile(attachFileNo);
        } catch (Exception e) {
            log.error( "getAttachFile " + e.getMessage() );
        }
        return result;
    }

    @Override
    public List<ModelAttachFile> getAttachFileList(int articleNo) {
        List<ModelAttachFile> result = null;
        try {
            result = dao.getAttachFile(articleNo);
        } catch (Exception e) {
            log.error( "getAttachFileList " + e.getMessage() );
        }
        return result;
    }

    @Override
    public int insertAttachFile(ModelAttachFile attachFile) {
        int result = -1;
        try {
            result = dao.insertAttachFile(attachFile);
        } catch (Exception e) {
            log.error( "insertAttachFile " + e.getMessage() );
        }
        return result;
    }

    @Override
    public int deleteAttachFile(ModelAttachFile attachFile) {
        int result = -1;
        try {
            result = dao.deleteAttachFile(attachFile);
        } catch (Exception e) {
            log.error( "deleteAttachFile " + e.getMessage() );
        }
        return result;
    }

    @Override
    public List<ModelComments> getComment(int commentNo) {
        List<ModelComments> result = null;
        try {
            result = dao.getComment(commentNo);
        } catch (Exception e) {
            log.error( "getComment " + e.getMessage() );
        }
        return result;
    }

    @Override
    public List<ModelComments> getCommentList(int articleNo) {
        List<ModelComments> result = null;
        try {
            result = dao.getCommentList(articleNo);
        } catch (Exception e) {
            log.error( "getCommentList " + e.getMessage() );
        }
        return result;
    }

    @Override
    public int insertComment(ModelComments comments) {
        int result = -1;
        try {
            result = dao.insertComment(comments);
        } catch (Exception e) {
            log.error( "insertComment " + e.getMessage() );
        }
        return result;
    }

    @Override
    public int updateComment(ModelComments updateValue, ModelComments searchValue) {
        int result = -1;
        try {
            result = dao.updateComment(updateValue, searchValue);
        } catch (Exception e) {
            log.error( "updateComment " + e.getMessage() );
        }
        return result;
    }

    @Override
    public int deleteComment(ModelComments comments) {
        int result = -1;
        try {
            result = dao.deleteComment(comments);
        } catch (Exception e) {
            log.error( "deleteComment " + e.getMessage() );
        }
        return result;
    }
    
    
}
