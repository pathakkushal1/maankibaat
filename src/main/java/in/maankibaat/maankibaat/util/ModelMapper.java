package in.maankibaat.maankibaat.util;

import in.maankibaat.maankibaat.model.Result;
import in.maankibaat.maankibaat.model.Slok;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Component
public class ModelMapper {

    public Result<List<Slok>> mapSloks(Result<List<Map<String,Object>>> inputSlok){

        List<Slok> sloks = new ArrayList<>();
        Slok slok;

        List<Map<String,Object>> list = inputSlok.getResult();
        for (Map<String,Object> f :list) {
            slok = Slok.builder().name(f.get("name").toString())
                    .num((int)f.get("num"))
                    .line1(f.get("line1").toString())
                    .line2(f.get("line2").toString())
                    .line3(f.get("line3").toString())
                    .line4(f.get("line4").toString()).build();
            sloks.add(slok);
        }
        return new Result<>(Arrays.asList("Success"),sloks);
    }

    public Result<Slok> mapSlok(Result<List<Map<String,Object>>> inputSlok){


        Slok slok = null;

        List<Map<String,Object>> list = inputSlok.getResult();
        for (Map<String,Object> f :list) {
            slok = Slok.builder().name(f.get("name").toString())
                    .num((int)f.get("num"))
                    .line1(f.get("line1").toString())
                    .line2(f.get("line2").toString())
                    .line3(f.get("line3").toString())
                    .line4(f.get("line4").toString()).build();

        }
        return new Result<>(Arrays.asList("Success"),slok);
    }
}
