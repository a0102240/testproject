package java24.board.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import java24.board.Log4jTest;
import java24.board.dao.DaoBoard;
import java24.board.infc.IServiceBoard;
import java24.board.model.ModelArticle;
import java24.board.model.ModelAttachFile;
import java24.board.model.ModelBoard;
import java24.board.model.ModelComments;

@Service("board")

public class ServiceBoard implements IServiceBoard{
    private static Logger log= LoggerFactory.getLogger(Log4jTest.class);
    
    @Autowired
    @Qualifier("daobook")
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
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ModelBoard getBoardListResultMap() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int insertBoard(ModelBoard board) {
        int resert =-1;
        resert=dao.insertBoard(board);
        return resert;
    }

    @Override
    public int updateBoard(ModelBoard updateValue, ModelBoard searchValue) {
        int resert =-1;
        resert=dao.updateBoard(updateValue, searchValue);
        return resert;
    }

    @Override
    public int deleteBoard(ModelBoard board) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public List<ModelBoard> getBoardSearch(ModelBoard board) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<ModelBoard> getBoardPaging(ModelBoard board) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int insertBoardList(List item) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getArticleTotalRecord(int boardcd) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public List<ModelArticle> getArticleList(HashMap articleList) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<ModelArticle> getArticle(int articleNo) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int insertArticle(ModelArticle article) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int updateArticle(String searchValue) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int deleteArticle(ModelArticle article) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int increaseHit(int articleNo) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public List<ModelArticle> getNextArticle(ModelBoard board,
            String searchWord) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<ModelArticle> getPrevArticle(ModelBoard board,
            String searchWord) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<ModelAttachFile> getAttachFile(int articleNo) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int insertAttachFile(ModelAttachFile attachfile) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int deleteAttachFile(ModelAttachFile attachfile) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public List<ModelComments> getComment(int commentNo) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<ModelComments> getCommentList(int articleNo) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int insertComment(ModelComments comments) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int updateComment(String updateValue) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int deleteComment(ModelComments comments) {
        // TODO Auto-generated method stub
        return 0;
    }
    
    
}
