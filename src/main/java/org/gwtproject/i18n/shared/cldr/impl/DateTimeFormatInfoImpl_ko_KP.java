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
 * Implementation of DateTimeFormatInfo for the "ko_KP" locale.
 */

import org.gwtproject.i18n.shared.cldr.DateTimeFormatInfoImpl;

public class DateTimeFormatInfoImpl_ko_KP extends DateTimeFormatInfoImpl_ko {

  @Override
  public String[] ampms() {
    return new String[] {
        "AM",
        "PM"
    };
  }

  @Override
  public String dateFormat() {
    return dateFormatMedium();
  }

  @Override
  public String dateFormatFull() {
    return "y년 M월 d일 EEEE";
  }

  @Override
  public String dateFormatLong() {
    return "y년 M월 d일";
  }

  @Override
  public String dateFormatMedium() {
    return "y. M. d.";
  }

  @Override
  public String dateFormatShort() {
    return "yy. M. d.";
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
        "기원전",
        "서기"
    };
  }

  @Override
  public String[] erasShort() {
    return new String[] {
        "BC",
        "AD"
    };
  }

  @Override
  public int firstDayOfTheWeek() {
    return 1;
  }

  @Override
  public String formatDay() {
    return "d일";
  }

  @Override
  public String formatHour12Minute() {
    return "a h:mm";
  }

  @Override
  public String formatHour12MinuteSecond() {
    return "a h:mm:ss";
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
    return "MMM d일";
  }

  @Override
  public String formatMonthFull() {
    return "LLLL";
  }

  @Override
  public String formatMonthFullDay() {
    return "MMMM d일";
  }

  @Override
  public String formatMonthFullWeekdayDay() {
    return "MMMM d일 EEEE";
  }

  @Override
  public String formatMonthNumDay() {
    return "M. d.";
  }

  @Override
  public String formatYear() {
    return "y년";
  }

  @Override
  public String formatYearMonthAbbrev() {
    return "y년 MMM";
  }

  @Override
  public String formatYearMonthAbbrevDay() {
    return "y년 MMM d일";
  }

  @Override
  public String formatYearMonthFull() {
    return "y년 MMMM";
  }

  @Override
  public String formatYearMonthFullDay() {
    return "y년 MMMM d일";
  }

  @Override
  public String formatYearMonthNum() {
    return "y. M.";
  }

  @Override
  public String formatYearMonthNumDay() {
    return "y. M. d.";
  }

  @Override
  public String formatYearMonthWeekdayDay() {
    return "y년 MMM d일 (EEE)";
  }

  @Override
  public String formatYearQuarterFull() {
    return "y년 QQQQ";
  }

  @Override
  public String formatYearQuarterShort() {
    return "y년 Q";
  }

  @Override
  public String[] monthsFull() {
    return new String[] {
        "1월",
        "2월",
        "3월",
        "4월",
        "5월",
        "6월",
        "7월",
        "8월",
        "9월",
        "10월",
        "11월",
        "12월"
    };
  }

  @Override
  public String[] monthsFullStandalone() {
    return monthsFull();
  }

  @Override
  public String[] monthsNarrow() {
    return new String[] {
        "1월",
        "2월",
        "3월",
        "4월",
        "5월",
        "6월",
        "7월",
        "8월",
        "9월",
        "10월",
        "11월",
        "12월"
    };
  }

  @Override
  public String[] monthsNarrowStandalone() {
    return monthsNarrow();
  }

  @Override
  public String[] monthsShort() {
    return new String[] {
        "1월",
        "2월",
        "3월",
        "4월",
        "5월",
        "6월",
        "7월",
        "8월",
        "9월",
        "10월",
        "11월",
        "12월"
    };
  }

  @Override
  public String[] monthsShortStandalone() {
    return monthsShort();
  }

  @Override
  public String[] quartersFull() {
    return new String[] {
        "제 1/4분기",
        "제 2/4분기",
        "제 3/4분기",
        "제 4/4분기"
    };
  }

  @Override
  public String[] quartersShort() {
    return new String[] {
        "1분기",
        "2분기",
        "3분기",
        "4분기"
    };
  }

  @Override
  public String timeFormat() {
    return timeFormatMedium();
  }

  @Override
  public String timeFormatFull() {
    return "a h시 m분 s초 zzzz";
  }

  @Override
  public String timeFormatLong() {
    return "a h시 m분 s초 z";
  }

  @Override
  public String timeFormatMedium() {
    return "a h:mm:ss";
  }

  @Override
  public String timeFormatShort() {
    return "a h:mm";
  }

  @Override
  public String[] weekdaysFull() {
    return new String[] {
        "일요일",
        "월요일",
        "화요일",
        "수요일",
        "목요일",
        "금요일",
        "토요일"
    };
  }

  @Override
  public String[] weekdaysFullStandalone() {
    return weekdaysFull();
  }

  @Override
  public String[] weekdaysNarrow() {
    return new String[] {
        "일",
        "월",
        "화",
        "수",
        "목",
        "금",
        "토"
    };
  }

  @Override
  public String[] weekdaysNarrowStandalone() {
    return weekdaysNarrow();
  }

  @Override
  public String[] weekdaysShort() {
    return new String[] {
        "일",
        "월",
        "화",
        "수",
        "목",
        "금",
        "토"
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
