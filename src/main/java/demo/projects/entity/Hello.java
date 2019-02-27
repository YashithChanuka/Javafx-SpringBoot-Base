package demo.projects.entity;


import demo.projects.dto.HelloDto;

import javax.persistence.*;

@Entity
@Table(name = "T_HELLO")
public class Hello {
    @Id
    @Column(name = "HELLO_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer helloID;

    @Column(name = "TEST")
    private Integer test;

    public void setDataFromHelloDto(HelloDto helloDto){
        this.test=helloDto.getTest();
    }

    public HelloDto getHelloDto(){
        HelloDto helloDto=new HelloDto();
        helloDto.setHelloID(this.helloID);
        helloDto.setTest(this.test);

        return helloDto;
    }

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
        final StringBuffer sb = new StringBuffer("Hello{");
        sb.append("helloID=").append(helloID);
        sb.append(", test=").append(test);
        sb.append('}');
        return sb.toString();
    }
}
