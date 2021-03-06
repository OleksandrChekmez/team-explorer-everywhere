// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.ws;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.ws._IdentityManagementWebServiceSoap_ListApplicationGroups;

import java.lang.String;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _IdentityManagementWebServiceSoap_ListApplicationGroups
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String projectUri;
    protected int options;
    protected int features;
    protected String[] propertyNameFilters;
    protected int propertyScope;

    public _IdentityManagementWebServiceSoap_ListApplicationGroups()
    {
        super();
    }

    public _IdentityManagementWebServiceSoap_ListApplicationGroups(
        final String projectUri,
        final int options,
        final int features,
        final String[] propertyNameFilters,
        final int propertyScope)
    {
        // TODO : Call super() instead of setting all fields directly?
        setProjectUri(projectUri);
        setOptions(options);
        setFeatures(features);
        setPropertyNameFilters(propertyNameFilters);
        setPropertyScope(propertyScope);
    }

    public String getProjectUri()
    {
        return this.projectUri;
    }

    public void setProjectUri(String value)
    {
        this.projectUri = value;
    }

    public int getOptions()
    {
        return this.options;
    }

    public void setOptions(int value)
    {
        this.options = value;
    }

    public int getFeatures()
    {
        return this.features;
    }

    public void setFeatures(int value)
    {
        this.features = value;
    }

    public String[] getPropertyNameFilters()
    {
        return this.propertyNameFilters;
    }

    public void setPropertyNameFilters(String[] value)
    {
        this.propertyNameFilters = value;
    }

    public int getPropertyScope()
    {
        return this.propertyScope;
    }

    public void setPropertyScope(int value)
    {
        this.propertyScope = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        XMLStreamWriterHelper.writeElement(
            writer,
            "projectUri",
            this.projectUri);
        XMLStreamWriterHelper.writeElement(
            writer,
            "options",
            this.options);
        XMLStreamWriterHelper.writeElement(
            writer,
            "features",
            this.features);

        if (this.propertyNameFilters != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("propertyNameFilters");

            for (int iterator0 = 0; iterator0 < this.propertyNameFilters.length; iterator0++)
            {
                XMLStreamWriterHelper.writeElement(
                    writer,
                    "string",
                    this.propertyNameFilters[iterator0]);
            }

            writer.writeEndElement();
        }

        XMLStreamWriterHelper.writeElement(
            writer,
            "propertyScope",
            this.propertyScope);

        writer.writeEndElement();
    }
}
