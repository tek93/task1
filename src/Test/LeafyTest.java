package Test;

import com.company.Leafy;
import org.junit.Assert;
import org.junit.Test;


class LeafyTest {

    @Test
    public void addLeafy (){
        Leafy leafy ;
         leafy = new Leafy("mam pień, ", " gałęzie, ", "igły");
        Assert.assertEquals(leafy, leafy);



    }

}