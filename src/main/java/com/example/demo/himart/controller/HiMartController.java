package com.example.demo.himart.controller;

import com.example.demo.himart.domian.PhoneApp;
import com.example.demo.himart.service.HiMartService;
import com.example.demo.himart.service.HiMartServiceImpl;
import com.example.demo.util.service.LambdaUtils;

import java.util.Scanner;
import java.util.function.Function;

public class HiMartController extends LambdaUtils {
        private Scanner scanner;
        private HiMartService hiMartService;

    public HiMartController(){
            this.scanner = new Scanner(System.in);
            this.hiMartService = new HiMartServiceImpl(); }

        public void HiMartMain() {
            print.accept("안녕하세요"+ "입니다.");
            //= null;
            while (true) {
                print.accept("0.종료  1.스마트폰  2.  3.  4.  5.   ");
                switch (scanner.next()){
                    case "0" : return;
                    case "1" :
                        phoneMain(scanner);
                        break;
                    case "2" :

                        break;
                    case "3" :

                        break;
                     case "4" :

                        break;
                    case "5" :

                        break;
                }

            }

        }
        public void phoneMain(Scanner scanner){
            PhoneApp phoneApp = new PhoneApp();
            PhoneApp.Phone phone = null;
            PhoneApp.CelPhone celPhone = null;
            PhoneApp.IPhone iPhone = null;
            PhoneApp.GalaxyNote galaxyNote = null;
            while (true){
                print.accept("[Menu] 0.종료   1.집전화   2.휴대폰   3.아이폰   4.갤럭시");
                switch (scanner.next()){
                    case "0" : return;
                    case "1" :
                        phone = phoneApp. new Phone();
                        print.accept("1.집전화");
                        print.accept("종류 : ");
                        phone.setKind(scanner.next());
                        print.accept("제조사 : ");
                        phone.setCompany(scanner.next());
                        print.accept("통화 : ");
                        phone.setCall(scanner.next());
                        print.accept(String.format("종류 : %s \n제조사 : %s  \n통화 :  %s\n",phone.getKind(),phone.getCompany(),phone.getCall()));
                        print.accept(phone.toString());
                    break;
                    case "2" :
                        celPhone = phoneApp.new CelPhone();
                        print.accept("2.휴대폰");
                        print.accept("종류 : ");
                        celPhone.setKind(scanner.next());
                        print.accept("제조사 : ");
                        celPhone.setCompany(scanner.next());
                        print.accept("통화 : ");
                        celPhone.setCall(scanner.next());
                        print.accept("이동 : ");
                        celPhone.setMovie(scanner.next());
                        celPhone.isPortable();
                        print.accept(String.format("종류 : %s \n제조사 : %s  \n통화 :  %s\n이동 :  %s",celPhone.getKind(),celPhone.getCompany(),celPhone.getCall(),celPhone.getMovie()));
                        print.accept(celPhone.toString());
                    break;
                    case "3" :
                        iPhone = phoneApp.new IPhone();
                        print.accept("3.IPhone");
                        print.accept("제조사 : ");
                        iPhone.setCompany(scanner.next());
                        iPhone.setKind(PhoneApp.IPhone.BRAND);
                        print.accept("통화 : ");
                        iPhone.setCall(scanner.next());
                        print.accept("이동 : ");
                        iPhone.setMovie(scanner.next());
                        print.accept("검색 : ");
                        iPhone.setInternet(scanner.next());
                        print.accept(String.format("종류 : %s \n제조사 : %s  \n통화 :  %s\n이동 :  %s\n검색 :   %s",iPhone.getKind(),iPhone.getCompany(),iPhone.getCall(),iPhone.getMovie(),iPhone.getInternet()));
                        print.accept(iPhone.toString());
                    break;
                    case "4" :
                        galaxyNote = phoneApp.new GalaxyNote();
                        print.accept("4.galaxyNote");
                        iPhone.setKind(PhoneApp.GalaxyNote.BRAND);
                        print.accept("제조사 : ");
                        galaxyNote.setCompany(scanner.next());
                        print.accept("통화 : ");
                        galaxyNote.setCall(scanner.next());
                        print.accept("이동 : ");
                        galaxyNote.setMovie(scanner.next());
                        print.accept("검색 : ");
                        galaxyNote.setInternet(scanner.next());
                        print.accept("펜슬 : ");
                        galaxyNote.setPencil(scanner.next());
                        print.accept(String.format("종류 : %s \n제조사 : %s  \n통화 :  %s\n이동 :  %s\n검색 :   %s\n펜슬 : %s",galaxyNote.getKind(),galaxyNote.getCompany(),galaxyNote.getCall(),galaxyNote.getMovie(),galaxyNote.getInternet(),galaxyNote.getPencil()));
                        print.accept(galaxyNote.toString());
                    break;
                }
            }
        }
}
