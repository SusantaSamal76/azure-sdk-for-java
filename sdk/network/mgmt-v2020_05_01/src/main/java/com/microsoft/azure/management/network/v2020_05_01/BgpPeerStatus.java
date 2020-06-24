/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * BGP peer status details.
 */
public class BgpPeerStatus {
    /**
     * The virtual network gateway's local address.
     */
    @JsonProperty(value = "localAddress", access = JsonProperty.Access.WRITE_ONLY)
    private String localAddress;

    /**
     * The remote BGP peer.
     */
    @JsonProperty(value = "neighbor", access = JsonProperty.Access.WRITE_ONLY)
    private String neighbor;

    /**
     * The autonomous system number of the remote BGP peer.
     */
    @JsonProperty(value = "asn", access = JsonProperty.Access.WRITE_ONLY)
    private Long asn;

    /**
     * The BGP peer state. Possible values include: 'Unknown', 'Stopped',
     * 'Idle', 'Connecting', 'Connected'.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private BgpPeerState state;

    /**
     * For how long the peering has been up.
     */
    @JsonProperty(value = "connectedDuration", access = JsonProperty.Access.WRITE_ONLY)
    private String connectedDuration;

    /**
     * The number of routes learned from this peer.
     */
    @JsonProperty(value = "routesReceived", access = JsonProperty.Access.WRITE_ONLY)
    private Long routesReceived;

    /**
     * The number of BGP messages sent.
     */
    @JsonProperty(value = "messagesSent", access = JsonProperty.Access.WRITE_ONLY)
    private Long messagesSent;

    /**
     * The number of BGP messages received.
     */
    @JsonProperty(value = "messagesReceived", access = JsonProperty.Access.WRITE_ONLY)
    private Long messagesReceived;

    /**
     * Get the virtual network gateway's local address.
     *
     * @return the localAddress value
     */
    public String localAddress() {
        return this.localAddress;
    }

    /**
     * Get the remote BGP peer.
     *
     * @return the neighbor value
     */
    public String neighbor() {
        return this.neighbor;
    }

    /**
     * Get the autonomous system number of the remote BGP peer.
     *
     * @return the asn value
     */
    public Long asn() {
        return this.asn;
    }

    /**
     * Get the BGP peer state. Possible values include: 'Unknown', 'Stopped', 'Idle', 'Connecting', 'Connected'.
     *
     * @return the state value
     */
    public BgpPeerState state() {
        return this.state;
    }

    /**
     * Get for how long the peering has been up.
     *
     * @return the connectedDuration value
     */
    public String connectedDuration() {
        return this.connectedDuration;
    }

    /**
     * Get the number of routes learned from this peer.
     *
     * @return the routesReceived value
     */
    public Long routesReceived() {
        return this.routesReceived;
    }

    /**
     * Get the number of BGP messages sent.
     *
     * @return the messagesSent value
     */
    public Long messagesSent() {
        return this.messagesSent;
    }

    /**
     * Get the number of BGP messages received.
     *
     * @return the messagesReceived value
     */
    public Long messagesReceived() {
        return this.messagesReceived;
    }

}
