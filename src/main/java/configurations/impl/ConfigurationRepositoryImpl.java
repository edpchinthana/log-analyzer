package configurations.impl;

import configurations.ConfigurationRepository;
import models.ConfigurationModel;

/**
 * Created by Padma Gnanapiya (SE/2017/014)
 */


public class ConfigurationRepositoryImpl implements ConfigurationRepository {
    final String configurationFilePath = "configuration.json";

    public ConfigurationRepositoryImpl() {
    }

    @Override
    public ConfigurationModel importConfiguration() {
        ImportConfiguration importConfiguration = new ImportConfigurationImpl();
        return importConfiguration.perform(configurationFilePath);
    }

    @Override
    public void exportConfiguration(ConfigurationModel configuration) {
        ExportConfiguration exportConfiguration = new ExportConfigurationImpl();
        exportConfiguration.perform(configuration, configurationFilePath);
    }
}