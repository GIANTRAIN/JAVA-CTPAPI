/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostapi;

public class CThostFtdcMarketDataBid45Field {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcMarketDataBid45Field(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcMarketDataBid45Field obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttraderapiJNI.delete_CThostFtdcMarketDataBid45Field(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBidPrice4(double value) {
    thosttraderapiJNI.CThostFtdcMarketDataBid45Field_BidPrice4_set(swigCPtr, this, value);
  }

  public double getBidPrice4() {
    return thosttraderapiJNI.CThostFtdcMarketDataBid45Field_BidPrice4_get(swigCPtr, this);
  }

  public void setBidVolume4(int value) {
    thosttraderapiJNI.CThostFtdcMarketDataBid45Field_BidVolume4_set(swigCPtr, this, value);
  }

  public int getBidVolume4() {
    return thosttraderapiJNI.CThostFtdcMarketDataBid45Field_BidVolume4_get(swigCPtr, this);
  }

  public void setBidPrice5(double value) {
    thosttraderapiJNI.CThostFtdcMarketDataBid45Field_BidPrice5_set(swigCPtr, this, value);
  }

  public double getBidPrice5() {
    return thosttraderapiJNI.CThostFtdcMarketDataBid45Field_BidPrice5_get(swigCPtr, this);
  }

  public void setBidVolume5(int value) {
    thosttraderapiJNI.CThostFtdcMarketDataBid45Field_BidVolume5_set(swigCPtr, this, value);
  }

  public int getBidVolume5() {
    return thosttraderapiJNI.CThostFtdcMarketDataBid45Field_BidVolume5_get(swigCPtr, this);
  }

  public CThostFtdcMarketDataBid45Field() {
    this(thosttraderapiJNI.new_CThostFtdcMarketDataBid45Field(), true);
  }

}
