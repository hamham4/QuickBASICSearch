package fastNFA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.transform.Result;

public class OrgSearcher {
	
	private int MAX_RESULTS = 15;
	
	private OrgSearcher() {
	}
	
	public List<Result> search(Org org) {
		List<Result> searchResults = new ArrayList<Result>();
		List<String> searchTerms = getSearchTermsList(org);
		
		Iterator<String> searchTermIterator = searchTerms.iterator();
		URL searchURL = getSearchURL(searchTermIterator.next());
		int resultCount = getResultCount(searchURL);
		
		 while (searchTermIterator.hasNext() && resultCount > MAX_RESULTS){
			searchURL = getSearchURL(searchTermIterator.next());
			resultCount = getResultCount(searchURL);
			Result result = newResult(blah blah);
			result.setblalbhalbha();
			searchResults.add(result);

		}
	
		return searchResults;
	}
	
	private int getResultCount(URL searchURL) throws IOException {

		URLConnection connection = searchURL.openConnection();
		BufferedReader input = new BufferedReader(new InputStreamReader (connection.getInputStream()));
		String HTMLLine;
		while ((HTMLLine = input.readLine()) != null) {
			System.out.println(HTMLLine);
			if (HTMLLine.contains("ctl00_cphMain_lblSearchCount")) {
				break;
			}
		
		}
		
		input.close();
		
		int resultCount = parseOutResultCount(HTMLLine);
		
		return resultCount;
	}
	
	private int parseOutResultCount(String HTMLLine) {
		int count = 0;
		//parse some stuff to get value
		//convert value from String to Int
		
		return count;
		
	}
	
	
	private List<String> getSearchTermsList(Org org) {
		List<String> searchTerms = new ArrayList<String>();
		
		searchTerms.add(org.getFirstNamePart());
		if (org.getSecondNamePart() != null) {
			searchTerms.add(org.getFirstNamePart() + " " + org.getSecondNamePart());
		}
		searchTerms.add(org.getName());
		return searchTerms;
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
