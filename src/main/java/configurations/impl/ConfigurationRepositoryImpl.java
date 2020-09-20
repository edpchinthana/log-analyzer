package configurations.impl;

import configurations.ConfigurationRepository;
import models.ConfigurationModel;

public class ConfigurationRepositoryImpl implements ConfigurationRepository {
    final static String configurationFilePath = "configuration.json";

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