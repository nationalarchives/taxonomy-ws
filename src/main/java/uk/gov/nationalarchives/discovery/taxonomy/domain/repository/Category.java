package uk.gov.nationalarchives.discovery.taxonomy.domain.repository;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Created by pdavis on 08/08/16.
 */
@Document(collection = "categories")
public class Category {

    @Id
    private String _id;

    @Field("CIAID")
    private String ciaid;

    @Field("ttl")
    private String title;

    @Field("qry")
    private String query;

    @Field("SC")
    private String score;

    @Field("lock")
    private String lck;

    public Category() {
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getCiaid() {
        return ciaid;
    }

    public void setCiaid(String ciaid) {
        this.ciaid = ciaid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getLck() {
        return lck;
    }

    public void setLck(String lck) {
        this.lck = lck;
    }

    @Override
    public String toString() {
        return "Category{" +
                "_id='" + _id + '\'' +
                ", ciaid='" + ciaid + '\'' +
                ", title='" + title + '\'' +
                ", query='" + query + '\'' +
                ", score='" + score + '\'' +
                ", lck='" + lck + '\'' +
                '}';
    }
}
