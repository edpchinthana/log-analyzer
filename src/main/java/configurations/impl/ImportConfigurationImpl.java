package configurations.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.FileReader;
import models.ConfigurationModel;
import org.json.simple.parser.JSONParser;

/**
 * Created by Padma Gnanapiya (SE/2017/014)
 */


public class ImportConfigurationImpl implements ImportConfiguration {

    @Override
    public ConfigurationModel perform(String configurationFilePath) {
        new JSONParser();
        ConfigurationModel configuration = new ConfigurationModel();

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            configuration = objectMapper.readValue(new FileReader(configurationFilePath), ConfigurationModel.class);
        } catch (Exception var5) {
            System.out.println(var5);
        }

        return configuration;
    }
}
