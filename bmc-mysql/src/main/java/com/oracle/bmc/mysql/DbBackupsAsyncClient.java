/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql;

import java.util.Locale;
import com.oracle.bmc.mysql.internal.http.*;
import com.oracle.bmc.mysql.requests.*;
import com.oracle.bmc.mysql.responses.*;

/**
 * Async client implementation for DbBackups service. <br/>
 * There are two ways to use async client:
 * 1. Use AsyncHandler: using AsyncHandler, if the response to the call is an {@link java.io.InputStream}, like
 * getObject Api in object storage service, developers need to process the stream in AsyncHandler, and not anywhere else,
 * because the stream will be closed right after the AsyncHandler is invoked. <br/>
 * 2. Use Java Future: using Java Future, developers need to close the stream after they are done with the Java Future.<br/>
 * Accessing the result should be done in a mutually exclusive manner, either through the Future or the AsyncHandler,
 * but not both.  If the Future is used, the caller should pass in null as the AsyncHandler.  If the AsyncHandler
 * is used, it is still safe to use the Future to determine whether or not the request was completed via
 * Future.isDone/isCancelled.<br/>
 * Please refer to https://github.com/oracle/oci-java-sdk/blob/master/bmc-examples/src/main/java/ResteasyClientWithObjectStorageExample.java
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@lombok.extern.slf4j.Slf4j
public class DbBackupsAsyncClient implements DbBackupsAsync {
    /**
     * Service instance for DbBackups.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("DBBACKUPS")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://mysql.{region}.ocp.{secondLevelDomain}")
                    .build();

    @lombok.Getter(value = lombok.AccessLevel.PACKAGE)
    private final com.oracle.bmc.http.internal.RestClient client;

    private final com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
            authenticationDetailsProvider;

    /**
     * Creates a new service instance using the given authentication provider.
     * @param authenticationDetailsProvider The authentication details provider, required.
     */
    public DbBackupsAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public DbBackupsAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration) {
        this(authenticationDetailsProvider, configuration, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     */
    public DbBackupsAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
        this(
                authenticationDetailsProvider,
                configuration,
                clientConfigurator,
                new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                        com.oracle.bmc.http.signing.SigningStrategy.STANDARD));
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * <p>
     * This is an advanced constructor for clients that want to take control over how requests are signed.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     * @param defaultRequestSignerFactory The request signer factory used to create the request signer for this service.
     */
    public DbBackupsAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory) {
        this(
                authenticationDetailsProvider,
                configuration,
                clientConfigurator,
                defaultRequestSignerFactory,
                new java.util.ArrayList<com.oracle.bmc.http.ClientConfigurator>());
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * <p>
     * This is an advanced constructor for clients that want to take control over how requests are signed.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     * @param defaultRequestSignerFactory The request signer factory used to create the request signer for this service.
     * @param additionalClientConfigurators Additional client configurators to be run after the primary configurator.
     */
    public DbBackupsAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators) {
        this(
                authenticationDetailsProvider,
                configuration,
                clientConfigurator,
                defaultRequestSignerFactory,
                additionalClientConfigurators,
                null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * <p>
     * This is an advanced constructor for clients that want to take control over how requests are signed.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     * @param defaultRequestSignerFactory The request signer factory used to create the request signer for this service.
     * @param additionalClientConfigurators Additional client configurators to be run after the primary configurator.
     * @param endpoint Endpoint, or null to leave unset (note, may be overridden by {@code authenticationDetailsProvider})
     */
    public DbBackupsAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint) {
        this(
                authenticationDetailsProvider,
                configuration,
                clientConfigurator,
                defaultRequestSignerFactory,
                com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory
                        .createDefaultRequestSignerFactories(),
                additionalClientConfigurators,
                endpoint);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * <p>
     * This is an advanced constructor for clients that want to take control over how requests are signed.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     * @param defaultRequestSignerFactory The request signer factory used to create the request signer for this service.
     * @param signingStrategyRequestSignerFactories The request signer factories for each signing strategy used to create the request signer
     * @param additionalClientConfigurators Additional client configurators to be run after the primary configurator.
     * @param endpoint Endpoint, or null to leave unset (note, may be overridden by {@code authenticationDetailsProvider})
     */
    public DbBackupsAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.Map<
                            com.oracle.bmc.http.signing.SigningStrategy,
                            com.oracle.bmc.http.signing.RequestSignerFactory>
                    signingStrategyRequestSignerFactories,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint) {
        this.authenticationDetailsProvider = authenticationDetailsProvider;
        java.util.List<com.oracle.bmc.http.ClientConfigurator> authenticationDetailsConfigurators =
                new java.util.ArrayList<>();
        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.ProvidesClientConfigurators) {
            authenticationDetailsConfigurators.addAll(
                    ((com.oracle.bmc.auth.ProvidesClientConfigurators)
                                    this.authenticationDetailsProvider)
                            .getClientConfigurators());
        }
        java.util.List<com.oracle.bmc.http.ClientConfigurator> allConfigurators =
                new java.util.ArrayList<>(additionalClientConfigurators);
        allConfigurators.addAll(authenticationDetailsConfigurators);
        com.oracle.bmc.http.internal.RestClientFactory restClientFactory =
                com.oracle.bmc.http.internal.RestClientFactoryBuilder.builder()
                        .clientConfigurator(clientConfigurator)
                        .additionalClientConfigurators(allConfigurators)
                        .build();
        com.oracle.bmc.http.signing.RequestSigner defaultRequestSigner =
                defaultRequestSignerFactory.createRequestSigner(
                        SERVICE, this.authenticationDetailsProvider);
        java.util.Map<
                        com.oracle.bmc.http.signing.SigningStrategy,
                        com.oracle.bmc.http.signing.RequestSigner>
                requestSigners = new java.util.HashMap<>();
        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.BasicAuthenticationDetailsProvider) {
            for (com.oracle.bmc.http.signing.SigningStrategy s :
                    com.oracle.bmc.http.signing.SigningStrategy.values()) {
                requestSigners.put(
                        s,
                        signingStrategyRequestSignerFactories
                                .get(s)
                                .createRequestSigner(SERVICE, authenticationDetailsProvider));
            }
        }
        this.client = restClientFactory.create(defaultRequestSigner, requestSigners, configuration);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RegionProvider) {
            com.oracle.bmc.auth.RegionProvider provider =
                    (com.oracle.bmc.auth.RegionProvider) this.authenticationDetailsProvider;

            if (provider.getRegion() != null) {
                this.setRegion(provider.getRegion());
                if (endpoint != null) {
                    LOG.info(
                            "Authentication details provider configured for region '{}', but endpoint specifically set to '{}'. Using endpoint setting instead of region.",
                            provider.getRegion(),
                            endpoint);
                }
            }
        }
        if (endpoint != null) {
            setEndpoint(endpoint);
        }
    }

    /**
     * Create a builder for this client.
     * @return builder
     */
    public static Builder builder() {
        return new Builder(SERVICE);
    }

    /**
     * Builder class for this client. The "authenticationDetailsProvider" is required and must be passed to the
     * {@link #build(AbstractAuthenticationDetailsProvider)} method.
     */
    public static class Builder
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DbBackupsAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            requestSignerFactory =
                    new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                            com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Build the client.
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public DbBackupsAsyncClient build(
                @lombok.NonNull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            return new DbBackupsAsyncClient(
                    authenticationDetailsProvider,
                    configuration,
                    clientConfigurator,
                    requestSignerFactory,
                    additionalClientConfigurators,
                    endpoint);
        }
    }

    @Override
    public void setEndpoint(String endpoint) {
        LOG.info("Setting endpoint to {}", endpoint);
        client.setEndpoint(endpoint);
    }

    @Override
    public String getEndpoint() {
        String endpoint = null;
        java.net.URI uri = client.getBaseTarget().getUri();
        if (uri != null) {
            endpoint = uri.toString();
        }
        return endpoint;
    }

    @Override
    public void setRegion(com.oracle.bmc.Region region) {
        com.google.common.base.Optional<String> endpoint = region.getEndpoint(SERVICE);
        if (endpoint.isPresent()) {
            setEndpoint(endpoint.get());
        } else {
            throw new IllegalArgumentException(
                    "Endpoint for " + SERVICE + " is not known in region " + region);
        }
    }

    @Override
    public void setRegion(String regionId) {
        regionId = regionId.toLowerCase(Locale.ENGLISH);
        try {
            com.oracle.bmc.Region region = com.oracle.bmc.Region.fromRegionId(regionId);
            setRegion(region);
        } catch (IllegalArgumentException e) {
            LOG.info("Unknown regionId '{}', falling back to default endpoint format", regionId);
            String endpoint = com.oracle.bmc.Region.formatDefaultRegionEndpoint(SERVICE, regionId);
            setEndpoint(endpoint);
        }
    }

    @Override
    public void close() {
        client.close();
    }

    @Override
    public java.util.concurrent.Future<CreateBackupResponse> createBackup(
            final CreateBackupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateBackupRequest, CreateBackupResponse>
                    handler) {
        LOG.trace("Called async createBackup");
        final CreateBackupRequest interceptedRequest =
                CreateBackupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateBackupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, CreateBackupResponse>
                transformer = CreateBackupConverter.fromResponse();
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);

        com.oracle.bmc.responses.AsyncHandler<CreateBackupRequest, CreateBackupResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            CreateBackupRequest, CreateBackupResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.post(
                                    ib,
                                    interceptedRequest.getCreateBackupDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                (handler == null)
                        ? null
                        : new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                (handler == null)
                        ? null
                        : new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(
                        ib,
                        interceptedRequest.getCreateBackupDetails(),
                        interceptedRequest,
                        onSuccess,
                        onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, CreateBackupResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.post(
                                    ib,
                                    interceptedRequest.getCreateBackupDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteBackupResponse> deleteBackup(
            final DeleteBackupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteBackupRequest, DeleteBackupResponse>
                    handler) {
        LOG.trace("Called async deleteBackup");
        final DeleteBackupRequest interceptedRequest =
                DeleteBackupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteBackupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, DeleteBackupResponse>
                transformer = DeleteBackupConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<DeleteBackupRequest, DeleteBackupResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            DeleteBackupRequest, DeleteBackupResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.delete(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                (handler == null)
                        ? null
                        : new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                (handler == null)
                        ? null
                        : new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.delete(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, DeleteBackupResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.delete(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<GetBackupResponse> getBackup(
            final GetBackupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetBackupRequest, GetBackupResponse>
                    handler) {
        LOG.trace("Called async getBackup");
        final GetBackupRequest interceptedRequest = GetBackupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetBackupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, GetBackupResponse>
                transformer = GetBackupConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<GetBackupRequest, GetBackupResponse> handlerToUse =
                handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            GetBackupRequest, GetBackupResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                (handler == null)
                        ? null
                        : new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                (handler == null)
                        ? null
                        : new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, GetBackupResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<ListBackupsResponse> listBackups(
            final ListBackupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListBackupsRequest, ListBackupsResponse>
                    handler) {
        LOG.trace("Called async listBackups");
        final ListBackupsRequest interceptedRequest =
                ListBackupsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListBackupsConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListBackupsResponse>
                transformer = ListBackupsConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<ListBackupsRequest, ListBackupsResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            ListBackupsRequest, ListBackupsResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                (handler == null)
                        ? null
                        : new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                (handler == null)
                        ? null
                        : new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, interceptedRequest, onSuccess, onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, ListBackupsResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.get(ib, interceptedRequest, onSuccess, onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateBackupResponse> updateBackup(
            final UpdateBackupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateBackupRequest, UpdateBackupResponse>
                    handler) {
        LOG.trace("Called async updateBackup");
        final UpdateBackupRequest interceptedRequest =
                UpdateBackupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateBackupConverter.fromRequest(client, interceptedRequest);
        final com.google.common.base.Function<javax.ws.rs.core.Response, UpdateBackupResponse>
                transformer = UpdateBackupConverter.fromResponse();

        com.oracle.bmc.responses.AsyncHandler<UpdateBackupRequest, UpdateBackupResponse>
                handlerToUse = handler;
        if (handler != null
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            handlerToUse =
                    new com.oracle.bmc.util.internal.RefreshAuthTokenWrappingAsyncHandler<
                            UpdateBackupRequest, UpdateBackupResponse>(
                            (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                                    this.authenticationDetailsProvider,
                            handler) {
                        @Override
                        public void retryCall() {
                            final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response>
                                    onSuccess =
                                            new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                                    this, transformer, interceptedRequest);
                            final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                                    new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                            this, interceptedRequest);
                            client.put(
                                    ib,
                                    interceptedRequest.getUpdateBackupDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    };
        }

        final com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                (handler == null)
                        ? null
                        : new com.oracle.bmc.http.internal.SuccessConsumer<>(
                                handlerToUse, transformer, interceptedRequest);
        final com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                (handler == null)
                        ? null
                        : new com.oracle.bmc.http.internal.ErrorConsumer<>(
                                handlerToUse, interceptedRequest);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.put(
                        ib,
                        interceptedRequest.getUpdateBackupDetails(),
                        interceptedRequest,
                        onSuccess,
                        onError);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenTransformingFuture<
                    javax.ws.rs.core.Response, UpdateBackupResponse>(
                    responseFuture,
                    transformer,
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    new com.google.common.base.Supplier<
                            java.util.concurrent.Future<javax.ws.rs.core.Response>>() {
                        @Override
                        public java.util.concurrent.Future<javax.ws.rs.core.Response> get() {
                            return client.put(
                                    ib,
                                    interceptedRequest.getUpdateBackupDetails(),
                                    interceptedRequest,
                                    onSuccess,
                                    onError);
                        }
                    });
        } else {
            return new com.oracle.bmc.util.internal.TransformingFuture<>(
                    responseFuture, transformer);
        }
    }
}
