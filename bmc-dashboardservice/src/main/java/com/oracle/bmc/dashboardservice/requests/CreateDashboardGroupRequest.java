/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dashboardservice.requests;

import com.oracle.bmc.dashboardservice.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dashboardservice/CreateDashboardGroupExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateDashboardGroupRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210731")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class CreateDashboardGroupRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.dashboardservice.model.CreateDashboardGroupDetails> {

    /**
     * Details about the dashboard group being created.
     */
    private com.oracle.bmc.dashboardservice.model.CreateDashboardGroupDetails
            createDashboardGroupDetails;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or server
     * error without risk of executing that same action again.
     * Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations
     * (for example, if a resource has been deleted and purged from the system,
     * then a retry of the original creation request may be rejected).
     *
     */
    private String opcRetryToken;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * To identify if the call is cross-regional. In CRUD calls for a resource, to
     * identify that the call originates from different region, set the
     * {@code CrossRegionIdentifierHeader} parameter to a region name (ex - {@code US-ASHBURN-1})
     * The call will be served from a Replicated bucket.
     * For same-region calls, the value is unassigned.
     *
     */
    private String opcCrossRegion;

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.dashboardservice.model.CreateDashboardGroupDetails getBody$() {
        return createDashboardGroupDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateDashboardGroupRequest,
                    com.oracle.bmc.dashboardservice.model.CreateDashboardGroupDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

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
        public Builder copy(CreateDashboardGroupRequest o) {
            createDashboardGroupDetails(o.getCreateDashboardGroupDetails());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            opcCrossRegion(o.getOpcCrossRegion());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateDashboardGroupRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of CreateDashboardGroupRequest
         */
        public CreateDashboardGroupRequest build() {
            CreateDashboardGroupRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(
                com.oracle.bmc.dashboardservice.model.CreateDashboardGroupDetails body) {
            createDashboardGroupDetails(body);
            return this;
        }
    }
}
