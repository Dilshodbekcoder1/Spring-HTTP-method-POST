package uz.mohirdev.lesson.web.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.mohirdev.lesson.model.Student;

@RestController
@RequestMapping("/api")
public class StudentResource {

 @GetMapping ("/students")
   public ResponseEntity hello() {
        return ResponseEntity.ok("Hello world mohirdev");
   }

 @PostMapping("/students")
 public ResponseEntity create(@RequestBody Student student){
     return ResponseEntity.ok(student);

 }

}
