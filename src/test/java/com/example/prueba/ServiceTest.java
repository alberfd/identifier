package com.example.prueba;

import com.example.prueba.dto.TemperatureReadingsDTO;
import com.example.prueba.service.TemperatureService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ServiceTest {

	@Autowired
	private TemperatureService temperatureService;


	@Test
	void temperatureReadingsTest(){

		final TemperatureReadingsDTO readingDTO = new TemperatureReadingsDTO(new int[]{1,2,3});

		final int maxIncrement = temperatureService.getMaxIncrement(readingDTO);

		Assertions.assertEquals(maxIncrement, 2);
	}

	@Test
	void temperatureReadingsNoIncrementTest(){

		final TemperatureReadingsDTO readingDTO = new TemperatureReadingsDTO(new int[]{3,2,1});

		final int maxIncrement = temperatureService.getMaxIncrement(readingDTO);

		Assertions.assertEquals(maxIncrement, 0);
	}

	@Test
	void temperatureReadingsIncrementTest(){

		final TemperatureReadingsDTO readingDTO = new TemperatureReadingsDTO(new int[]{1,3,2,4});

		final int maxIncrement = temperatureService.getMaxIncrement(readingDTO);

		Assertions.assertEquals(maxIncrement, 3);
	}

	@Test
	void temperatureReadingsEmptyTest(){

		final TemperatureReadingsDTO readingDTO = new TemperatureReadingsDTO(new int[]{});

		final int maxIncrement = temperatureService.getMaxIncrement(readingDTO);

		Assertions.assertEquals(maxIncrement, 0);
	}

	@Test
	void temperatureReadingsOnlyOneValueTest(){

		final TemperatureReadingsDTO readingDTO = new TemperatureReadingsDTO(new int[]{2});

		final int maxIncrement = temperatureService.getMaxIncrement(readingDTO);

		Assertions.assertEquals(maxIncrement, 0);
	}

}
