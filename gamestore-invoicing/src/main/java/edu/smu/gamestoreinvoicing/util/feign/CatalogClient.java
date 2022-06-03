package edu.smu.gamestoreinvoicing.util.feign;

import edu.smu.gamestoreinvoicing.model.Console;
import edu.smu.gamestoreinvoicing.model.Game;
import edu.smu.gamestoreinvoicing.model.TShirt;
import edu.smu.gamestoreinvoicing.viewModel.ConsoleViewModel;
import edu.smu.gamestoreinvoicing.viewModel.GameViewModel;
import edu.smu.gamestoreinvoicing.viewModel.TShirtViewModel;
import org.apache.http.impl.ConnSupport;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@FeignClient(name = "gamestore-catalog-service", url = "http://localhost:7474")
public interface CatalogClient {

    @GetMapping(value = "/console/{id}")
    Optional<Console> getConsoleById(@PathVariable long id);

    @PostMapping(value = "/console")
    public Console createConsole(Console console);

    @GetMapping(value = "/tshirt/{id}")
    Optional<TShirt> getTshirtById(@PathVariable long id);

    @PostMapping(value = "/tshirt")
    public TShirt createTshirt(TShirt tShirt);

    @GetMapping(value = "/game/{id}")
    Optional<Game> getGameById(@PathVariable long id);

    @PostMapping(value = "/game")
    public Game createGame(Game game);

}
