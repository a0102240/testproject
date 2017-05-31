package java24.board.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java23.mybatis.model.ModelBook;
import java24.board.infc.IDaoBoard;
import java24.board.model.ModelAttachFile;
import java24.board.model.ModelArticle;
import java24.board.model.ModelBoard;
import java24.board.model.ModelComments;

@Repository("board")
public class DaoBoard implements IDaoBoard {
    
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
    public List<ModelBoard> getBoardOne(String boardcd) {
        List<ModelBoard> result = null;
        result = session.selectList("mapper.mapperBoard.getBoardOne", boardcd );
        return result;
    }

    @Override
    public List<ModelBoard> getBoardList() {
        List<ModelBoard> result = null;
        result = session.selectList("mapper.mapperBoard.getBoardList");
        return result;
    }

    @Override
    public ModelBoard getBoardListResultMap() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int insertBoard(ModelBoard board) {
        int result = -1;
        result = session.insert("mapper.mapperBoard.insertBoard", board);
        return result;
    }

    @Override
    public int updateBoard(ModelBoard updateValue,ModelBoard searchValue) {
        int result=-1;
        Map<String,ModelBoard> map=new HashMap<String,ModelBoard>();
        map.put("updateValue",updateValue);
        map.put("searchValue",searchValue);
        result=session.update("mapper.mapperBoard.updateBoard",map);
        return result;
        }

    @Override
    public int deleteBoard(ModelBoard board) {
        int result = -1;
        result = session.delete("mapper.mapperBoard.deleteBoard", board);
        return result;
    }

    @Override
    public List<ModelBoard> getBoardSearch(ModelBoard board) {
        List<ModelBoard> result = null;
        result = session.selectList("mapper.mapperBoard.getBoardSearch",board);
        return result;
    }

    @Override
    public List<ModelBoard> getBoardPaging() {
        List<ModelBoard> result = null;
        result = session.selectList("mapper.mapperBoard.getBoardPaging");
        return result;
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
    public List<ModelArticle> getPrevArticle(ModelBoard board,String searchWord) {

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

    @Override
    public List<ModelBoard> getBoardPaging(ModelBoard board) {
        // TODO Auto-generated method stub
        return null;
    }

    
}
