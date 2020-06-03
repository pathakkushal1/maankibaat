package in.maankibaat.maankibaat.client;

import in.maankibaat.maankibaat.config.ServiceProperties;
import in.maankibaat.maankibaat.model.Input;
import in.maankibaat.maankibaat.model.Result;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

@Component
@AllArgsConstructor(onConstructor = @_(@Autowired))
public class DBClient {



    ServiceProperties serviceProperties;

    DBUserClinet dbUserClinet;


    @FeignClient(name="DBClient", url="${service.props.db.url}")
    public interface DBUserClinet{

        @RequestMapping(method = RequestMethod.POST, value = "/query")
        public Result<List<Map<String,Object>>> query(Input input);

    }

    public Result<List<Map<String,Object>>> query(Input input){
        return dbUserClinet.query(input);
    }

}
