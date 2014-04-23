import com.google.inject.AbstractModule;
import module.services.StringService;
import module.services.StringServiceImpl;

/**
 * Created by Chanan on 4/23/2014.
 */
public class GuiceModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(StringService.class).to(StringServiceImpl.class);
    }
}