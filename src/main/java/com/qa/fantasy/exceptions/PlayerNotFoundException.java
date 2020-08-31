package com.qa.fantasy.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.persistence.EntityNotFoundException;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "The player with this id does not exist.")
public class PlayerNotFoundException extends EntityNotFoundException {
}
