package ua.borisov.project.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

public class GwtTeststartModule extends GWTTestCase {
    @Override
    public String getModuleName() {
        return "ua.borisov.project.startModuleJUnit";
    }

    public void testGreetingService(){
        GreetingServiceAsync greetingService = GWT.create(GreetingService.class);
        ServiceDefTarget target = (ServiceDefTarget) greetingService;
        target.setServiceEntryPoint(GWT.getModuleBaseURL() + "startModule/greet");

        delayTestFinish(10000);


        greetingService.greetServer("ivan","secret", new AsyncCallback<String>() {
            public void onFailure(Throwable caught) {

                fail("Request failure: " + caught.getMessage());
            }

            public void onSuccess(String result) {

                assertTrue(result.startsWith("1)"));
                finishTest();
            }
        });
    }
}
