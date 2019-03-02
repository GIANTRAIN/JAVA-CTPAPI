/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostapi;

public class CThostFtdcQueryMaxOrderVolumeWithPriceField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQueryMaxOrderVolumeWithPriceField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQueryMaxOrderVolumeWithPriceField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttraderapiJNI.delete_CThostFtdcQueryMaxOrderVolumeWithPriceField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thosttraderapiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttraderapiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thosttraderapiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thosttraderapiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_InvestorID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    thosttraderapiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thosttraderapiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_InstrumentID_get(swigCPtr, this);
  }

  public void setDirection(char value) {
    thosttraderapiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return thosttraderapiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_Direction_get(swigCPtr, this);
  }

  public void setOffsetFlag(char value) {
    thosttraderapiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_OffsetFlag_set(swigCPtr, this, value);
  }

  public char getOffsetFlag() {
    return thosttraderapiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_OffsetFlag_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    thosttraderapiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return thosttraderapiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_HedgeFlag_get(swigCPtr, this);
  }

  public void setMaxVolume(int value) {
    thosttraderapiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_MaxVolume_set(swigCPtr, this, value);
  }

  public int getMaxVolume() {
    return thosttraderapiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_MaxVolume_get(swigCPtr, this);
  }

  public void setPrice(double value) {
    thosttraderapiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_Price_set(swigCPtr, this, value);
  }

  public double getPrice() {
    return thosttraderapiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_Price_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    thosttraderapiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thosttraderapiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_ExchangeID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    thosttraderapiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return thosttraderapiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_InvestUnitID_get(swigCPtr, this);
  }

  public CThostFtdcQueryMaxOrderVolumeWithPriceField() {
    this(thosttraderapiJNI.new_CThostFtdcQueryMaxOrderVolumeWithPriceField(), true);
  }

}
