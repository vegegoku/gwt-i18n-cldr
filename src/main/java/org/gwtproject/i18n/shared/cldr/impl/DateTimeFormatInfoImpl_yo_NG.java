/*
 * Copyright 2012 Google Inc.
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
package org.gwtproject.i18n.shared.cldr.impl;
// DO NOT EDIT - GENERATED FROM CLDR AND ICU DATA

/**
 * Implementation of DateTimeFormatInfo for the "yo_NG" locale.
 */

import org.gwtproject.i18n.shared.cldr.DateTimeFormatInfoImpl;

public class DateTimeFormatInfoImpl_yo_NG extends DateTimeFormatInfoImpl_yo {

  @Override
  public String[] ampms() {
    return new String[] {
        "Àárọ̀",
        "Ọ̀sán"
    };
  }

  @Override
  public String dateFormat() {
    return dateFormatMedium();
  }

  @Override
  public String dateFormatFull() {
    return "EEEE, d MMMM y";
  }

  @Override
  public String dateFormatLong() {
    return "d MMMM y";
  }

  @Override
  public String dateFormatMedium() {
    return "d MMM y";
  }

  @Override
  public String dateFormatShort() {
    return "dd/MM/y";
  }

  @Override
  public String dateTime(String timePattern, String datePattern) {
    return dateTimeMedium(timePattern, datePattern);
  }

  @Override
  public String dateTimeFull(String timePattern, String datePattern) {
    return datePattern + " " + timePattern;
  }

  @Override
  public String dateTimeLong(String timePattern, String datePattern) {
    return datePattern + " " + timePattern;
  }

  @Override
  public String dateTimeMedium(String timePattern, String datePattern) {
    return datePattern + " " + timePattern;
  }

  @Override
  public String dateTimeShort(String timePattern, String datePattern) {
    return datePattern + " " + timePattern;
  }

  @Override
  public String[] erasFull() {
    return new String[] {
        "Saju Kristi",
        "Lehin Kristi"
    };
  }

  @Override
  public String[] erasShort() {
    return new String[] {
        "BCE",
        "LK"
    };
  }

  @Override
  public int firstDayOfTheWeek() {
    return 1;
  }

  @Override
  public String formatDay() {
    return "d";
  }

  @Override
  public String formatHour12Minute() {
    return "h:mm a";
  }

  @Override
  public String formatHour12MinuteSecond() {
    return "h:mm:ss a";
  }

  @Override
  public String formatHour24Minute() {
    return "HH:mm";
  }

  @Override
  public String formatHour24MinuteSecond() {
    return "HH:mm:ss";
  }

  @Override
  public String formatMinuteSecond() {
    return "mm:ss";
  }

  @Override
  public String formatMonthAbbrev() {
    return "LLL";
  }

  @Override
  public String formatMonthAbbrevDay() {
    return "MMM d";
  }

  @Override
  public String formatMonthFull() {
    return "LLLL";
  }

  @Override
  public String formatMonthFullDay() {
    return "MMMM d";
  }

  @Override
  public String formatMonthFullWeekdayDay() {
    return "EEEE, MMMM d";
  }

  @Override
  public String formatMonthNumDay() {
    return "M/d";
  }

  @Override
  public String formatYear() {
    return "y";
  }

  @Override
  public String formatYearMonthAbbrev() {
    return "MMM y";
  }

  @Override
  public String formatYearMonthAbbrevDay() {
    return "y MMM d";
  }

  @Override
  public String formatYearMonthFull() {
    return "MMMM y";
  }

  @Override
  public String formatYearMonthFullDay() {
    return "d MMMM y";
  }

  @Override
  public String formatYearMonthNum() {
    return "M/y";
  }

  @Override
  public String formatYearMonthNumDay() {
    return "y-MM-dd";
  }

  @Override
  public String formatYearMonthWeekdayDay() {
    return "EEE, MMM d, y";
  }

  @Override
  public String formatYearQuarterFull() {
    return "QQQQ y";
  }

  @Override
  public String formatYearQuarterShort() {
    return "Q y";
  }

  @Override
  public String[] monthsFull() {
    return new String[] {
        "Oṣù Ṣẹ́rẹ́",
        "Oṣù Èrèlè",
        "Oṣù Ẹrẹ̀nà",
        "Oṣù Ìgbé",
        "Oṣù Ẹ̀bibi",
        "Oṣù Òkúdu",
        "Oṣù Agẹmọ",
        "Oṣù Ògún",
        "Oṣù Owewe",
        "Oṣù Ọ̀wàrà",
        "Oṣù Bélú",
        "Oṣù Ọ̀pẹ̀"
    };
  }

  @Override
  public String[] monthsFullStandalone() {
    return monthsFull();
  }

  @Override
  public String[] monthsNarrow() {
    return new String[] {
        "1",
        "2",
        "3",
        "4",
        "5",
        "6",
        "7",
        "8",
        "9",
        "10",
        "11",
        "12"
    };
  }

  @Override
  public String[] monthsNarrowStandalone() {
    return monthsNarrow();
  }

  @Override
  public String[] monthsShort() {
    return new String[] {
        "Ṣẹ́rẹ́",
        "Èrèlè",
        "Ẹrẹ̀nà",
        "Ìgbé",
        "Ẹ̀bibi",
        "Òkúdu",
        "Agẹmọ",
        "Ògún",
        "Owewe",
        "Ọ̀wàrà",
        "Bélú",
        "Ọ̀pẹ̀"
    };
  }

  @Override
  public String[] monthsShortStandalone() {
    return monthsShort();
  }

  @Override
  public String[] quartersFull() {
    return new String[] {
        "Kọ́tà Kínní",
        "Kọ́tà Kejì",
        "Kọ́à Keta",
        "Kọ́tà Kẹrin"
    };
  }

  @Override
  public String[] quartersShort() {
    return new String[] {
        "K1",
        "K2",
        "K3",
        "K4"
    };
  }

  @Override
  public String timeFormat() {
    return timeFormatMedium();
  }

  @Override
  public String timeFormatFull() {
    return "HH:mm:ss zzzz";
  }

  @Override
  public String timeFormatLong() {
    return "HH:mm:ss z";
  }

  @Override
  public String timeFormatMedium() {
    return "HH:mm:ss";
  }

  @Override
  public String timeFormatShort() {
    return "HH:mm";
  }

  @Override
  public String[] weekdaysFull() {
    return new String[] {
        "Ọjọ́ Àìkú",
        "Ọjọ́ Ajé",
        "Ọjọ́ Ìsẹ́gun",
        "Ọjọ́rú",
        "Ọjọ́bọ",
        "Ọjọ́ Ẹtì",
        "Ọjọ́ Àbámẹ́ta"
    };
  }

  @Override
  public String[] weekdaysFullStandalone() {
    return weekdaysFull();
  }

  @Override
  public String[] weekdaysNarrow() {
    return new String[] {
        "S",
        "M",
        "T",
        "W",
        "T",
        "F",
        "S"
    };
  }

  @Override
  public String[] weekdaysNarrowStandalone() {
    return weekdaysNarrow();
  }

  @Override
  public String[] weekdaysShort() {
    return new String[] {
        "Àìkú",
        "Ajé",
        "Ìsẹ́gun",
        "Ọjọ́rú",
        "Ọjọ́bọ",
        "Ẹtì",
        "Àbámẹ́ta"
    };
  }

  @Override
  public String[] weekdaysShortStandalone() {
    return weekdaysShort();
  }

  @Override
  public int weekendEnd() {
    return 0;
  }

  @Override
  public int weekendStart() {
    return 6;
  }
}
