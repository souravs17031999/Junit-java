package com.in28minutes.springunittestingwithmockito.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.in28minutes.springunittestingwithmockito.data.ItemRepository;
import com.in28minutes.springunittestingwithmockito.entity.Item;

package com.in28minutes.unittesting.unittesting.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

package com.in28minutes.unittesting.unittesting.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.in28minutes.unittesting.unittesting.data.ItemRepository;
import com.in28minutes.unittesting.unittesting.model.Item;

@Component
public class ItemService {

	@Autowired
	private ItemRepository repository;

	public List<Item> calculateTotalValue() {

		List<Item> items = repository.findAll();

		items.stream().forEach((item) -> {
			item.setValue(item.getPrice() * item.getQuantity());
		});

		return items;
	}

	public void insertItem() {

	}

}

public class SomeBusinessMockTest {

	@Test
	public void calculateSumUsingDataService_basic() {
		SomeBusinessImpl business = new SomeBusinessImpl();
		SomeDataService dataServiceMock = mock(SomeDataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 1, 2, 3 });

		business.setSomeDataService(dataServiceMock);
		int actualResult = business.calculateSumUsingDataService();
		int expectedResult = 6;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void calculateSumUsingDataService_empty() {
		SomeBusinessImpl business = new SomeBusinessImpl();
		SomeDataService dataServiceMock = mock(SomeDataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { });

		business.setSomeDataService(dataServiceMock);
		int actualResult = business.calculateSumUsingDataService();//new int[] {}
		int expectedResult = 0;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void calculateSumUsingDataService_oneValue() {
		SomeBusinessImpl business = new SomeBusinessImpl();
		SomeDataService dataServiceMock = mock(SomeDataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 1, 2, 3 });

		business.setSomeDataService(dataServiceMock);
		int actualResult = business.calculateSumUsingDataService();//new int[] { 5 }
		int expectedResult = 5;
		assertEquals(expectedResult, actualResult);
	}
}
@Component
public class ItemBusinessService {

	@Autowired
	private ItemRepository repository;

	public Item retreiveHardcodedItem() {
		return new Item(1, "Ball", 10, 100);
	}

	public List<Item> retrieveAllItems() {
		List<Item> items = repository.findAll();

		for(Item item:items) {
			item.setValue(item.getPrice() * item.getQuantity());
		}

		return items;
	}

}
@RunWith(SpringRunner.class)
@SpringBootTest
public class UnitTestingApplicationTests {

	@Test
	public void contextLoads() {
	}

}
