package fastNFA;

import java.net.URL;
import java.util.Iterator;
import java.util.List;

public class Searcher {
	
	private int MAX_RESULTS = 15;
	
	private Searcher() {	
	}
	
	public static void search(Searchable searchObject) {
		List<SearchDetail> primarySearchDetails = searchObject.getSearchDetails();
		
		//Iterate through primary search details
		Iterator<SearchDetail> primarySearchIterator = primarySearchDetails.iterator();
		while (primarySearchIterator.hasNext()) {
			SearchDetail currentMandatorySearchDetails = primarySearchIterator.next();
			searchVariations(currentMandatorySearchDetails);
			
			
		}
		
		//Run search if mandatory = true
		//Stop search if results < 15\
		//Execute search URL
		//Update search boolean
		
		//Parse the number of search results
		//update search result count in searchURL
		
	}
	
	private static void searchVariations(SearchDetail searchDetailVaration) {
		
		
	}
	private static int getResultCount(URL searchURL) {
		
		
	}
	
	

}
