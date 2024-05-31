package LSP;

public class Main {
    public static void main(String[] args){
        LecturerAtGS lect01 = new LecturerAtGS();
        lect01.lecturerInfo();

        LecturerNight lect02 = new LecturerNight();
        lect02.lecturerInfo();

        LecturerWithWork lect03 = new LecturerWithWork();
        lect03.lecturerInfo();

        LecturerNomal lect04 = new LecturerNomal();
        lect04.lecturerInfo();
    }
}