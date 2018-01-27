package org.biacode.hermes.core.api.websocket.resource.controller.room

import com.fasterxml.jackson.annotation.JsonProperty
import org.biacode.hermes.core.api.websocket.resource.controller.common.CommandAwareWebsocketRequest

/**
 * Created by Arthur Asatryan.
 * Date: 1/28/18
 * Time: 12:12 AM
 */
class CreateRoomRequest(
        @JsonProperty("roomName")
        val roomName: String
) : CommandAwareWebsocketRequest()