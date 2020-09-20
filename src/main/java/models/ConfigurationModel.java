package models;

import utils.TimestampConvertor;
import utils.TimestampConvertorImpl;

import java.sql.Timestamp;
import java.text.ParseException;

public class ConfigurationModel {
    private DatabaseConfigurationModel databaseConfiguration;
    private EmailSenderConfigurationModel emailSenderConfiguration;
    private String lastTimestamp;

    public ConfigurationModel() {
    }

    public ConfigurationModel(DatabaseConfigurationModel databaseConfiguration, EmailSenderConfigurationModel emailSenderConfiguration, String lastTimestamp) {
        this.databaseConfiguration = databaseConfiguration;
        this.emailSenderConfiguration = emailSenderConfiguration;
        this.lastTimestamp = lastTimestamp;
    }

    public DatabaseConfigurationModel getDatabaseConfiguration() {
        return this.databaseConfiguration;
    }

    public void setDatabaseConfiguration(DatabaseConfigurationModel databaseConfiguration) {
        this.databaseConfiguration = databaseConfiguration;
    }

    public EmailSenderConfigurationModel getEmailSenderConfiguration() {
        return this.emailSenderConfiguration;
    }

    public void setEmailSenderConfiguration(EmailSenderConfigurationModel emailSenderConfiguration) {
        this.emailSenderConfiguration = emailSenderConfiguration;
    }

    public String getLastTimestampStr() {
        return this.lastTimestamp;
    }

    public Timestamp getLastTimestamp () throws ParseException {
        TimestampConvertor convertor = new TimestampConvertorImpl();
        return convertor.stringToTimestamp(lastTimestamp);
    }
    public void setLastTimestamp(String lastTimestamp) {
        this.lastTimestamp = lastTimestamp;
    }
}
