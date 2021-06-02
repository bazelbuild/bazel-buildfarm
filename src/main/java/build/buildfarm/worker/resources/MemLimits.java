// Copyright 2021 The Bazel Authors. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package build.buildfarm.worker;

import java.util.ArrayList;

/**
 * @class MemLimits
 * @brief Memory resource limitations imposed on specific actions.
 * @details These resource limitations are often specified by the client (via: exec_properties), but
 *     ultimately validated and decided by the server. Restricting memory usage can be beneficial to
 *     preventing hungry actions from bogging down the worker and affecting neighboring actions that
 *     may be sharing the same hardware. More importantly, being able to apply restrictions allows
 *     for a more efficient utilization of shared compute across different workers and action
 *     profiles. One might also consider using certain workers for particular memory loads, or
 *     allowing workers to schedule actions based on memory availability. These restrictions will
 *     ultimately encourage action writers to implement their actions more efficiently or opt for
 *     local execution as an alternative.
 */
public class MemLimits {
  /**
   * @field limit
   * @brief Whether or not we perform memory limiting on the action.
   * @details Depending on the server implementation, we may skip applying any restrictions to
   *     memory usage.
   */
  public boolean limit = false;

  /**
   * @field min
   * @brief The minimum memory required.
   * @details Client can suggest this though exec_properties.
   */
  public long min = 0;

  /**
   * @field max
   * @brief The maximum memory required.
   * @details Client can suggest this though exec_properties.
   */
  public long max = 0;

  /**
   * @field claimed
   * @brief The amount of memory actually claimed for the action.
   * @details This will be in the range of (min,max) when limited.
   */
  public long claimed = 0;

  /**
   * @field description
   * @brief Description explaining why settings were chosen.
   * @details This can be used to debug execution behavior.
   */
  public ArrayList<String> description = new ArrayList<>();
}
