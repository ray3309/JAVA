package exam;

public class NsmcVO {
	private String id;
	private String document;
	private int label;
	
	public NsmcVO(String id, String document, int label) {
		this.id = id;
		this.document = document;
		this.label = label;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public int getLabel() {
		return label;
	}

	public void setLabel(int label) {
		this.label = label;
	}	
}
