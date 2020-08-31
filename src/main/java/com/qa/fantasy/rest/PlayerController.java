package com.qa.fantasy.rest;

import com.qa.fantasy.domain.Player;
import com.qa.fantasy.dto.PlayerDTO;
import com.qa.fantasy.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class PlayerController {

    private final PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("/viewAllPlayers")
    public ResponseEntity<List<PlayerDTO>> getAllPlayers() {
        return ResponseEntity.ok(this.playerService.viewAllPlayers());
    }

    @PostMapping("/createPlayer")
    public ResponseEntity<PlayerDTO> createPlayer(@RequestBody Player player) {
        return new ResponseEntity<PlayerDTO>(this.playerService.createPlayer(player), HttpStatus.CREATED);
    }

    @DeleteMapping("/deletePlayer/{id}")
    public ResponseEntity<?> deletePlayer(@PathVariable Long id) {
        return this.playerService.deletePlayerById(id)
                ? ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build()
                : ResponseEntity.noContent().build();
    }

    @GetMapping("/getPlayerById/{id}")
    public ResponseEntity<PlayerDTO> getPlayerById(@PathVariable Long id) {
        return ResponseEntity.ok(this.playerService.findPlayerById(id));
    }

    @PutMapping("/updatePlayer")
    public ResponseEntity<PlayerDTO> updatePlayer(@PathParam("id") Long id, @RequestBody Player player) {
        //localhost:8080/updatePlayer?id="insertidhere"
        return ResponseEntity.ok(this.playerService.updatePlayer(id, player));
    }
}
