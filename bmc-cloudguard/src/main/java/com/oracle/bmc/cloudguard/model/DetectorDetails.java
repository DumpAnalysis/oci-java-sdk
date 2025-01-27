/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Details of a Detector Rule
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DetectorDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DetectorDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("riskLevel")
        private RiskLevel riskLevel;

        public Builder riskLevel(RiskLevel riskLevel) {
            this.riskLevel = riskLevel;
            this.__explicitlySet__.add("riskLevel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("configurations")
        private java.util.List<DetectorConfiguration> configurations;

        public Builder configurations(java.util.List<DetectorConfiguration> configurations) {
            this.configurations = configurations;
            this.__explicitlySet__.add("configurations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("condition")
        private Condition condition;

        public Builder condition(Condition condition) {
            this.condition = condition;
            this.__explicitlySet__.add("condition");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("labels")
        private java.util.List<String> labels;

        public Builder labels(java.util.List<String> labels) {
            this.labels = labels;
            this.__explicitlySet__.add("labels");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isConfigurationAllowed")
        private Boolean isConfigurationAllowed;

        public Builder isConfigurationAllowed(Boolean isConfigurationAllowed) {
            this.isConfigurationAllowed = isConfigurationAllowed;
            this.__explicitlySet__.add("isConfigurationAllowed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("problemThreshold")
        private Integer problemThreshold;

        public Builder problemThreshold(Integer problemThreshold) {
            this.problemThreshold = problemThreshold;
            this.__explicitlySet__.add("problemThreshold");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetTypes")
        private java.util.List<String> targetTypes;

        public Builder targetTypes(java.util.List<String> targetTypes) {
            this.targetTypes = targetTypes;
            this.__explicitlySet__.add("targetTypes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sightingTypes")
        private java.util.List<SightingType> sightingTypes;

        public Builder sightingTypes(java.util.List<SightingType> sightingTypes) {
            this.sightingTypes = sightingTypes;
            this.__explicitlySet__.add("sightingTypes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DetectorDetails build() {
            DetectorDetails __instance__ =
                    new DetectorDetails(
                            isEnabled,
                            riskLevel,
                            configurations,
                            condition,
                            labels,
                            isConfigurationAllowed,
                            problemThreshold,
                            targetTypes,
                            sightingTypes);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DetectorDetails o) {
            Builder copiedBuilder =
                    isEnabled(o.getIsEnabled())
                            .riskLevel(o.getRiskLevel())
                            .configurations(o.getConfigurations())
                            .condition(o.getCondition())
                            .labels(o.getLabels())
                            .isConfigurationAllowed(o.getIsConfigurationAllowed())
                            .problemThreshold(o.getProblemThreshold())
                            .targetTypes(o.getTargetTypes())
                            .sightingTypes(o.getSightingTypes());

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
     * Enables the control
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    Boolean isEnabled;

    /**
     * The Risk Level
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("riskLevel")
    RiskLevel riskLevel;

    /**
     * Configuration details
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("configurations")
    java.util.List<DetectorConfiguration> configurations;

    @com.fasterxml.jackson.annotation.JsonProperty("condition")
    Condition condition;

    /**
     * user defined labels for a detector rule
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("labels")
    java.util.List<String> labels;

    /**
     * configuration allowed or not
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isConfigurationAllowed")
    Boolean isConfigurationAllowed;

    /**
     * Cutover point for an elevated resource Risk Score to create a Problem
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("problemThreshold")
    Integer problemThreshold;

    /**
     * List of target types for which the detector rule is applicable
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetTypes")
    java.util.List<String> targetTypes;

    /**
     * List of sighting types
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sightingTypes")
    java.util.List<SightingType> sightingTypes;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
