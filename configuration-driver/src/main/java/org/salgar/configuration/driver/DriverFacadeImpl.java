package org.salgar.configuration.driver;

import org.salgar.configuration.api.ConfigurationFacade;
import org.salgar.configuration.scope.annotataion.RefreshScope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import javax.inject.Named;

@Configuration
//@DependsOn("configServerPropertySourceConfig")
@RefreshScope
public class DriverFacadeImpl implements DriverFacade {
    @Autowired
    @Named("proxyConfigurationFacade")
    ConfigurationFacade configurationFacade;

    @Value("${fil.dev.FinoUrl.02}")
    private String oneOtherProperty;

    public String driver() {
        String parameter = configurationFacade.getProperty("fil", "dev", "01", "FinoUrl");

        return parameter;
    }

    public String driver1() {
        return this.oneOtherProperty;
    }
}
