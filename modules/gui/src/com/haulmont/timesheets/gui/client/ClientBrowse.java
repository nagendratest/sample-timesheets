/*
 * Copyright (c) 2016 Haulmont
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.haulmont.timesheets.gui.client;

import com.haulmont.cuba.gui.WindowManager;
import com.haulmont.cuba.gui.components.AbstractLookup;
import com.haulmont.cuba.gui.components.actions.CreateAction;
import com.haulmont.cuba.gui.components.actions.EditAction;

import javax.inject.Named;
import java.util.Map;

/**
 * @author gorelov
 */
public class ClientBrowse extends AbstractLookup {

    @Named("clientsTable.create")
    protected CreateAction clientsTableCreate;
    @Named("clientsTable.edit")
    protected EditAction clientsTableEdit;

    @Override
    public void init(Map<String, Object> params) {
        clientsTableCreate.setOpenType(WindowManager.OpenType.DIALOG);
        clientsTableEdit.setOpenType(WindowManager.OpenType.DIALOG);
    }
}