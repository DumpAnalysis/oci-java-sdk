/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.responses;

import com.oracle.bmc.cloudguard.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class GetTargetDetectorRecipeResponse {

    /**
     * For optimistic concurrency control. See `if-match`.
     *
     */
    private String etag;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned TargetDetectorRecipe instance.
     */
    private TargetDetectorRecipe targetDetectorRecipe;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetTargetDetectorRecipeResponse o) {
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            targetDetectorRecipe(o.getTargetDetectorRecipe());

            return this;
        }
    }
}