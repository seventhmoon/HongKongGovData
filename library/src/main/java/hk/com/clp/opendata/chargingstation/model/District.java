package hk.com.clp.opendata.chargingstation.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by fung on 3/5/2017.
 */
@Root (name="district")
public class District {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Element (name="name")
    private String name;
}
