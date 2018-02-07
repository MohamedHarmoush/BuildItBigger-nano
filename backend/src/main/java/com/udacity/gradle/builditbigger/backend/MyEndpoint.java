package com.udacity.gradle.builditbigger.backend;

import com.example.harmoush.javalibrary.Joker;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;


import javax.inject.Named;

/** An endpoint class we are exposing */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    /** A simple endpoint method that takes a name and says Hi back */
    @ApiMethod(name = "sendJoke")
    public MyBean sendJoke() {
        MyBean response = new MyBean();
        Joker mJoker = new Joker();
        String joke = mJoker.getJoke();
        response.setData(joke);

        return response;
    }

}
