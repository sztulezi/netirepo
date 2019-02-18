package com.neti.mentoring;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

// az osztaly celjat nem teljesen ertem... valoszinuleg ide kerulnenek a web reteg bean-jei
// @Configuration: @Component is egyben, valamint itt adhatok meg a spring contextben elo custom bean-ek is
// @EnableWebMvc: bekapcsolja a Controller, RequestMapping, stb annotaciokat feldolgozo processort

@Configuration
@EnableWebMvc
public class WebConfig {

}
