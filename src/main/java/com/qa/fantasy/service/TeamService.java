package com.qa.fantasy.service;

import com.qa.fantasy.domain.Team;
import com.qa.fantasy.exceptions.TeamNotFoundException;
import com.qa.fantasy.repo.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {

    private final TeamRepository repo;

    @Autowired
    public TeamService(TeamRepository repo) { this.repo = repo; }

    public Team createTeam(Team team) { return this.repo.save(team); }

    public Boolean deleteTeamById(Long id) {
        if(!this.repo.existsById(id)) {
            throw new TeamNotFoundException();
        }
        this.repo.deleteById(id);
        return this.repo.existsById(id);
    }

    public List<Team> viewAllTeams() { return this.repo.findAll(); }

    public Team findTeamById(Long id) { return this.repo.findById(id).orElseThrow(TeamNotFoundException::new); }
}
