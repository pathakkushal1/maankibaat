package in.maankibaat.maankibaat.service;

import in.maankibaat.maankibaat.client.DBClient;
import in.maankibaat.maankibaat.model.Input;
import in.maankibaat.maankibaat.model.Result;
import in.maankibaat.maankibaat.model.Slok;
import in.maankibaat.maankibaat.util.ModelMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@AllArgsConstructor(onConstructor = @_(@Autowired))

public class DBService {

    DBClient dbClient;

    ModelMapper modelMapper;

    public Result<Slok> getSlok(int num) {

        Map<String,Object> param  = new HashMap<String,Object>();
        param.put("num",num);
        Input input = Input.builder().query("select * from slok where num= :num").param(param).build();
        Result<List<Map<String,Object>>> slokss = dbClient.query(input);
        return modelMapper.mapSlok(slokss);
    }


    public Result<List<Slok>> getAllSlok() {
        Input input = Input.builder().query("select * from slok").build();
        Result<List<Map<String,Object>>> slokss = dbClient.query(input);
        return modelMapper.mapSloks(slokss);
    }



}
