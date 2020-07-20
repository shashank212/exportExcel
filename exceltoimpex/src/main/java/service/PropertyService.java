package service;

import java.io.IOException;

public interface PropertyService {
    String fetchStringProperty(String key) throws IOException;

    String fetchProperty(String key) throws IOException;
}
