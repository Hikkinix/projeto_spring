package com.praticas.gameslist.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GameAspect {

    @Before("execution(* com.praticas.gameslist.services.*.findAll*(..))")
    public void registrarLog() {
        System.out.println("Aspecto: Consulta Reaelizada com sucesso");
    }

}
