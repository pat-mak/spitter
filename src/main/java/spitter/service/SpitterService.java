package spitter.service;

import java.util.Arrays;
import java.util.List;

import spitter.domain.Spittle;

public class SpitterService {

	public List<Spittle> getRecentSpittles() {
		return Arrays.asList(new Spittle[]{new Spittle("First"),new Spittle("second")});
	}

}
