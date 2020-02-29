package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18NService")
public class i18NSpanishGreetingService implements GreetingService {

    @Override
    public String sayGreeting(String myGreeting) {
        return "Howdy Greeting i18NSpanishGreetingService -Spanish";
    }
}
