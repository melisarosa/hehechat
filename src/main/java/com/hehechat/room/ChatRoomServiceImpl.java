package com.hehechat.room;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ChatRoomServiceImpl implements ChatRoomService {
    private List<ChatRoomEntity> rooms = new ArrayList<>();

    @Override
    public CreateChatRoomResponse createChatRoom(CreateChatRoomRequest request) {
        ChatRoomEntity entity = new ChatRoomEntity();
        entity.setId(UUID.randomUUID().toString());
        entity.setName(request.getRoomName());
        rooms.add(entity);

        CreateChatRoomResponse response = new CreateChatRoomResponse();
        response.setName(entity.getName());
        response.setId(entity.getId());

        return response;
    }

    @Override
    public GetAllChatRoomResponse getAllChatRoom() {
        GetAllChatRoomResponse response = new GetAllChatRoomResponse();
        response.setRooms(rooms.stream()
                .map(ChatRoomEntity::getName)
                .collect(Collectors.toList())
        );
        return response;
    }
}
