// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/model_monitoring.proto

package com.google.cloud.aiplatform.v1;

public interface ModelMonitoringAlertConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.ModelMonitoringAlertConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Email alert config.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ModelMonitoringAlertConfig.EmailAlertConfig email_alert_config = 1;</code>
   * @return Whether the emailAlertConfig field is set.
   */
  boolean hasEmailAlertConfig();
  /**
   * <pre>
   * Email alert config.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ModelMonitoringAlertConfig.EmailAlertConfig email_alert_config = 1;</code>
   * @return The emailAlertConfig.
   */
  com.google.cloud.aiplatform.v1.ModelMonitoringAlertConfig.EmailAlertConfig getEmailAlertConfig();
  /**
   * <pre>
   * Email alert config.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ModelMonitoringAlertConfig.EmailAlertConfig email_alert_config = 1;</code>
   */
  com.google.cloud.aiplatform.v1.ModelMonitoringAlertConfig.EmailAlertConfigOrBuilder getEmailAlertConfigOrBuilder();

  public com.google.cloud.aiplatform.v1.ModelMonitoringAlertConfig.AlertCase getAlertCase();
}
