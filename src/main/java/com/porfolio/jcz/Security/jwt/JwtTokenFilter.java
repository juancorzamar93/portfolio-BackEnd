/*Esta clase lo que  hace es usar la clase Provider para validar el token otra vez y lo que va hacer es además es ejecutarse cada vez que queramos hacer,
por ejemplo, si vamos hacer modificación se va a ejecutar esta clase primero para validar que el token este correctamente y si no está ahi 
nos va a poder que  ¿loggemos?*/
package com.porfolio.jcz.Security.jwt;

import com.porfolio.jcz.Security.Service.UserDetailsImpl;
import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.filter.OncePerRequestFilter;

public class JwtTokenFilter extends OncePerRequestFilter {

    private final static Logger logger = LoggerFactory.getLogger(JwtProvider.class);

    @Autowired
    JwtProvider jwtProvider;
    @Autowired
    UserDetailsImpl userDetailsServiceImpl;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        try {
            String token = getToken(request);
            if (token != null && jwtProvider.validateToken(token)) {
                String nombreUsuario = jwtProvider.getNombreUsuarioFromToken(token);
                UserDetails userDetails = userDetailsServiceImpl.loadUserByUsername(nombreUsuario);
                UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(userDetails,
                        null, userDetails.getAuthorities());
                SecurityContextHolder.getContext().setAuthentication(auth);
            }
        } catch (Exception e) {
            logger.error("Falló el método doFilterInternal");
        }
        filterChain.doFilter(request, response);

    }
    private String getToken(HttpServletRequest request){
        String header = request.getHeader("Authorization");
                if(header != null && header.startsWith("Bearer"))
                    return header.replace("Bearer", "");
              return null;
    
    }

}
