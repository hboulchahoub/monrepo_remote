package ma.geo.local.controllers;

import ma.geo.local.dtos.StudentDTO;
import ma.geo.local.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public StudentDTO save(StudentDTO dto) {
        return studentService.save(dto);
    }

    @PutMapping
    public StudentDTO update(StudentDTO dto) {
        return studentService.update(dto);
    }

    @DeleteMapping
    public boolean delete(Long id) {
        return studentService.delete(id);
    }

    @GetMapping
    public List<StudentDTO> selectAll() {
        return studentService.selectAll();
    }
}
