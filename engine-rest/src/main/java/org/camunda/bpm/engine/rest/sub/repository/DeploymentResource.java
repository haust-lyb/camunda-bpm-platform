/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.camunda.bpm.engine.rest.sub.repository;

import java.io.InputStream;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.camunda.bpm.engine.rest.dto.repository.DeploymentResourceDto;

public interface DeploymentResource {

  @GET
  @Path("/{resourceId}")
  @Produces(MediaType.APPLICATION_JSON)
  DeploymentResourceDto getDeploymentResource(@PathParam("resourceId") String resourceId);

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  List<DeploymentResourceDto> getDeploymentResources();

  @GET
  @Path("{resourceId}/data")
  @Produces(MediaType.APPLICATION_OCTET_STREAM)
  InputStream getDeploymentData(@PathParam("resourceId") String resourceId);

}
