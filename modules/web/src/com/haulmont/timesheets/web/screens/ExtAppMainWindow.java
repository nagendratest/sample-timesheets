/*
 * Copyright (c) 2018 com.haulmont.timesheets.web.screens
 */
package com.haulmont.timesheets.web.screens;

import com.haulmont.cuba.gui.WindowManager;
import com.haulmont.cuba.web.app.mainwindow.AppMainWindow;

/**
 * @author Nagendra
 */
public class ExtAppMainWindow extends AppMainWindow {
    @Override
    public void ready() {
        super.ready();
        openWindow("calendar-screen", WindowManager.OpenType.NEW_WINDOW.closeable(false));

    }
}