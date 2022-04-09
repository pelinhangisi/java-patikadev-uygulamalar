package com.company;


    public class Course {
        Teacher teacher;
        String name;
        String code;
        String prefix;
        int note;
        int sozluNote;


        Course(String name, String code, String prefix) {

            this.name = name;
            this.code = code;
            this.prefix = prefix;
            this.note = 0;
            this.sozluNote = 0;

        }

        void addTeacher(Teacher teacher) {
            if (this.prefix.equals(teacher.branch)) {
                this.teacher = teacher;
            } else {
                System.out.println(teacher.name + "Akademisyeni bu derse atanamaz. ");
            }
        }

        void printTeacher() {
            this.teacher.print();

        }
    }

