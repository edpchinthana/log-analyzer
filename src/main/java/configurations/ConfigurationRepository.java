package configurations;

import models.ConfigurationModel;

/**
 * Created by Padma Gnanapiya (SE/2017/014)
 */


public interface ConfigurationRepository {
    ConfigurationModel importConfiguration();
    void exportConfiguration(ConfigurationModel configurationModel);
}