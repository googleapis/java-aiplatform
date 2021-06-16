/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.aiplatform.v1beta1;

import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
@Generated("by gapic-generator-java")
public class BatchPredictionJobName implements ResourceName {
  private static final PathTemplate PROJECT_LOCATION_BATCH_PREDICTION_JOB =
      PathTemplate.createWithoutUrlEncoding(
          "projects/{project}/locations/{location}/batchPredictionJobs/{batch_prediction_job}");
  private volatile Map<String, String> fieldValuesMap;
  private final String project;
  private final String location;
  private final String batchPredictionJob;

  @Deprecated
  protected BatchPredictionJobName() {
    project = null;
    location = null;
    batchPredictionJob = null;
  }

  private BatchPredictionJobName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    location = Preconditions.checkNotNull(builder.getLocation());
    batchPredictionJob = Preconditions.checkNotNull(builder.getBatchPredictionJob());
  }

  public String getProject() {
    return project;
  }

  public String getLocation() {
    return location;
  }

  public String getBatchPredictionJob() {
    return batchPredictionJob;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static BatchPredictionJobName of(
      String project, String location, String batchPredictionJob) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setBatchPredictionJob(batchPredictionJob)
        .build();
  }

  public static String format(String project, String location, String batchPredictionJob) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setBatchPredictionJob(batchPredictionJob)
        .build()
        .toString();
  }

  public static BatchPredictionJobName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PROJECT_LOCATION_BATCH_PREDICTION_JOB.validatedMatch(
            formattedString, "BatchPredictionJobName.parse: formattedString not in valid format");
    return of(
        matchMap.get("project"), matchMap.get("location"), matchMap.get("batch_prediction_job"));
  }

  public static List<BatchPredictionJobName> parseList(List<String> formattedStrings) {
    List<BatchPredictionJobName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<BatchPredictionJobName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (BatchPredictionJobName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PROJECT_LOCATION_BATCH_PREDICTION_JOB.matches(formattedString);
  }

  @Override
  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          if (project != null) {
            fieldMapBuilder.put("project", project);
          }
          if (location != null) {
            fieldMapBuilder.put("location", location);
          }
          if (batchPredictionJob != null) {
            fieldMapBuilder.put("batch_prediction_job", batchPredictionJob);
          }
          fieldValuesMap = fieldMapBuilder.build();
        }
      }
    }
    return fieldValuesMap;
  }

  public String getFieldValue(String fieldName) {
    return getFieldValuesMap().get(fieldName);
  }

  @Override
  public String toString() {
    return PROJECT_LOCATION_BATCH_PREDICTION_JOB.instantiate(
        "project", project, "location", location, "batch_prediction_job", batchPredictionJob);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      BatchPredictionJobName that = ((BatchPredictionJobName) o);
      return Objects.equals(this.project, that.project)
          && Objects.equals(this.location, that.location)
          && Objects.equals(this.batchPredictionJob, that.batchPredictionJob);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(project);
    h *= 1000003;
    h ^= Objects.hashCode(location);
    h *= 1000003;
    h ^= Objects.hashCode(batchPredictionJob);
    return h;
  }

  /**
   * Builder for projects/{project}/locations/{location}/batchPredictionJobs/{batch_prediction_job}.
   */
  public static class Builder {
    private String project;
    private String location;
    private String batchPredictionJob;

    protected Builder() {}

    public String getProject() {
      return project;
    }

    public String getLocation() {
      return location;
    }

    public String getBatchPredictionJob() {
      return batchPredictionJob;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setLocation(String location) {
      this.location = location;
      return this;
    }

    public Builder setBatchPredictionJob(String batchPredictionJob) {
      this.batchPredictionJob = batchPredictionJob;
      return this;
    }

    private Builder(BatchPredictionJobName batchPredictionJobName) {
      this.project = batchPredictionJobName.project;
      this.location = batchPredictionJobName.location;
      this.batchPredictionJob = batchPredictionJobName.batchPredictionJob;
    }

    public BatchPredictionJobName build() {
      return new BatchPredictionJobName(this);
    }
  }
}
