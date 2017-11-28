package com.example;

import org.hibernate.validator.constraints.NotEmpty;

public class Configuration extends io.dropwizard.Configuration {

    @NotEmpty
    private String template;

    @NotEmpty
    private String defaultName = "Stranger";

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String value) {
        this.template = value;
    }

    public String getDefaultName() {
        return defaultName;
    }

    public void setDefaultName(String value) {
        this.defaultName = value;
    }
}
