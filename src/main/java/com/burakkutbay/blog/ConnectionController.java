package com.burakkutbay.blog;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by User on 12.07.2020.
 */
@RestController
public class ConnectionController {

    private final JdbcTemplate jdbcTemplate;


    public ConnectionController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping("/")
    public String connect(){
      String currentTimestamp=jdbcTemplate.queryForObject("SELECT CURRENT_TIMESTAMP()", String.class);
      return "Database Connection Succesfuly Current Timestamp: "+ currentTimestamp;
    }
}
