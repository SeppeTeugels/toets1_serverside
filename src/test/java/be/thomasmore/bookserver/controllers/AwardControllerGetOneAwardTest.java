package be.thomasmore.bookserver.controllers;

import be.thomasmore.bookserver.AbstractIntegrationTest;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.jdbc.Sql;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.context.jdbc.Sql.ExecutionPhase.AFTER_TEST_METHOD;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@Sql("/sql/awards/create_2_awards.sql")
@Sql(scripts = "/sql/awards/clear_awards.sql", executionPhase = AFTER_TEST_METHOD)
public class AwardControllerGetOneAwardTest extends AbstractIntegrationTest {

    @Test
    public void getOneAuthors() throws Exception {
        mockMvc.perform(getMockRequestGetBooks("/api/awards/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.title").value("tesing title"))
                .andExpect(jsonPath("$.info").value("testinginfo"))
                .andExpect(jsonPath("$.country").value("Belgium"));
    }
}
