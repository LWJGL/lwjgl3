/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package shaderc.templates

import shaderc.*
import org.lwjgl.generator.*

val spv_optimizer = "SPVOptimizer".nativeClass(Module.SHADERC, prefix = "SPV", prefixMethod = "spv", binding = simpleBinding(
    Module.SHADERC,
    libraryExpression = """Configuration.SPIRV_TOOLS_OPTIMIZER_LIBRARY_NAME, Shaderc::getLibrary"""
)) {
    spv_optimizer_t.p(
        "OptimizerCreate",

        spv_target_env("env")
    )

    void(
        "OptimizerDestroy",

        spv_optimizer_t.p("optimizer")
    )

    void(
        "OptimizerSetMessageConsumer",

        spv_optimizer_t.p("optimizer"),
        nullable..spv_message_consumer("consumer")
    )

    void(
        "OptimizerRegisterLegalizationPasses",

        spv_optimizer_t.p("optimizer")
    )

    void(
        "OptimizerRegisterPerformancePasses",

        spv_optimizer_t.p("optimizer")
    )

    void(
        "OptimizerRegisterSizePasses",

        spv_optimizer_t.p("optimizer")
    )

    bool(
        "OptimizerRegisterPassFromFlag",

        spv_optimizer_t.p("optimizer"),
        charASCII.const.p("flag")
    )

    bool(
        "OptimizerRegisterPassesFromFlags",

        spv_optimizer_t.p("optimizer"),
        charASCII.const.p.p("flags"),
        AutoSize("flags")..size_t.const("flag_count")
    )

    bool(
        "OptimizerRegisterPassesFromFlagsWhilePreservingTheInterface",

        spv_optimizer_t.p("optimizer"),
        charASCII.const.p.p("flags"),
        AutoSize("flags")..size_t.const("flag_count")
    )

    spv_result_t(
        "OptimizerRun",

        spv_optimizer_t.p("optimizer"),
        uint32_t.const.p("binary"),
        AutoSize("binary")..size_t.const("word_count"),
        Check(1)..spv_binary.p("optimized_binary"),
        spv_optimizer_options.const("options")
    )
}