package board.model.vo;

import java.sql.Date;

//vo(value object) == dto(data transfer object) == do(domain object) == bean
//데이터베이스 테이블이 가진 컬럼의 값 저장용 클래스
public class Board implements java.io.Serializable {
	private static final long serialVersionUID = 111L;
	
	private int boardNum;
	private String boardWriter;
	private String boardTitle;
	private String boardContent;
	private String boardOriginalFileName;
	private String boardRenameFileName;
	private int boardReplyRef;
	private int boardReplyLev;
	private int boardReplySeq;
	private int boardReadCount;
	private java.sql.Date boardDate;
	
	public Board() {}

	public Board(int boardNum, String boardWriter, String boardTitle, String boardContent, String boardOriginalFileName,
			String boardRenameFileName, int boardReplyRef, int boardReplyLev, int boardReplySeq, int boardReadCount,
			Date boardDate) {
		super();
		this.boardNum = boardNum;
		this.boardWriter = boardWriter;
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		this.boardOriginalFileName = boardOriginalFileName;
		this.boardRenameFileName = boardRenameFileName;
		this.boardReplyRef = boardReplyRef;
		this.boardReplyLev = boardReplyLev;
		this.boardReplySeq = boardReplySeq;
		this.boardReadCount = boardReadCount;
		this.boardDate = boardDate;
	}

	public int getBoardNum() {
		return boardNum;
	}

	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}

	public String getBoardWriter() {
		return boardWriter;
	}

	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	public String getBoardOriginalFileName() {
		return boardOriginalFileName;
	}

	public void setBoardOriginalFileName(String boardOriginalFileName) {
		this.boardOriginalFileName = boardOriginalFileName;
	}

	public String getBoardRenameFileName() {
		return boardRenameFileName;
	}

	public void setBoardRenameFileName(String boardRenameFileName) {
		this.boardRenameFileName = boardRenameFileName;
	}

	public int getBoardReplyRef() {
		return boardReplyRef;
	}

	public void setBoardReplyRef(int boardReplyRef) {
		this.boardReplyRef = boardReplyRef;
	}

	public int getBoardReplyLev() {
		return boardReplyLev;
	}

	public void setBoardReplyLev(int boardReplyLev) {
		this.boardReplyLev = boardReplyLev;
	}

	public int getBoardReplySeq() {
		return boardReplySeq;
	}

	public void setBoardReplySeq(int boardReplySeq) {
		this.boardReplySeq = boardReplySeq;
	}

	public int getBoardReadCount() {
		return boardReadCount;
	}

	public void setBoardReadCount(int boardReadCount) {
		this.boardReadCount = boardReadCount;
	}

	public java.sql.Date getBoardDate() {
		return boardDate;
	}

	public void setBoardDate(java.sql.Date boardDate) {
		this.boardDate = boardDate;
	}

	@Override
	public String toString() {
		return "Board [boardNum=" + boardNum + ", boardWriter=" + boardWriter + ", boardTitle=" + boardTitle
				+ ", boardContent=" + boardContent + ", boardOriginalFileName=" + boardOriginalFileName
				+ ", boardRenameFileName=" + boardRenameFileName + ", boardReplyRef=" + boardReplyRef
				+ ", boardReplyLev=" + boardReplyLev + ", boardReplySeq=" + boardReplySeq + ", boardReadCount="
				+ boardReadCount + ", boardDate=" + boardDate + "]";
	}	
	
}
