package com.mcppatternwithjunit;

import android.app.Activity;
import android.content.Intent;

/**
 * Created by INFYZO\shailesh.pateliya on 19/12/17.
 */

public class ActivityUtil {
    private Activity activity;

    public ActivityUtil(Activity activity) {
        this.activity = activity;
    }

    public void startMainActivity(){
        activity.startActivity(new Intent(activity,MainActivity.class));
    }
}
