package configurations;

import models.ConfigurationModel;

public interface ConfigurationRepository {
    ConfigurationModel importConfiguration();
    void exportConfiguration(ConfigurationModel configurationModel);
}