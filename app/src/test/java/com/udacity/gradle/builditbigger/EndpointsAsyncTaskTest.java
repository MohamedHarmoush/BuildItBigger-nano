package com.udacity.gradle.builditbigger;

/**
 * Created by Harmoush on 2/7/2018.
 */
import android.content.Context;
import android.util.Log;

import com.udacity.gradle.builditbigger.EndpointsAsyncTask;

import org.junit.Assert;
import org.mockito.Mock;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class EndpointsAsyncTaskTest {
    @Mock
    Context context;
    String TAG = EndpointsAsyncTask.class.getSimpleName();
    @Test
    public void verifyEndpointsResponse() {

        try {
            String joke = new EndpointsAsyncTask().execute(context).get();
           //comment
            Log.d(TAG,"joke = "+joke);
            assertNotNull (joke);
            assert(!(joke.equals("fun and fun equal fun!!")));
            Assert.assertTrue(!joke.equals(""));
        } catch (Exception e) {
            e.fillInStackTrace();
        }


    }

}
