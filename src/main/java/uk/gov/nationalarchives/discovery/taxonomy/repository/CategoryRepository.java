package uk.gov.nationalarchives.discovery.taxonomy.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import uk.gov.nationalarchives.discovery.taxonomy.domain.repository.Category;

/**
 * Created by pdavis on 08/08/16.
 */
@Repository
public interface CategoryRepository extends MongoRepository<Category, String> {

    Category findByCiaid(String ciaid);

}
