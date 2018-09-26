package com.lt.cukes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class World {
    public Long id;
    public String response;
    public int statusCode;
}
