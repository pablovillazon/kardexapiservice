package be.jkin.kudosusuariosrest.Controllers;


import be.jkin.kudosusuariosrest.model.Kardex;
import be.jkin.kudosusuariosrest.model.User;
import be.jkin.kudosusuariosrest.queue.Publishier;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1")
public class KardexController {

    @Autowired Publishier publishier;
    private static final Logger LOGGER = LoggerFactory.getLogger(KardexController.class);

    @PostMapping("/kardex")
    public String createKardez(@Valid @RequestBody Kardex kardex)
    {
        ObjectMapper obj = new ObjectMapper();
        try {
            String jsonStr = obj.writeValueAsString(kardex);
            LOGGER.info("Kardex Received:", jsonStr);
            publishier.SendMessageToQueue(jsonStr);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return "Error processing save";
        }catch (Exception e){
            LOGGER.error(e.getMessage());
            return "Error processing save";
        }
        return "Kardex enviado para guardar";
    }

}
