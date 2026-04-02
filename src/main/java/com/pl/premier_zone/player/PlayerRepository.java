package com.pl.premier_zone.player;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PlayerRepository extends JpaRepository<Player, String> {
    public void deleteByName(String name);

    Optional<Player> findByName(String name);

    List<Player> findByTeamName(String teamName);

    List<Player> findByNameContainingIgnoreCase(String keyword);

    List<Player> findByPositionContainingIgnoreCase(String position);

    List<Player> findByNationContainingIgnoreCase(String nation);

    List<Player> findByTeamNameAndPositionContainingIgnoreCase(String teamName, String position);
}
