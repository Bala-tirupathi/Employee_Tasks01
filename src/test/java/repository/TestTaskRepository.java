package repository;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.tirupathi.taskOfSpringboot.entity.Task;
import com.tirupathi.taskOfSpringboot.payloadDto.TaskDto;
import com.tirupathi.taskOfSpringboot.repository.TaskRepository;

@DataJpaTest              // For SB application knowing that it should be using embedded in-memory database for database related activities
public class TestTaskRepository {
	
	@Autowired
	private TaskRepository taskRepository;
	Task task;
	TaskDto taskDto;
	
	@BeforeEach
	void setUp() {
		task = new Task();
		taskRepository.save(task);
	}
	
	@AfterEach
	void teardown() {
		task = null;
		taskRepository.deleteAll();
	}

}
