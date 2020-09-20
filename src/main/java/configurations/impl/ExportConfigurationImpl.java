package configurations.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import models.ConfigurationModel;

/**
 * Created by Padma Gnanapiya (SE/2017/014)
 */


public class ExportConfigurationImpl implements ExportConfiguration {
    public ExportConfigurationImpl() {
    }

    public void perform(ConfigurationModel configuration, String configurationFilePath) {
        File configurationFile = new File(configurationFilePath);
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            String jsonStr = objectMapper.writeValueAsString(configuration);
            FileWriter fileWriter = new FileWriter(configurationFile, false);
            fileWriter.write(jsonStr);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}