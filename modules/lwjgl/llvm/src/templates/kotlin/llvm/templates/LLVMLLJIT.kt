/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package llvm.templates

import llvm.*
import org.lwjgl.generator.*

val LLVMLLJIT = "LLVMLLJIT".nativeClass(
    Module.LLVM,
    prefixConstant = "LLVM",
    prefixMethod = "LLVM",
    binding = LLVM_BINDING_DELEGATE
) {
    documentation = "Requires LLVM 11.0 or higher."

    LLVMOrcLLJITBuilderRef(
        "OrcCreateLLJITBuilder",
        """
        Create an {@code LLVMOrcLLJITBuilder}.

        The client owns the resulting {@code LLJITBuilder} and should dispose of it using #OrcDisposeLLJITBuilder() once they are done with it.
        """,

        void()
    )

    void(
        "OrcDisposeLLJITBuilder",
        """
        Dispose of an {@code LLVMOrcLLJITBuilderRef}.

        This should only be called if ownership has not been passed to {@code LLVMOrcCreateLLJIT} (e.g. because some error prevented that function from being
        called).        
        """,

        LLVMOrcLLJITBuilderRef("Builder", "")
    )

    void(
        "OrcLLJITBuilderSetJITTargetMachineBuilder",
        """
        Set the {@code JITTargetMachineBuilder} to be used when constructing the {@code LLJIT} instance.

        Calling this function is optional: if it is not called then the {@code LLJITBuilder} will use {@code JITTargeTMachineBuilder::detectHost} to construct
        a {@code JITTargetMachineBuilder}.

        This function takes ownership of the {@code JTMB} argument: clients should not dispose of the {@code JITTargetMachineBuilder} after calling this
        function.
        """,

        LLVMOrcLLJITBuilderRef("Builder", ""),
        LLVMOrcJITTargetMachineBuilderRef("JTMB", "")
    )

    void(
        "OrcLLJITBuilderSetObjectLinkingLayerCreator",
        "Set an {@code ObjectLinkingLayer} creator function for this {@code LLJIT} instance.",

        LLVMOrcLLJITBuilderRef("Builder", ""),
        LLVMOrcLLJITBuilderObjectLinkingLayerCreatorFunction("F", ""),
        opaque_p("Ctx", ""),

        since = "12"
    )

    LLVMErrorRef(
        "OrcCreateLLJIT",
        """
        Create an {@code LLJIT} instance from an {@code LLJITBuilder}.

        This operation takes ownership of the {@code Builder} argument: clients should not dispose of the builder after calling this function (even if the
        function returns an error). If a null {@code Builder} argument is provided then a default-constructed {@code LLJITBuilder} will be used.

        On success the resulting {@code LLJIT} instance is uniquely owned by the client and automatically manages the memory of all JIT'd code and all modules
        that are transferred to it (e.g. via #OrcLLJITAddLLVMIRModule()). Disposing of the {@code LLJIT} instance will free all memory managed by the JIT,
        including JIT'd code and not-yet compiled modules.
        """,

        Check(1)..LLVMOrcLLJITRef.p("Result", ""),
        LLVMOrcLLJITBuilderRef("Builder", "")
    )

    LLVMErrorRef(
        "OrcDisposeLLJIT",
        "Dispose of an LLJIT instance.",

        LLVMOrcLLJITRef("J", "")
    )

    LLVMOrcExecutionSessionRef(
        "OrcLLJITGetExecutionSession",
        """
        Get a reference to the {@code ExecutionSession} for this {@code LLJIT} instance.

        The {@code ExecutionSession} is owned by the {@code LLJIT} instance. The client is not responsible for managing its memory.
        """,

        LLVMOrcLLJITRef("J", "")
    )

    LLVMOrcJITDylibRef(
        "OrcLLJITGetMainJITDylib",
        """
        Return a reference to the Main {@code JITDylib}.

        The {@code JITDylib} is owned by the {@code LLJIT} instance. The client is not responsible for managing its memory.        
        """,

        LLVMOrcLLJITRef("J", "")
    )

    charUTF8.const.p(
        "OrcLLJITGetTripleString",
        "Return the target triple for this {@code LLJIT} instance. This string is owned by the {@code LLJIT} instance and should not be freed by the client.",

        LLVMOrcLLJITRef("J", "")
    )

    char(
        "OrcLLJITGetGlobalPrefix",
        "Returns the global prefix character according to the {@code LLJIT}'s {@code DataLayout}.",

        LLVMOrcLLJITRef("J", "")
    )

    LLVMOrcSymbolStringPoolEntryRef(
        "OrcLLJITMangleAndIntern",
        """
        Mangles the given string according to the {@code LLJIT} instance's {@code DataLayout}, then interns the result in the {@code SymbolStringPool} and
        returns a reference to the pool entry.

        Clients should call #OrcReleaseSymbolStringPoolEntry() to decrement the ref-count on the pool entry once they are finished with this value.
        """,

        LLVMOrcLLJITRef("J", ""),
        charUTF8.const.p("UnmangledName", "")
    )

    LLVMErrorRef(
        "OrcLLJITAddObjectFile",
        """
        Add a buffer representing an object file to the given {@code JITDylib} in the given {@code LLJIT} instance. This operation transfers ownership of the
        buffer to the {@code LLJIT} instance. The buffer should not be disposed of or referenced once this function returns.

        Resources associated with the given object will be tracked by the given {@code JITDylib}'s default resource tracker.        
        """,

        LLVMOrcLLJITRef("J", ""),
        LLVMOrcJITDylibRef("JD", ""),
        LLVMMemoryBufferRef("ObjBuffer", "")
    )

    LLVMErrorRef(
        "OrcLLJITAddObjectFileWithRT",
        """
        Add a buffer representing an object file to the given {@code ResourceTracker}'s {@code JITDylib} in the given {@code LLJIT} instance. This operation
        transfers ownership of the buffer to the {@code LLJIT} instance. The buffer should not be disposed of or referenced once this function returns.

        Resources associated with the given object will be tracked by {@code ResourceTracker} {@code RT}.        
        """,

        LLVMOrcLLJITRef("J", ""),
        LLVMOrcResourceTrackerRef("RT", ""),
        LLVMMemoryBufferRef("ObjBuffer", ""),

        since = "12"
    )

    LLVMErrorRef(
        "OrcLLJITAddLLVMIRModule",
        """
        Add an IR module to the given {@code JITDylib} in the given {@code LLJIT} instance. This operation transfers ownership of the {@code TSM} argument to
        the {@code LLJIT} instance. The {@code TSM} argument should not be disposed of or referenced once this function returns.

        Resources associated with the given {@code Module} will be tracked by the given {@code JITDylib}'s default resource tracker.
        """,

        LLVMOrcLLJITRef("J", ""),
        LLVMOrcJITDylibRef("JD", ""),
        LLVMOrcThreadSafeModuleRef("TSM", "")
    )

    LLVMErrorRef(
        "OrcLLJITAddLLVMIRModuleWithRT",
        """
        Add an IR module to the given {@code ResourceTracker}'s {@code JITDylib} in the given {@code LLJIT} instance. This operation transfers ownership of the
        {@code TSM} argument to the {@code LLJIT} instance. The {@code TSM} argument should not be disposed of or referenced once this function returns.

        Resources associated with the given {@code Module} will be tracked by {@code ResourceTracker} {@code RT}.        
        """,

        LLVMOrcLLJITRef("J", ""),
        LLVMOrcResourceTrackerRef("JD", ""),
        LLVMOrcThreadSafeModuleRef("TSM", ""),

        since = "12"
    )

    LLVMErrorRef(
        "OrcLLJITLookup",
        """
        Look up the given symbol in the main {@code JITDylib} of the given {@code LLJIT} instance.

        This operation does not take ownership of the Name argument.        
        """,

        LLVMOrcLLJITRef("J", ""),
        Check(1)..LLVMOrcExecutorAddress.p("Result", ""),
        charUTF8.const.p("Name", "")
    )

    LLVMOrcObjectLayerRef(
        "OrcLLJITGetObjLinkingLayer",
        "Returns a non-owning reference to the {@code LLJIT} instance's object linking layer.",

        LLVMOrcLLJITRef("J", ""),

        since = "12"
    )

    LLVMOrcObjectTransformLayerRef(
        "OrcLLJITGetObjTransformLayer",
        "Returns a non-owning reference to the {@code LLJIT} instance's object linking layer.",

        LLVMOrcLLJITRef("J", ""),

        since = "12"
    )

    LLVMOrcIRTransformLayerRef(
        "OrcLLJITGetIRTransformLayer",
        "Returns a non-owning reference to the {@code LLJIT} instance's IR transform layer.",

        LLVMOrcLLJITRef("J", ""),

        since = "12"
    )

    charUTF8.const.p(
        "OrcLLJITGetDataLayoutStr",
        """
        Get the {@code LLJIT} instance's default data layout string.

        This string is owned by the {@code LLJIT} instance and does not need to be freed by the caller.
        """,

        LLVMOrcLLJITRef("J", ""),

        since = "12"
    )
}