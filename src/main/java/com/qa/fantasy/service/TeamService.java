package com.qa.fantasy.service;

import com.qa.fantasy.domain.Team;
import com.qa.fantasy.dto.TeamDTO;
import com.qa.fantasy.exceptions.TeamNotFoundException;
import com.qa.fantasy.repo.TeamRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TeamService {

    private final TeamRepository repo;
    private final ModelMapper mapper;

    @Autowired
    public TeamService(TeamRepository repo, ModelMapper mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    private TeamDTO mapToDTO(Team team) {
        return this.mapper.map(team, TeamDTO.class);
    }

    public TeamDTO createTeam(Team team) {
        return this.mapToDTO(this.repo.save(team));
    }

    public Boolean deleteTeamById(Long id) {
        if(!this.repo.existsById(id)) {
            throw new TeamNotFoundException();
        }
        this.repo.deleteById(id);
        return this.repo.existsById(id);
    }

    public List<TeamDTO> viewAllTeams() {
        return this.repo.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
    }

    public TeamDTO findTeamById(Long id) {
        return this.mapToDTO(this.repo.findById(id).orElseThrow(TeamNotFoundException::new));
    }
}
