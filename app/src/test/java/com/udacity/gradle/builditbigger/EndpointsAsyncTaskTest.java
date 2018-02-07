package com.udacity.gradle.builditbigger;

/**
 * Created by Harmoush on 2/7/2018.
 */
import android.content.Context;

import com.udacity.gradle.builditbigger.EndpointsAsyncTask;
import org.mockito.Mock;
import org.junit.Test;

public class EndpointsAsyncTaskTest {
    @Mock
    Context context;
    @Test
    public void verifyEndpointsResponse() {

        try {
            String joke = new EndpointsAsyncTask().execute(context).get();
            assert (joke!=null);
            assert(!(joke.equals("fun and fun equal fun!!")));
        } catch (Exception e) {
            e.fillInStackTrace();
        }


    }

}
