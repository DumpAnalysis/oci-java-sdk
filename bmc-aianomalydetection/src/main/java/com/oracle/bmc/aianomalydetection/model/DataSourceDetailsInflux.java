/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aianomalydetection.model;

/**
 * Data Source details for influx.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210101")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DataSourceDetailsInflux.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "dataSourceType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DataSourceDetailsInflux extends DataSourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("versionSpecificDetails")
        private InfluxDetails versionSpecificDetails;

        public Builder versionSpecificDetails(InfluxDetails versionSpecificDetails) {
            this.versionSpecificDetails = versionSpecificDetails;
            this.__explicitlySet__.add("versionSpecificDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("userName")
        private String userName;

        public Builder userName(String userName) {
            this.userName = userName;
            this.__explicitlySet__.add("userName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("passwordSecretId")
        private String passwordSecretId;

        public Builder passwordSecretId(String passwordSecretId) {
            this.passwordSecretId = passwordSecretId;
            this.__explicitlySet__.add("passwordSecretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("measurementName")
        private String measurementName;

        public Builder measurementName(String measurementName) {
            this.measurementName = measurementName;
            this.__explicitlySet__.add("measurementName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("url")
        private String url;

        public Builder url(String url) {
            this.url = url;
            this.__explicitlySet__.add("url");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DataSourceDetailsInflux build() {
            DataSourceDetailsInflux __instance__ =
                    new DataSourceDetailsInflux(
                            versionSpecificDetails,
                            userName,
                            passwordSecretId,
                            measurementName,
                            url);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataSourceDetailsInflux o) {
            Builder copiedBuilder =
                    versionSpecificDetails(o.getVersionSpecificDetails())
                            .userName(o.getUserName())
                            .passwordSecretId(o.getPasswordSecretId())
                            .measurementName(o.getMeasurementName())
                            .url(o.getUrl());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    @Deprecated
    public DataSourceDetailsInflux(
            InfluxDetails versionSpecificDetails,
            String userName,
            String passwordSecretId,
            String measurementName,
            String url) {
        super();
        this.versionSpecificDetails = versionSpecificDetails;
        this.userName = userName;
        this.passwordSecretId = passwordSecretId;
        this.measurementName = measurementName;
        this.url = url;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("versionSpecificDetails")
    InfluxDetails versionSpecificDetails;

    /**
     * Username for connection to Influx
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userName")
    String userName;

    /**
     * Password Secret Id for the influx connection
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("passwordSecretId")
    String passwordSecretId;

    /**
     * Measurement name for influx
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("measurementName")
    String measurementName;

    /**
     * public IP address and port to influx DB
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    String url;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
