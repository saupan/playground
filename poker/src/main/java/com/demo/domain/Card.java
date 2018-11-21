package com.demo.domain;

import com.demo.poker.enums.CARD_TYPE;
import com.demo.poker.enums.CARD_VALUE;

import lombok.Data;

@Data
public class Card {

	private CARD_TYPE type;
	private CARD_VALUE value;

}
