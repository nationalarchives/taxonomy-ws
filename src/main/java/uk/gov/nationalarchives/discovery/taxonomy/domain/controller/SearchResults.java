package uk.gov.nationalarchives.discovery.taxonomy.domain.controller;

import java.util.List;

/**
 * Created by pdavis on 08/08/16.
 */
public class SearchResults {

    private List<String> documentIds;

    public SearchResults() {
    }

    public SearchResults(List<String> documentIds) {
        this.documentIds = documentIds;
    }

    public List<String> getDocumentIds() {
        return documentIds;
    }

    public void setDocumentIds(List<String> documentIds) {
        this.documentIds = documentIds;
    }
}

