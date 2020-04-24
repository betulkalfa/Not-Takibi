package com.sbk.firebasenot;

public class Ogrenci {


        private String Ders;
        private int Soru;
        private long Tarih;
        private long Id;

        public Ogrenci() {
        }

        public Ogrenci(String ders, int soru, long tarih) {
            setDers(ders);
            setSoru(soru);
            setTarih(tarih);
        }

        public void setId(long id){Id=id;}
        public long getId(){return Id;}

        public String getDers() {
            return Ders;
        }

        public void setDers(String ders) {
            Ders = ders;
        }

        public int getSoru() {
            return Soru;
        }

        public void setSoru(int soru) {
            Soru = soru;
        }

        public long getTarih() {
            return Tarih;
        }

        public void setTarih(long tarih) {
            Tarih = tarih;
        }
    }
