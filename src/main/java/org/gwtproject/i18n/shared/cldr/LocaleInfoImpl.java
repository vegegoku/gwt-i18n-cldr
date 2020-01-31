/*
 * Copyright 2008 Google Inc.
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
 */
package org.gwtproject.i18n.shared.cldr;


import org.gwtproject.i18n.shared.cldr.impl.DateTimeFormatInfo_factory;
import org.gwtproject.i18n.shared.cldr.impl.LocalizedNames_factory;
import org.gwtproject.i18n.shared.cldr.impl.NumberConstants_factory;

/**
 * Implementation detail of LocaleInfo -- not a public API and subject to
 * change.
 *
 * Generated interface for locale information.  The default implementation
 * returns null, which is used if the i18n module is not imported.
 *
 */
public class LocaleInfoImpl {

  /**
   * Returns the current locale name, such as "default, "en_US", etc.
   */
  public String getLocaleName() {
    return null;
  }

  /**
   * Create a {@link DateTimeFormatInfo} instance appropriate for this locale.
   *
   * Note that the caller takes care of any caching so subclasses need not
   * bother.
   *
   * @return a {@link DateTimeFormatInfo} instance
   */
  public DateTimeFormatInfo getDateTimeFormatInfo() {
    return DateTimeFormatInfo_factory.create();
  }

  /**
   * @return an implementation of {@link LocalizedNames} for this locale.
   */
  public LocalizedNames getLocalizedNames() {
    return LocalizedNames_factory.create();
  }

  /**
   * Returns a NumberConstants instance appropriate for this locale.
   */
  public NumberConstants getNumberConstants() {
    return NumberConstants_factory.create();
  }

  public boolean isRTL() {
    return false;
  }
}
