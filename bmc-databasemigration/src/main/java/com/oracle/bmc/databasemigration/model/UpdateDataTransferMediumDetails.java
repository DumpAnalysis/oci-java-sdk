/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Data Transfer Medium details for the Migration.
 * Only one type of data transfer medium can be specified and will replace the stored Data Transfer Medium details.
 * If an empty object is specified, the stored Data Transfer Medium details will be removed.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210929")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateDataTransferMediumDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UpdateDataTransferMediumDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("databaseLinkDetails")
        private UpdateDatabaseLinkDetails databaseLinkDetails;

        public Builder databaseLinkDetails(UpdateDatabaseLinkDetails databaseLinkDetails) {
            this.databaseLinkDetails = databaseLinkDetails;
            this.__explicitlySet__.add("databaseLinkDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectStorageDetails")
        private UpdateObjectStoreBucket objectStorageDetails;

        public Builder objectStorageDetails(UpdateObjectStoreBucket objectStorageDetails) {
            this.objectStorageDetails = objectStorageDetails;
            this.__explicitlySet__.add("objectStorageDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateDataTransferMediumDetails build() {
            UpdateDataTransferMediumDetails __instance__ =
                    new UpdateDataTransferMediumDetails(databaseLinkDetails, objectStorageDetails);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateDataTransferMediumDetails o) {
            Builder copiedBuilder =
                    databaseLinkDetails(o.getDatabaseLinkDetails())
                            .objectStorageDetails(o.getObjectStorageDetails());

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

    @com.fasterxml.jackson.annotation.JsonProperty("databaseLinkDetails")
    UpdateDatabaseLinkDetails databaseLinkDetails;

    @com.fasterxml.jackson.annotation.JsonProperty("objectStorageDetails")
    UpdateObjectStoreBucket objectStorageDetails;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
