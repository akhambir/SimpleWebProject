package com.akhambir.DAO.interfaces;

import com.akhambir.model.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskDAO extends CrudRepository<Task, Long> {

}
