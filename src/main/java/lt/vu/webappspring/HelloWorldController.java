package lt.vu.webappspring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author Zygimantus
 */
public class HelloWorldController extends AbstractController {

    protected final Logger logger = LogManager.getLogger(this.getClass());

    private static final String MESSAGE = "Hello world";

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request,
            HttpServletResponse response) throws Exception {

        ModelAndView model = new ModelAndView("index");
        model.addObject("msg", MESSAGE);
        
        logger.debug("Message {} was added", MESSAGE);

        return model;
    }
}
