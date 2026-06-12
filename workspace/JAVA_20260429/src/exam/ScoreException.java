package exam;

//The serializable class ScoreException does not declare a static final serialVersionUID field of type long
public class ScoreException extends Exception {    	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4593847612884759439L;

	public ScoreException(String msg) {
        super(msg);
    }
}