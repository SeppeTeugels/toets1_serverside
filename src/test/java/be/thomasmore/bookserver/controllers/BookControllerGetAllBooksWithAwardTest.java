package be.thomasmore.bookserver.controllers;

import be.thomasmore.bookserver.AbstractIntegrationTest;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.jdbc.Sql;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.context.jdbc.Sql.ExecutionPhase.AFTER_TEST_METHOD;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@Sql("/sql/books/create_2_books.sql")
@Sql(scripts = "/sql/books/clean_books.sql", executionPhase = AFTER_TEST_METHOD)
public class BookControllerGetAllBooksWithAwardTest extends AbstractIntegrationTest {

    @Test
    public void getAllBooks() throws Exception {
        mockMvc.perform(getMockRequestGetBooks("/api/books"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(2)))
                .andExpect(jsonPath("$[0].id").value(1))
                .andExpect(jsonPath("$[0].title").value("Test Automation"))
                .andExpect(jsonPath("$[0].authors").exists())
                .andExpect(jsonPath("$[0].authors").isEmpty())
                .andExpect(jsonPath("$[1].awards").exists())
                .andExpect(jsonPath("$[1].awards").isEmpty())
                .andExpect(jsonPath("$[1].id").value(2))
                .andExpect(jsonPath("$[1].title").value("REST API Automation Testing from Scratch"))
                .andExpect(jsonPath("$[1].authors").exists())
                .andExpect(jsonPath("$[1].authors").isEmpty())
                .andExpect(jsonPath("$[1].awards").exists())
                .andExpect(jsonPath("$[1].awards").isEmpty());
    }

}
