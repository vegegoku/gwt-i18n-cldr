package org.gwtproject.i18n.shared.cldr.impl;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.gwtproject.i18n.shared.cldr.DateTimeFormatInfo;
import org.gwtproject.i18n.shared.cldr.LocaleInfoImpl;
import org.gwtproject.i18n.shared.cldr.LocalizedNames;
import org.gwtproject.i18n.shared.cldr.NumberConstants;

@Generated("gwt-cldr-importer : org.gwtproject.tools.cldr.LocalesNativeNamesProcessor, CLDR version : release-34")
public class LocaleInfoImpl_mk extends LocaleInfoImpl {
  @Override
  public String getLocaleName() {
    return "mk";
  }

  @Override
  public LocalizedNames getLocalizedNames() {
    return new LocalizedNamesImpl_mk();
  }

  @Override
  public DateTimeFormatInfo getDateTimeFormatInfo() {
    return new DateTimeFormatInfoImpl_mk();
  }

  @Override
  public NumberConstants getNumberConstants() {
    return new NumberConstantsImpl_mk();
  }

  @Override
  public boolean isRTL() {
    return false;
  }
}
