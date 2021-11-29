package scopes;

import netscape.javascript.JSObject;

public class NasScope implements Scope{
    @Override
    public JSObject getScopeRepresentation() {
        System.out.println("This is a nas class ");
        return null;
    }
}
