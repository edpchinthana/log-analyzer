package models;

public class EmailSenderConfigurationModel {
    private String host;
    private String port;
    private String sender;
    private String password;

    public EmailSenderConfigurationModel() {
    }

    public EmailSenderConfigurationModel(String host, String port, String sender, String password) {
        this.host = host;
        this.port = port;
        this.sender = sender;
        this.password = password;
    }

    public String getHost() {
        return this.host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return this.port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getSender() {
        return this.sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}