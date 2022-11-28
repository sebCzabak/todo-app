package sebCzabak.todoapp.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sebCzabak.todoapp.model.Task;

@RepositoryRestResource
public interface TaskRepository extends JpaRepository<Task,Integer> {
}
