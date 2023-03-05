package ma.geo.local.repositories;

import ma.geo.local.dtos.StudentDTO;
import ma.geo.local.entities.StudentEntity;

import java.util.List;

public interface StudentRepository {

    StudentEntity save(StudentEntity entity);

    StudentEntity update(StudentEntity entity);

    boolean delete(Long id);

    List<StudentEntity> selectAll();
}
