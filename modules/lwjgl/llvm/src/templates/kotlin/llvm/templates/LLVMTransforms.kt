/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package llvm.templates

import llvm.*
import org.lwjgl.generator.*

val LLVMTransforms = "LLVMTransforms".nativeClass(
    Module.LLVM,
    prefixConstant = "LLVM",
    prefixMethod = "LLVM",
    binding = LLVM_BINDING_DELEGATE
) {
    documentation = ""

    IgnoreMissing..void(
        "AddAggressiveInstCombinerPass",
        "See {@code llvm::createAggressiveInstCombinerPass} function.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddCoroEarlyPass",
        "See {@code llvm::createCoroEarlyPass} function.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddCoroSplitPass",
        "See {@code llvm::createCoroSplitPass} function.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddCoroElidePass",
        "See {@code llvm::createCoroElidePass} function.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddCoroCleanupPass",
        "See {@code llvm::createCoroCleanupPass} function.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "PassManagerBuilderAddCoroutinePassesToExtensionPoints",
        "See {@code llvm::addCoroutinePassesToExtensionPoints} function.",

        LLVMPassManagerBuilderRef("PMB", ""),

        since = "11"
    )

    IgnoreMissing..void(
        "AddInstructionCombiningPass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddInstructionSimplifyPass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", ""),

        since = "12"
    )

    IgnoreMissing..void(
        "AddArgumentPromotionPass",
        "See {@code llvm::createArgumentPromotionPass} function.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddConstantMergePass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddMergeFunctionsPass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", ""),

        since = "10"
    )

    IgnoreMissing..void(
        "AddCalledValuePropagationPass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddDeadArgEliminationPass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddFunctionAttrsPass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddFunctionInliningPass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddAlwaysInlinerPass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddGlobalDCEPass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddGlobalOptimizerPass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddIPConstantPropagationPass",
        "See {@code llvm::createIPConstantPropagationPass} function.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddPruneEHPass",
        "See {@code llvm::createPruneEHPass} function.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddIPSCCPPass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddInternalizePass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", ""),
        unsigned_int("AllButMain", "")
    )

    IgnoreMissing..void(
        "AddInternalizePassWithMustPreservePredicate",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", ""),
        opaque_p("Context", ""),
        LLVMMustPreserve("MustPreserve", ""),

        since = "10"
    )

    IgnoreMissing..void(
        "AddStripDeadPrototypesPass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddStripSymbolsPass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..LLVMErrorRef(
        "RunPasses",
        """
        Construct and run a set of passes over a module.

        This function takes a string with the passes that should be used. The format of this string is the same as opt's {@code -passes} argument for the new
        pass manager. Individual passes may be specified, separated by commas. Full pipelines may also be invoked using {@code default<O3>} and friends. See
        {@code opt} for full reference of the Passes format.
        """,

        LLVMModuleRef("M", ""),
        charUTF8.const.p("Passes", ""),
        LLVMTargetMachineRef("TM", ""),
        LLVMPassBuilderOptionsRef("Options", ""),

        since = "13"
    )

    IgnoreMissing..LLVMPassBuilderOptionsRef(
        "CreatePassBuilderOptions",
        """
        Create a new set of options for a {@code PassBuilder}.

        Ownership of the returned instance is given to the client, and they are responsible for it. The client should call #DisposePassBuilderOptions() to free
        the pass builder options.
        """,

        void(),

        since = "13"
    )

    IgnoreMissing..void(
        "PassBuilderOptionsSetVerifyEach",
        "Toggle adding the {@code VerifierPass} for the {@code PassBuilder}, ensuring all functions inside the module is valid.",

        LLVMPassBuilderOptionsRef("Options", ""),
        LLVMBool("VerifyEach", ""),

        since = "13"
    )

    IgnoreMissing..void(
        "PassBuilderOptionsSetDebugLogging",
        "Toggle debug logging when running the PassBuilder",

        LLVMPassBuilderOptionsRef("Options", ""),
        LLVMBool("DebugLogging", ""),

        since = "13"
    )

    IgnoreMissing..void(
        "PassBuilderOptionsSetLoopInterleaving",
        "",

        LLVMPassBuilderOptionsRef("Options", ""),
        LLVMBool("LoopInterleaving", ""),

        since = "13"
    )

    IgnoreMissing..void(
        "PassBuilderOptionsSetLoopVectorization",
        "",

        LLVMPassBuilderOptionsRef("Options", ""),
        LLVMBool("LoopVectorization", ""),

        since = "13"
    )

    IgnoreMissing..void(
        "PassBuilderOptionsSetSLPVectorization",
        "",

        LLVMPassBuilderOptionsRef("Options", ""),
        LLVMBool("SLPVectorization", ""),

        since = "13"
    )

    IgnoreMissing..void(
        "PassBuilderOptionsSetLoopUnrolling",
        "",

        LLVMPassBuilderOptionsRef("Options", ""),
        LLVMBool("LoopUnrolling", ""),

        since = "13"
    )

    IgnoreMissing..void(
        "PassBuilderOptionsSetForgetAllSCEVInLoopUnroll",
        "",

        LLVMPassBuilderOptionsRef("Options", ""),
        LLVMBool("ForgetAllSCEVInLoopUnroll", ""),

        since = "13"
    )

    IgnoreMissing..void(
        "PassBuilderOptionsSetLicmMssaOptCap",
        "",

        LLVMPassBuilderOptionsRef("Options", ""),
        unsigned("LicmMssaOptCap", ""),

        since = "13"
    )

    IgnoreMissing..void(
        "PassBuilderOptionsSetLicmMssaNoAccForPromotionCap",
        "",

        LLVMPassBuilderOptionsRef("Options", ""),
        unsigned("LicmMssaNoAccForPromotionCap", ""),

        since = "13"
    )

    IgnoreMissing..void(
        "PassBuilderOptionsSetCallGraphProfile",
        "",

        LLVMPassBuilderOptionsRef("Options", ""),
        LLVMBool("CallGraphProfile", ""),

        since = "13"
    )

    IgnoreMissing..void(
        "PassBuilderOptionsSetMergeFunctions",
        "",

        LLVMPassBuilderOptionsRef("Options", ""),
        LLVMBool("MergeFunctions", ""),

        since = "13"
    )

    IgnoreMissing..void(
        "PassBuilderOptionsSetInlinerThreshold",
        "",

        LLVMPassBuilderOptionsRef("Options", ""),
        int("Threshold", ""),

        since = "17"
    )

    IgnoreMissing..void(
        "DisposePassBuilderOptions",
        "Dispose of a heap-allocated {@code PassBuilderOptions} instance.",

        LLVMPassBuilderOptionsRef("Options", ""),

        since = "13"
    )

    IgnoreMissing..LLVMPassManagerBuilderRef(
        "PassManagerBuilderCreate",
        "Removed in LLVM 17.",

        void()
    )

    IgnoreMissing..void(
        "PassManagerBuilderDispose",
        "Removed in LLVM 17.",

        LLVMPassManagerBuilderRef("PMB", "")
    )

    IgnoreMissing..void(
        "PassManagerBuilderSetOptLevel",
        "Removed in LLVM 17.",

        LLVMPassManagerBuilderRef("PMB", ""),
        unsigned_int("OptLevel", "")
    )

    IgnoreMissing..void(
        "PassManagerBuilderSetSizeLevel",
        "Removed in LLVM 17.",

        LLVMPassManagerBuilderRef("PMB", ""),
        unsigned_int("SizeLevel", "")
    )

    IgnoreMissing..void(
        "PassManagerBuilderSetDisableUnitAtATime",
        "Removed in LLVM 17.",

        LLVMPassManagerBuilderRef("PMB", ""),
        LLVMBool("Value", "")
    )

    IgnoreMissing..void(
        "PassManagerBuilderSetDisableUnrollLoops",
        "Removed in LLVM 17.",

        LLVMPassManagerBuilderRef("PMB", ""),
        LLVMBool("Value", "")
    )

    IgnoreMissing..void(
        "PassManagerBuilderSetDisableSimplifyLibCalls",
        "Removed in LLVM 17.",

        LLVMPassManagerBuilderRef("PMB", ""),
        LLVMBool("Value", "")
    )

    IgnoreMissing..void(
        "PassManagerBuilderUseInlinerWithThreshold",
        "Removed in LLVM 17.",

        LLVMPassManagerBuilderRef("PMB", ""),
        unsigned_int("Threshold", "")
    )

    IgnoreMissing..void(
        "PassManagerBuilderPopulateFunctionPassManager",
        "Removed in LLVM 17.",

        LLVMPassManagerBuilderRef("PMB", ""),
        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "PassManagerBuilderPopulateModulePassManager",
        "Removed in LLVM 17.",

        LLVMPassManagerBuilderRef("PMB", ""),
        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "PassManagerBuilderPopulateLTOPassManager",
        "See {@code llvm::PassManagerBuilder::populateLTOPassManager}.",

        LLVMPassManagerBuilderRef("PMB", ""),
        LLVMPassManagerRef("PM", ""),
        LLVMBool("Internalize", ""),
        LLVMBool("RunInliner", "")
    )

    IgnoreMissing..void(
        "AddAggressiveDCEPass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddDCEPass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", ""),

        since = "10"
    )

    IgnoreMissing..void(
        "AddBitTrackingDCEPass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddAlignmentFromAssumptionsPass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddCFGSimplificationPass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddDeadStoreEliminationPass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddScalarizerPass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddMergedLoadStoreMotionPass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddGVNPass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddNewGVNPass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddIndVarSimplifyPass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddJumpThreadingPass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddLICMPass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddLoopDeletionPass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddLoopIdiomPass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddLoopRotatePass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddLoopRerollPass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddLoopUnrollPass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddLoopUnrollAndJamPass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddLoopUnswitchPass",
        "See {@code llvm::createLoopUnswitchPass} function.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddLowerAtomicPass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddMemCpyOptPass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddPartiallyInlineLibCallsPass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddReassociatePass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddSCCPPass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddScalarReplAggregatesPass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddScalarReplAggregatesPassSSA",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddScalarReplAggregatesPassWithThreshold",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", ""),
        int("Threshold", "")
    )

    IgnoreMissing..void(
        "AddSimplifyLibCallsPass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddTailCallEliminationPass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddConstantPropagationPass",
        "See {@code llvm::createConstantPropagationPass} function.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddDemoteMemoryToRegisterPass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddVerifierPass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddCorrelatedValuePropagationPass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddEarlyCSEPass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddEarlyCSEMemSSAPass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddLowerExpectIntrinsicPass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddLowerConstantIntrinsicsPass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", ""),

        since = "10"
    )

    IgnoreMissing..void(
        "AddTypeBasedAliasAnalysisPass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddScopedNoAliasAAPass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddBasicAliasAnalysisPass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddUnifyFunctionExitNodesPass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddLowerSwitchPass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddPromoteMemoryToRegisterPass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddAddDiscriminatorsPass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", ""),

        since = "9"
    )

    IgnoreMissing..void(
        "AddLoopVectorizePass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddSLPVectorizePass",
        "Removed in LLVM 17.",

        LLVMPassManagerRef("PM", "")
    )
}