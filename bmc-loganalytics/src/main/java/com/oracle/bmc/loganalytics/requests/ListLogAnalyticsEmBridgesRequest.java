/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.requests;

import com.oracle.bmc.loganalytics.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ListLogAnalyticsEmBridgesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListLogAnalyticsEmBridgesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ListLogAnalyticsEmBridgesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The Logging Analytics namespace used for the request.
     *
     */
    private String namespaceName;

    /**
     * The ID of the compartment in which to list resources.
     */
    private String compartmentId;

    /**
     * A filter to return only log analytics enterprise manager bridge name whose name matches the entire name given. The match
     * is case-insensitive.
     *
     */
    private String displayName;

    /**
     * A filter to return only log analytics enterprise manager bridges matching all the lifecycle states specified for this parameter.
     *
     */
    private java.util.List<com.oracle.bmc.loganalytics.model.EmBridgeLifecycleStates>
            lifecycleState;

    /**
     * A filter to return only log analytics enterprise manager bridges whose lifecycleDetails contains the specified string.
     *
     */
    private String lifecycleDetailsContains;

    /**
     * Filter by the processing status of the latest upload from enterprise manager.
     *
     */
    private java.util.List<com.oracle.bmc.loganalytics.model.EmBridgeLatestImportProcessingStatus>
            importStatus;

    /**
     * The maximum number of items to return.
     */
    private Integer limit;

    /**
     * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
     */
    private String page;

    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
     *
     */
    private SortOrder sortOrder;

    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
     *
     **/
    public enum SortOrder {
        Asc("ASC"),
        Desc("DESC"),
        ;

        private final String value;
        private static java.util.Map<String, SortOrder> map;

        static {
            map = new java.util.HashMap<>();
            for (SortOrder v : SortOrder.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortOrder(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortOrder create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortOrder: " + key);
        }
    };
    /**
     * The field to sort enterprise manager bridges by. Only one sort order may be provided. Default order for timeCreated and timeUpdated
     * is descending. Default order for enterprise manager name is ascending. If no value is specified timeCreated is default.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort enterprise manager bridges by. Only one sort order may be provided. Default order for timeCreated and timeUpdated
     * is descending. Default order for enterprise manager name is ascending. If no value is specified timeCreated is default.
     *
     **/
    public enum SortBy {
        TimeCreated("timeCreated"),
        TimeUpdated("timeUpdated"),
        DisplayName("displayName"),
        ;

        private final String value;
        private static java.util.Map<String, SortBy> map;

        static {
            map = new java.util.HashMap<>();
            for (SortBy v : SortBy.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortBy: " + key);
        }
    };
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListLogAnalyticsEmBridgesRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private java.util.List<com.oracle.bmc.loganalytics.model.EmBridgeLifecycleStates>
                lifecycleState = null;

        /**
         * A filter to return only log analytics enterprise manager bridges matching all the lifecycle states specified for this parameter.
         *
         * @return this builder instance
         */
        public Builder lifecycleState(
                java.util.List<com.oracle.bmc.loganalytics.model.EmBridgeLifecycleStates>
                        lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * Singular setter. A filter to return only log analytics enterprise manager bridges matching all the lifecycle states specified for this parameter.
         *
         * @return this builder instance
         */
        public Builder lifecycleState(EmBridgeLifecycleStates singularValue) {
            return this.lifecycleState(java.util.Arrays.asList(singularValue));
        }

        private java.util.List<
                        com.oracle.bmc.loganalytics.model.EmBridgeLatestImportProcessingStatus>
                importStatus = null;

        /**
         * Filter by the processing status of the latest upload from enterprise manager.
         *
         * @return this builder instance
         */
        public Builder importStatus(
                java.util.List<
                                com.oracle.bmc.loganalytics.model
                                        .EmBridgeLatestImportProcessingStatus>
                        importStatus) {
            this.importStatus = importStatus;
            return this;
        }

        /**
         * Singular setter. Filter by the processing status of the latest upload from enterprise manager.
         *
         * @return this builder instance
         */
        public Builder importStatus(EmBridgeLatestImportProcessingStatus singularValue) {
            return this.importStatus(java.util.Arrays.asList(singularValue));
        }

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListLogAnalyticsEmBridgesRequest o) {
            namespaceName(o.getNamespaceName());
            compartmentId(o.getCompartmentId());
            displayName(o.getDisplayName());
            lifecycleState(o.getLifecycleState());
            lifecycleDetailsContains(o.getLifecycleDetailsContains());
            importStatus(o.getImportStatus());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListLogAnalyticsEmBridgesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListLogAnalyticsEmBridgesRequest
         */
        public ListLogAnalyticsEmBridgesRequest build() {
            ListLogAnalyticsEmBridgesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
