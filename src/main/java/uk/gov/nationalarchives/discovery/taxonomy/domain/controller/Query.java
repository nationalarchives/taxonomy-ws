package uk.gov.nationalarchives.discovery.taxonomy.domain.controller;

/**
 * Created by pdavis on 08/08/16.
 */
public class Query {

    private String categoryTitle;
    private String query;


    public Query() {
    }

    public Query(String categoryTitle, String query) {
        this.categoryTitle = categoryTitle;
        this.query = query;

    }

    public String getCategoryTitle() {
        return categoryTitle;
    }

    public String getQuery() {
        return query;
    }
}
