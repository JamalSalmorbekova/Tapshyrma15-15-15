public class Programmist15 extends Person15 {
        String companyName;

        public Programmist15() {
        }

        public Programmist15(String name, String designation, String companyName) {
            super(name, designation);
            this.companyName = companyName;

        }

        public String getCompanyName() {
            return companyName;
        }

        public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }

        void coding (){
            super.Learn();
            super.Walk();
            super.Eat();
            System.out.println("Программист  алгоритм  боюнча  код  жазат.");
        }

        @Override
        public String toString() {
            return  "1. ПРОГРАММИСТ{" +
                    "аты - '" + name + '\'' +
                    ",кесиби'" + designation + '\'' +
                    ", иштеген  компаниясынын  аты='" + companyName + '\'' +
                    '}';
        }
    }
