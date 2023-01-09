package co.Develhope.Swagger01.controllers;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "")
public class NameController {
    @ApiOperation(value = "returns a name", notes = "returns a name of the path variable")
    @GetMapping(value = "/name/{n}")
    public String yourName(@PathVariable String n){
        return n;
    }
}
