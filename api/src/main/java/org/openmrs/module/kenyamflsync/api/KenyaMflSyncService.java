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

package org.openmrs.module.kenyamflsync.api;

import org.openmrs.api.OpenmrsService;
import org.openmrs.module.kenyamflsync.task.BaseSynchronizeTask;
import org.springframework.transaction.annotation.Transactional;

import java.net.URL;

/**
 * Module service interface
 */
@Transactional
public interface KenyaMflSyncService extends OpenmrsService {

	/**
	 * Internal only. Executes a synchronization task in a transaction
	 * @param task the task to execute
	 */
	void executeTask(BaseSynchronizeTask task);
}