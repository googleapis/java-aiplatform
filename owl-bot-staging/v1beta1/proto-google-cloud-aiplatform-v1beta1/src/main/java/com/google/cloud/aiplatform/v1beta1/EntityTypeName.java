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
public class EntityTypeName implements ResourceName {
  private static final PathTemplate PROJECT_LOCATION_FEATURESTORE_ENTITY_TYPE =
      PathTemplate.createWithoutUrlEncoding(
          "projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}");
  private volatile Map<String, String> fieldValuesMap;
  private final String project;
  private final String location;
  private final String featurestore;
  private final String entityType;

  @Deprecated
  protected EntityTypeName() {
    project = null;
    location = null;
    featurestore = null;
    entityType = null;
  }

  private EntityTypeName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    location = Preconditions.checkNotNull(builder.getLocation());
    featurestore = Preconditions.checkNotNull(builder.getFeaturestore());
    entityType = Preconditions.checkNotNull(builder.getEntityType());
  }

  public String getProject() {
    return project;
  }

  public String getLocation() {
    return location;
  }

  public String getFeaturestore() {
    return featurestore;
  }

  public String getEntityType() {
    return entityType;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static EntityTypeName of(
      String project, String location, String featurestore, String entityType) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setFeaturestore(featurestore)
        .setEntityType(entityType)
        .build();
  }

  public static String format(
      String project, String location, String featurestore, String entityType) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setFeaturestore(featurestore)
        .setEntityType(entityType)
        .build()
        .toString();
  }

  public static EntityTypeName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PROJECT_LOCATION_FEATURESTORE_ENTITY_TYPE.validatedMatch(
            formattedString, "EntityTypeName.parse: formattedString not in valid format");
    return of(
        matchMap.get("project"),
        matchMap.get("location"),
        matchMap.get("featurestore"),
        matchMap.get("entity_type"));
  }

  public static List<EntityTypeName> parseList(List<String> formattedStrings) {
    List<EntityTypeName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<EntityTypeName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (EntityTypeName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PROJECT_LOCATION_FEATURESTORE_ENTITY_TYPE.matches(formattedString);
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
          if (featurestore != null) {
            fieldMapBuilder.put("featurestore", featurestore);
          }
          if (entityType != null) {
            fieldMapBuilder.put("entity_type", entityType);
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
    return PROJECT_LOCATION_FEATURESTORE_ENTITY_TYPE.instantiate(
        "project",
        project,
        "location",
        location,
        "featurestore",
        featurestore,
        "entity_type",
        entityType);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      EntityTypeName that = ((EntityTypeName) o);
      return Objects.equals(this.project, that.project)
          && Objects.equals(this.location, that.location)
          && Objects.equals(this.featurestore, that.featurestore)
          && Objects.equals(this.entityType, that.entityType);
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
    h ^= Objects.hashCode(featurestore);
    h *= 1000003;
    h ^= Objects.hashCode(entityType);
    return h;
  }

  /**
   * Builder for
   * projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}.
   */
  public static class Builder {
    private String project;
    private String location;
    private String featurestore;
    private String entityType;

    protected Builder() {}

    public String getProject() {
      return project;
    }

    public String getLocation() {
      return location;
    }

    public String getFeaturestore() {
      return featurestore;
    }

    public String getEntityType() {
      return entityType;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setLocation(String location) {
      this.location = location;
      return this;
    }

    public Builder setFeaturestore(String featurestore) {
      this.featurestore = featurestore;
      return this;
    }

    public Builder setEntityType(String entityType) {
      this.entityType = entityType;
      return this;
    }

    private Builder(EntityTypeName entityTypeName) {
      this.project = entityTypeName.project;
      this.location = entityTypeName.location;
      this.featurestore = entityTypeName.featurestore;
      this.entityType = entityTypeName.entityType;
    }

    public EntityTypeName build() {
      return new EntityTypeName(this);
    }
  }
}
