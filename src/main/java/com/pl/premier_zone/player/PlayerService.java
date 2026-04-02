package com.pl.premier_zone.player;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Component
public class PlayerService {
    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> getPlayer() {
        return playerRepository.findAll();
    }

    public List<Player> getPlayerByTeam(String teamName) {
        return playerRepository.findByTeamName(teamName);
    }

    public List<Player> getSearchPlayerByName(String keyword) {
        return playerRepository.findByNameContainingIgnoreCase(keyword);
    }

    public List<Player> getSearchPlayerByPosition(String position) {
        return playerRepository.findByPositionContainingIgnoreCase(position);
    }

    public List<Player> getSearchPlayerByNation(String nation) {
        return playerRepository.findByNationContainingIgnoreCase(nation);
    }

    public List<Player> getSearchPlayerByTeamNameAndPosition(String teamName, String position) {
        return playerRepository.findByTeamNameAndPositionContainingIgnoreCase(teamName, position);
    }

    public Player addNewPlayer(Player player) {
        Optional<Player> playerOptional = playerRepository.findByName(player.getName());
        if (playerOptional.isPresent()) {
            throw new IllegalStateException("Player already exists");
        }
        return playerRepository.save(player);
    }

    public Player updatePlayer(Player updatedPlayer) {
        Player existingPlayer = playerRepository.findByName(updatedPlayer.getName()).orElseThrow(()
                -> new IllegalStateException("Player not found"));

        existingPlayer.setTeamName(updatedPlayer.getTeamName());
        existingPlayer.setPosition(updatedPlayer.getPosition());
        existingPlayer.setNation(updatedPlayer.getNation());
        existingPlayer.setAge(updatedPlayer.getAge());

        return playerRepository.save(existingPlayer);
    }

    @Transactional
    public void deletePlayer(String playerName) {
        playerRepository.findByName(playerName)
                        .orElseThrow(() -> new IllegalStateException("Player not found"));
        playerRepository.deleteByName(playerName);
    }






}
