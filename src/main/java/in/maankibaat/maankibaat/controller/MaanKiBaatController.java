package in.maankibaat.maankibaat.controller;

import in.maankibaat.maankibaat.model.Result;
import in.maankibaat.maankibaat.model.Slok;
import in.maankibaat.maankibaat.service.MaanKiBaatService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor(onConstructor = @_(@Autowired))
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MaanKiBaatController {

    MaanKiBaatService maanKiBaatService;

    @GetMapping("/getAllSlok")
    public ResponseEntity<Result<List<Slok>>> getAllSlok(){
        return maanKiBaatService.getAllSlok();
    }

    @GetMapping("/getSlok/{num}")
    public ResponseEntity<Result<Slok>> getSlok(@PathVariable int num){
        return maanKiBaatService.getSlok(num);
    }

}
