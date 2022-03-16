/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/custom_job.proto

package com.google.cloud.aiplatform.v1beta1;

public interface WorkerPoolSpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.WorkerPoolSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The custom container task.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ContainerSpec container_spec = 6;</code>
   *
   * @return Whether the containerSpec field is set.
   */
  boolean hasContainerSpec();
  /**
   *
   *
   * <pre>
   * The custom container task.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ContainerSpec container_spec = 6;</code>
   *
   * @return The containerSpec.
   */
  com.google.cloud.aiplatform.v1beta1.ContainerSpec getContainerSpec();
  /**
   *
   *
   * <pre>
   * The custom container task.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ContainerSpec container_spec = 6;</code>
   */
  com.google.cloud.aiplatform.v1beta1.ContainerSpecOrBuilder getContainerSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * The Python packaged task.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.PythonPackageSpec python_package_spec = 7;</code>
   *
   * @return Whether the pythonPackageSpec field is set.
   */
  boolean hasPythonPackageSpec();
  /**
   *
   *
   * <pre>
   * The Python packaged task.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.PythonPackageSpec python_package_spec = 7;</code>
   *
   * @return The pythonPackageSpec.
   */
  com.google.cloud.aiplatform.v1beta1.PythonPackageSpec getPythonPackageSpec();
  /**
   *
   *
   * <pre>
   * The Python packaged task.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.PythonPackageSpec python_package_spec = 7;</code>
   */
  com.google.cloud.aiplatform.v1beta1.PythonPackageSpecOrBuilder getPythonPackageSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Immutable. The specification of a single machine.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.MachineSpec machine_spec = 1 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return Whether the machineSpec field is set.
   */
  boolean hasMachineSpec();
  /**
   *
   *
   * <pre>
   * Optional. Immutable. The specification of a single machine.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.MachineSpec machine_spec = 1 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The machineSpec.
   */
  com.google.cloud.aiplatform.v1beta1.MachineSpec getMachineSpec();
  /**
   *
   *
   * <pre>
   * Optional. Immutable. The specification of a single machine.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.MachineSpec machine_spec = 1 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.MachineSpecOrBuilder getMachineSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The number of worker replicas to use for this worker pool.
   * </pre>
   *
   * <code>int64 replica_count = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The replicaCount.
   */
  long getReplicaCount();

  /**
   *
   *
   * <pre>
   * Disk spec.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.DiskSpec disk_spec = 5;</code>
   *
   * @return Whether the diskSpec field is set.
   */
  boolean hasDiskSpec();
  /**
   *
   *
   * <pre>
   * Disk spec.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.DiskSpec disk_spec = 5;</code>
   *
   * @return The diskSpec.
   */
  com.google.cloud.aiplatform.v1beta1.DiskSpec getDiskSpec();
  /**
   *
   *
   * <pre>
   * Disk spec.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.DiskSpec disk_spec = 5;</code>
   */
  com.google.cloud.aiplatform.v1beta1.DiskSpecOrBuilder getDiskSpecOrBuilder();

  public com.google.cloud.aiplatform.v1beta1.WorkerPoolSpec.TaskCase getTaskCase();
}
