package com.luxoft.falcon.configuration;

import lombok.Getter;


public class MainConfig {
    @Getter
    private static final String CONFIG_FILE_NAME = "spiderconnector.xml";
    @Getter
    private static final String SOURCE_NAME_SPIDER = "spider";
    @Getter
    private static final String SOURCE_NAME_LOCALHOST = "localhost";

}
