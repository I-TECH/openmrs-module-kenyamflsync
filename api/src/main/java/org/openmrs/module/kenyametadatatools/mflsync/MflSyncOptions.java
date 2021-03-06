/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */

package org.openmrs.module.kenyametadatatools.mflsync;

import org.openmrs.LocationAttributeType;
import org.openmrs.module.kenyametadatatools.MetadataToolsConstants;

/**
 * Options for MFL synchronization
 */
public class MflSyncOptions {

	private LocationAttributeType attributeType;

	private String spreadsheetUrl;

	public MflSyncOptions() {
		this.spreadsheetUrl = MetadataToolsConstants.DEFAULT_MFL_SYNC_URL;
	}

	public LocationAttributeType getAttributeType() {
		return attributeType;
	}

	public void setAttributeType(LocationAttributeType attributeType) {
		this.attributeType = attributeType;
	}

	public String getSpreadsheetUrl() {
		return spreadsheetUrl;
	}

	public void setSpreadsheetUrl(String spreadsheetUrl) {
		this.spreadsheetUrl = spreadsheetUrl;
	}
}