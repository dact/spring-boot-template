package com.example.template;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class ApiRest {

    @GetMapping(path = "/")
    public ResponseEntity commandName() {
        return new ResponseEntity<>("get", HttpStatus.OK);
    }

    @PostMapping(path = "/")
    public ResponseEntity commandNamePost(@RequestBody String value) {
        return new ResponseEntity<>("Post:"+value, HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity commandNameDelete(@PathVariable String id) {
        return new ResponseEntity<>("Delete:"+id, HttpStatus.OK);
    }

    /*update entery resource*/
    @PutMapping(path = "/")
    public ResponseEntity commandNamePut(@RequestBody String value) {
        return new ResponseEntity<>("Put:"+value, HttpStatus.OK);
    }

    /*only update some atributes*/
    @PatchMapping(path = "/")
    public ResponseEntity commandNamePatch(@RequestBody String value) {
        return new ResponseEntity<>("Patch:"+value, HttpStatus.OK);
    }


}
