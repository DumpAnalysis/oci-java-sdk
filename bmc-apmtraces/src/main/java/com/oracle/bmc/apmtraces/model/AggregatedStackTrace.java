/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.model;

/**
 * A branching tree with aggregated stack trace.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AggregatedStackTrace.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class AggregatedStackTrace {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("stackTraceElement")
        private StackTraceElement stackTraceElement;

        public Builder stackTraceElement(StackTraceElement stackTraceElement) {
            this.stackTraceElement = stackTraceElement;
            this.__explicitlySet__.add("stackTraceElement");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("children")
        private java.util.List<AggregatedStackTrace> children;

        public Builder children(java.util.List<AggregatedStackTrace> children) {
            this.children = children;
            this.__explicitlySet__.add("children");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AggregatedStackTrace build() {
            AggregatedStackTrace __instance__ =
                    new AggregatedStackTrace(stackTraceElement, children);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AggregatedStackTrace o) {
            Builder copiedBuilder =
                    stackTraceElement(o.getStackTraceElement()).children(o.getChildren());

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

    @com.fasterxml.jackson.annotation.JsonProperty("stackTraceElement")
    StackTraceElement stackTraceElement;

    /**
     * List of child aggregated stack trace to represent branches.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("children")
    java.util.List<AggregatedStackTrace> children;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}