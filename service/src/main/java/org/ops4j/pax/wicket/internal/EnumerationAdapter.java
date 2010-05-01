/*
 * Copyright 2010 David Leangen.
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
package org.ops4j.pax.wicket.internal;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationAdapter<E>
    implements Iterator<E>
{
    private final Enumeration<E> m_enumeration;

    public EnumerationAdapter( Enumeration<E> enumeration )
    {
        m_enumeration = enumeration;
    }

    public boolean hasNext()
    {
        return m_enumeration.hasMoreElements();
    }

    public E next()
    {
        return m_enumeration.nextElement();
    }

    public void remove()
    {
        throw new UnsupportedOperationException();
    }
}
