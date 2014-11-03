package fastNFA;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class OrgSearcher {
	
	private OrgSearcher() {
	}
	
	public List<Result> search(Org org) {
		List<Result> searchResults = new ArrayList<Result>();
		
		return searchResults;
	}
	
	private URL getSearchURL(String searchTerm) {
		String baseURL = "https://www.nfa.futures.org/basicnet/SearchResults.aspx?type=firm&firm=";
		String termCombiner = "+";
		
		String formattedSearchTerm = searchTerm.replaceAll(" ", termCombiner);
		
		URL searchURL = null;
		try {
			searchURL = new URL(baseURL + formattedSearchTerm);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return searchURL;
	}
	

}
