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
package org.iplant.pipeline.client.images;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.DataResource;

public interface Resources extends ClientBundle {
	public static final Resources INSTANCE = GWT.create(Resources.class);

	@Source("down.png")
	DataResource down();
	
	@Source("add.png")
	DataResource add();
	
	@Source("trash_can_open.png")
	DataResource trashOpen();
	
	@Source("trash_can_close.png")
	DataResource trashClose();
	
	@Source("wrench.png")
	DataResource wrench();
	
	@Source("accept.png")
	DataResource accept();
	
	@Source("cancel.png")
	DataResource cancel();
	

}
