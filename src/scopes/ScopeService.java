package scopes;

public class ScopeService {

    SimpleScopeFactory factory;

    protected ScopeService(SimpleScopeFactory factory){
        this.factory = factory;
    }

    /**
     * Service process
     * 1- Obtain jeton
     * 2- Extract the list of scopes from jeton
     * 3- Validate the list is not empty
     * 4- Validate the list has only desired scopes
     * 5- Create the response object
     * 6- Create all the scopes on the list
     *      Here we call the scopes factory
     * 7- Add the scopes to the answerList
     * 8- Send the response into json format
     */

    public Scope obtainScope(String type){
        Scope scope;

        scope = factory.createScope(type);

        return scope;

    }

}
