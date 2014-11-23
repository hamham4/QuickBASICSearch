package fastNFA;

import java.net.URL;
import java.util.List;

public interface Searchable {

	void createSearchDetails();
	
	List<SearchDetail> getSearchDetails();

	//Used by the createSearchDetails function to create the searchURLs
	URL createSearchURL(String searchTerm);
	
	
}
