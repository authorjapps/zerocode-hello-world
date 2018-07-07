package org.jsmart.zerocode.javaexec.utils;

import com.google.inject.Inject;
import com.google.inject.name.Named;

import java.util.HashMap;
import java.util.Map;

import static org.slf4j.LoggerFactory.getLogger;

public class PropertyUtils {
    private static final org.slf4j.Logger LOGGER = getLogger(PropertyUtils.class);
    public static final String PROPERTY_HOST = "restful.application.endpoint.host";
    public static final String PROPERTY_PORT = "restful.application.endpoint.port";
    public static final String VALUE_KEY = "value";

    @Inject(optional = true)
    @Named(PROPERTY_HOST)
    private String restfulHost;

    @Inject(optional = true)
    @Named(PROPERTY_PORT)
    private Integer restfulPort;

    // -----------------------------------------------------------
    // You can @Inject any property here via
    // @Named("property key name from config file") as shown above
    // -----------------------------------------------------------

    public Map<String, Object> getProperty(String propertyKey){

        switch (propertyKey) {
            case PROPERTY_HOST:
                LOGGER.info("key:{}, value:{} ", PROPERTY_HOST, restfulHost);
                return outputAs(restfulHost);

            case PROPERTY_PORT:
                LOGGER.info("key:{}, value:{} ", PROPERTY_HOST, restfulHost);
                return outputAs(restfulPort);

            default:
                return null;
        }
    }

    private <T> Map<String, T> outputAs(T value) {
        Map<String, T> valueMap = new HashMap<>();
        valueMap.put(VALUE_KEY, value);
        return valueMap;
    }

}
