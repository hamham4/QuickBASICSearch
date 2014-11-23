package fastNFA;

<<<<<<< HEAD
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
	
	
	
	
	
=======
public class Result {
	private String url;
	private String searchTerm;
	private String resultCount;
>>>>>>> 02ef6b5696a5285e807241a37cbf6d1b89945aa9

}
