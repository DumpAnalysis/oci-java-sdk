/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.responses;

import com.oracle.bmc.resourcemanager.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ListTemplateCategoriesResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique identifier for the request.
     */
    private String opcRequestId;

    /**
     * The returned TemplateCategorySummaryCollection instance.
     */
    private com.oracle.bmc.resourcemanager.model.TemplateCategorySummaryCollection
            templateCategorySummaryCollection;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "templateCategorySummaryCollection"
    })
    private ListTemplateCategoriesResponse(
            int __httpStatusCode__,
            String opcRequestId,
            com.oracle.bmc.resourcemanager.model.TemplateCategorySummaryCollection
                    templateCategorySummaryCollection) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.templateCategorySummaryCollection = templateCategorySummaryCollection;
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
        public Builder copy(ListTemplateCategoriesResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            templateCategorySummaryCollection(o.getTemplateCategorySummaryCollection());

            return this;
        }

        public ListTemplateCategoriesResponse build() {
            return new ListTemplateCategoriesResponse(
                    __httpStatusCode__, opcRequestId, templateCategorySummaryCollection);
        }
    }
}
