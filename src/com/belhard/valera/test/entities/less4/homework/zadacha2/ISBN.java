package com.belhard.valera.test.entities.less4.homework.zadacha2;

import java.util.Date;

public class ISBN {


        private String number;
        private Date date;

        public ISBN(String number, Date date) {
            this.number = number;
            this.date = date;
        }

        @Override
        public String toString() {
            return "ISBN{" +
                    "number='" + number + '\'' +
                    ", date=" + date +
                    '}';
        }

}
