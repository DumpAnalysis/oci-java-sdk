/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplace.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.marketplace.model.*;
import com.oracle.bmc.marketplace.requests.*;
import com.oracle.bmc.marketplace.responses.*;
import org.apache.commons.lang3.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
@lombok.extern.slf4j.Slf4j
public class GetThirdPartyPaidListingEligibilityConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    public static com.oracle.bmc.marketplace.requests.GetThirdPartyPaidListingEligibilityRequest
            interceptRequest(
                    com.oracle.bmc.marketplace.requests.GetThirdPartyPaidListingEligibilityRequest
                            request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.marketplace.requests.GetThirdPartyPaidListingEligibilityRequest
                    request) {
        Validate.notNull(request, "request instance is required");
        Validate.notNull(request.getCompartmentId(), "compartmentId is required");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget().path("/20181001").path("thirdPartyPaidListingEligibility");

        target =
                target.queryParam(
                        "compartmentId",
                        com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                request.getCompartmentId()));

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getOpcRequestId() != null) {
            ib.header("opc-request-id", request.getOpcRequestId());
        }

        return ib;
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.marketplace.responses
                            .GetThirdPartyPaidListingEligibilityResponse>
            fromResponse() {
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.marketplace.responses
                                .GetThirdPartyPaidListingEligibilityResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.marketplace.responses
                                        .GetThirdPartyPaidListingEligibilityResponse>() {
                            @Override
                            public com.oracle.bmc.marketplace.responses
                                            .GetThirdPartyPaidListingEligibilityResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.marketplace.responses.GetThirdPartyPaidListingEligibilityResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        ThirdPartyPaidListingEligibility>>
                                        responseFn =
                                                RESPONSE_CONVERSION_FACTORY.create(
                                                        ThirdPartyPaidListingEligibility.class);

                                com.oracle.bmc.http.internal.WithHeaders<
                                                ThirdPartyPaidListingEligibility>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.marketplace.responses
                                                .GetThirdPartyPaidListingEligibilityResponse.Builder
                                        builder =
                                                com.oracle.bmc.marketplace.responses
                                                        .GetThirdPartyPaidListingEligibilityResponse
                                                        .builder()
                                                        .__httpStatusCode__(
                                                                rawResponse.getStatus());

                                builder.thirdPartyPaidListingEligibility(response.getItem());

                                com.google.common.base.Optional<java.util.List<String>>
                                        opcRequestIdHeader =
                                                com.oracle.bmc.http.internal.HeaderUtils.get(
                                                        headers, "opc-request-id");
                                if (opcRequestIdHeader.isPresent()) {
                                    builder.opcRequestId(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-request-id",
                                                    opcRequestIdHeader.get().get(0),
                                                    String.class));
                                }

                                com.oracle.bmc.marketplace.responses
                                                .GetThirdPartyPaidListingEligibilityResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
