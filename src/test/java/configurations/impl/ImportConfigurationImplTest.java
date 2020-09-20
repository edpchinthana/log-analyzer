package configurations.impl;

import models.ConfigurationModel;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;

/**
 * Created by Padma Gnanapiya (SE/2017/014)
 */


public class ImportConfigurationImplTest {
    @Before
    public void setUp() throws Exception {
        File filename = new File("src/main/java/configurations/impl/configurationFile.txt");
        filename.createNewFile();
    }

    @After
    public void tearDown() throws Exception {
        File file = new File("src/main/java/configurations/impl/configurationFile.txt");
        file.delete();
    }

    @Test
    public void should_return_configuration_model() {
        ImportConfigurationImpl importConfiguration=new ImportConfigurationImpl();

        ConfigurationModel configurationModel=importConfiguration.perform("src/main/java/configurations/impl/configurationFile.txt");
        ConfigurationModel configurationModel2= mock(ConfigurationModel.class);
        assertNotEquals(configurationModel, configurationModel2);
    }
}