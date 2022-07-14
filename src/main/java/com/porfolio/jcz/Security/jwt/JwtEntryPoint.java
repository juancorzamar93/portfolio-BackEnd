/*
 LO QUE HACE ESTA CLASE ES CHEQUEAR SI HAY UN TOKEN VALIDO
 */
package com.porfolio.jcz.Security.jwt;



import org.slf4j.Logger;


import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

@Component
public class JwtEntryPoint implements AuthenticationEntryPoint {
    private final static Logger logger = LoggerFactory.getLogger(JwtEntryPoint.class);
}
