package fastNFA;

import java.net.URL;

public class Result {
	private int numResults;
	private URL searchURL;
	private String searchTerm;
	
	public Result(String searchTerm, URL searchURL) {
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
	
}