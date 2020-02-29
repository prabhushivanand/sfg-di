package guru.springframework.sfgdi.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements GreetingService {


    @Override
    public String sayGreeting( String myGreeting) {
        return myGreeting;
    }
}
