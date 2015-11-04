package service.impl;

import service.ObjectService;

import javax.enterprise.context.ApplicationScoped;
import java.util.Arrays;
import java.util.List;

@ApplicationScoped
public class ObjectServiceImpl implements ObjectService {
    public List<String> get() {
        return Arrays.asList("Hello", "world!");
    }
}
