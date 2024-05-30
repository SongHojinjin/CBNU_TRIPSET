package com.trip.Let.sGo.chat.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class ChatRoomDTO {
    private String roomId;
    private String roomName;

    public static ChatRoomDTO create(String name) {
        ChatRoomDTO room = new ChatRoomDTO();
        room.roomId = UUID.randomUUID().toString();
        room.roomName = name;
        return room;
    }
}
