/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * Specific info about a Hadoop cluster
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ClusterDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ClusterDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("bdaVersion")
        private String bdaVersion;

        public Builder bdaVersion(String bdaVersion) {
            this.bdaVersion = bdaVersion;
            this.__explicitlySet__.add("bdaVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bdmVersion")
        private String bdmVersion;

        public Builder bdmVersion(String bdmVersion) {
            this.bdmVersion = bdmVersion;
            this.__explicitlySet__.add("bdmVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bdsVersion")
        private String bdsVersion;

        public Builder bdsVersion(String bdsVersion) {
            this.bdsVersion = bdsVersion;
            this.__explicitlySet__.add("bdsVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("osVersion")
        private String osVersion;

        public Builder osVersion(String osVersion) {
            this.osVersion = osVersion;
            this.__explicitlySet__.add("osVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
        private String dbVersion;

        public Builder dbVersion(String dbVersion) {
            this.dbVersion = dbVersion;
            this.__explicitlySet__.add("dbVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bdCellVersion")
        private String bdCellVersion;

        public Builder bdCellVersion(String bdCellVersion) {
            this.bdCellVersion = bdCellVersion;
            this.__explicitlySet__.add("bdCellVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("csqlCellVersion")
        private String csqlCellVersion;

        public Builder csqlCellVersion(String csqlCellVersion) {
            this.csqlCellVersion = csqlCellVersion;
            this.__explicitlySet__.add("csqlCellVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeRefreshed")
        private java.util.Date timeRefreshed;

        public Builder timeRefreshed(java.util.Date timeRefreshed) {
            this.timeRefreshed = timeRefreshed;
            this.__explicitlySet__.add("timeRefreshed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("clouderaManagerUrl")
        private String clouderaManagerUrl;

        public Builder clouderaManagerUrl(String clouderaManagerUrl) {
            this.clouderaManagerUrl = clouderaManagerUrl;
            this.__explicitlySet__.add("clouderaManagerUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ambariUrl")
        private String ambariUrl;

        public Builder ambariUrl(String ambariUrl) {
            this.ambariUrl = ambariUrl;
            this.__explicitlySet__.add("ambariUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bigDataManagerUrl")
        private String bigDataManagerUrl;

        public Builder bigDataManagerUrl(String bigDataManagerUrl) {
            this.bigDataManagerUrl = bigDataManagerUrl;
            this.__explicitlySet__.add("bigDataManagerUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hueServerUrl")
        private String hueServerUrl;

        public Builder hueServerUrl(String hueServerUrl) {
            this.hueServerUrl = hueServerUrl;
            this.__explicitlySet__.add("hueServerUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("odhVersion")
        private String odhVersion;

        public Builder odhVersion(String odhVersion) {
            this.odhVersion = odhVersion;
            this.__explicitlySet__.add("odhVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("jupyterHubUrl")
        private String jupyterHubUrl;

        public Builder jupyterHubUrl(String jupyterHubUrl) {
            this.jupyterHubUrl = jupyterHubUrl;
            this.__explicitlySet__.add("jupyterHubUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ClusterDetails build() {
            ClusterDetails __instance__ =
                    new ClusterDetails(
                            bdaVersion,
                            bdmVersion,
                            bdsVersion,
                            osVersion,
                            dbVersion,
                            bdCellVersion,
                            csqlCellVersion,
                            timeCreated,
                            timeRefreshed,
                            clouderaManagerUrl,
                            ambariUrl,
                            bigDataManagerUrl,
                            hueServerUrl,
                            odhVersion,
                            jupyterHubUrl);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ClusterDetails o) {
            Builder copiedBuilder =
                    bdaVersion(o.getBdaVersion())
                            .bdmVersion(o.getBdmVersion())
                            .bdsVersion(o.getBdsVersion())
                            .osVersion(o.getOsVersion())
                            .dbVersion(o.getDbVersion())
                            .bdCellVersion(o.getBdCellVersion())
                            .csqlCellVersion(o.getCsqlCellVersion())
                            .timeCreated(o.getTimeCreated())
                            .timeRefreshed(o.getTimeRefreshed())
                            .clouderaManagerUrl(o.getClouderaManagerUrl())
                            .ambariUrl(o.getAmbariUrl())
                            .bigDataManagerUrl(o.getBigDataManagerUrl())
                            .hueServerUrl(o.getHueServerUrl())
                            .odhVersion(o.getOdhVersion())
                            .jupyterHubUrl(o.getJupyterHubUrl());

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

    /**
     * BDA version installed in the cluster
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bdaVersion")
    String bdaVersion;

    /**
     * Big Data Manager version installed in the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bdmVersion")
    String bdmVersion;

    /**
     * Big Data Service version installed in the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bdsVersion")
    String bdsVersion;

    /**
     * Oracle Linux version installed in the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("osVersion")
    String osVersion;

    /**
     * Cloud SQL query server database version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
    String dbVersion;

    /**
     * Cloud SQL cell version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bdCellVersion")
    String bdCellVersion;

    /**
     * Big Data SQL version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("csqlCellVersion")
    String csqlCellVersion;

    /**
     * The time the cluster was created, shown as an RFC 3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The time the cluster was automatically or manually refreshed, shown as an RFC 3339 formatted datetime string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeRefreshed")
    java.util.Date timeRefreshed;

    /**
     * The URL of Cloudera Manager
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clouderaManagerUrl")
    String clouderaManagerUrl;

    /**
     * The URL of Ambari
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ambariUrl")
    String ambariUrl;

    /**
     * The URL of Big Data Manager.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bigDataManagerUrl")
    String bigDataManagerUrl;

    /**
     * The URL of the Hue server.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hueServerUrl")
    String hueServerUrl;

    /**
     * Version of the ODH (Oracle Distribution including Apache Hadoop) installed on the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("odhVersion")
    String odhVersion;

    /**
     * The URL of the Jupyterhub.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jupyterHubUrl")
    String jupyterHubUrl;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
