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

    void(
        "AddInstructionCombiningPass",
        "See {@code llvm::createInstructionCombiningPass} function.",

        LLVMPassManagerRef("PM", "")
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

    void(
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

    void(
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