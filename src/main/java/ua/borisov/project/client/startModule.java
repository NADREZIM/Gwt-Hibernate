package ua.borisov.project.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import ua.borisov.project.client.ui.Login;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class startModule implements EntryPoint {
    public void onModuleLoad() {
        RootPanel.get("main").add(new Login());
    }

}