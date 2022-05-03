/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The current state of audit policies available on the target.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@lombok.extern.slf4j.Slf4j
public enum AuditPolicyLifecycleState {
    Creating("CREATING"),
    Updating("UPDATING"),
    Active("ACTIVE"),
    Failed("FAILED"),
    NeedsAttention("NEEDS_ATTENTION"),
    Deleting("DELETING"),
    Deleted("DELETED"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private final String value;
    private static java.util.Map<String, AuditPolicyLifecycleState> map;

    static {
        map = new java.util.HashMap<>();
        for (AuditPolicyLifecycleState v : AuditPolicyLifecycleState.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    AuditPolicyLifecycleState(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static AuditPolicyLifecycleState create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'AuditPolicyLifecycleState', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}