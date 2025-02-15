/*
 * Copyright 2001-2004 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Contributors:  Christian Trutz <christian.trutz@belaso.de>
package org.apache.log4j;

import java.io.IOException;

/**
 * This class is a minimal implementation of the original Log4J class.
 * 
 * @author Christian Trutz 
 * */
public class RollingFileAppender {

    public RollingFileAppender() {
        super();
    }

    public RollingFileAppender(Layout layout, String filename) throws IOException {
        super();
    }

    public RollingFileAppender(Layout layout, String filename, boolean append) throws IOException {
        super();
    }

    public void setMaxBackupIndex(int maxBackups) {
        // nothing to do
    }

    public void setMaximumFileSize(long maxFileSize) {
        // nothing to do
    }
	
	public void setMaxFileSize(String maxFileSize){
		
	}

  public void setName(String name) {  }
  
}
