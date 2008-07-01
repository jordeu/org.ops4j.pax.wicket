/*
 * Copyright 2006 Niclas Hedhman.
 *
 * Licensed  under the  Apache License,  Version 2.0  (the "License");
 * you may not use  this file  except in  compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed  under the  License is distributed on an "AS IS" BASIS,
 * WITHOUT  WARRANTIES OR CONDITIONS  OF ANY KIND, either  express  or
 * implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ops4j.pax.wicket.samples.departmentstore.service.basic.internal;

import org.ops4j.pax.wicket.samples.departmentstore.model.DepartmentStore;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator
    implements BundleActivator
{

    private ServiceRegistration m_registration;

    public void start( BundleContext context )
        throws Exception
    {
        DepartmentStoreImpl store = new DepartmentStoreImpl( "Sungei Wang Plaza" );
        m_registration = context.registerService( DepartmentStore.class.getName(), store, null );
    }

    public void stop( BundleContext context )
        throws Exception
    {
        m_registration.unregister();
    }
}
