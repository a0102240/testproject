package java24.board.infc;

import java.util.List;

import java24.board.model.ModelBoard;

public interface IDaoBoard extends IBoard  {

    List<ModelBoard> getBoardPaging();
}


