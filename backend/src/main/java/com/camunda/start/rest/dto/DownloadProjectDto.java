/*
 * Copyright Camunda Services GmbH and/or licensed to Camunda Services GmbH
 * under one or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information regarding copyright
 * ownership. Camunda licenses this file to you under the Apache License,
 * Version 2.0; you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.camunda.start.rest.dto;

import java.util.List;

public class DownloadProjectDto {

  public String username;
  public String password;

  public String database;

  public String group;
  public String artifact;
  public String version;

  public String camundaVersion;
  public String springBootVersion;
  public String javaVersion;

  public List<String> modules;

  public void setGroup(String group) {
    this.group = group;
  }

  public String getGroup() {
    return group;
  }

  public void setDatabase(String database) {
    this.database = database;
  }

  public String getDatabase() {
    return database;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getUsername() {
    return username;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getPassword() {
    return password;
  }

  public void setSpringBootVersion(String springBootVersion) {
    this.springBootVersion = springBootVersion;
  }

  public String getSpringBootVersion() {
    return springBootVersion;
  }

  public void setJavaVersion(String javaVersion) {
    this.javaVersion = javaVersion;
  }

  public String getJavaVersion() {
    return javaVersion;
  }

  public void setArtifact(String artifact) {
    this.artifact = artifact;
  }

  public String getArtifact() {
    return artifact;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public String getVersion() {
    return version;
  }

  public void setCamundaVersion(String camundaVersion) {
    this.camundaVersion = camundaVersion;
  }

  public String getCamundaVersion() {
    return camundaVersion;
  }

  public void setModules(List<String> modules) {
    this.modules = modules;
  }

  public List<String> getModules() {
    return modules;
  }

}
