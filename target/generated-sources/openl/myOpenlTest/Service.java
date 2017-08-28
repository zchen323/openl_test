package myOpenlTest;

import java.lang.Double;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.math.BigDecimal;
import com.example.beans.Address;
import com.example.beans.openl.Auto;
import com.example.beans.openl.Person;
import org.openl.meta.ByteValue;
import org.openl.meta.DoubleValue;
import org.openl.meta.IntValue;

public interface Service {

    Long[] calculate(Person[] p, Auto[][] au, Address[][][] ad, int[] ar1);

    Integer calculate(Person[] p, Auto[][] au, Address[][][] ad, int[] ar1, Double[][] ar2);

    Integer calculate(Person p, Auto au, Address ad);

    DoubleValue[][] calculate(IntValue[] p, ByteValue au, BigDecimal[][][] ad);

    int[] getNumbers();

    String hello(int hour);
}
