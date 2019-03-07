/*
Licensed to the Apache Software Foundation (ASF) under one
or more contributor license agreements.  See the NOTICE file
distributed with this work for additional information
regarding copyright ownership.  The ASF licenses this file
to you under the Apache License, Version 2.0 (the
"License"); you may not use this file except in compliance
with the License.  You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing,
software distributed under the License is distributed on an
"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
KIND, either express or implied.  See the License for the
specific language governing permissions and limitations
under the License.
*/
package org.apache.edgent.execution;

import org.apache.edgent.execution.services.ServiceContainer;

/**
 * An interface for submission of an executable
 * that is executed directly within the current
 * virtual machine.
 * 
 * @param <E> the executable type
 * @param <J> the submitted executable's future
 */
public interface DirectSubmitter<E, J extends Job> extends Submitter<E,J> {
    
    /**
     * Access to services.
     * 
     * Since any executables are executed directly within
     * the current virtual machine, callers may register
     * services that are visible to the executable
     * and its elements.
     * 
     * @return Service container for this submitter.
     */
    ServiceContainer getServices();
}