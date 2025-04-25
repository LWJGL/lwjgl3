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
    IgnoreMissing..void(
        "AddAggressiveInstCombinerPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddCoroEarlyPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddCoroSplitPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddCoroElidePass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddCoroCleanupPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "PassManagerBuilderAddCoroutinePassesToExtensionPoints",

        LLVMPassManagerBuilderRef("PMB")
    )

    IgnoreMissing..void(
        "AddInstructionCombiningPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddInstructionSimplifyPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddArgumentPromotionPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddConstantMergePass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddMergeFunctionsPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddCalledValuePropagationPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddDeadArgEliminationPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddFunctionAttrsPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddFunctionInliningPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddAlwaysInlinerPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddGlobalDCEPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddGlobalOptimizerPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddIPConstantPropagationPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddPruneEHPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddIPSCCPPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddInternalizePass",

        LLVMPassManagerRef("PM"),
        unsigned_int("AllButMain")
    )

    IgnoreMissing..void(
        "AddInternalizePassWithMustPreservePredicate",

        LLVMPassManagerRef("PM"),
        opaque_p("Context"),
        LLVMMustPreserve("MustPreserve")
    )

    IgnoreMissing..void(
        "AddStripDeadPrototypesPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddStripSymbolsPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..LLVMErrorRef(
        "RunPasses",

        LLVMModuleRef("M"),
        charUTF8.const.p("Passes"),
        LLVMTargetMachineRef("TM"),
        LLVMPassBuilderOptionsRef("Options")
    )

    IgnoreMissing..LLVMErrorRef(
        "RunPassesOnFunction",

        LLVMValueRef("F"),
        charUTF8.const.p("Passes"),
        LLVMTargetMachineRef("TM"),
        LLVMPassBuilderOptionsRef("Options")
    )

    IgnoreMissing..LLVMPassBuilderOptionsRef(
        "CreatePassBuilderOptions",

        void()
    )

    IgnoreMissing..void(
        "PassBuilderOptionsSetVerifyEach",

        LLVMPassBuilderOptionsRef("Options"),
        LLVMBool("VerifyEach")
    )

    IgnoreMissing..void(
        "PassBuilderOptionsSetDebugLogging",

        LLVMPassBuilderOptionsRef("Options"),
        LLVMBool("DebugLogging")
    )

    IgnoreMissing..void(
        "PassBuilderOptionsSetAAPipeline",

        LLVMPassBuilderOptionsRef("Options"),
        charUTF8.const.p("AAPipeline")
    )

    IgnoreMissing..void(
        "PassBuilderOptionsSetLoopInterleaving",

        LLVMPassBuilderOptionsRef("Options"),
        LLVMBool("LoopInterleaving")
    )

    IgnoreMissing..void(
        "PassBuilderOptionsSetLoopVectorization",

        LLVMPassBuilderOptionsRef("Options"),
        LLVMBool("LoopVectorization")
    )

    IgnoreMissing..void(
        "PassBuilderOptionsSetSLPVectorization",

        LLVMPassBuilderOptionsRef("Options"),
        LLVMBool("SLPVectorization")
    )

    IgnoreMissing..void(
        "PassBuilderOptionsSetLoopUnrolling",

        LLVMPassBuilderOptionsRef("Options"),
        LLVMBool("LoopUnrolling")
    )

    IgnoreMissing..void(
        "PassBuilderOptionsSetForgetAllSCEVInLoopUnroll",

        LLVMPassBuilderOptionsRef("Options"),
        LLVMBool("ForgetAllSCEVInLoopUnroll")
    )

    IgnoreMissing..void(
        "PassBuilderOptionsSetLicmMssaOptCap",

        LLVMPassBuilderOptionsRef("Options"),
        unsigned("LicmMssaOptCap"),
    )

    IgnoreMissing..void(
        "PassBuilderOptionsSetLicmMssaNoAccForPromotionCap",

        LLVMPassBuilderOptionsRef("Options"),
        unsigned("LicmMssaNoAccForPromotionCap")
    )

    IgnoreMissing..void(
        "PassBuilderOptionsSetCallGraphProfile",

        LLVMPassBuilderOptionsRef("Options"),
        LLVMBool("CallGraphProfile")
    )

    IgnoreMissing..void(
        "PassBuilderOptionsSetMergeFunctions",

        LLVMPassBuilderOptionsRef("Options"),
        LLVMBool("MergeFunctions")
    )

    IgnoreMissing..void(
        "PassBuilderOptionsSetInlinerThreshold",

        LLVMPassBuilderOptionsRef("Options"),
        int("Threshold")
    )

    IgnoreMissing..void(
        "DisposePassBuilderOptions",

        LLVMPassBuilderOptionsRef("Options")
    )

    IgnoreMissing..LLVMPassManagerBuilderRef(
        "PassManagerBuilderCreate",

        void()
    )

    IgnoreMissing..void(
        "PassManagerBuilderDispose",

        LLVMPassManagerBuilderRef("PMB")
    )

    IgnoreMissing..void(
        "PassManagerBuilderSetOptLevel",

        LLVMPassManagerBuilderRef("PMB"),
        unsigned_int("OptLevel")
    )

    IgnoreMissing..void(
        "PassManagerBuilderSetSizeLevel",

        LLVMPassManagerBuilderRef("PMB"),
        unsigned_int("SizeLevel")
    )

    IgnoreMissing..void(
        "PassManagerBuilderSetDisableUnitAtATime",

        LLVMPassManagerBuilderRef("PMB"),
        LLVMBool("Value")
    )

    IgnoreMissing..void(
        "PassManagerBuilderSetDisableUnrollLoops",

        LLVMPassManagerBuilderRef("PMB"),
        LLVMBool("Value")
    )

    IgnoreMissing..void(
        "PassManagerBuilderSetDisableSimplifyLibCalls",

        LLVMPassManagerBuilderRef("PMB"),
        LLVMBool("Value")
    )

    IgnoreMissing..void(
        "PassManagerBuilderUseInlinerWithThreshold",

        LLVMPassManagerBuilderRef("PMB"),
        unsigned_int("Threshold")
    )

    IgnoreMissing..void(
        "PassManagerBuilderPopulateFunctionPassManager",

        LLVMPassManagerBuilderRef("PMB"),
        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "PassManagerBuilderPopulateModulePassManager",

        LLVMPassManagerBuilderRef("PMB"),
        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "PassManagerBuilderPopulateLTOPassManager",

        LLVMPassManagerBuilderRef("PMB"),
        LLVMPassManagerRef("PM"),
        LLVMBool("Internalize"),
        LLVMBool("RunInliner")
    )

    IgnoreMissing..void(
        "AddAggressiveDCEPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddDCEPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddBitTrackingDCEPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddAlignmentFromAssumptionsPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddCFGSimplificationPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddDeadStoreEliminationPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddScalarizerPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddMergedLoadStoreMotionPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddGVNPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddNewGVNPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddIndVarSimplifyPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddJumpThreadingPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddLICMPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddLoopDeletionPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddLoopIdiomPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddLoopRotatePass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddLoopRerollPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddLoopUnrollPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddLoopUnrollAndJamPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddLoopUnswitchPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddLowerAtomicPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddMemCpyOptPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddPartiallyInlineLibCallsPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddReassociatePass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddSCCPPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddScalarReplAggregatesPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddScalarReplAggregatesPassSSA",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddScalarReplAggregatesPassWithThreshold",

        LLVMPassManagerRef("PM"),
        int("Threshold")
    )

    IgnoreMissing..void(
        "AddSimplifyLibCallsPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddTailCallEliminationPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddConstantPropagationPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddDemoteMemoryToRegisterPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddVerifierPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddCorrelatedValuePropagationPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddEarlyCSEPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddEarlyCSEMemSSAPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddLowerExpectIntrinsicPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddLowerConstantIntrinsicsPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddTypeBasedAliasAnalysisPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddScopedNoAliasAAPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddBasicAliasAnalysisPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddUnifyFunctionExitNodesPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddLowerSwitchPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddPromoteMemoryToRegisterPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddAddDiscriminatorsPass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddLoopVectorizePass",

        LLVMPassManagerRef("PM")
    )

    IgnoreMissing..void(
        "AddSLPVectorizePass",

        LLVMPassManagerRef("PM")
    )
}