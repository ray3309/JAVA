package exam;

import java.util.ArrayList;

public class BoardService {

	private ArrayList<BoardVO> blist;

	public BoardService() {
	   blist = new ArrayList<BoardVO>();
	}
	public void addBoard(BoardVO v) {
		blist.add(v);
	}
	public ArrayList<BoardVO> getList(){
		return blist;
	}
	public int getTotal() {
		return blist.size();
	}
	
}
