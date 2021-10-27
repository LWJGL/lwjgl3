/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package llvm.templates

import llvm.*
import org.lwjgl.generator.*

val LLVMExecutionEngine = "LLVMExecutionEngine".nativeClass(
    Module.LLVM,
    prefixConstant = "LLVM",
    prefixMethod = "LLVM",
    binding = LLVM_BINDING_DELEGATE
) {
    documentation = ""

    void(
        "LinkInMCJIT",
        "",

        void()
    )

    void(
        "LinkInInterpreter",
        "",

        void()
    )

    LLVMGenericValueRef(
        "CreateGenericValueOfInt",
        "",

        LLVMTypeRef("Ty", ""),
        unsigned_long_long("N", ""),
        LLVMBool("IsSigned", "")
    )

    LLVMGenericValueRef(
        "CreateGenericValueOfPointer",
        "",

        opaque_p("P", "")
    )

    LLVMGenericValueRef(
        "CreateGenericValueOfFloat",
        "",

        LLVMTypeRef("Ty", ""),
        double("N", "")
    )

    unsigned_int(
        "GenericValueIntWidth",
        "",

        LLVMGenericValueRef("GenValRef", "")
    )

    unsigned_long_long(
        "GenericValueToInt",
        "",

        LLVMGenericValueRef("GenVal", ""),
        LLVMBool("IsSigned", "")
    )

    opaque_p(
        "GenericValueToPointer",
        "",

        LLVMGenericValueRef("GenVal", "")
    )

    double(
        "GenericValueToFloat",
        "",

        LLVMTypeRef("TyRef", ""),
        LLVMGenericValueRef("GenVal", "")
    )

    void(
        "DisposeGenericValue",
        "",

        LLVMGenericValueRef("GenVal", "")
    )

    LLVMBool(
        "CreateExecutionEngineForModule",
        "",

        Check(1)..LLVMExecutionEngineRef.p("OutEE", ""),
        LLVMModuleRef("M", ""),
        Check(1)..charUTF8.p.p("OutError", "")
    )

    LLVMBool(
        "CreateInterpreterForModule",
        "",

        Check(1)..LLVMExecutionEngineRef.p("OutInterp", ""),
        LLVMModuleRef("M", ""),
        Check(1)..charUTF8.p.p("OutError", "")
    )

    LLVMBool(
        "CreateJITCompilerForModule",
        "",

        Check(1)..LLVMExecutionEngineRef.p("OutJIT", ""),
        LLVMModuleRef("M", ""),
        unsigned_int("OptLevel", ""),
        Check(1)..charUTF8.p.p("OutError", "")
    )

    void(
        "InitializeMCJITCompilerOptions",
        "",

        LLVMMCJITCompilerOptions.p("Options", ""),
        AutoSize("Options")..size_t("SizeOfOptions", "")
    )

    LLVMBool(
        "CreateMCJITCompilerForModule",
        """
        Create an MCJIT execution engine for a module, with the given options. It is the responsibility of the caller to ensure that all fields in
        {@code Options} up to the given {@code SizeOfOptions} are initialized. It is correct to pass a smaller value of {@code SizeOfOptions} that omits some
        fields. The canonical way of using this is:

        ${codeBlock("""
LLVMMCJITCompilerOptions options;
LLVMInitializeMCJITCompilerOptions(&options, sizeof(options));
... fill in those options you care about
LLVMCreateMCJITCompilerForModule(&jit, mod, &options, sizeof(options),
                                 &error);""")}

        Note that this is also correct, though possibly suboptimal:

        ${codeBlock("""
LLVMCreateMCJITCompilerForModule(&jit, mod, 0, 0, &error);""")}
        """,

        Check(1)..LLVMExecutionEngineRef.p("OutJIT", ""),
        LLVMModuleRef("M", ""),
        LLVMMCJITCompilerOptions.p("Options", ""),
        AutoSize("Options")..size_t("SizeOfOptions", ""),
        Check(1)..charUTF8.p.p("OutError", "")
    )

    void(
        "DisposeExecutionEngine",
        "",

        LLVMExecutionEngineRef("EE", "")
    )

    void(
        "RunStaticConstructors",
        "",

        LLVMExecutionEngineRef("EE", "")
    )

    void(
        "RunStaticDestructors",
        "",

        LLVMExecutionEngineRef("EE", "")
    )

    int(
        "RunFunctionAsMain",
        "",

        LLVMExecutionEngineRef("EE", ""),
        LLVMValueRef("F", ""),
        AutoSize("ArgV")..unsigned_int("ArgC", ""),
        charUTF8.const.p.const.p("ArgV", ""),
        NullTerminated..charUTF8.const.p.const.p("EnvP", "")
    )

    LLVMGenericValueRef(
        "RunFunction",
        "",

        LLVMExecutionEngineRef("EE", ""),
        LLVMValueRef("F", ""),
        AutoSize("Args")..unsigned_int("NumArgs", ""),
        LLVMGenericValueRef.p("Args", "")
    )

    void(
        "FreeMachineCodeForFunction",
        "",

        LLVMExecutionEngineRef("EE", ""),
        LLVMValueRef("F", "")
    )

    void(
        "AddModule",
        "",

        LLVMExecutionEngineRef("EE", ""),
        LLVMModuleRef("M", "")
    )

    LLVMBool(
        "RemoveModule",
        "",

        LLVMExecutionEngineRef("EE", ""),
        LLVMModuleRef("M", ""),
        Check(1)..LLVMModuleRef.p("OutMod", ""),
        Check(1)..charUTF8.p.p("OutError", "")
    )

    LLVMBool(
        "FindFunction",
        "",

        LLVMExecutionEngineRef("EE", ""),
        Check(1)..charUTF8.const.p("Name", ""),
        Check(1)..LLVMValueRef.p("OutFn", "")
    )

    opaque_p(
        "RecompileAndRelinkFunction",
        "",

        LLVMExecutionEngineRef("EE", ""),
        LLVMValueRef("Fn", "")
    )

    LLVMTargetDataRef(
        "GetExecutionEngineTargetData",
        "",

        LLVMExecutionEngineRef("EE", "")
    )

    LLVMTargetMachineRef(
        "GetExecutionEngineTargetMachine",
        "",

        LLVMExecutionEngineRef("EE", "")
    )

    void(
        "AddGlobalMapping",
        "",

        LLVMExecutionEngineRef("EE", ""),
        LLVMValueRef("Global", ""),
        opaque_p("Addr", "")
    )

    opaque_p(
        "GetPointerToGlobal",
        "",

        LLVMExecutionEngineRef("EE", ""),
        LLVMValueRef("Global", "")
    )

    uint64_t(
        "GetGlobalValueAddress",
        "",

        LLVMExecutionEngineRef("EE", ""),
        charUTF8.const.p("Name", "")
    )

    uint64_t(
        "GetFunctionAddress",
        "",

        LLVMExecutionEngineRef("EE", ""),
        charUTF8.const.p("Name", "")
    )

    IgnoreMissing..LLVMBool(
        "ExecutionEngineGetErrMsg",
        """
        Returns true on error, false on success. If true is returned then the error message is copied to {@code OutStr} and cleared in the
        {@code ExecutionEngine} instance.
        """,

        LLVMExecutionEngineRef("EE", ""),
        Check(1)..charUTF8.p.p("OutError", ""),

        since = "11"
    )

    LLVMMCJITMemoryManagerRef(
        "CreateSimpleMCJITMemoryManager",
        """
        Create a simple custom MCJIT memory manager. This memory manager can intercept allocations in a module-oblivious way. This will return #NULL if any of
        the passed functions are #NULL.
        """,

        opaque_p("Opaque", "an opaque client object to pass back to the callbacks"),
        LLVMMemoryManagerAllocateCodeSectionCallback("AllocateCodeSection", "allocate a block of memory for executable code"),
        LLVMMemoryManagerAllocateDataSectionCallback("AllocateDataSection", "allocate a block of memory for data"),
        LLVMMemoryManagerFinalizeMemoryCallback("FinalizeMemory", "set page permissions and flush cache. Return 0 on success, 1 on error."),
        LLVMMemoryManagerDestroyCallback("Destroy", "")
    )

    void(
        "DisposeMCJITMemoryManager",
        "",

        LLVMMCJITMemoryManagerRef("MM", "")
    )

    IgnoreMissing..LLVMJITEventListenerRef("CreateGDBRegistrationListener", "", void())
    IgnoreMissing..LLVMJITEventListenerRef("CreateIntelJITEventListener", "", void())
    IgnoreMissing..LLVMJITEventListenerRef("CreateOProfileJITEventListener", "", void())
    IgnoreMissing..LLVMJITEventListenerRef("CreatePerfJITEventListener", "", void())
}