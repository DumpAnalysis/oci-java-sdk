/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * The properties that define a node pool summary.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = NodePoolSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class NodePoolSummary {
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

        @com.fasterxml.jackson.annotation.JsonProperty("clusterId")
        private String clusterId;

        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            this.__explicitlySet__.add("clusterId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("kubernetesVersion")
        private String kubernetesVersion;

        public Builder kubernetesVersion(String kubernetesVersion) {
            this.kubernetesVersion = kubernetesVersion;
            this.__explicitlySet__.add("kubernetesVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nodeImageId")
        private String nodeImageId;

        public Builder nodeImageId(String nodeImageId) {
            this.nodeImageId = nodeImageId;
            this.__explicitlySet__.add("nodeImageId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nodeImageName")
        private String nodeImageName;

        public Builder nodeImageName(String nodeImageName) {
            this.nodeImageName = nodeImageName;
            this.__explicitlySet__.add("nodeImageName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nodeShapeConfig")
        private NodeShapeConfig nodeShapeConfig;

        public Builder nodeShapeConfig(NodeShapeConfig nodeShapeConfig) {
            this.nodeShapeConfig = nodeShapeConfig;
            this.__explicitlySet__.add("nodeShapeConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nodeSource")
        private NodeSourceOption nodeSource;

        public Builder nodeSource(NodeSourceOption nodeSource) {
            this.nodeSource = nodeSource;
            this.__explicitlySet__.add("nodeSource");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nodeSourceDetails")
        private NodeSourceDetails nodeSourceDetails;

        public Builder nodeSourceDetails(NodeSourceDetails nodeSourceDetails) {
            this.nodeSourceDetails = nodeSourceDetails;
            this.__explicitlySet__.add("nodeSourceDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nodeShape")
        private String nodeShape;

        public Builder nodeShape(String nodeShape) {
            this.nodeShape = nodeShape;
            this.__explicitlySet__.add("nodeShape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("initialNodeLabels")
        private java.util.List<KeyValue> initialNodeLabels;

        public Builder initialNodeLabels(java.util.List<KeyValue> initialNodeLabels) {
            this.initialNodeLabels = initialNodeLabels;
            this.__explicitlySet__.add("initialNodeLabels");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sshPublicKey")
        private String sshPublicKey;

        public Builder sshPublicKey(String sshPublicKey) {
            this.sshPublicKey = sshPublicKey;
            this.__explicitlySet__.add("sshPublicKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("quantityPerSubnet")
        private Integer quantityPerSubnet;

        public Builder quantityPerSubnet(Integer quantityPerSubnet) {
            this.quantityPerSubnet = quantityPerSubnet;
            this.__explicitlySet__.add("quantityPerSubnet");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subnetIds")
        private java.util.List<String> subnetIds;

        public Builder subnetIds(java.util.List<String> subnetIds) {
            this.subnetIds = subnetIds;
            this.__explicitlySet__.add("subnetIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nodeConfigDetails")
        private NodePoolNodeConfigDetails nodeConfigDetails;

        public Builder nodeConfigDetails(NodePoolNodeConfigDetails nodeConfigDetails) {
            this.nodeConfigDetails = nodeConfigDetails;
            this.__explicitlySet__.add("nodeConfigDetails");
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

        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NodePoolSummary build() {
            NodePoolSummary __instance__ =
                    new NodePoolSummary(
                            id,
                            compartmentId,
                            clusterId,
                            name,
                            kubernetesVersion,
                            nodeImageId,
                            nodeImageName,
                            nodeShapeConfig,
                            nodeSource,
                            nodeSourceDetails,
                            nodeShape,
                            initialNodeLabels,
                            sshPublicKey,
                            quantityPerSubnet,
                            subnetIds,
                            nodeConfigDetails,
                            freeformTags,
                            definedTags,
                            systemTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NodePoolSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .clusterId(o.getClusterId())
                            .name(o.getName())
                            .kubernetesVersion(o.getKubernetesVersion())
                            .nodeImageId(o.getNodeImageId())
                            .nodeImageName(o.getNodeImageName())
                            .nodeShapeConfig(o.getNodeShapeConfig())
                            .nodeSource(o.getNodeSource())
                            .nodeSourceDetails(o.getNodeSourceDetails())
                            .nodeShape(o.getNodeShape())
                            .initialNodeLabels(o.getInitialNodeLabels())
                            .sshPublicKey(o.getSshPublicKey())
                            .quantityPerSubnet(o.getQuantityPerSubnet())
                            .subnetIds(o.getSubnetIds())
                            .nodeConfigDetails(o.getNodeConfigDetails())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .systemTags(o.getSystemTags());

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
     * The OCID of the node pool.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The OCID of the compartment in which the node pool exists.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The OCID of the cluster to which this node pool is attached.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clusterId")
    String clusterId;

    /**
     * The name of the node pool.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * The version of Kubernetes running on the nodes in the node pool.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kubernetesVersion")
    String kubernetesVersion;

    /**
     * Deprecated. see {@code nodeSource}. The OCID of the image running on the nodes in the node pool.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodeImageId")
    String nodeImageId;

    /**
     * Deprecated. see {@code nodeSource}. The name of the image running on the nodes in the node pool.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodeImageName")
    String nodeImageName;

    /**
     * The shape configuration of the nodes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodeShapeConfig")
    NodeShapeConfig nodeShapeConfig;

    /**
     * Deprecated. see {@code nodeSourceDetails}. Source running on the nodes in the node pool.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodeSource")
    NodeSourceOption nodeSource;

    /**
     * Source running on the nodes in the node pool.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodeSourceDetails")
    NodeSourceDetails nodeSourceDetails;

    /**
     * The name of the node shape of the nodes in the node pool.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodeShape")
    String nodeShape;

    /**
     * A list of key/value pairs to add to nodes after they join the Kubernetes cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("initialNodeLabels")
    java.util.List<KeyValue> initialNodeLabels;

    /**
     * The SSH public key on each node in the node pool on launch.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sshPublicKey")
    String sshPublicKey;

    /**
     * The number of nodes in each subnet.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("quantityPerSubnet")
    Integer quantityPerSubnet;

    /**
     * The OCIDs of the subnets in which to place nodes for this node pool.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetIds")
    java.util.List<String> subnetIds;

    /**
     * The configuration of nodes in the node pool.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodeConfigDetails")
    NodePoolNodeConfigDetails nodeConfigDetails;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    java.util.Map<String, java.util.Map<String, Object>> systemTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
