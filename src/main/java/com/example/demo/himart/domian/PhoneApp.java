package com.example.demo.himart.domian;

import lombok.Data;

public class PhoneApp {
    @Data public class Phone{
        protected String kind, company, call;
        @Override public String toString() {
            return "집전화기{" +
                    "폰종류='" + kind + '\'' +
                    ", 제조사='" + company + '\'' +
                    ", 통화='" + call + '\'' +
                    '}';
        }
    }
    @Data public class CelPhone extends Phone {
        protected boolean portable;
        protected String movie;
        @Override public String toString() {
            return "CelPhone{" +
                    "폰종류='" + kind + '\'' +
                    ", 제조사='" + company + '\'' +
                    ", 통화='" + call + '\'' +
                    ", 이동='" + movie + '\'' +
                    '}';
        }
    }
    @Data public class IPhone extends CelPhone {
        public final static String BRAND = "아이폰";
        protected String internet;
        @Override public String toString() {
            return "스마트폰{" +
                    "폰종류='" + BRAND + '\'' +
                    ", 제조사='" + company + '\'' +
                    ", 통화='" + call + '\'' +
                    ", 이동='" + movie + '\'' +
                    ", 검색='" + internet + '\'' +
                    '}';
        }
    }
    @Data public class GalaxyNote extends IPhone{
        public final static String BRAND = "갤럭시폰";
        protected String pencil;
        @Override public String toString() {
            return "스마트폰{" +
                    "폰종류='" + BRAND + '\'' +
                    ", 제조사='" + company + '\'' +
                    ", 통화='" + call + '\'' +
                    ", 이동='" + movie + '\'' +
                    ", 검색='" + internet + '\'' +
                    ", 팬슬='" + pencil + '\'' +
                    '}';
        }
    }
}
