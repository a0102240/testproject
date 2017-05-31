package java24.board.infc;

import java.util.HashMap;
import java.util.List;
import java24.board.model.ModelArticle;
import java24.board.model.ModelAttachFile;
import java24.board.model.ModelBoard;
import java24.board.model.ModelComments;

public interface IBoard {

    String getBoardName(String boardcd);
    
    List<ModelBoard> getBoardOne (String boardcd);
    
    List<ModelBoard> getBoardList();
    
    ModelBoard getBoardListResultMap();
    
    int insertBoard(ModelBoard board);
    
    int updateBoard(ModelBoard updateValue, ModelBoard searchValue);
    
    int deleteBoard(ModelBoard board);
    
    List<ModelBoard> getBoardSearch(ModelBoard board);
    
    List<ModelBoard> getBoardPaging(ModelBoard boardcd,ModelBoard searchWord);
    
    int insertBoardList (List item);
        
    int getArticleTotalRecord (int boardcd);
        
    List<ModelArticle> getArticleList (HashMap articleList);
     
    List<ModelArticle> getArticle (int articleNo);
     
    int insertArticle(ModelArticle article);
    
    int updateArticle(String searchValue);
    
    int deleteArticle(ModelArticle article);

    int increaseHit(int articleNo);
    
    List<ModelArticle> getNextArticle(ModelBoard board, String searchWord); 
    
    List<ModelArticle> getPrevArticle(ModelBoard board, String searchWord);
    
    List<ModelAttachFile> getAttachFile(int articleNo);
    
    int insertAttachFile(ModelAttachFile attachfile);
    
    int deleteAttachFile(ModelAttachFile attachfile);
    
    List<ModelComments> getComment(int commentNo);
    
    List<ModelComments> getCommentList(int articleNo);
    
    int insertComment(ModelComments comments);
    
    int updateComment(ModelComments updateValue, ModelComments searchValue);
    
    int deleteComment(ModelComments comments);

}
