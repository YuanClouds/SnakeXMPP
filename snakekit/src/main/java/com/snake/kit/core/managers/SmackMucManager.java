package com.snake.kit.core.managers;

import android.content.Context;

import org.jivesoftware.smack.AbstractXMPPConnection;

/**
 * Created by Yuan on 2016/11/7.
 * Detail
 */

public class SmackMucManager  extends BaseManager{

    public SmackMucManager(Context context, AbstractXMPPConnection mConnection) {
        super(context, mConnection);
    }
}
