package com.qa.fantasy.rest;

import com.qa.fantasy.domain.Team;
import com.qa.fantasy.dto.TeamDTO;
import com.qa.fantasy.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeamController {

    private final TeamService teamService;

    @Autowired
    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping("/viewAllTeams")
    public ResponseEntity<List<TeamDTO>> getAllTeams() {
        return ResponseEntity.ok(this.teamService.viewAllTeams());
    }

    @PostMapping("/createTeam")
    public ResponseEntity<TeamDTO> createTeam(@RequestBody Team team) {
        return new ResponseEntity<TeamDTO>(this.teamService.createTeam(team), HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteTeam/{id}")
    public Boolean deleteTeam(@PathVariable Long id)
    {
        return this.teamService.deleteTeamById(id);
    }

    @GetMapping("/viewTeamById/{id}")
    public ResponseEntity<TeamDTO> getTeamById(@PathVariable Long id) {
        return ResponseEntity.ok(this.teamService.findTeamById(id));
    }
}
