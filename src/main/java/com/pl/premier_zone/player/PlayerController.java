package com.pl.premier_zone.player;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/player")
public class PlayerController {

    private final PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping
    public List<Player> getPlayers() {
        return playerService.getPlayer();
    }

    @GetMapping("/team")
    public List<Player> getPlayersByTeam(@RequestParam String team) {
        return playerService.getPlayerByTeam(team);
    }

    @GetMapping("/search")
    public List<Player> getPlayersByName(@RequestParam String name) {
        return playerService.getSearchPlayerByName(name);
    }

    @GetMapping("/position")
    public List<Player> getPlayersByPosition(@RequestParam String position) {
        return playerService.getSearchPlayerByPosition(position);
    }

    @GetMapping("/nation")
    public List<Player> getPlayersByNation(@RequestParam String nation) {
        return playerService.getSearchPlayerByNation(nation);
    }

    @GetMapping("/filter")
    public List<Player> getPlayersByTeamNameAndPosition(@RequestParam String teamName, @RequestParam String position) {
        return playerService.getSearchPlayerByTeamNameAndPosition(teamName, position);
    }

    @PostMapping
    public ResponseEntity<Player> addNewPlayer(@RequestBody Player player) {
        Player saved = playerService.addNewPlayer(player);
        return ResponseEntity.status(201).body(saved);
    }

    @DeleteMapping(path = "/{playerName}")
    public ResponseEntity<String> deletePlayer (@PathVariable("playerName") String playerName) {
        playerService.deletePlayer(playerName);
        return ResponseEntity.ok("Player deleted successfully");
    }

    @PutMapping
    public ResponseEntity<Player> updatePlayer(@RequestBody Player player) {
        Player updatedPlayer = playerService.updatePlayer(player);
        return ResponseEntity.ok(updatedPlayer);
    }








}
