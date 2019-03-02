/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostapi;

public class CThostFtdcBrokerUserField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcBrokerUserField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcBrokerUserField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttraderapiJNI.delete_CThostFtdcBrokerUserField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thosttraderapiJNI.CThostFtdcBrokerUserField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttraderapiJNI.CThostFtdcBrokerUserField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thosttraderapiJNI.CThostFtdcBrokerUserField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thosttraderapiJNI.CThostFtdcBrokerUserField_UserID_get(swigCPtr, this);
  }

  public void setUserName(String value) {
    thosttraderapiJNI.CThostFtdcBrokerUserField_UserName_set(swigCPtr, this, value);
  }

  public String getUserName() {
    return thosttraderapiJNI.CThostFtdcBrokerUserField_UserName_get(swigCPtr, this);
  }

  public void setUserType(char value) {
    thosttraderapiJNI.CThostFtdcBrokerUserField_UserType_set(swigCPtr, this, value);
  }

  public char getUserType() {
    return thosttraderapiJNI.CThostFtdcBrokerUserField_UserType_get(swigCPtr, this);
  }

  public void setIsActive(int value) {
    thosttraderapiJNI.CThostFtdcBrokerUserField_IsActive_set(swigCPtr, this, value);
  }

  public int getIsActive() {
    return thosttraderapiJNI.CThostFtdcBrokerUserField_IsActive_get(swigCPtr, this);
  }

  public void setIsUsingOTP(int value) {
    thosttraderapiJNI.CThostFtdcBrokerUserField_IsUsingOTP_set(swigCPtr, this, value);
  }

  public int getIsUsingOTP() {
    return thosttraderapiJNI.CThostFtdcBrokerUserField_IsUsingOTP_get(swigCPtr, this);
  }

  public void setIsAuthForce(int value) {
    thosttraderapiJNI.CThostFtdcBrokerUserField_IsAuthForce_set(swigCPtr, this, value);
  }

  public int getIsAuthForce() {
    return thosttraderapiJNI.CThostFtdcBrokerUserField_IsAuthForce_get(swigCPtr, this);
  }

  public CThostFtdcBrokerUserField() {
    this(thosttraderapiJNI.new_CThostFtdcBrokerUserField(), true);
  }

}
