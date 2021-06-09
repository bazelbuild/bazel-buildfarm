load("@com_github_bazelbuild_buildtools//buildifier:def.bzl", "buildifier")
load("@io_bazel_rules_docker//java:image.bzl", "java_image")

package(default_visibility = ["//visibility:public"])

buildifier(
    name = "buildifier",
)

# These are execution wrappers that buildfarm may choose to use when executing actions.
# For their availability on a worker, they should be provided to a java_image as a "runtime_dep".
# The relevant configuration for workers is the "execution policy".
# That is where these binaries can be used and stacked.
# Buildfarm may also choose different execution wrappers dynamically based on exec_properties.
# Be aware that the process-wrapper and linux-sandbox come from bazel itself.
# Therefore, users may want to ensure that the same bazel version is sourced here as is used locally.
filegroup(
    name = "execution_wrappers",
    data = [
        ":as-nobody",
        ":linux-sandbox.binary",
        ":process-wrapper.binary",
        ":tini.binary",
    ],
)

genrule(
    name = "process-wrapper.binary",
    srcs = ["@bazel//src/main/tools:process-wrapper"],
    outs = ["process-wrapper"],
    cmd = "cp $< $@;",
)

genrule(
    name = "linux-sandbox.binary",
    srcs = ["@bazel//src/main/tools:linux-sandbox"],
    outs = ["linux-sandbox"],
    cmd = "cp $< $@;",
)

genrule(
    name = "tini.binary",
    srcs = ["@tini//file"],
    outs = ["tini"],
    cmd = "cp $< $@ && chmod +x $@",
)

cc_binary(
    name = "as-nobody",
    srcs = select({
        "//config:windows": ["as-nobody-windows.c"],
        "//conditions:default": ["as-nobody.c"],
    }),
)

# Docker images for buildfarm components
java_image(
    name = "buildfarm-server",
    base = "@amazon_corretto_java_image_base//image",
    classpath_resources = [
        "//src/main/java/build/buildfarm:configs",
    ],
    main_class = "build.buildfarm.server.BuildFarmServer",
    tags = ["container"],
    runtime_deps = [
        "//src/main/java/build/buildfarm/server",
    ],
)

java_image(
    name = "buildfarm-shard-worker",
    base = "@ubuntu-bionic//image",
    classpath_resources = [
        "//src/main/java/build/buildfarm:configs",
    ],
    entrypoint = [
        "/app/buildfarm/tini",
        "--",
    ],
    main_class = "build.buildfarm.worker.shard.Worker",
    tags = ["container"],
    runtime_deps = [
        ":as-nobody",
        ":linux-sandbox.binary",
        ":process-wrapper.binary",
        ":tini.binary",
        "//src/main/java/build/buildfarm/worker/shard",
    ],
)
