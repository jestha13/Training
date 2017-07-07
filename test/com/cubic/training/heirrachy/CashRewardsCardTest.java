package com.cubic.training.heirrachy;

import static org.junit.Assert.*;

import org.junit.Test;

public class CashRewardsCardTest {

	@Test
	public void testredeemNow() {
		CashRewardsCard c = new CashRewardsCard(25);
		c.redeemNow();
		assertEquals("you cannot redeem the points now.",c.x);
		
	}

}
