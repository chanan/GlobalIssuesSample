package module.controllers;

import com.google.inject.Inject;
import module.services.StringService;
import play.mvc.*;

public class Application extends Controller {
    private final StringService stringService;

    @Inject
    public Application(StringService stringService) {
        this.stringService = stringService;
    }

    public Result index()  {
        return ok(module.views.html.main.render(stringService.MakeUpperCase("hello")));
    }
}