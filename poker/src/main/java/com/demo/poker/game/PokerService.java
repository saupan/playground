package com.demo.poker.game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.domain.Card;
import com.demo.poker.enums.CARD_TYPE;
import com.demo.poker.enums.CARD_VALUE;

@Service
public class PokerService {

	public List<Card> getDeck() {
		List<Card> deck = new ArrayList<>();
		for (CARD_TYPE type : CARD_TYPE.values()) {
			for (CARD_VALUE value : CARD_VALUE.values()) {
				Card card = new Card();
				card.setType(type);
				card.setValue(value);
				deck.add(card);
			}
		}
		Collections.shuffle(deck);
		return deck;
	}
}
