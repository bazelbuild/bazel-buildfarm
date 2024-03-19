load("@io_grpc_grpc_java//:java_grpc_library.bzl", "java_grpc_library")

package(default_visibility = ["//visibility:public"])

java_grpc_library(
    name = "build_bazel_remote_asset_v1_remote_asset_java_grpc",
    srcs = [
        "@bazel_remote_apis//build/bazel/remote/asset/v1:remote_asset_proto",
    ],
    deps = [
        "@bazel_remote_apis//build/bazel/remote/asset/v1:remote_asset_java_grpc",
    ],
)

java_grpc_library(
    name = "build_bazel_remote_execution_v2_remote_execution_java_grpc",
    srcs = [
        "@bazel_remote_apis//build/bazel/remote/execution/v2:remote_execution_proto",
    ],
    deps = [
        "@bazel_remote_apis//build/bazel/remote/execution/v2:remote_execution_java_grpc",
    ],
)
