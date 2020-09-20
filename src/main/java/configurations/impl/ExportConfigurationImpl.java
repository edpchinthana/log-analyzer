package configurations.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import models.ConfigurationModel;


public class ExportConfigurationImpl implements ExportConfiguration {

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