package scopes;

public enum Scopes {
    NAS_SCOPE("nas_scope", "NasScope"),
    ADDRESS_SCOPE( "address_scope","addressScope");

    private String scopeName;
    private String scopeClass;

    Scopes(String scopeName, String scopeClass){
        this.scopeName = scopeName;
        this.scopeClass = scopeClass;
    }

    public String getScopeName(){
        return this.scopeName;
    }

    public String getScopeClass(){
        return this.scopeClass;
    }

}
