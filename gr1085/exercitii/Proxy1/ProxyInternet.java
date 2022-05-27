package gr1085.exercitii.Proxy1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ProxyInternet implements Internet{
    private Internet internet = new RealInternet();
    private static List<String> bannedSites;

    static
    {
        bannedSites = new ArrayList<String>();
        bannedSites.add("abc.com");
        bannedSites.add("def.com");
        bannedSites.add("ijk.com");
        bannedSites.add("lmn.com");
    }

    @Override
    public void connectTo(String serverhost) throws Exception {
        if (bannedSites.contains(serverhost.toLowerCase())) {
            throw new Exception("Access Denied");
        }

        internet.connectTo(serverhost);
    }
}
