package com.bib.neptune.rate;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.junit.jupiter.api.extension.ExtendWith;
//import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@ExtendWith(SpringExtension.class)

//@RunWith(SpringJUnit4ClassRunner.class)
public class BaseTest {
    protected static final ObjectMapper MAPPER = new ObjectMapper();

    @SneakyThrows
    protected static String toJson(Object obj) {
        return MAPPER.writeValueAsString(obj);
    }

}
