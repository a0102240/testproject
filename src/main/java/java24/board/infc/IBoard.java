package java24.board.infc;

import java.util.List;
import java24.board.model.ModelArticle;
import java24.board.model.ModelAttachFile;
import java24.board.model.ModelBoard;
import java24.board.model.ModelComments;

public interface IBoard {
'
    String getBoardName(String boardcd);
    ModelBoard getBoardOne (String boardcd);
    List<ModelBoard> getBoardList();
    ModelBoard getBoardListResultMap();
    //bbsResultMap();
    bbsResultMap getBoardCustomMap();
    List<ModelBoard> insertBoard(ModelBoard boardcd,ModelBoard boardnm,ModelBoard UseYN,ModelBoard InsertUID,ModelBoard InsertDT,ModelBoard UpdateUID);
    //updateBoard();
    int deleteBoard(ModelBoard boardcd,ModelBoard boardnm,ModelBoard UseYN);
        ModelBoard getBoardSearch(ModelBoard boardcd, ModelBoard boardnm);
    //ModelBoard getBoardPaging(hashmap boardcd,searchWord, start, end);
    //insertBoardList java.util.List item.boardcd item.boardnm item.UseYN
    //int getArticleTotalRecord (boardcd)
    // ModelArticle getArticleList (boardcd start end);
     ModelArticle getArticle (int articleNo);
     List<ModelArticle> insertArticle(ModelArticle boardcd,ModelArticle articleno,ModelArticle title,ModelArticle email,ModelArticle UseYN);
     List<ModelArticle> updateArticle(ModelArticle articleNo, ModelArticle boardcd, ModelArticle email,ModelArticle UseYN);
     List<ModelArticle> deleteArticle(ModelArticle articleNo, ModelArticle boardcd, ModelArticle email,ModelArticle UseYN);
     int increaseHit(int articleNo);
    

    
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
