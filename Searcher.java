package fastNFA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;

public class Searcher {
	
	private static int MAX_RESULTS = 15;
	
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
	
	private static void searchVariations(SearchDetail mandatorySearchDetail) {
		List<SearchDetail> variations = mandatorySearchDetail.getSearchVariations();
		Iterator<SearchDetail> variationIterator = variations.iterator();
		
		int resultCount = 15;
		while (variationIterator.hasNext() && resultCount >= MAX_RESULTS) {
			
			SearchDetail currentVariation = variationIterator.next();
			resultCount = getResultCount(currentVariation.getSearchURL());
			currentVariation.setNumResults(resultCount);
			currentVariation.setSearched(true);
		}
		
		
	}
	private static int getResultCount(URL searchURL) throws IOException {
		URLConnection searchConnection = searchURL.openConnection();
		BufferedReader input = new BufferedReader(new InputStreamReader (searchConnection.getInputStream()));
		int resultCount = parseSearchResults(input);
		input.close();
		return resultCount;
		
	}
	
	private static int parseSearchResults(BufferedReader input) throws IOException {
		String inputLine;
		while ((inputLine = input.readLine()) != null) {
			System.out.println(inputLine);
			if (inputLine.contains("ctl00_cphMain_lblSearchCount")) {
				break;
			}
		
		}
		
		int startOfResult = 0;
		StringBuilder stringBuilder = new StringBuilder();
		for(int i = 0; i < inputLine.length(); i++) {
			if (inputLine.charAt(i) == '<') {
				startOfResult = i;
				break;
			}
		}
		
		for(int i = startOfResult; i < inputLine.length(); i++){
			if (inputLine.charAt(i) == ' ') {
				break;
			}
			stringBuilder.append(inputLine.charAt(i));
		}
		
		String resultCount = stringBuilder.toString();
		
		return Integer.parseInt(resultCount);
		
	}

	
	

}
