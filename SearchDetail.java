package fastNFA;

import java.net.URL;

public class SearchDetail {
	private int numResults;
	private URL searchURL;
	private String searchTerm;
	private boolean searched = false;
	private boolean mandatory = true;
	
	public SearchDetail(String searchTerm, URL searchURL) {
		this.searchTerm = searchTerm;
		this.searchURL = searchURL;
	}

	public int getNumResults() {
		return numResults;
	}

	public void setNumResults(int numResults) {
		this.numResults = numResults;
	}

	public URL getSearchURL() {
		return searchURL;
	}

	public String getSearchTerm() {
		return searchTerm;
	}

	public boolean wasSearched() {
		return searched;
	}

	public void setSearched(boolean searched) {
		this.searched = searched;
	}

	public boolean isMandatory() {
		return mandatory;
	}

	public void setMandatory(boolean mandatory) {
		this.mandatory = mandatory;
	}
	
}