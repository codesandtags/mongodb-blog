package org.codesandtags;

import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;

/**
 * Created by Edwin on 8/08/2015.
 */
public class HelloWorldSpark {

    public static void main(String[] args) {
        Spark.get("/", new Route() {
            public Object handle(Request request, Response response) throws Exception {
                return "Hello Muchacho";
            }
        });
    }
}
