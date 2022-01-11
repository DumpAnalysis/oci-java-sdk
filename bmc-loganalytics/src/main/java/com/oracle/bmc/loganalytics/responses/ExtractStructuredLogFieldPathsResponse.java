/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.responses;

import com.oracle.bmc.loganalytics.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ExtractStructuredLogFieldPathsResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. When you contact Oracle about a specific request, provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned ExtractLogFieldResults instance.
     */
    private com.oracle.bmc.loganalytics.model.ExtractLogFieldResults extractLogFieldResults;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "extractLogFieldResults"
    })
    private ExtractStructuredLogFieldPathsResponse(
            int __httpStatusCode__,
            String opcRequestId,
            com.oracle.bmc.loganalytics.model.ExtractLogFieldResults extractLogFieldResults) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.extractLogFieldResults = extractLogFieldResults;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ExtractStructuredLogFieldPathsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            extractLogFieldResults(o.getExtractLogFieldResults());

            return this;
        }

        public ExtractStructuredLogFieldPathsResponse build() {
            return new ExtractStructuredLogFieldPathsResponse(
                    __httpStatusCode__, opcRequestId, extractLogFieldResults);
        }
    }
}
