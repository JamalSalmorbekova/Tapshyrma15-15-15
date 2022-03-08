public class Singer15 extends Person15 {
        String bandName;

        public Singer15() {
        }

        public Singer15(String name, String designation, String bandName) {
            super(name, designation);
            this.bandName = bandName;
        }

        public String getBandName() {
            return bandName;
        }

        public void setBandName(String bandName) {
            this.bandName = bandName;
        }

        void singing (){
            System.out.println("Ырчы  ырдагысы  келет.");
        }
        public void playGuitar () {

            super.Learn();
            super.Walk();
            super.Eat();

            System.out.println("Ал  комузда  да  жакшы  ойнойт.");
        }


        @Override
        public String toString() {
            return "3. Singer{" +
                    "name='" + name + '\'' +
                    ", designation='" + designation + '\'' +
                    ", bandName='" + bandName + '\'' +
                    '}';
        }
    }
