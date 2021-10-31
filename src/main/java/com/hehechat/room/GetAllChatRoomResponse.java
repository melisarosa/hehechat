package com.hehechat.room;

import java.util.ArrayList;
import java.util.List;

public class GetAllChatRoomResponse {
    public List<String> getRooms() {
        return rooms;
    }

    public void setRooms(List<String> rooms) {
        this.rooms = rooms;
    }

    private List<String> rooms = new ArrayList<>();
}
