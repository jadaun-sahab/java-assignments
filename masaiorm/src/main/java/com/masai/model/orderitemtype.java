package com.masai.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public enum orderitemtype {
	@GeneratedValue(strategy = GenerationType.AUTO)
	productname,
	quantity,
	price;
}
