package ECommerce.Core.Adapters;

import ECommerce.Entities.Concretes.User;
import ECommerce.GoogleAuth.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements AuthServiceExternal{
    private final GoogleAuthManager googleAuthManager;

    public GoogleAuthManagerAdapter() {
        this.googleAuthManager = new GoogleAuthManager();
    }

    public void register(User user) {
        googleAuthManager.register(user);
    }

    public void login(User user) {
        googleAuthManager.login(user);
    }
}
