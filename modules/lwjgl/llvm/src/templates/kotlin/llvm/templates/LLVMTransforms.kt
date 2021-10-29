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

    void(
        "AddInstructionCombiningPass",
        "See {@code llvm::createInstructionCombiningPass} function.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddInstructionSimplifyPass",
        "See {@code llvm::createInstSimplifyLegacyPass} function.",

        LLVMPassManagerRef("PM", ""),

        since = "12"
    )

    void(
        "AddArgumentPromotionPass",
        "See {@code llvm::createArgumentPromotionPass} function.",

        LLVMPassManagerRef("PM", "")
    )

    void(
        "AddConstantMergePass",
        "See {@code llvm::createConstantMergePass} function.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddMergeFunctionsPass",
        "See {@code llvm::createMergeFunctionsPass} function.",

        LLVMPassManagerRef("PM", ""),

        since = "10"
    )

    IgnoreMissing..void(
        "AddCalledValuePropagationPass",
        "See {@code llvm::createCalledValuePropagationPass} function.",

        LLVMPassManagerRef("PM", "")
    )

    void(
        "AddDeadArgEliminationPass",
        "See {@code llvm::createDeadArgEliminationPass} function.",

        LLVMPassManagerRef("PM", "")
    )

    void(
        "AddFunctionAttrsPass",
        "See {@code llvm::createFunctionAttrsPass} function.",

        LLVMPassManagerRef("PM", "")
    )

    void(
        "AddFunctionInliningPass",
        "See {@code llvm::createFunctionInliningPass} function.",

        LLVMPassManagerRef("PM", "")
    )

    void(
        "AddAlwaysInlinerPass",
        "See {@code llvm::createAlwaysInlinerPass} function.",

        LLVMPassManagerRef("PM", "")
    )

    void(
        "AddGlobalDCEPass",
        "See {@code llvm::createGlobalDCEPass} function.",

        LLVMPassManagerRef("PM", "")
    )

    void(
        "AddGlobalOptimizerPass",
        "See {@code llvm::createGlobalOptimizerPass} function.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddIPConstantPropagationPass",
        "See {@code llvm::createIPConstantPropagationPass} function.",

        LLVMPassManagerRef("PM", "")
    )

    void(
        "AddPruneEHPass",
        "See {@code llvm::createPruneEHPass} function.",

        LLVMPassManagerRef("PM", "")
    )

    void(
        "AddIPSCCPPass",
        "See {@code llvm::createIPSCCPPass} function.",

        LLVMPassManagerRef("PM", "")
    )

    void(
        "AddInternalizePass",
        "See {@code llvm::createInternalizePass} function.",

        LLVMPassManagerRef("PM", ""),
        unsigned_int("AllButMain", "")
    )

    IgnoreMissing..void(
        "AddInternalizePassWithMustPreservePredicate",
        """
        Create and add the internalize pass to the given pass manager with the provided preservation callback.

        The context parameter is forwarded to the callback on each invocation. As such, it is the responsibility of the caller to extend its lifetime until
        execution of this pass has finished.

        See {@code llvm::createInternalizePass} function.
        """,

        LLVMPassManagerRef("PM", ""),
        opaque_p("Context", ""),
        LLVMMustPreserve("MustPreserve", ""),

        since = "10"
    )

    void(
        "AddStripDeadPrototypesPass",
        "See {@code llvm::createStripDeadPrototypesPass} function.",

        LLVMPassManagerRef("PM", "")
    )

    void(
        "AddStripSymbolsPass",
        "See {@code llvm::createStripSymbolsPass} function.",

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
        "DisposePassBuilderOptions",
        "Dispose of a heap-allocated {@code PassBuilderOptions} instance.",

        LLVMPassBuilderOptionsRef("Options", ""),

        since = "13"
    )

    LLVMPassManagerBuilderRef(
        "PassManagerBuilderCreate",
        "See {@code llvm::PassManagerBuilder}.",

        void()
    )

    void(
        "PassManagerBuilderDispose",
        "",

        LLVMPassManagerBuilderRef("PMB", "")
    )

    void(
        "PassManagerBuilderSetOptLevel",
        "See {@code llvm::PassManagerBuilder::OptLevel}.",

        LLVMPassManagerBuilderRef("PMB", ""),
        unsigned_int("OptLevel", "")
    )

    void(
        "PassManagerBuilderSetSizeLevel",
        "See {@code llvm::PassManagerBuilder::SizeLevel}.",

        LLVMPassManagerBuilderRef("PMB", ""),
        unsigned_int("SizeLevel", "")
    )

    void(
        "PassManagerBuilderSetDisableUnitAtATime",
        "See {@code llvm::PassManagerBuilder::DisableUnitAtATime}.",

        LLVMPassManagerBuilderRef("PMB", ""),
        LLVMBool("Value", "")
    )

    void(
        "PassManagerBuilderSetDisableUnrollLoops",
        "See {@code llvm::PassManagerBuilder::DisableUnrollLoops}.",

        LLVMPassManagerBuilderRef("PMB", ""),
        LLVMBool("Value", "")
    )

    void(
        "PassManagerBuilderSetDisableSimplifyLibCalls",
        "See {@code llvm::PassManagerBuilder::DisableSimplifyLibCalls}",

        LLVMPassManagerBuilderRef("PMB", ""),
        LLVMBool("Value", "")
    )

    void(
        "PassManagerBuilderUseInlinerWithThreshold",
        "See {@code llvm::PassManagerBuilder::Inliner}.",

        LLVMPassManagerBuilderRef("PMB", ""),
        unsigned_int("Threshold", "")
    )

    void(
        "PassManagerBuilderPopulateFunctionPassManager",
        "See {@code llvm::PassManagerBuilder::populateFunctionPassManager}.",

        LLVMPassManagerBuilderRef("PMB", ""),
        LLVMPassManagerRef("PM", "")
    )

    void(
        "PassManagerBuilderPopulateModulePassManager",
        "See {@code llvm::PassManagerBuilder::populateModulePassManager}.",

        LLVMPassManagerBuilderRef("PMB", ""),
        LLVMPassManagerRef("PM", "")
    )

    void(
        "PassManagerBuilderPopulateLTOPassManager",
        "See {@code llvm::PassManagerBuilder::populateLTOPassManager}.",

        LLVMPassManagerBuilderRef("PMB", ""),
        LLVMPassManagerRef("PM", ""),
        LLVMBool("Internalize", ""),
        LLVMBool("RunInliner", "")
    )

    void(
        "AddAggressiveDCEPass",
        "See {@code llvm::createAggressiveDCEPass} function.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddDCEPass",
        "See {@code llvm::createDeadCodeEliminationPass} function.",

        LLVMPassManagerRef("PM", ""),

        since = "10"
    )

    void(
        "AddBitTrackingDCEPass",
        "See {@code llvm::createBitTrackingDCEPass} function.",

        LLVMPassManagerRef("PM", "")
    )

    void(
        "AddAlignmentFromAssumptionsPass",
        "See {@code llvm::createAlignmentFromAssumptionsPass} function.",

        LLVMPassManagerRef("PM", "")
    )

    void(
        "AddCFGSimplificationPass",
        "See {@code llvm::createCFGSimplificationPass} function.",

        LLVMPassManagerRef("PM", "")
    )

    void(
        "AddDeadStoreEliminationPass",
        "See {@code llvm::createDeadStoreEliminationPass} function.",

        LLVMPassManagerRef("PM", "")
    )

    void(
        "AddScalarizerPass",
        "See {@code llvm::createScalarizerPass} function.",

        LLVMPassManagerRef("PM", "")
    )

    void(
        "AddMergedLoadStoreMotionPass",
        "See {@code llvm::createMergedLoadStoreMotionPass} function.",

        LLVMPassManagerRef("PM", "")
    )

    void(
        "AddGVNPass",
        "See {@code llvm::createGVNPass} function.",

        LLVMPassManagerRef("PM", "")
    )

    void(
        "AddNewGVNPass",
        "See {@code llvm::createGVNPass} function.",

        LLVMPassManagerRef("PM", "")
    )

    void(
        "AddIndVarSimplifyPass",
        "See {@code llvm::createIndVarSimplifyPass} function.",

        LLVMPassManagerRef("PM", "")
    )

    void(
        "AddJumpThreadingPass",
        "See {@code llvm::createJumpThreadingPass} function.",

        LLVMPassManagerRef("PM", "")
    )

    void(
        "AddLICMPass",
        "See {@code llvm::createLICMPass} function.",

        LLVMPassManagerRef("PM", "")
    )

    void(
        "AddLoopDeletionPass",
        "See {@code llvm::createLoopDeletionPass} function.",

        LLVMPassManagerRef("PM", "")
    )

    void(
        "AddLoopIdiomPass",
        "See {@code llvm::createLoopIdiomPass} function",

        LLVMPassManagerRef("PM", "")
    )

    void(
        "AddLoopRotatePass",
        "See {@code llvm::createLoopRotatePass} function.",

        LLVMPassManagerRef("PM", "")
    )

    void(
        "AddLoopRerollPass",
        "See {@code llvm::createLoopRerollPass} function.",

        LLVMPassManagerRef("PM", "")
    )

    void(
        "AddLoopUnrollPass",
        "See {@code llvm::createLoopUnrollPass} function.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddLoopUnrollAndJamPass",
        "See {@code llvm::createLoopUnrollAndJamPass} function.",

        LLVMPassManagerRef("PM", "")
    )

    void(
        "AddLoopUnswitchPass",
        "See {@code llvm::createLoopUnswitchPass} function.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddLowerAtomicPass",
        "See {@code llvm::createLowerAtomicPass} function.",

        LLVMPassManagerRef("PM", "")
    )

    void(
        "AddMemCpyOptPass",
        "See {@code llvm::createMemCpyOptPass} function.",

        LLVMPassManagerRef("PM", "")
    )

    void(
        "AddPartiallyInlineLibCallsPass",
        "See {@code llvm::createPartiallyInlineLibCallsPass} function.",

        LLVMPassManagerRef("PM", "")
    )

    void(
        "AddReassociatePass",
        "See {@code llvm::createReassociatePass} function.",

        LLVMPassManagerRef("PM", "")
    )

    void(
        "AddSCCPPass",
        "See {@code llvm::createSCCPPass} function.",

        LLVMPassManagerRef("PM", "")
    )

    void(
        "AddScalarReplAggregatesPass",
        "See {@code llvm::createSROAPass} function.",

        LLVMPassManagerRef("PM", "")
    )

    void(
        "AddScalarReplAggregatesPassSSA",
        "See {@code llvm::createSROAPass} function.",

        LLVMPassManagerRef("PM", "")
    )

    void(
        "AddScalarReplAggregatesPassWithThreshold",
        "See {@code llvm::createSROAPass} function.",

        LLVMPassManagerRef("PM", ""),
        int("Threshold", "")
    )

    void(
        "AddSimplifyLibCallsPass",
        "See {@code llvm::createSimplifyLibCallsPass} function.",

        LLVMPassManagerRef("PM", "")
    )

    void(
        "AddTailCallEliminationPass",
        "See {@code llvm::createTailCallEliminationPass} function.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddConstantPropagationPass",
        "See {@code llvm::createConstantPropagationPass} function.",

        LLVMPassManagerRef("PM", "")
    )

    void(
        "AddDemoteMemoryToRegisterPass",
        "See {@code llvm::demotePromoteMemoryToRegisterPass} function.",

        LLVMPassManagerRef("PM", "")
    )

    void(
        "AddVerifierPass",
        "See {@code llvm::createVerifierPass} function.",

        LLVMPassManagerRef("PM", "")
    )

    void(
        "AddCorrelatedValuePropagationPass",
        "See {@code llvm::createCorrelatedValuePropagationPass} function",

        LLVMPassManagerRef("PM", "")
    )

    void(
        "AddEarlyCSEPass",
        "See {@code llvm::createEarlyCSEPass} function",

        LLVMPassManagerRef("PM", "")
    )

    void(
        "AddEarlyCSEMemSSAPass",
        "See {@code llvm::createEarlyCSEPass} function",

        LLVMPassManagerRef("PM", "")
    )

    void(
        "AddLowerExpectIntrinsicPass",
        "See {@code llvm::createLowerExpectIntrinsicPass} function",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddLowerConstantIntrinsicsPass",
        "See {@code llvm::createLowerConstantIntrinsicsPass} function",

        LLVMPassManagerRef("PM", ""),

        since = "10"
    )

    void(
        "AddTypeBasedAliasAnalysisPass",
        "See {@code llvm::createTypeBasedAliasAnalysisPass} function",

        LLVMPassManagerRef("PM", "")
    )

    void(
        "AddScopedNoAliasAAPass",
        "See {@code llvm::createScopedNoAliasAAPass} function",

        LLVMPassManagerRef("PM", "")
    )

    void(
        "AddBasicAliasAnalysisPass",
        "See {@code llvm::createBasicAliasAnalysisPass} function",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddUnifyFunctionExitNodesPass",
        "See {@code llvm::createUnifyFunctionExitNodesPass} function",

        LLVMPassManagerRef("PM", "")
    )

    void(
        "AddLowerSwitchPass",
        "See {@code llvm::createLowerSwitchPass} function.",

        LLVMPassManagerRef("PM", "")
    )

    void(
        "AddPromoteMemoryToRegisterPass",
        "See {@code llvm::createPromoteMemoryToRegisterPass} function.",

        LLVMPassManagerRef("PM", "")
    )

    IgnoreMissing..void(
        "AddAddDiscriminatorsPass",
        "See {@code llvm::createAddDiscriminatorsPass} function.",

        LLVMPassManagerRef("PM", ""),

        since = "9"
    )

    void(
        "AddLoopVectorizePass",
        "See {@code llvm::createLoopVectorizePass} function.",

        LLVMPassManagerRef("PM", "")
    )

    void(
        "AddSLPVectorizePass",
        "See {@code llvm::createSLPVectorizerPass} function.",

        LLVMPassManagerRef("PM", "")
    )
}