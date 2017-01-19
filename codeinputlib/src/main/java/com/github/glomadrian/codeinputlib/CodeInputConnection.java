package com.github.glomadrian.codeinputlib;

import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;

class CodeInputConnection extends BaseInputConnection {

    CodeInputConnection(View targetView, boolean fullEditor) {
        super(targetView, fullEditor);
    }

    @Override
    public boolean deleteSurroundingText(int beforeLength, int afterLength) {
        sendKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_DEL));
        return true;
    }
}
