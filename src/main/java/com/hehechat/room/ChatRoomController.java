package com.hehechat.room;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/rooms")
public class ChatRoomController {

    @Autowired
    private ChatRoomService chatRoomService;

    // API to create new chat room
    @PostMapping
    public CreateChatRoomResponse createChatRoom(@RequestBody CreateChatRoomRequest request) {
        return chatRoomService.createChatRoom(request);
    }

    // API to get all chat room
    @GetMapping
    public GetAllChatRoomResponse getAllChatRoom() {
        return chatRoomService.getAllChatRoom();
    }

}
