/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostapi;

public class CThostFtdcTransferSerialField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcTransferSerialField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcTransferSerialField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttraderapiJNI.delete_CThostFtdcTransferSerialField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setPlateSerial(int value) {
    thosttraderapiJNI.CThostFtdcTransferSerialField_PlateSerial_set(swigCPtr, this, value);
  }

  public int getPlateSerial() {
    return thosttraderapiJNI.CThostFtdcTransferSerialField_PlateSerial_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    thosttraderapiJNI.CThostFtdcTransferSerialField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return thosttraderapiJNI.CThostFtdcTransferSerialField_TradeDate_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    thosttraderapiJNI.CThostFtdcTransferSerialField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return thosttraderapiJNI.CThostFtdcTransferSerialField_TradingDay_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    thosttraderapiJNI.CThostFtdcTransferSerialField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return thosttraderapiJNI.CThostFtdcTransferSerialField_TradeTime_get(swigCPtr, this);
  }

  public void setTradeCode(String value) {
    thosttraderapiJNI.CThostFtdcTransferSerialField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return thosttraderapiJNI.CThostFtdcTransferSerialField_TradeCode_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    thosttraderapiJNI.CThostFtdcTransferSerialField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return thosttraderapiJNI.CThostFtdcTransferSerialField_SessionID_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    thosttraderapiJNI.CThostFtdcTransferSerialField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return thosttraderapiJNI.CThostFtdcTransferSerialField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    thosttraderapiJNI.CThostFtdcTransferSerialField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return thosttraderapiJNI.CThostFtdcTransferSerialField_BankBranchID_get(swigCPtr, this);
  }

  public void setBankAccType(char value) {
    thosttraderapiJNI.CThostFtdcTransferSerialField_BankAccType_set(swigCPtr, this, value);
  }

  public char getBankAccType() {
    return thosttraderapiJNI.CThostFtdcTransferSerialField_BankAccType_get(swigCPtr, this);
  }

  public void setBankAccount(String value) {
    thosttraderapiJNI.CThostFtdcTransferSerialField_BankAccount_set(swigCPtr, this, value);
  }

  public String getBankAccount() {
    return thosttraderapiJNI.CThostFtdcTransferSerialField_BankAccount_get(swigCPtr, this);
  }

  public void setBankSerial(String value) {
    thosttraderapiJNI.CThostFtdcTransferSerialField_BankSerial_set(swigCPtr, this, value);
  }

  public String getBankSerial() {
    return thosttraderapiJNI.CThostFtdcTransferSerialField_BankSerial_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thosttraderapiJNI.CThostFtdcTransferSerialField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttraderapiJNI.CThostFtdcTransferSerialField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    thosttraderapiJNI.CThostFtdcTransferSerialField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return thosttraderapiJNI.CThostFtdcTransferSerialField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setFutureAccType(char value) {
    thosttraderapiJNI.CThostFtdcTransferSerialField_FutureAccType_set(swigCPtr, this, value);
  }

  public char getFutureAccType() {
    return thosttraderapiJNI.CThostFtdcTransferSerialField_FutureAccType_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    thosttraderapiJNI.CThostFtdcTransferSerialField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return thosttraderapiJNI.CThostFtdcTransferSerialField_AccountID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thosttraderapiJNI.CThostFtdcTransferSerialField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thosttraderapiJNI.CThostFtdcTransferSerialField_InvestorID_get(swigCPtr, this);
  }

  public void setFutureSerial(int value) {
    thosttraderapiJNI.CThostFtdcTransferSerialField_FutureSerial_set(swigCPtr, this, value);
  }

  public int getFutureSerial() {
    return thosttraderapiJNI.CThostFtdcTransferSerialField_FutureSerial_get(swigCPtr, this);
  }

  public void setIdCardType(char value) {
    thosttraderapiJNI.CThostFtdcTransferSerialField_IdCardType_set(swigCPtr, this, value);
  }

  public char getIdCardType() {
    return thosttraderapiJNI.CThostFtdcTransferSerialField_IdCardType_get(swigCPtr, this);
  }

  public void setIdentifiedCardNo(String value) {
    thosttraderapiJNI.CThostFtdcTransferSerialField_IdentifiedCardNo_set(swigCPtr, this, value);
  }

  public String getIdentifiedCardNo() {
    return thosttraderapiJNI.CThostFtdcTransferSerialField_IdentifiedCardNo_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    thosttraderapiJNI.CThostFtdcTransferSerialField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return thosttraderapiJNI.CThostFtdcTransferSerialField_CurrencyID_get(swigCPtr, this);
  }

  public void setTradeAmount(double value) {
    thosttraderapiJNI.CThostFtdcTransferSerialField_TradeAmount_set(swigCPtr, this, value);
  }

  public double getTradeAmount() {
    return thosttraderapiJNI.CThostFtdcTransferSerialField_TradeAmount_get(swigCPtr, this);
  }

  public void setCustFee(double value) {
    thosttraderapiJNI.CThostFtdcTransferSerialField_CustFee_set(swigCPtr, this, value);
  }

  public double getCustFee() {
    return thosttraderapiJNI.CThostFtdcTransferSerialField_CustFee_get(swigCPtr, this);
  }

  public void setBrokerFee(double value) {
    thosttraderapiJNI.CThostFtdcTransferSerialField_BrokerFee_set(swigCPtr, this, value);
  }

  public double getBrokerFee() {
    return thosttraderapiJNI.CThostFtdcTransferSerialField_BrokerFee_get(swigCPtr, this);
  }

  public void setAvailabilityFlag(char value) {
    thosttraderapiJNI.CThostFtdcTransferSerialField_AvailabilityFlag_set(swigCPtr, this, value);
  }

  public char getAvailabilityFlag() {
    return thosttraderapiJNI.CThostFtdcTransferSerialField_AvailabilityFlag_get(swigCPtr, this);
  }

  public void setOperatorCode(String value) {
    thosttraderapiJNI.CThostFtdcTransferSerialField_OperatorCode_set(swigCPtr, this, value);
  }

  public String getOperatorCode() {
    return thosttraderapiJNI.CThostFtdcTransferSerialField_OperatorCode_get(swigCPtr, this);
  }

  public void setBankNewAccount(String value) {
    thosttraderapiJNI.CThostFtdcTransferSerialField_BankNewAccount_set(swigCPtr, this, value);
  }

  public String getBankNewAccount() {
    return thosttraderapiJNI.CThostFtdcTransferSerialField_BankNewAccount_get(swigCPtr, this);
  }

  public void setErrorID(int value) {
    thosttraderapiJNI.CThostFtdcTransferSerialField_ErrorID_set(swigCPtr, this, value);
  }

  public int getErrorID() {
    return thosttraderapiJNI.CThostFtdcTransferSerialField_ErrorID_get(swigCPtr, this);
  }

  public void setErrorMsg(String value) {
    thosttraderapiJNI.CThostFtdcTransferSerialField_ErrorMsg_set(swigCPtr, this, value);
  }

  public String getErrorMsg() {
    return thosttraderapiJNI.CThostFtdcTransferSerialField_ErrorMsg_get(swigCPtr, this);
  }

  public CThostFtdcTransferSerialField() {
    this(thosttraderapiJNI.new_CThostFtdcTransferSerialField(), true);
  }

}
