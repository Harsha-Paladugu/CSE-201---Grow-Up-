
public class Karma extends Statistics{
        
        public Karma() {
            super();
        }
        public void karmaUp(int value) {
            statUp(value);
        }
        
        public void karmaDown(int value) {
            statDown(value);
        }
        
        public int getKarma() {
           return getStat();
        }
        
}
