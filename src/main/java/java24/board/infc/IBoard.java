package java24.board.infc;

import java.util.List;
import java24.board.model.ModelArticle;
import java24.board.model.ModelBoard;
import java24.board.model.ModelComments;

public interface IBoard {

    String getBoardName(String boardcd);
    
    ModelBoard getBoardOne (String boardcd);
    
    List<ModelBoard> getBoardList();
    
    ModelBoard getBoardListResultMap();
    
    int insertBoard(ModelBoard boardcd,ModelBoard boardnm,ModelBoard UseYN,ModelBoard InsertUID,ModelBoard InsertDT,ModelBoard UpdateUID);
    
    int updateBoard();
    
    int deleteBoard(ModelBoard boardcd,ModelBoard boardnm,ModelBoard UseYN);
    
    List<ModelBoard> getBoardSearch(ModelBoard boardcd, ModelBoard boardnm);
    
    List<ModelBoard> getBoardPaging(ModelBoard boardcd, ModelBoard searchWord,ModelBoard start,ModelBoard end);
    
    int insertBoardList (int boardcd, int boardnm, int UseYN);
        
    int getArticleTotalRecord (int boardcd);
        
    List<ModelArticle> getArticleList (ModelArticle boardcd, ModelArticle start, ModelArticle end);
     
    ModelArticle getArticle (int articleNo);
     
    int insertArticle(ModelArticle boardcd,ModelArticle articleno,ModelArticle title,ModelArticle email,ModelArticle UseYN);
    
    int updateArticle(ModelArticle articleNo, ModelArticle boardcd, ModelArticle email,ModelArticle UseYN);
    
    int deleteArticle(ModelArticle articleNo, ModelArticle boardcd, ModelArticle email,ModelArticle UseYN);

    int increaseHit(int articleNo);
    
    List<ModelArticle> getNextArticle(ModelBoard board, String searchWord); 
    
    List<ModelArticle> getPrevArticle(ModelBoard board, String searchWord);
    
    List<ModelAttachFile> getAttachFile(int articleNo);
    
    int insertAttachFile(ModelAttachFile attachfile);
    
    int deleteAttachFile(ModelAttachFile attachfile);
    
    List<ModelComments> getComment(int commentNo);
    
    List<ModelComments> getCommentList(int articleNo);
    
    int insertComment(ModelComments comments);
    
    int updateComment(String updateValue);
    
    int deleteComment(ModelComments comments);

}
