package controllers;

import com.google.inject.Inject;
import services.ParentStringService;
import play.mvc.*;

public class Application extends Controller {
    private final ParentStringService parentStringService;

    @Inject
    public Application(ParentStringService parentStringService) {
        this.parentStringService = parentStringService;
    }

    public Result index()  {
        return ok(module.views.html.main.render(parentStringService.MakeLower("HELLO")));
    }
}