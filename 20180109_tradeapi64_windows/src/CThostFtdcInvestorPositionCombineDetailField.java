/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostapi;

public class CThostFtdcInvestorPositionCombineDetailField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcInvestorPositionCombineDetailField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcInvestorPositionCombineDetailField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttraderapiJNI.delete_CThostFtdcInvestorPositionCombineDetailField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradingDay(String value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionCombineDetailField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionCombineDetailField_TradingDay_get(swigCPtr, this);
  }

  public void setOpenDate(String value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionCombineDetailField_OpenDate_set(swigCPtr, this, value);
  }

  public String getOpenDate() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionCombineDetailField_OpenDate_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionCombineDetailField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionCombineDetailField_ExchangeID_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionCombineDetailField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionCombineDetailField_SettlementID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionCombineDetailField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionCombineDetailField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionCombineDetailField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionCombineDetailField_InvestorID_get(swigCPtr, this);
  }

  public void setComTradeID(String value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionCombineDetailField_ComTradeID_set(swigCPtr, this, value);
  }

  public String getComTradeID() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionCombineDetailField_ComTradeID_get(swigCPtr, this);
  }

  public void setTradeID(String value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionCombineDetailField_TradeID_set(swigCPtr, this, value);
  }

  public String getTradeID() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionCombineDetailField_TradeID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionCombineDetailField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionCombineDetailField_InstrumentID_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionCombineDetailField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionCombineDetailField_HedgeFlag_get(swigCPtr, this);
  }

  public void setDirection(char value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionCombineDetailField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionCombineDetailField_Direction_get(swigCPtr, this);
  }

  public void setTotalAmt(int value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionCombineDetailField_TotalAmt_set(swigCPtr, this, value);
  }

  public int getTotalAmt() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionCombineDetailField_TotalAmt_get(swigCPtr, this);
  }

  public void setMargin(double value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionCombineDetailField_Margin_set(swigCPtr, this, value);
  }

  public double getMargin() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionCombineDetailField_Margin_get(swigCPtr, this);
  }

  public void setExchMargin(double value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionCombineDetailField_ExchMargin_set(swigCPtr, this, value);
  }

  public double getExchMargin() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionCombineDetailField_ExchMargin_get(swigCPtr, this);
  }

  public void setMarginRateByMoney(double value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionCombineDetailField_MarginRateByMoney_set(swigCPtr, this, value);
  }

  public double getMarginRateByMoney() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionCombineDetailField_MarginRateByMoney_get(swigCPtr, this);
  }

  public void setMarginRateByVolume(double value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionCombineDetailField_MarginRateByVolume_set(swigCPtr, this, value);
  }

  public double getMarginRateByVolume() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionCombineDetailField_MarginRateByVolume_get(swigCPtr, this);
  }

  public void setLegID(int value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionCombineDetailField_LegID_set(swigCPtr, this, value);
  }

  public int getLegID() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionCombineDetailField_LegID_get(swigCPtr, this);
  }

  public void setLegMultiple(int value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionCombineDetailField_LegMultiple_set(swigCPtr, this, value);
  }

  public int getLegMultiple() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionCombineDetailField_LegMultiple_get(swigCPtr, this);
  }

  public void setCombInstrumentID(String value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionCombineDetailField_CombInstrumentID_set(swigCPtr, this, value);
  }

  public String getCombInstrumentID() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionCombineDetailField_CombInstrumentID_get(swigCPtr, this);
  }

  public void setTradeGroupID(int value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionCombineDetailField_TradeGroupID_set(swigCPtr, this, value);
  }

  public int getTradeGroupID() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionCombineDetailField_TradeGroupID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionCombineDetailField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionCombineDetailField_InvestUnitID_get(swigCPtr, this);
  }

  public CThostFtdcInvestorPositionCombineDetailField() {
    this(thosttraderapiJNI.new_CThostFtdcInvestorPositionCombineDetailField(), true);
  }

}
