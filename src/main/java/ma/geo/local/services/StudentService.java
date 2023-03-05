package ma.geo.local.services;

import ma.geo.local.dtos.StudentDTO;

import java.util.List;

public interface StudentService {

    StudentDTO save(StudentDTO dto);

    StudentDTO update(StudentDTO dto);

    boolean delete(Long id);

    List<StudentDTO> selectAll();
}
