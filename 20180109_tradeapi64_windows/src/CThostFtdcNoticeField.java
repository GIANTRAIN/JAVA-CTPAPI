/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostapi;

public class CThostFtdcNoticeField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcNoticeField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcNoticeField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttraderapiJNI.delete_CThostFtdcNoticeField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thosttraderapiJNI.CThostFtdcNoticeField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttraderapiJNI.CThostFtdcNoticeField_BrokerID_get(swigCPtr, this);
  }

  public void setContent(String value) {
    thosttraderapiJNI.CThostFtdcNoticeField_Content_set(swigCPtr, this, value);
  }

  public String getContent() {
    return thosttraderapiJNI.CThostFtdcNoticeField_Content_get(swigCPtr, this);
  }

  public void setSequenceLabel(String value) {
    thosttraderapiJNI.CThostFtdcNoticeField_SequenceLabel_set(swigCPtr, this, value);
  }

  public String getSequenceLabel() {
    return thosttraderapiJNI.CThostFtdcNoticeField_SequenceLabel_get(swigCPtr, this);
  }

  public CThostFtdcNoticeField() {
    this(thosttraderapiJNI.new_CThostFtdcNoticeField(), true);
  }

}
