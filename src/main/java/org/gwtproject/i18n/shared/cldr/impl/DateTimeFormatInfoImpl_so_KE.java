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
 * Implementation of DateTimeFormatInfo for the "so_KE" locale.
 */

import org.gwtproject.i18n.shared.cldr.DateTimeFormatInfoImpl;

public class DateTimeFormatInfoImpl_so_KE extends DateTimeFormatInfoImpl_so {

  @Override
  public String[] ampms() {
    return new String[] {
        "sn.",
        "gn."
    };
  }

  @Override
  public String dateFormat() {
    return dateFormatMedium();
  }

  @Override
  public String dateFormatFull() {
    return "EEEE, MMMM dd, y";
  }

  @Override
  public String dateFormatLong() {
    return "dd MMMM y";
  }

  @Override
  public String dateFormatMedium() {
    return "dd-MMM-y";
  }

  @Override
  public String dateFormatShort() {
    return "dd/MM/yy";
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
        "CK",
        "CD"
    };
  }

  @Override
  public String[] erasShort() {
    return new String[] {
        "CK",
        "CD"
    };
  }

  @Override
  public int firstDayOfTheWeek() {
    return 0;
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
        "Bisha Koobaad",
        "Bisha Labaad",
        "Bisha Saddexaad",
        "Bisha Afraad",
        "Bisha Shanaad",
        "Bisha Lixaad",
        "Bisha Todobaad",
        "Bisha Sideedaad",
        "Bisha Sagaalaad",
        "Bisha Tobnaad",
        "Bisha Kow iyo Tobnaad",
        "Bisha Laba iyo Tobnaad"
    };
  }

  @Override
  public String[] monthsFullStandalone() {
    return new String[] {
        "Jannaayo",
        "Febraayo",
        "Maarso",
        "Abriil",
        "May",
        "Juun",
        "Luuliyo",
        "Ogost",
        "Sebtembar",
        "Oktoobar",
        "Nofembar",
        "Desembar"
    };
  }

  @Override
  public String[] monthsNarrow() {
    return new String[] {
        "K",
        "L",
        "S",
        "A",
        "S",
        "L",
        "T",
        "S",
        "S",
        "T",
        "K",
        "L"
    };
  }

  @Override
  public String[] monthsNarrowStandalone() {
    return new String[] {
        "J",
        "F",
        "M",
        "A",
        "M",
        "J",
        "L",
        "O",
        "S",
        "O",
        "N",
        "D"
    };
  }

  @Override
  public String[] monthsShort() {
    return new String[] {
        "Kob",
        "Lab",
        "Sad",
        "Afr",
        "May",
        "Juun",
        "Luuliyo",
        "Og",
        "Sebtembar",
        "Oktoobar",
        "Nofembar",
        "Dec"
    };
  }

  @Override
  public String[] monthsShortStandalone() {
    return new String[] {
        "Jan",
        "Feb",
        "Mar",
        "Abr",
        "May",
        "Juun",
        "Luuliyo",
        "Og",
        "Seb",
        "Okt",
        "Nof",
        "Des"
    };
  }

  @Override
  public String[] quartersFull() {
    return new String[] {
        "Rubaca 1aad",
        "Rubaca 2aad",
        "Rubaca 3aad",
        "Rubaca 4aad"
    };
  }

  @Override
  public String[] quartersShort() {
    return new String[] {
        "R1",
        "R2",
        "R3",
        "R4"
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
        "Axad",
        "Isniin",
        "Talaado",
        "Arbaco",
        "Khamiis",
        "Jimco",
        "Sabti"
    };
  }

  @Override
  public String[] weekdaysFullStandalone() {
    return weekdaysFull();
  }

  @Override
  public String[] weekdaysNarrow() {
    return new String[] {
        "A",
        "I",
        "T",
        "A",
        "Kh",
        "J",
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
        "Axd",
        "Isn",
        "Tal",
        "Arb",
        "Kha",
        "Jim",
        "Sab"
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
