package com.hehechat.room;

public interface ChatRoomService {

    CreateChatRoomResponse createChatRoom(CreateChatRoomRequest request);

    GetAllChatRoomResponse getAllChatRoom();
}
