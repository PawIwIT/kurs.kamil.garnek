package zadTomka.zad52;

import java.util.ArrayList;
import java.util.List;

public class Town {
    int liczbaOsobGlosujacych = 0;
    List<Citizen> citizens = new ArrayList<>();
     public int HowManyCanVote() {
        for (Citizen citizen : citizens) {
            if (citizen.CanVote() == true) {
                liczbaOsobGlosujacych++;
            }

        }
        return liczbaOsobGlosujacych;
    }
    public void WhoCanVote(){
for (Citizen citizen : citizens){
    if (citizen.CanVote()==true){
        System.out.println(citizen.imie);
    }
}

    }
}
