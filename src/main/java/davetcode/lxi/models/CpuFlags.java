package davetcode.lxi.models;

public class CpuFlags {
  private Boolean mSign;
  private Boolean mZero;
  private Boolean mAuxCarry;
  private Boolean mParity;
  private Boolean mCarry;

  public Boolean getCarry() {
    return mCarry;
  }

  public void setCarry(Boolean mCarry) {
    this.mCarry = mCarry;
  }

  public Boolean getParity() {
    return mParity;
  }

  public void setParity(Boolean mParity) {
    this.mParity = mParity;
  }

  public Boolean getAuxCarry() {
    return mAuxCarry;
  }

  public void setAuxCarry(Boolean mAuxCarry) {
    this.mAuxCarry = mAuxCarry;
  }

  public Boolean getZero() {
    return mZero;
  }

  public void setZero(Boolean mZero) {
    this.mZero = mZero;
  }

  public Boolean getSign() {
    return mSign;
  }

  public void setSign(Boolean mSign) {
    this.mSign = mSign;
  }

  public CpuFlags(Boolean sign, Boolean zero, Boolean auxCarry, Boolean parity, Boolean carry) {
    mSign = sign;
    mZero = zero;
    mAuxCarry = auxCarry;
    mParity = parity;
    mCarry = carry;
  }

}
