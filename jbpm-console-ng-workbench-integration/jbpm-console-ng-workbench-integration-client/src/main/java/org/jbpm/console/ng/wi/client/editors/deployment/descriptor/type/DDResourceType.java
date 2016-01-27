/*
 * Copyright 2015 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

package org.jbpm.console.ng.wi.client.editors.deployment.descriptor.type;

import javax.enterprise.context.ApplicationScoped;

import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.IsWidget;
import org.jbpm.console.ng.wi.client.i18n.Constants;
import org.jbpm.console.ng.wi.dd.type.DDResourceTypeDefinition;


import org.uberfire.client.resources.UberfireResources;
import org.uberfire.client.workbench.type.ClientResourceType;

@ApplicationScoped
public class DDResourceType extends DDResourceTypeDefinition implements ClientResourceType {

    private static final Image IMAGE = new Image( UberfireResources.INSTANCE.images().typeGenericFile() );

    @Override
    public IsWidget getIcon() {
        return IMAGE;
    }

    @Override
    public String getDescription() {
        String desc = Constants.INSTANCE.Deployment();
        if ( desc == null || desc.isEmpty() ) return super.getDescription();
        return desc;
    }

}