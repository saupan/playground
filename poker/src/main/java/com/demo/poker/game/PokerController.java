package com.demo.poker.game;

import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.domain.Card;

@RestController
public class PokerController {
	
	private final PokerService pokerService;

	@Autowired
	public PokerController(PokerService pokerService) {
		this.pokerService = pokerService;
	}

	@GetMapping("/api/deck")
	public List<Card> getDeck() {
		return pokerService.getDeck();
	}

}
