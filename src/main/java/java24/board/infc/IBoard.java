package java24.board.infc;

import java.util.HashMap;
import java.util.List;

import java24.board.model.ModelArticle;
import java24.board.model.ModelAttachFile;
import java24.board.model.ModelBoard;
import java24.board.model.ModelComments;

public interface IBoard {
    
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
