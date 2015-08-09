package org.codesandtags;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

public class HelloWorldFreemarker {

    public static void main(String[] args) {
        Configuration configuration = new Configuration(Configuration.VERSION_2_3_23);
        configuration.setClassForTemplateLoading(HelloWorldFreemarker.class, "/");

        try {
            Template helloTemplate = configuration.getTemplate("hello.flt");
            StringWriter writter = new StringWriter();
            Map<String, Object> parameters = new HashMap();
            parameters.put("name", "Cocoman");
            helloTemplate.process(parameters, writter);
            System.out.println(" => " + writter);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TemplateException e) {
            e.printStackTrace();
        }
    }
}
