package ECommerce.Core.Adapters;

import ECommerce.Entities.Concretes.User;

public interface AuthServiceExternal {
    void register(User user);
    void login(User user);
}
