package ua.borisov.project.client.secondModule;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import ua.borisov.project.client.ui.Login;

/**
 * Created by User on 23.10.2016.
 */
public class SecondModule extends Composite {

    @UiTemplate("SecondModule.ui.xml")
    interface SecondModuleUiBinder extends UiBinder<Widget, SecondModule> {
    }

    private static SecondModuleUiBinder ourUiBinder = GWT.create(SecondModuleUiBinder.class);
    @UiField
    Label nameLb;

    @UiField(provided = true)
    SecondModuleResouces res;

    public SecondModule() {

    }
    public SecondModule(String name){
        this.res = GWT.create(SecondModuleResouces.class);
        res.style().ensureInjected();
        initWidget(ourUiBinder.createAndBindUi(this));
       setNameLb(name);
    }
    @UiHandler("logout")
    void onMyScriptedAnchorClick(ClickEvent event) {
        removeFromParent();
        RootPanel.get("main").add(new Login());
    }

    public void setNameLb(String value){
        nameLb.setText(value);
    }
}
