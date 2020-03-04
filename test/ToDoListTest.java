import java.util.Collection;

import org.junit.*;
import org.junit.Test;
import junit.framework.*;




public class ToDoListTest extends TestCase{
	// Define Test Fixtures

	
	public ToDoListTest() {
		super();
	}
	@Before
	 public void setUp() throws Exception{
		//Initialise Test Fixtures
	}
	@After
	 public void tearDown() throws Exception{
		// Uninitialise test Fixtures
	}

	@Test
	public void testAddTask() {
		ToDoList toDoList = new ToDoList();
		Task task1 = new Task("new task");
		
		toDoList.addTask(task1);
		
		Collection<Task> collection = toDoList.getAllTasks();
		
		assertEquals(collection.size(), 1);
		
		
		assertTrue(collection.contains(task1));
		
		
		toDoList.removeTask("new task");
		
		collection = toDoList.getAllTasks();
		
		assertFalse(collection.contains(task1));
	}
	@Test
	public void testgetStatus() {
		fail("Not implemented yet");
	}
	@Test
	public void testRemoveTask() {
		fail("Not implemented yet");
	}
	@Test
	public void testGetCompletedTasks() {
		fail("Not implemented yet");
	}
}
