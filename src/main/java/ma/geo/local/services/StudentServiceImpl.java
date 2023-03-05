package ma.geo.local.services;

import ma.geo.local.dtos.StudentDTO;
import ma.geo.local.mappers.StudentMapper;
import ma.geo.local.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public StudentDTO save(StudentDTO dto) {
        return studentMapper.convertEntityToDto(studentRepository.save(studentMapper.convertDtoToEntity(dto)));
    }

    @Override
    public StudentDTO update(StudentDTO dto) {
        return studentMapper.convertEntityToDto(studentRepository.update(studentMapper.convertDtoToEntity(dto)));
    }

    @Override
    public boolean delete(Long id) {
        return studentRepository.delete(id);
    }

    @Override
    public List<StudentDTO> selectAll() {
        return studentMapper.convertEntityToDto(studentRepository.selectAll());
    }
}
