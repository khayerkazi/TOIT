/*
 *************************************************************************
 * The contents of this file are subject to the Openbravo  Public  License
 * Version  1.1  (the  "License"),  being   the  Mozilla   Public  License
 * Version 1.1  with a permitted attribution clause; you may not  use this
 * file except in compliance with the License. You  may  obtain  a copy of
 * the License at http://www.openbravo.com/legal/license.html
 * Software distributed under the License  is  distributed  on  an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific  language  governing  rights  and  limitations
 * under the License.
 * The Original Code is Openbravo ERP.
 * The Initial Developer of the Original Code is Openbravo SLU
 * All portions are Copyright (C) 2008-2011 Openbravo SLU
 * All Rights Reserved.
 * Contributor(s):  ______________________________________.
 ************************************************************************
*/
package org.openbravo.client.myob;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.client.application.ParameterValue;
import org.openbravo.model.ad.access.Role;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
/**
 * Entity class for entity OBKMO_WidgetInstance (stored in table OBKMO_Widget_Instance).
 *
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class WidgetInstance extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "OBKMO_Widget_Instance";
    public static final String ENTITY_NAME = "OBKMO_WidgetInstance";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_CLIENT = "client";
    public static final String PROPERTY_ORGANIZATION = "organization";
    public static final String PROPERTY_ACTIVE = "active";
    public static final String PROPERTY_CREATIONDATE = "creationDate";
    public static final String PROPERTY_CREATEDBY = "createdBy";
    public static final String PROPERTY_UPDATED = "updated";
    public static final String PROPERTY_UPDATEDBY = "updatedBy";
    public static final String PROPERTY_WIDGETCLASS = "widgetClass";
    public static final String PROPERTY_COPIEDFROM = "copiedFrom";
    public static final String PROPERTY_COLUMNPOSITION = "columnPosition";
    public static final String PROPERTY_SEQUENCEINCOLUMN = "sequenceInColumn";
    public static final String PROPERTY_VISIBLEATROLE = "visibleAtRole";
    public static final String PROPERTY_VISIBLEATUSER = "visibleAtUser";
    public static final String PROPERTY_RELATIVEPRIORITY = "relativePriority";
    public static final String PROPERTY_OBKMOWIDGETINSTANCECOPIEDFROMLIST = "oBKMOWidgetInstanceCopiedFromList";
    public static final String PROPERTY_OBUIAPPPARAMETERVALUEEMOBKMOWIDGETINSTANCEIDLIST = "oBUIAPPParameterValueEMObkmoWidgetInstanceIDList";

    public WidgetInstance() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_CREATIONDATE, new Date());
        setDefaultValue(PROPERTY_UPDATED, new Date());
        setDefaultValue(PROPERTY_COLUMNPOSITION, (long) 0);
        setDefaultValue(PROPERTY_SEQUENCEINCOLUMN, (long) 1);
        setDefaultValue(PROPERTY_OBKMOWIDGETINSTANCECOPIEDFROMLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_OBUIAPPPARAMETERVALUEEMOBKMOWIDGETINSTANCEIDLIST, new ArrayList<Object>());
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    public String getId() {
        return (String) get(PROPERTY_ID);
    }

    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    public Client getClient() {
        return (Client) get(PROPERTY_CLIENT);
    }

    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }

    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }

    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }

    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    public User getCreatedBy() {
        return (User) get(PROPERTY_CREATEDBY);
    }

    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }

    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    public User getUpdatedBy() {
        return (User) get(PROPERTY_UPDATEDBY);
    }

    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    public WidgetClass getWidgetClass() {
        return (WidgetClass) get(PROPERTY_WIDGETCLASS);
    }

    public void setWidgetClass(WidgetClass widgetClass) {
        set(PROPERTY_WIDGETCLASS, widgetClass);
    }

    public WidgetInstance getCopiedFrom() {
        return (WidgetInstance) get(PROPERTY_COPIEDFROM);
    }

    public void setCopiedFrom(WidgetInstance copiedFrom) {
        set(PROPERTY_COPIEDFROM, copiedFrom);
    }

    public Long getColumnPosition() {
        return (Long) get(PROPERTY_COLUMNPOSITION);
    }

    public void setColumnPosition(Long columnPosition) {
        set(PROPERTY_COLUMNPOSITION, columnPosition);
    }

    public Long getSequenceInColumn() {
        return (Long) get(PROPERTY_SEQUENCEINCOLUMN);
    }

    public void setSequenceInColumn(Long sequenceInColumn) {
        set(PROPERTY_SEQUENCEINCOLUMN, sequenceInColumn);
    }

    public Role getVisibleAtRole() {
        return (Role) get(PROPERTY_VISIBLEATROLE);
    }

    public void setVisibleAtRole(Role visibleAtRole) {
        set(PROPERTY_VISIBLEATROLE, visibleAtRole);
    }

    public User getVisibleAtUser() {
        return (User) get(PROPERTY_VISIBLEATUSER);
    }

    public void setVisibleAtUser(User visibleAtUser) {
        set(PROPERTY_VISIBLEATUSER, visibleAtUser);
    }

    public Long getRelativePriority() {
        return (Long) get(PROPERTY_RELATIVEPRIORITY);
    }

    public void setRelativePriority(Long relativePriority) {
        set(PROPERTY_RELATIVEPRIORITY, relativePriority);
    }

    @SuppressWarnings("unchecked")
    public List<WidgetInstance> getOBKMOWidgetInstanceCopiedFromList() {
        return (List<WidgetInstance>) get(PROPERTY_OBKMOWIDGETINSTANCECOPIEDFROMLIST);
    }

    public void setOBKMOWidgetInstanceCopiedFromList(List<WidgetInstance> oBKMOWidgetInstanceCopiedFromList) {
        set(PROPERTY_OBKMOWIDGETINSTANCECOPIEDFROMLIST, oBKMOWidgetInstanceCopiedFromList);
    }

    @SuppressWarnings("unchecked")
    public List<ParameterValue> getOBUIAPPParameterValueEMObkmoWidgetInstanceIDList() {
        return (List<ParameterValue>) get(PROPERTY_OBUIAPPPARAMETERVALUEEMOBKMOWIDGETINSTANCEIDLIST);
    }

    public void setOBUIAPPParameterValueEMObkmoWidgetInstanceIDList(List<ParameterValue> oBUIAPPParameterValueEMObkmoWidgetInstanceIDList) {
        set(PROPERTY_OBUIAPPPARAMETERVALUEEMOBKMOWIDGETINSTANCEIDLIST, oBUIAPPParameterValueEMObkmoWidgetInstanceIDList);
    }

}
