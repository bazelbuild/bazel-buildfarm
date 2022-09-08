// Copyright 2020 The Bazel Authors. All rights reserved.
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

package build.buildfarm.metrics.gcp;

import build.buildfarm.common.config.yml.BuildfarmConfigs;
import build.buildfarm.metrics.AbstractMetricsPublisher;

public class GcpMetricsPublisher extends AbstractMetricsPublisher {
  private static BuildfarmConfigs configs = BuildfarmConfigs.getInstance();

  public GcpMetricsPublisher() {
    super(configs.getServer().getClusterId());
  }

  @Override
  public void publishMetric(String metricName, Object metricValue) {
    throw new UnsupportedOperationException();
  }
}
