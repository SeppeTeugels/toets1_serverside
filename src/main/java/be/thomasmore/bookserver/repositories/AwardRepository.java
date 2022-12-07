package be.thomasmore.bookserver.repositories;
import be.thomasmore.bookserver.model.Award;
import be.thomasmore.bookserver.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.lang.NonNull;

import java.util.List;

public interface AwardRepository extends CrudRepository<Award, Integer> {

    @NonNull
    List<Award> findAll();

    List<Award> findByTitleContainingIgnoreCase(String titleKeyWord);
    List<Award> findByInfoContainingIgnoreCase(String titleKeyWord);

}
