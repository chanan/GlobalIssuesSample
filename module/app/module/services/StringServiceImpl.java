package module.services;

/**
 * Created by Chanan on 4/23/2014.
 */
public class StringServiceImpl implements StringService {
    @Override
    public String MakeUpperCase(String in) {
        return in.toUpperCase();
    }
}
