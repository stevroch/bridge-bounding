/*
  @(#) RandomIndexableVertexFactory.java	1.0,	05/07/2013
  
  Bridge Bounding, https://github.com/kleinmind/bridge-bounding
  
  Copyright 2013 Symeon Papadopoulos

  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
*/
package graph;

import jung.StringIndexableVertex;

/**
 * Defines a generator for unique indexable vertices.
 * @author Symeon Papadopoulos
 *
 */
public interface RandomIndexableVertexFactory {

	/**
	 * Create a new indexable vertex that is different from the 
	 * ones that were generated before.
	 * @return
	 */
	public StringIndexableVertex createRandomIndexableVertex();
	
}