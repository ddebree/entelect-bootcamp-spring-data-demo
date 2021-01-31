package za.co.entelect.bootcampspringdatademo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.co.entelect.bootcampspringdatademo.dto.Classroom;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/classroom")
public class ClassroomController {

    public ClassroomController() {
    }

    @GetMapping
    public ResponseEntity<List<Classroom>> getClassrooms() {
        //TODO: We should probably get the data from the repo
        return ResponseEntity.ok(new ArrayList<>());
    }
}
