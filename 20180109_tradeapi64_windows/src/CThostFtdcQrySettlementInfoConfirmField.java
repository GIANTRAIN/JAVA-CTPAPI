/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostapi;

public class CThostFtdcQrySettlementInfoConfirmField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQrySettlementInfoConfirmField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQrySettlementInfoConfirmField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttraderapiJNI.delete_CThostFtdcQrySettlementInfoConfirmField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thosttraderapiJNI.CThostFtdcQrySettlementInfoConfirmField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttraderapiJNI.CThostFtdcQrySettlementInfoConfirmField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thosttraderapiJNI.CThostFtdcQrySettlementInfoConfirmField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thosttraderapiJNI.CThostFtdcQrySettlementInfoConfirmField_InvestorID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    thosttraderapiJNI.CThostFtdcQrySettlementInfoConfirmField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return thosttraderapiJNI.CThostFtdcQrySettlementInfoConfirmField_AccountID_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    thosttraderapiJNI.CThostFtdcQrySettlementInfoConfirmField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return thosttraderapiJNI.CThostFtdcQrySettlementInfoConfirmField_CurrencyID_get(swigCPtr, this);
  }

  public CThostFtdcQrySettlementInfoConfirmField() {
    this(thosttraderapiJNI.new_CThostFtdcQrySettlementInfoConfirmField(), true);
  }

}
