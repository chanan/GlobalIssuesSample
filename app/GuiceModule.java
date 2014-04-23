import com.google.inject.AbstractModule;
import services.ParentStringService;
import services.ParentStringServiceImpl;

/**
 * Created by Chanan on 4/23/2014.
 */
public class GuiceModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(ParentStringService.class).to(ParentStringServiceImpl.class);
    }
}