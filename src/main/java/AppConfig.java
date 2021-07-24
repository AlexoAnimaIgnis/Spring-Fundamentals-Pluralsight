import com.pluralsight.repository.HibernateSpeakerRepository;
import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService() {
        SpeakerServiceImpl speakerService = new SpeakerServiceImpl();
        speakerService.setSpeakerRepository(getSpeakerRepository());
        return speakerService;
    }

    @Bean(name = "speakerRepository")
    public HibernateSpeakerRepository getSpeakerRepository() {
        return  new HibernateSpeakerRepositoryImpl();
    }
}
