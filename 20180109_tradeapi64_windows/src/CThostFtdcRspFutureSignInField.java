/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostapi;

public class CThostFtdcRspFutureSignInField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcRspFutureSignInField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcRspFutureSignInField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttraderapiJNI.delete_CThostFtdcRspFutureSignInField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeCode(String value) {
    thosttraderapiJNI.CThostFtdcRspFutureSignInField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return thosttraderapiJNI.CThostFtdcRspFutureSignInField_TradeCode_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    thosttraderapiJNI.CThostFtdcRspFutureSignInField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return thosttraderapiJNI.CThostFtdcRspFutureSignInField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    thosttraderapiJNI.CThostFtdcRspFutureSignInField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return thosttraderapiJNI.CThostFtdcRspFutureSignInField_BankBranchID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thosttraderapiJNI.CThostFtdcRspFutureSignInField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttraderapiJNI.CThostFtdcRspFutureSignInField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    thosttraderapiJNI.CThostFtdcRspFutureSignInField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return thosttraderapiJNI.CThostFtdcRspFutureSignInField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    thosttraderapiJNI.CThostFtdcRspFutureSignInField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return thosttraderapiJNI.CThostFtdcRspFutureSignInField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    thosttraderapiJNI.CThostFtdcRspFutureSignInField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return thosttraderapiJNI.CThostFtdcRspFutureSignInField_TradeTime_get(swigCPtr, this);
  }

  public void setBankSerial(String value) {
    thosttraderapiJNI.CThostFtdcRspFutureSignInField_BankSerial_set(swigCPtr, this, value);
  }

  public String getBankSerial() {
    return thosttraderapiJNI.CThostFtdcRspFutureSignInField_BankSerial_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    thosttraderapiJNI.CThostFtdcRspFutureSignInField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return thosttraderapiJNI.CThostFtdcRspFutureSignInField_TradingDay_get(swigCPtr, this);
  }

  public void setPlateSerial(int value) {
    thosttraderapiJNI.CThostFtdcRspFutureSignInField_PlateSerial_set(swigCPtr, this, value);
  }

  public int getPlateSerial() {
    return thosttraderapiJNI.CThostFtdcRspFutureSignInField_PlateSerial_get(swigCPtr, this);
  }

  public void setLastFragment(char value) {
    thosttraderapiJNI.CThostFtdcRspFutureSignInField_LastFragment_set(swigCPtr, this, value);
  }

  public char getLastFragment() {
    return thosttraderapiJNI.CThostFtdcRspFutureSignInField_LastFragment_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    thosttraderapiJNI.CThostFtdcRspFutureSignInField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return thosttraderapiJNI.CThostFtdcRspFutureSignInField_SessionID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    thosttraderapiJNI.CThostFtdcRspFutureSignInField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return thosttraderapiJNI.CThostFtdcRspFutureSignInField_InstallID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thosttraderapiJNI.CThostFtdcRspFutureSignInField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thosttraderapiJNI.CThostFtdcRspFutureSignInField_UserID_get(swigCPtr, this);
  }

  public void setDigest(String value) {
    thosttraderapiJNI.CThostFtdcRspFutureSignInField_Digest_set(swigCPtr, this, value);
  }

  public String getDigest() {
    return thosttraderapiJNI.CThostFtdcRspFutureSignInField_Digest_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    thosttraderapiJNI.CThostFtdcRspFutureSignInField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return thosttraderapiJNI.CThostFtdcRspFutureSignInField_CurrencyID_get(swigCPtr, this);
  }

  public void setDeviceID(String value) {
    thosttraderapiJNI.CThostFtdcRspFutureSignInField_DeviceID_set(swigCPtr, this, value);
  }

  public String getDeviceID() {
    return thosttraderapiJNI.CThostFtdcRspFutureSignInField_DeviceID_get(swigCPtr, this);
  }

  public void setBrokerIDByBank(String value) {
    thosttraderapiJNI.CThostFtdcRspFutureSignInField_BrokerIDByBank_set(swigCPtr, this, value);
  }

  public String getBrokerIDByBank() {
    return thosttraderapiJNI.CThostFtdcRspFutureSignInField_BrokerIDByBank_get(swigCPtr, this);
  }

  public void setOperNo(String value) {
    thosttraderapiJNI.CThostFtdcRspFutureSignInField_OperNo_set(swigCPtr, this, value);
  }

  public String getOperNo() {
    return thosttraderapiJNI.CThostFtdcRspFutureSignInField_OperNo_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    thosttraderapiJNI.CThostFtdcRspFutureSignInField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return thosttraderapiJNI.CThostFtdcRspFutureSignInField_RequestID_get(swigCPtr, this);
  }

  public void setTID(int value) {
    thosttraderapiJNI.CThostFtdcRspFutureSignInField_TID_set(swigCPtr, this, value);
  }

  public int getTID() {
    return thosttraderapiJNI.CThostFtdcRspFutureSignInField_TID_get(swigCPtr, this);
  }

  public void setErrorID(int value) {
    thosttraderapiJNI.CThostFtdcRspFutureSignInField_ErrorID_set(swigCPtr, this, value);
  }

  public int getErrorID() {
    return thosttraderapiJNI.CThostFtdcRspFutureSignInField_ErrorID_get(swigCPtr, this);
  }

  public void setErrorMsg(String value) {
    thosttraderapiJNI.CThostFtdcRspFutureSignInField_ErrorMsg_set(swigCPtr, this, value);
  }

  public String getErrorMsg() {
    return thosttraderapiJNI.CThostFtdcRspFutureSignInField_ErrorMsg_get(swigCPtr, this);
  }

  public void setPinKey(String value) {
    thosttraderapiJNI.CThostFtdcRspFutureSignInField_PinKey_set(swigCPtr, this, value);
  }

  public String getPinKey() {
    return thosttraderapiJNI.CThostFtdcRspFutureSignInField_PinKey_get(swigCPtr, this);
  }

  public void setMacKey(String value) {
    thosttraderapiJNI.CThostFtdcRspFutureSignInField_MacKey_set(swigCPtr, this, value);
  }

  public String getMacKey() {
    return thosttraderapiJNI.CThostFtdcRspFutureSignInField_MacKey_get(swigCPtr, this);
  }

  public CThostFtdcRspFutureSignInField() {
    this(thosttraderapiJNI.new_CThostFtdcRspFutureSignInField(), true);
  }

}
