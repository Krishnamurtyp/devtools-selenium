package com.github.qeagle.devtools.launch.exceptions;

/*-
 * #%L
 * cdt-java-client
 * %%
 * Copyright (C) 2018 TL
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

/**
 * Chrome process exception raised when error occurs during chrome startup.
 *
 * @author TestLeaf
 */
public class ChromeProcessException extends RuntimeException {
  /**
   * Instantiates a new Chrome process exception.
   *
   * @param message Message.
   */
  public ChromeProcessException(String message) {
    super(message);
  }

  /**
   * Instantiates a new Chrome process exception.
   *
   * @param message Message.
   * @param cause Root exception cause.
   */
  public ChromeProcessException(String message, Throwable cause) {
    super(message, cause);
  }
}
