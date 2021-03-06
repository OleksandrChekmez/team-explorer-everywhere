// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.build.buildservice._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.build.buildservice._03._BuildQueueWebServiceSoap_UpdateBuilds;
import ms.tfs.build.buildservice._03._QueuePriority;
import ms.tfs.build.buildservice._03._QueuedBuildUpdate;
import ms.tfs.build.buildservice._03._QueuedBuildUpdateOptions;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _BuildQueueWebServiceSoap_UpdateBuilds
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected _QueuedBuildUpdateOptions[] updates;

    public _BuildQueueWebServiceSoap_UpdateBuilds()
    {
        super();
    }

    public _BuildQueueWebServiceSoap_UpdateBuilds(final _QueuedBuildUpdateOptions[] updates)
    {
        // TODO : Call super() instead of setting all fields directly?
        setUpdates(updates);
    }

    public _QueuedBuildUpdateOptions[] getUpdates()
    {
        return this.updates;
    }

    public void setUpdates(_QueuedBuildUpdateOptions[] value)
    {
        this.updates = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        if (this.updates != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("updates");

            for (int iterator0 = 0; iterator0 < this.updates.length; iterator0++)
            {
                this.updates[iterator0].writeAsElement(
                    writer,
                    "QueuedBuildUpdateOptions");
            }

            writer.writeEndElement();
        }

        writer.writeEndElement();
    }
}
