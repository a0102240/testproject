package java24.board.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java24.board.infc.IBoard;
import java24.board.model.ModelAttachFile;
import java24.board.model.ModelArticle;
import java24.board.model.ModelBoard;
import java24.board.model.ModelComments;

@Repository("board")
public class DaoBoard implements IBoard {
    
    @Autowired
    @Qualifier("sqlSession")
    private SqlSession session;

    @Override
    public String getBoardName(String boardcd) {
        
        String result = "";
        result = session.selectOne("mapper.mapperBoard.getBoardName", boardcd );
        return result;
    }

    @Override
    public ModelBoard getBoardOne(String boardcd) {
        // TODO Auto-generated method stub
        return null;
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
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int updateBoard() {
        // TODO Auto-generated method stub
        return 0;
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
    public List<ModelAttachFile> getAttachFile(
            int articleNo) {
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
