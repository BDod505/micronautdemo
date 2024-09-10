package example.micronaut.controller;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import io.micronaut.security.annotation.Secured;
import io.micronaut.security.rules.SecurityRule;

import java.security.Principal;
@Secured(SecurityRule.IS_AUTHENTICATED) // <1>
@Controller("/basic-auth")
public class DemoController {
    @Produces(MediaType.TEXT_PLAIN)
    @Get
    String index(Principal principal) {
        return principal.getName();
}
}

