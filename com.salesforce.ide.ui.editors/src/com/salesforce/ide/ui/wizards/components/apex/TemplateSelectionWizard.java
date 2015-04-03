/*******************************************************************************
 * Copyright (c) 2015 Salesforce.com, inc..
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *     Salesforce.com, inc. - initial API and implementation
 ******************************************************************************/
package com.salesforce.ide.ui.wizards.components.apex;

import com.salesforce.ide.ui.editors.ForceIdeEditorsPlugin;
import com.salesforce.ide.ui.wizards.components.ComponentWizard;

public abstract class TemplateSelectionWizard extends ComponentWizard {

    public TemplateSelectionWizard() {
        setDialogSettings(ForceIdeEditorsPlugin.getDefault().getDialogSettings());
    }

}
