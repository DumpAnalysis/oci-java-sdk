/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.blockchain.model;

/**
 * Blockchain Platform Instance Description.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191010")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = BlockchainPlatform.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class BlockchainPlatform {
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

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isByol")
        private Boolean isByol;

        public Builder isByol(Boolean isByol) {
            this.isByol = isByol;
            this.__explicitlySet__.add("isByol");
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

        @com.fasterxml.jackson.annotation.JsonProperty("serviceVersion")
        private String serviceVersion;

        public Builder serviceVersion(String serviceVersion) {
            this.serviceVersion = serviceVersion;
            this.__explicitlySet__.add("serviceVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("platformRole")
        private PlatformRole platformRole;

        public Builder platformRole(PlatformRole platformRole) {
            this.platformRole = platformRole;
            this.__explicitlySet__.add("platformRole");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("computeShape")
        private ComputeShape computeShape;

        public Builder computeShape(ComputeShape computeShape) {
            this.computeShape = computeShape;
            this.__explicitlySet__.add("computeShape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("serviceEndpoint")
        private String serviceEndpoint;

        public Builder serviceEndpoint(String serviceEndpoint) {
            this.serviceEndpoint = serviceEndpoint;
            this.__explicitlySet__.add("serviceEndpoint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("storageSizeInTBs")
        private Double storageSizeInTBs;

        public Builder storageSizeInTBs(Double storageSizeInTBs) {
            this.storageSizeInTBs = storageSizeInTBs;
            this.__explicitlySet__.add("storageSizeInTBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("storageUsedInTBs")
        private Double storageUsedInTBs;

        public Builder storageUsedInTBs(Double storageUsedInTBs) {
            this.storageUsedInTBs = storageUsedInTBs;
            this.__explicitlySet__.add("storageUsedInTBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isMultiAD")
        private Boolean isMultiAD;

        public Builder isMultiAD(Boolean isMultiAD) {
            this.isMultiAD = isMultiAD;
            this.__explicitlySet__.add("isMultiAD");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalOcpuCapacity")
        private Integer totalOcpuCapacity;

        public Builder totalOcpuCapacity(Integer totalOcpuCapacity) {
            this.totalOcpuCapacity = totalOcpuCapacity;
            this.__explicitlySet__.add("totalOcpuCapacity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("componentDetails")
        private BlockchainPlatformComponentDetails componentDetails;

        public Builder componentDetails(BlockchainPlatformComponentDetails componentDetails) {
            this.componentDetails = componentDetails;
            this.__explicitlySet__.add("componentDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("replicas")
        private ReplicaDetails replicas;

        public Builder replicas(ReplicaDetails replicas) {
            this.replicas = replicas;
            this.__explicitlySet__.add("replicas");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hostOcpuUtilizationInfo")
        private java.util.List<OcpuUtilizationInfo> hostOcpuUtilizationInfo;

        public Builder hostOcpuUtilizationInfo(
                java.util.List<OcpuUtilizationInfo> hostOcpuUtilizationInfo) {
            this.hostOcpuUtilizationInfo = hostOcpuUtilizationInfo;
            this.__explicitlySet__.add("hostOcpuUtilizationInfo");
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

        public BlockchainPlatform build() {
            BlockchainPlatform __instance__ =
                    new BlockchainPlatform(
                            id,
                            displayName,
                            compartmentId,
                            description,
                            isByol,
                            timeCreated,
                            timeUpdated,
                            serviceVersion,
                            platformRole,
                            computeShape,
                            serviceEndpoint,
                            lifecycleState,
                            lifecycleDetails,
                            storageSizeInTBs,
                            storageUsedInTBs,
                            isMultiAD,
                            totalOcpuCapacity,
                            componentDetails,
                            replicas,
                            hostOcpuUtilizationInfo,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BlockchainPlatform o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .displayName(o.getDisplayName())
                            .compartmentId(o.getCompartmentId())
                            .description(o.getDescription())
                            .isByol(o.getIsByol())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .serviceVersion(o.getServiceVersion())
                            .platformRole(o.getPlatformRole())
                            .computeShape(o.getComputeShape())
                            .serviceEndpoint(o.getServiceEndpoint())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .storageSizeInTBs(o.getStorageSizeInTBs())
                            .storageUsedInTBs(o.getStorageUsedInTBs())
                            .isMultiAD(o.getIsMultiAD())
                            .totalOcpuCapacity(o.getTotalOcpuCapacity())
                            .componentDetails(o.getComponentDetails())
                            .replicas(o.getReplicas())
                            .hostOcpuUtilizationInfo(o.getHostOcpuUtilizationInfo())
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
     * unique identifier that is immutable on creation
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * Platform Instance Display name, can be renamed
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Compartment Identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * Platform Instance Description
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * Bring your own license
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isByol")
    Boolean isByol;

    /**
     * The time the the Platform Instance was created. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The time the Platform Instance was updated. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * The version of the Platform Instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceVersion")
    String serviceVersion;
    /**
     * Role of platform - founder or participant
     **/
    @lombok.extern.slf4j.Slf4j
    public enum PlatformRole {
        Founder("FOUNDER"),
        Participant("PARTICIPANT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, PlatformRole> map;

        static {
            map = new java.util.HashMap<>();
            for (PlatformRole v : PlatformRole.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PlatformRole(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PlatformRole create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PlatformRole', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Role of platform - founder or participant
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("platformRole")
    PlatformRole platformRole;
    /**
     * Type of compute shape - one of Standard, (Enterprise) Small, Medium, Large or Extra Large
     **/
    @lombok.extern.slf4j.Slf4j
    public enum ComputeShape {
        Standard("STANDARD"),
        EnterpriseSmall("ENTERPRISE_SMALL"),
        EnterpriseMedium("ENTERPRISE_MEDIUM"),
        EnterpriseLarge("ENTERPRISE_LARGE"),
        EnterpriseExtraLarge("ENTERPRISE_EXTRA_LARGE"),
        EnterpriseCustom("ENTERPRISE_CUSTOM"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, ComputeShape> map;

        static {
            map = new java.util.HashMap<>();
            for (ComputeShape v : ComputeShape.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ComputeShape(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ComputeShape create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ComputeShape', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Type of compute shape - one of Standard, (Enterprise) Small, Medium, Large or Extra Large
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("computeShape")
    ComputeShape computeShape;

    /**
     * Service endpoint URL, valid post-provisioning
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceEndpoint")
    String serviceEndpoint;
    /**
     * The current state of the Platform Instance.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Creating("CREATING"),
        Updating("UPDATING"),
        Active("ACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Scaling("SCALING"),
        Inactive("INACTIVE"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The current state of the Platform Instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * An message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    String lifecycleDetails;

    /**
     * Storage size in TBs
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("storageSizeInTBs")
    Double storageSizeInTBs;

    /**
     * Storage used in TBs
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("storageUsedInTBs")
    Double storageUsedInTBs;

    /**
     * True for multi-AD blockchain plaforms, false for single-AD
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isMultiAD")
    Boolean isMultiAD;

    /**
     * Number of total OCPUs allocated to the platform cluster
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalOcpuCapacity")
    Integer totalOcpuCapacity;

    @com.fasterxml.jackson.annotation.JsonProperty("componentDetails")
    BlockchainPlatformComponentDetails componentDetails;

    @com.fasterxml.jackson.annotation.JsonProperty("replicas")
    ReplicaDetails replicas;

    /**
     * List of OcpuUtilization for all hosts
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostOcpuUtilizationInfo")
    java.util.List<OcpuUtilizationInfo> hostOcpuUtilizationInfo;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: `{\"bar-key\": \"value\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: `{\"foo-namespace\": {\"bar-key\": \"value\"}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
