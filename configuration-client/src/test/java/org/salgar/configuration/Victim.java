package org.salgar.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * Created by EH2SAF7 on 26.10.2016.
 */
@Configuration
public class Victim {
    @Value("${pk.dev.FinoUrl.01}")
    private String testProperty;

    public String getTestProperty() {
        return testProperty;
    }
}
