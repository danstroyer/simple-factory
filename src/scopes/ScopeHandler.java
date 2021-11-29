package scopes;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ScopeHandler {
    public static void main(String... args) {
        System.out.println("Getting the scope");

        List<String> scopes = new ArrayList<>();
        scopes.add("nas_scope");
        scopes.add("address_scope");

        ScopeService handler = new ScopeService(new SimpleScopeFactory());


        for (String scope : scopes) {

            String scopeClass = Arrays.stream(Scopes.values())
                    .filter(scopes1 -> scopes1.getScopeName()
                            .equalsIgnoreCase(scope))
                    .findAny()
                    .get()
                    .getScopeClass();

            Scope scopeInstance = handler.obtainScope(scopeClass);


            System.out.println(scopeInstance);
        }
    }
}
