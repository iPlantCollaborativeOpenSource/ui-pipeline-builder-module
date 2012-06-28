/* * Copyright 2012 Oregon State University.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 * 
 */
package org.iplant.pipeline.client.json;

import java.io.Serializable;

public class IPCType implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8286026843520090390L;
	protected int id;
	private int dragAction = 0;

	protected IPCType() {
	}

	public IPCType(int id) {
		this.id = id;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDragAction() {
		return dragAction;
	}

	public void setDragAction(int action) {
		dragAction = action;
	}

}
