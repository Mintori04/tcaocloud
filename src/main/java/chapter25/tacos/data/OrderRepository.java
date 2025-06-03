package chapter25.tacos.data;

import chapter25.tacos.TacoOrder;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<TacoOrder, String> {


}
