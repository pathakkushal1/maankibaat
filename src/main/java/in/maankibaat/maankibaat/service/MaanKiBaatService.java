package in.maankibaat.maankibaat.service;

import in.maankibaat.maankibaat.model.Result;
import in.maankibaat.maankibaat.model.Slok;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor(onConstructor = @_(@Autowired))
public class MaanKiBaatService {

    DBService dbService;

    public ResponseEntity<Result<List<Slok>>> getAllSlok() {
        Result<List<Slok>> result = dbService.getAllSlok();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    public ResponseEntity<Result<Slok>> getSlok(int num) {
        Result<Slok> result = dbService.getSlok(num);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
