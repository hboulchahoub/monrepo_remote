package ma.geo.local.mappers;

import ma.geo.local.dtos.StudentDTO;
import ma.geo.local.entities.StudentEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StudentMapper {

    public StudentEntity convertDtoToEntity(StudentDTO dto) {
        StudentEntity entity = new StudentEntity();
        entity.setName(dto.getName());
        entity.setId(dto.getId());
        return entity;
    }

    public List<StudentEntity> convertDtosToEntities(List<StudentDTO> dtos) {
        return dtos.stream()
                .map(dto -> convertDtoToEntity(dto))
                .collect(Collectors.toList());
    }

    public StudentDTO convertEntityToDto(StudentEntity entity) {
        StudentDTO dto = new StudentDTO();
        dto.setName(entity.getName());
        dto.setId(entity.getId());
        return dto;
    }

    public List<StudentDTO> convertEntityToDto(List<StudentEntity> entities) {
        return entities.stream().map(entity -> convertEntityToDto(entity)).collect(Collectors.toList());
    }
}
