
public class ComplexNumber {
    public ComplexNumber(){
    
    }
    public double getImaginaryValue() {
        return ImaginaryValue;
    }
    public void setRealValue(double r) {
        realValue = r;
    }
    public String toString(){
        return "ImaginaryPart: "+getImaginaryValue();
    }
}
