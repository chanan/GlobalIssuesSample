import com.google.inject.Guice;
import com.google.inject.Injector;
import play.GlobalSettings;

/**
 * Created by Chanan on 4/23/2014.
 */
public class Global extends GlobalSettings {
    private final Injector injector = Guice.createInjector(new GuiceModule());

    @Override
    public <A> A getControllerInstance(Class<A> clazz) throws Exception {
        return injector.getInstance(clazz);
    }
}