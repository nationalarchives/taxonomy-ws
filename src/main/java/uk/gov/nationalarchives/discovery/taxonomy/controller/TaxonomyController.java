package uk.gov.nationalarchives.discovery.taxonomy.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uk.gov.nationalarchives.discovery.taxonomy.domain.controller.Query;
import uk.gov.nationalarchives.discovery.taxonomy.domain.controller.SearchResults;
import uk.gov.nationalarchives.discovery.taxonomy.service.TaxonomyService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pdavis on 08/08/16.
 */

@RestController
public class TaxonomyController {

    private final TaxonomyService taxonomyService;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    public TaxonomyController(TaxonomyService taxonomyService) {
        this.taxonomyService = taxonomyService;
    }

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

    @RequestMapping(value = "/publishCategory", method = RequestMethod.GET)
    public void publishOneCategory(@RequestParam String categoryId) {
        logger.info("publishing category: {}", categoryId);
        taxonomyService.publishOneCategory(categoryId);
    }
}

