package com.mcppatternwithjunit;

/**
 * Created by INFYZO\shailesh.pateliya on 19/12/17.
 */

class LoginService {
    public boolean login(String james, String bond) {
        return james.equals("james") && bond.equals("bond");
    }
}
