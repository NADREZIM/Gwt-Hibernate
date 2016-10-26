package ua.borisov.project.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.*;
import ua.borisov.project.client.GreetingService;
import ua.borisov.project.client.GreetingServiceAsync;
import ua.borisov.project.client.Messages;
import ua.borisov.project.client.secondModule.SecondModule;


/**
 * Created by User on 23.10.2016.
 */
public class Login extends Composite {

    private GreetingServiceAsync greetingService = GWT.create(GreetingService.class);
    public Login(){
        this.res = GWT.create(LoginResources.class);
        res.style().ensureInjected();
        initWidget(uiBinder.createAndBindUi(this));

        loginLabel.setText(messages.loginLabel());
        passwordLabel.setText(messages.passwordLabel());
    }
    private static LoginUIBinder uiBinder = GWT.create(LoginUIBinder.class);

    @UiField(provided = true)
    LoginResources res;

    @UiField
    Label loginLabel;

    @UiField
    TextBox loginField;

    @UiField
    Label passwordLabel;

    @UiField
    TextBox passwordField;

    @UiField
    SubmitButton loginButton;

    @UiField
    Label error;

    private final Messages messages = GWT.create(Messages.class);

    @UiTemplate("Login.ui.xml")
    interface LoginUIBinder extends UiBinder<Widget,Login>{

    }

    public void setLoginLabel(String value){
        passwordLabel.setText(value);
    }

    public void setPasswordLabel(String value){
        passwordLabel.setText(value);
    }

    public void setErrorLabel(String value){
        error.setText(value);
    }

    @UiHandler("loginButton")
    void handleClick(ClickEvent e){
        greetingService.greetServer(loginField.getValue(),passwordField.getValue(), new AsyncCallback<String>() {
            public void onFailure(Throwable caught) {
              setErrorLabel( messages.error());

            }

            public void onSuccess(String result) {
                removeFromParent();
                RootPanel.get("main").add(new SecondModule(result));
            }
        });
    }
}
