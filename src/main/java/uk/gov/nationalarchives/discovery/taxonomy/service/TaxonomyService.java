package uk.gov.nationalarchives.discovery.taxonomy.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.gov.nationalarchives.discovery.taxonomy.domain.repository.Category;
import uk.gov.nationalarchives.discovery.taxonomy.repository.CategoryRepository;

/**
 * Created by pdavis on 08/08/16.
 */
@Service
public class TaxonomyService {

    private final CategoryRepository categoryRepository;

    @Autowired
    public TaxonomyService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public void publishOneCategory(String categoryId) {
        //retrieve the category from the repository
        Category category = categoryRepository.findByCiaid(categoryId);

        //if doesnt exist, return error message
        if (category == null) {

            logger.error("category not found: {}", categoryId);
            return;
        }

        logger.info("category found: {}", category.getTitle());

        //send publication request to ActiveMQ

    }
}
