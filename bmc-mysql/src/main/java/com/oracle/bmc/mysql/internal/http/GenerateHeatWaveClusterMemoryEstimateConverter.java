/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.mysql.model.*;
import com.oracle.bmc.mysql.requests.*;
import com.oracle.bmc.mysql.responses.*;
import org.apache.commons.lang3.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@lombok.extern.slf4j.Slf4j
public class GenerateHeatWaveClusterMemoryEstimateConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    public static com.oracle.bmc.mysql.requests.GenerateHeatWaveClusterMemoryEstimateRequest
            interceptRequest(
                    com.oracle.bmc.mysql.requests.GenerateHeatWaveClusterMemoryEstimateRequest
                            request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.mysql.requests.GenerateHeatWaveClusterMemoryEstimateRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20190415")
                        .path("dbSystems")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getDbSystemId()))
                        .path("heatWaveClusterMemoryEstimate")
                        .path("actions")
                        .path("generate");

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getOpcRequestId() != null) {
            ib.header("opc-request-id", request.getOpcRequestId());
        }

        if (request.getOpcRetryToken() != null) {
            ib.header("opc-retry-token", request.getOpcRetryToken());
        }

        return ib;
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.mysql.responses.GenerateHeatWaveClusterMemoryEstimateResponse>
            fromResponse() {
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.mysql.responses
                                .GenerateHeatWaveClusterMemoryEstimateResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.mysql.responses
                                        .GenerateHeatWaveClusterMemoryEstimateResponse>() {
                            @Override
                            public com.oracle.bmc.mysql.responses
                                            .GenerateHeatWaveClusterMemoryEstimateResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.mysql.responses.GenerateHeatWaveClusterMemoryEstimateResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        HeatWaveClusterMemoryEstimate>>
                                        responseFn =
                                                RESPONSE_CONVERSION_FACTORY.create(
                                                        HeatWaveClusterMemoryEstimate.class);

                                com.oracle.bmc.http.internal.WithHeaders<
                                                HeatWaveClusterMemoryEstimate>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.mysql.responses
                                                .GenerateHeatWaveClusterMemoryEstimateResponse
                                                .Builder
                                        builder =
                                                com.oracle.bmc.mysql.responses
                                                        .GenerateHeatWaveClusterMemoryEstimateResponse
                                                        .builder()
                                                        .__httpStatusCode__(
                                                                rawResponse.getStatus());

                                builder.heatWaveClusterMemoryEstimate(response.getItem());

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

                                com.google.common.base.Optional<java.util.List<String>>
                                        opcWorkRequestIdHeader =
                                                com.oracle.bmc.http.internal.HeaderUtils.get(
                                                        headers, "opc-work-request-id");
                                if (opcWorkRequestIdHeader.isPresent()) {
                                    builder.opcWorkRequestId(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-work-request-id",
                                                    opcWorkRequestIdHeader.get().get(0),
                                                    String.class));
                                }

                                com.oracle.bmc.mysql.responses
                                                .GenerateHeatWaveClusterMemoryEstimateResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}