package xmp;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface TestObjectRepository extends CrudRepository<TestObject, Long> {

    List<TestObject> findAll();
}
