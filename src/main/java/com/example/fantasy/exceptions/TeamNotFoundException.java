package com.example.fantasy.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.persistence.EntityNotFoundException;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "The team with this id does not exist.")
public class TeamNotFoundException extends EntityNotFoundException {
}
