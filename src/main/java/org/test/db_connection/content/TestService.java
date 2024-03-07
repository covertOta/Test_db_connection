package org.test.db_connection.content;

import org.springframework.stereotype.Service;
import org.test.db_connection.mapper.TestMapper;

@Service
public class TestService {
    private final TestMapper mapper;

    public TestService(TestMapper mapper) {
        this.mapper = mapper;
    }

    public int allCar() {
        return mapper.allCar();
    }
}
