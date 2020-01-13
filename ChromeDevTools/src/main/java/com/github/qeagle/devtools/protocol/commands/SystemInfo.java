package com.github.qeagle.devtools.protocol.commands;

/*-
 * #%L
 * cdt-java-client
 * %%
 * Copyright (C) 2018 - 2019 TL
 * %%
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
 * #L%
 */

import com.github.qeagle.devtools.protocol.support.annotations.Experimental;
import com.github.qeagle.devtools.protocol.support.annotations.ReturnTypeParameter;
import com.github.qeagle.devtools.protocol.support.annotations.Returns;
import com.github.qeagle.devtools.protocol.types.systeminfo.Info;
import com.github.qeagle.devtools.protocol.types.systeminfo.ProcessInfo;
import java.util.List;

/** The SystemInfo domain defines methods and events for querying low-level system information. */
@Experimental
public interface SystemInfo {

  /** Returns information about the system. */
  Info getInfo();

  /** Returns information about all running processes. */
  @Returns("processInfo")
  @ReturnTypeParameter(ProcessInfo.class)
  List<ProcessInfo> getProcessInfo();
}
