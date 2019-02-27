package demo.projects.dto;

import java.io.Serializable;

public class HelloDto implements Serializable {
    private static final long serialVersionUID = -6233440069268117168L;

    private Integer helloID;
    private Integer test;

    public Integer getHelloID() {
        return helloID;
    }

    public void setHelloID(Integer helloID) {
        this.helloID = helloID;
    }

    public Integer getTest() {
        return test;
    }

    public void setTest(Integer test) {
        this.test = test;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("HelloDto{");
        sb.append("helloID=").append(helloID);
        sb.append(", test=").append(test);
        sb.append('}');
        return sb.toString();
    }
}
