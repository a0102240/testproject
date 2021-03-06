package java24.board.infc;

import java.util.List;
import java24.board.model.ModelArticle;
import java24.board.model.ModelAttachFile;
import java24.board.model.ModelBoard;
import java24.board.model.ModelComments;

public interface IBoard {

    String getBoardName(String boardcd);
    
    List<ModelBoard> getBoardOne (String boardcd);
    
    List<ModelBoard> getBoardList();
    
    List<ModelBoard> getBoardListResultMap();
    
    int insertBoard(ModelBoard board);
    
    int updateBoard(ModelBoard updateValue, ModelBoard searchValue);
    
    int deleteBoard(ModelBoard board);
    
    List<ModelBoard> getBoardSearch(ModelBoard board);
    
    List<ModelBoard> getBoardPaging(String boardcd, String searchWord, int start, int end);
    
    int insertBoardList (ModelBoard item);
        
    int getArticleTotalRecord (String boardcd, String searchWord);
        
    List<ModelArticle> getArticleList(String boardcd, String searchWord, int start, int end);
     
    List<ModelArticle> getArticle (int articleNo);
     
    int insertArticle(ModelArticle article);
    
    int updateArticle(ModelArticle updateValue, ModelArticle searchValue);
    
    int deleteArticle(ModelArticle article);

    int increaseHit(int articleNo);
    
    List<ModelArticle> getNextArticle(ModelArticle article, String searchWord);
    
    List<ModelArticle> getPrevArticle(ModelArticle article, String searchWord);
    
    List<ModelAttachFile> getAttachFile(int attachFileNo);

    List<ModelAttachFile> getAttachFileList(int articleNo);
    
    int insertAttachFile(ModelAttachFile attachFile);

    int deleteAttachFile(ModelAttachFile attachFile);
    
    List<ModelComments> getComment(int commentNo);
    
    List<ModelComments> getCommentList(int articleNo);
    
    int insertComment(ModelComments comments);
    
    int updateComment(ModelComments updateValue, ModelComments searchValue);
    
    int deleteComment(ModelComments comments);

}
