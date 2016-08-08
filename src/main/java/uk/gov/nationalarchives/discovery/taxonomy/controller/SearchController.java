package uk.gov.nationalarchives.discovery.taxonomy.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import uk.gov.nationalarchives.discovery.taxonomy.domain.controller.Query;
import uk.gov.nationalarchives.discovery.taxonomy.domain.controller.SearchResults;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pdavis on 08/08/16.
 */

@RestController
public class SearchController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public SearchResults search(@RequestBody Query query) {
        logger.info("query: {}, for category: {}", query.getQuery(), query.getCategoryTitle());

        SearchResults searchResults = new SearchResults();
        List<String> documentIds = new ArrayList<>();
        documentIds.add("A123");
        documentIds.add("A124");
        searchResults.setDocumentIds(documentIds);
        return searchResults;


    }
}
