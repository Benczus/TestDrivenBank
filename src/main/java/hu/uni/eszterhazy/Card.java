package hu.uni.eszterhazy;

import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

public class Card {

    private String cardNum;
    private String ownerName;
    private int cvc;
    private LocalDate expDate;
    private boolean availability;

    private Card(String cardNum, String ownerName, int cvc, LocalDate expDate, boolean availability) {
        this.cardNum = cardNum;
        this.ownerName = ownerName;
        this.cvc = cvc;
        this.expDate = expDate;
        this.availability = availability;
    }


    static class CardBuilder{

        private String cardNum;
        private String ownerName;
        private int cvc;
        private LocalDate expDate;
        private boolean availability;

        public CardBuilder(String ownerName, boolean availability) {
        this.ownerName=ownerName;
        this.availability=availability;
        this.cardNum="";
            for (int i = 0; i <15 ; i++) {
                this.cardNum = this.cardNum.concat(String.valueOf(ThreadLocalRandom.current().nextInt(0, 9)));
            }
            this.expDate = LocalDate.now().plusYears(2);
            this.cvc =ThreadLocalRandom.current().nextInt(100, 999);
        }
        public CardBuilder setCardNum(String cardNum){
            this.cardNum=cardNum;
            return this;
        }

        public CardBuilder setCvc(int cvc) {
            this.cvc = cvc;
            return this;
        }

        public CardBuilder setExpDate(LocalDate expDate) {
            this.expDate = expDate;
            return this;
        }

        public Card build(){
            return new Card(this.cardNum, this.ownerName, this.cvc, this.expDate, this.availability);
        }

}


    public String printExpDate() {
        return  expDate.toString();

    }

    @Override
    public String toString() {
        return "Card{" +
                "cardNum='" + cardNum + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", cvc=" + cvc +
                ", expDate=" + expDate +
                ", availability=" + availability +
                '}';
    }


    public boolean isAvailable() {
        return this.availability;
    }



}
