package java24.board.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

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

    public List<ModelBoard> getBoardListResultMap() {
        List<ModelBoard> result = null;
        result = session.selectList("mapper.mapperBoard.getBoardListResultMap");
        return result;
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
    public List<ModelBoard> getBoardPaging(ModelBoard boardcd,ModelBoard searchWord) {
        List<ModelBoard> result = null;
        Map<String,ModelBoard> map=new HashMap<String,ModelBoard>();
        map.put("boardcd", boardcd);
        map.put("searchWord", searchWord);
        result = session.selectList("mapper.mapperBoard.getBoardPaging");
        return result;
    }

    @Override
    public int insertBoardList(ModelBoard item) {
        int result=-1;
        result=session.insert("mapper.mapperBook.insertBoardList",item);
        return result;
    }

    @Override
    public int getArticleTotalRecord(int boardcd) {
        int result = -1;
        result = session.selectOne("mapper.mapperBoard.getArticleTotalRecord", boardcd );
        return result;
    }

    @Override
    public List<ModelArticle> getArticleList(ModelArticle boardcd,ModelArticle searchWord, ModelArticle start, ModelArticle end) {
        List<ModelArticle> result = null;
        Map<String,ModelArticle> map=new HashMap<String,ModelArticle>();
        map.put("boardcd", boardcd);
        map.put("searchWord", searchWord);
        map.put("start", start);
        map.put("end", end);
        result = session.selectList("mapper.mapperBoard.getArticleList");
        return result;
    }

    @Override
    public List<ModelArticle> getArticle(int articleNo) {
        List<ModelArticle> result = null;
        result = session.selectList("mapper.mapperBoard.getArticle",articleNo);
        return result;
    }

    @Override
    public int insertArticle(ModelArticle article) {
        int result = -1;
        result = session.insert("mapper.mapperBoard.insertArticle",article);
        return result;
    }

    @Override
    public int updateArticle (ModelArticle updateValue, ModelArticle searchValue) {
        int result=-1;
        Map<String,ModelArticle> map=new HashMap<String,ModelArticle>();
        map.put("updateValue",updateValue);
        map.put("searchValue",searchValue);
        result=session.update("mapper.mapperBook.updateArticle",map);
        return result;
    }

    @Override
    public int deleteArticle(ModelArticle article) {
        int result=-1;
        result=session.delete("mapper.mapperBook.deleteArticle",article);
        return result;
    }

    @Override
    public int increaseHit(int articleNo) {
        int result=-1;
        result=session.selectOne("mapper.mapperBook.increaseHit",articleNo);
        return result;
    }

    @Override
    public List<ModelArticle> getNextArticle(ModelArticle article, String searchWord) {
        List<ModelArticle> result = null;
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("boardcd", article.getBoardcd());
        map.put("articleNo", article.getArticleno());
        map.put("searchWord", searchWord);
        result = session.selectList("mapper.mapperBoard.getPrevArticle", map);
        return result;
    }

    @Override
    public List<ModelArticle> getPrevArticle(ModelArticle article, String searchWord) {
        List<ModelArticle> result = null;
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("boardcd", article.getBoardcd());
        map.put("articleNo", article.getArticleno());
        map.put("searchWord", searchWord);
        result = session.selectList("mapper.mapperBoard.getPrevArticle", map);
        return result;
    }

    @Override

    public List<ModelAttachFile> getAttachFile(int attachFileNo) {
        List<ModelAttachFile> result = null;

        result = session.selectList("mapper.mapperBoard.getAttachFile", attachFileNo);
        return result;
    }

    @Override

    public int insertAttachFile(ModelAttachFile attachFile) {
        int result = -1;
        result = session.insert("mapper.mapperBoard.insertAttachFile", attachFile);
        return result;
    }

    @Override

    public int deleteAttachFile(ModelAttachFile attachFile) {
        int result = -1;
        result = session.delete("mapper.mapperBoard.deleteAttachFile", attachFile);
        return result;
    }

    @Override
    public List<ModelComments> getComment(int commentNo) {
        List<ModelComments> result = null;
        result = session.selectList("mapper.mapperBoard.getComment", commentNo);
        return result;
    }

    @Override
    public List<ModelComments> getCommentList(int articleNo) {
        List<ModelComments> result = null;
        result = session.selectList("mapper.mapperBoard.getCommentList", articleNo);
        return result;
    }

    @Override
    public int insertComment(ModelComments comments) {
        int result = -1;
        result = session.insert("mapper.mapperBoard.insertComment", comments);
        return result;
    }

    @Override
    public int updateComment(ModelComments updateValue, ModelComments searchValue) {
        int result=-1;
        Map<String, ModelComments> map=new HashMap<String, ModelComments>();
        map.put("updateValue",updateValue);
        map.put("searchValue",searchValue);
        result=session.update("mapper.mapperBoard.updateBoard",map);
        return result;
    }

    @Override
    public int deleteComment(ModelComments comments) {
        int result = -1;
        result = session.delete("mapper.mapperBoard.deleteComment", comments);
        return result;
    }

    @Override
    public List<ModelBoard> getBoardPaging() {
        // TODO Auto-generated method stub
        return null;
    }

    
}
