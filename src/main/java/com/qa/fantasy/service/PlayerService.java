package com.qa.fantasy.service;

import com.qa.fantasy.domain.Player;
import com.qa.fantasy.dto.PlayerDTO;
import com.qa.fantasy.exceptions.PlayerNotFoundException;
import com.qa.fantasy.repo.PlayerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlayerService {

    private final PlayerRepository repo;
    private final ModelMapper mapper;

    @Autowired
    public PlayerService(PlayerRepository repo, ModelMapper mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    private PlayerDTO mapToDTO(Player player) {
        return this.mapper.map(player, PlayerDTO.class);
    }

    public List<PlayerDTO> viewAllPlayers() {
        return this.repo.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
    }

    public PlayerDTO createPlayer(Player player) {
        return this.mapToDTO(this.repo.save(player));
    }

    public PlayerDTO findPlayerById(Long id) {
        return this.mapToDTO(this.repo.findById(id).orElseThrow(PlayerNotFoundException::new));
    }

    public Boolean deletePlayerById(Long id) {
        if(!this.repo.existsById(id)) {
            throw new PlayerNotFoundException();
        }
        this.repo.deleteById(id);
        return this.repo.existsById(id);
    }

    public PlayerDTO updatePlayer(Long id, Player player) {
        Player update = this.repo.findById(id).orElseThrow(PlayerNotFoundException::new);
        update.setAge(player.getAge());
        update.setName(player.getName());
        update.setPosition(player.getPosition());
        return this.mapToDTO(this.repo.save(player));
    }
}
