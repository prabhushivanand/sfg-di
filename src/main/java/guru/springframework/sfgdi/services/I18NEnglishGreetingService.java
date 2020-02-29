package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18NService")
public class I18NEnglishGreetingService implements GreetingService{

    @Override
    public String sayGreeting(String myGreeting) {
        return "I18NEnglishGreetingService -English";
    }
}
