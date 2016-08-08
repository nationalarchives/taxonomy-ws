package uk.gov.nationalarchives.discovery.taxonomy.service;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import uk.gov.nationalarchives.discovery.taxonomy.repository.CategoryRepository;

import static org.mockito.Mockito.verify;

/**
 * Created by pdavis on 08/08/16.
 */

@RunWith(SpringJUnit4ClassRunner.class)
public class TaxonomyServiceTest {

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Mock
    private CategoryRepository categoryRepository;

    @Test
    public void testPublishOneCategory() {
        //given my service set up and one existing category
        TaxonomyService taxonomyService = new TaxonomyService(categoryRepository);
        String categoryId = "C10004";

        // when I publish one category
        taxonomyService.publishOneCategory(categoryId);

        // then I made a call in the database to retrieve that category
        verify(categoryRepository).findByCiaid(Matchers.eq(categoryId));

        // and I published that category to Active MQ

    }

    @Test
    public void testPublishOneInvalidCategory() {
        //given my service set up

        // when I publish one category which does not exist

        // then I made a call in the database to retrieve that category

        // and an exception was thrown.
    }

}
