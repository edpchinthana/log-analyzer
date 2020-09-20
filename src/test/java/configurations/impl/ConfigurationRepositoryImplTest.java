package configurations.impl;

import models.ConfigurationModel;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

/**
 * Created by Padma Gnanapiya (SE/2017/014)
 */


public class ConfigurationRepositoryImplTest {
    ConfigurationRepositoryImpl configurationRepository=new ConfigurationRepositoryImpl();

    @Test
    public void should_return_ConfigurationModel() {
        ConfigurationModel configurationModel = configurationRepository.importConfiguration();
        assertThat(configurationModel,instanceOf(ConfigurationModel.class));
    }

    @Test
    public void check_exportConfiguration() {
        ConfigurationModel configurationModel=mock(ConfigurationModel.class);
        configurationRepository.exportConfiguration(configurationModel);
    }
}