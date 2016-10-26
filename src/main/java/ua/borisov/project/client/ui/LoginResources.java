package ua.borisov.project.client.ui;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;

/**
 * Created by User on 23.10.2016.
 */
public interface LoginResources extends ClientBundle {
    public interface MyCss extends CssResource {
        String displayBlock();
    }

    @Source("style.css")
    MyCss style();
}