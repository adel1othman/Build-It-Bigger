/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package com.example.adel.builditbigger.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

@Api(
        name = "jokeApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.adel.example.com",
                ownerName = "backend.builditbigger.adel.example.com",
                packagePath = ""))

public class JokeEndpoint {

    @ApiMethod(name = "putJoke")
    public JokeBean putJoke() {
        JokeBean joke = new JokeBean();
        joke.getJoke();
        return joke;
    }
}
