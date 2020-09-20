package configurations.impl;

import models.ConfigurationModel;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

/**
 * Created by Padma Gnanapiya (SE/2017/014)
 */


public class ExportConfigurationImplTest {
    ExportConfigurationImpl exportConfiguration=new ExportConfigurationImpl();

    @Before
    public void setUp() throws Exception {
        File filename = new File("src/main/java/configurations/impl/testTestFile.txt");
        filename.createNewFile();
    }

    @After
    public void tearDown() throws Exception {
        File file = new File("src/main/java/configurations/impl/testTestFile.txt");
        file.delete();
    }

    @Test
    public void ExportConfigurationImpl_perform() {
        ConfigurationModel configurationModel=mock(ConfigurationModel.class);
        exportConfiguration.perform(configurationModel, "src/main/java/configurations/impl/testTestFile.txt");
    }
}