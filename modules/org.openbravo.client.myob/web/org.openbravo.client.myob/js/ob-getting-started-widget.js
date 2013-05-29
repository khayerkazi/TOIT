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
 * All portions are Copyright (C) 2011-2012 Openbravo SLU
 * All Rights Reserved.
 * Contributor(s):  ______________________________________.
 ************************************************************************
 */

// = OBGettingStartedWidget =
//
// Getting Started widget
//
isc.defineClass('OBGettingStartedWidget', isc.OBWidget).addProperties({
  contentSource: null,
  widgetContentUrl: 'https://butler.openbravo.com/heartbeat-server/org.openbravo.butler.communitybranding/CommunityBranding.html' + '?uimode=gettingStarted&language=' + OB.Application.language_string,
  createWindowContents: function () {
    var loc = document.location;

    this.contentSource = this.widgetContentUrl + '&appurl=' + encodeURIComponent(loc.protocol + '//' + loc.hostname + (loc.port ? ':' + loc.port : '') + OB.Application.contextUrl) + '&nocache=' + Math.random();

    return isc.HTMLFlow.create({
      contentsType: 'page',
      contentsURL: this.contentSource,
      height: '100%',
      width: '100%'
    });
  },
  refresh: function () {
    this.windowContents.setContentsURL(this.contentSource);
  }
});