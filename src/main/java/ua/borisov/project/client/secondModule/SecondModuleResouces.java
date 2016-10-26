package ua.borisov.project.client.secondModule;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;

/**
 * Created by User on 23.10.2016.
 */
public interface SecondModuleResouces extends ClientBundle {
    public interface MyCss extends CssResource {

    }

    @Source("style.css")
    MyCss style();
}
