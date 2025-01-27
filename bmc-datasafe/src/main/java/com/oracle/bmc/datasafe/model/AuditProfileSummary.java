/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Summary of an audit profile.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AuditProfileSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class AuditProfileSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private AuditProfileLifecycleState lifecycleState;

        public Builder lifecycleState(AuditProfileLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isPaidUsageEnabled")
        private Boolean isPaidUsageEnabled;

        public Builder isPaidUsageEnabled(Boolean isPaidUsageEnabled) {
            this.isPaidUsageEnabled = isPaidUsageEnabled;
            this.__explicitlySet__.add("isPaidUsageEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("onlineMonths")
        private Integer onlineMonths;

        public Builder onlineMonths(Integer onlineMonths) {
            this.onlineMonths = onlineMonths;
            this.__explicitlySet__.add("onlineMonths");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("offlineMonths")
        private Integer offlineMonths;

        public Builder offlineMonths(Integer offlineMonths) {
            this.offlineMonths = offlineMonths;
            this.__explicitlySet__.add("offlineMonths");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("auditCollectedVolume")
        private Long auditCollectedVolume;

        public Builder auditCollectedVolume(Long auditCollectedVolume) {
            this.auditCollectedVolume = auditCollectedVolume;
            this.__explicitlySet__.add("auditCollectedVolume");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isOverrideGlobalRetentionSetting")
        private Boolean isOverrideGlobalRetentionSetting;

        public Builder isOverrideGlobalRetentionSetting(Boolean isOverrideGlobalRetentionSetting) {
            this.isOverrideGlobalRetentionSetting = isOverrideGlobalRetentionSetting;
            this.__explicitlySet__.add("isOverrideGlobalRetentionSetting");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AuditProfileSummary build() {
            AuditProfileSummary __instance__ =
                    new AuditProfileSummary(
                            id,
                            compartmentId,
                            displayName,
                            timeCreated,
                            timeUpdated,
                            targetId,
                            lifecycleState,
                            description,
                            lifecycleDetails,
                            isPaidUsageEnabled,
                            onlineMonths,
                            offlineMonths,
                            auditCollectedVolume,
                            isOverrideGlobalRetentionSetting,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AuditProfileSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .displayName(o.getDisplayName())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .targetId(o.getTargetId())
                            .lifecycleState(o.getLifecycleState())
                            .description(o.getDescription())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .isPaidUsageEnabled(o.getIsPaidUsageEnabled())
                            .onlineMonths(o.getOnlineMonths())
                            .offlineMonths(o.getOfflineMonths())
                            .auditCollectedVolume(o.getAuditCollectedVolume())
                            .isOverrideGlobalRetentionSetting(
                                    o.getIsOverrideGlobalRetentionSetting())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

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
     * The OCID of the audit profile.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The OCID of the compartment that contains the audit profile.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The display name of the audit profile.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The date and time the audit profile was created, in the format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The date and time the audit profile was updated, in the format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * The OCID of the Data Safe target for which the audit profile is created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    String targetId;

    /**
     * The current state of the audit profile.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    AuditProfileLifecycleState lifecycleState;

    /**
     * The description of audit profile.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * Details about the current state of the audit profile in Data Safe.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    String lifecycleDetails;

    /**
     * Indicates if you want to continue collecting audit records beyond the free limit of one million audit records per month per target database,
     * potentially incurring additional charges. The default value is inherited from the global settings.
     * You can change at the global level or at the target level.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPaidUsageEnabled")
    Boolean isPaidUsageEnabled;

    /**
     * Indicates the number of months the audit records will be stored online in Oracle Data Safe audit repository for immediate reporting and analysis.
     * Minimum: 1; Maximum:12 months
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("onlineMonths")
    Integer onlineMonths;

    /**
     * Indicates the number of months the audit records will be stored offline in the Data Safe audit archive.
     * Minimum: 0; Maximum: 72 months.
     * If you have a requirement to store the audit data even longer in archive, please contact the Oracle Support.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("offlineMonths")
    Integer offlineMonths;

    /**
     * Indicates count of audit records collected by Data Safe from the target which is eligible
     * for the current month's billing cycle. Audit records for actions performed by Data Safe service
     * account on the target is excluded.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("auditCollectedVolume")
    Long auditCollectedVolume;

    /**
     * Indicates whether audit retention settings like online and offline months is set at the
     * target level overriding the global audit retention settings.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isOverrideGlobalRetentionSetting")
    Boolean isOverrideGlobalRetentionSetting;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
