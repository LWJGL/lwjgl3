/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Requires LLVM 11.0 or higher. */
public class LLVMLLJIT {

    /** Contains the function pointers loaded from {@code LLVMCore.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            OrcCreateLLJITBuilder                       = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcCreateLLJITBuilder"),
            OrcDisposeLLJITBuilder                      = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcDisposeLLJITBuilder"),
            OrcLLJITBuilderSetJITTargetMachineBuilder   = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcLLJITBuilderSetJITTargetMachineBuilder"),
            OrcLLJITBuilderSetObjectLinkingLayerCreator = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcLLJITBuilderSetObjectLinkingLayerCreator"),
            OrcCreateLLJIT                              = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcCreateLLJIT"),
            OrcDisposeLLJIT                             = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcDisposeLLJIT"),
            OrcLLJITGetExecutionSession                 = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcLLJITGetExecutionSession"),
            OrcLLJITGetMainJITDylib                     = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcLLJITGetMainJITDylib"),
            OrcLLJITGetTripleString                     = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcLLJITGetTripleString"),
            OrcLLJITGetGlobalPrefix                     = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcLLJITGetGlobalPrefix"),
            OrcLLJITMangleAndIntern                     = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcLLJITMangleAndIntern"),
            OrcLLJITAddObjectFile                       = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcLLJITAddObjectFile"),
            OrcLLJITAddObjectFileWithRT                 = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcLLJITAddObjectFileWithRT"),
            OrcLLJITAddLLVMIRModule                     = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcLLJITAddLLVMIRModule"),
            OrcLLJITAddLLVMIRModuleWithRT               = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcLLJITAddLLVMIRModuleWithRT"),
            OrcLLJITLookup                              = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcLLJITLookup"),
            OrcLLJITGetObjLinkingLayer                  = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcLLJITGetObjLinkingLayer"),
            OrcLLJITGetObjTransformLayer                = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcLLJITGetObjTransformLayer"),
            OrcLLJITGetIRTransformLayer                 = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcLLJITGetIRTransformLayer"),
            OrcLLJITGetDataLayoutStr                    = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcLLJITGetDataLayoutStr");

    }

    protected LLVMLLJIT() {
        throw new UnsupportedOperationException();
    }

    // --- [ LLVMOrcCreateLLJITBuilder ] ---

    /**
     * Create an {@code LLVMOrcLLJITBuilder}.
     * 
     * <p>The client owns the resulting {@code LLJITBuilder} and should dispose of it using {@link #LLVMOrcDisposeLLJITBuilder OrcDisposeLLJITBuilder} once they are done with it.</p>
     */
    @NativeType("LLVMOrcLLJITBuilderRef")
    public static long LLVMOrcCreateLLJITBuilder() {
        long __functionAddress = Functions.OrcCreateLLJITBuilder;
        return invokeP(__functionAddress);
    }

    // --- [ LLVMOrcDisposeLLJITBuilder ] ---

    /**
     * Dispose of an {@code LLVMOrcLLJITBuilderRef}.
     * 
     * <p>This should only be called if ownership has not been passed to {@code LLVMOrcCreateLLJIT} (e.g. because some error prevented that function from being
     * called).</p>
     */
    public static void LLVMOrcDisposeLLJITBuilder(@NativeType("LLVMOrcLLJITBuilderRef") long Builder) {
        long __functionAddress = Functions.OrcDisposeLLJITBuilder;
        if (CHECKS) {
            check(Builder);
        }
        invokePV(Builder, __functionAddress);
    }

    // --- [ LLVMOrcLLJITBuilderSetJITTargetMachineBuilder ] ---

    /**
     * Set the {@code JITTargetMachineBuilder} to be used when constructing the {@code LLJIT} instance.
     * 
     * <p>Calling this function is optional: if it is not called then the {@code LLJITBuilder} will use {@code JITTargeTMachineBuilder::detectHost} to construct
     * a {@code JITTargetMachineBuilder}.</p>
     * 
     * <p>This function takes ownership of the {@code JTMB} argument: clients should not dispose of the {@code JITTargetMachineBuilder} after calling this
     * function.</p>
     */
    public static void LLVMOrcLLJITBuilderSetJITTargetMachineBuilder(@NativeType("LLVMOrcLLJITBuilderRef") long Builder, @NativeType("LLVMOrcJITTargetMachineBuilderRef") long JTMB) {
        long __functionAddress = Functions.OrcLLJITBuilderSetJITTargetMachineBuilder;
        if (CHECKS) {
            check(Builder);
            check(JTMB);
        }
        invokePPV(Builder, JTMB, __functionAddress);
    }

    // --- [ LLVMOrcLLJITBuilderSetObjectLinkingLayerCreator ] ---

    /** Unsafe version of: {@link #LLVMOrcLLJITBuilderSetObjectLinkingLayerCreator OrcLLJITBuilderSetObjectLinkingLayerCreator} */
    public static void nLLVMOrcLLJITBuilderSetObjectLinkingLayerCreator(long Builder, long F, long Ctx) {
        long __functionAddress = Functions.OrcLLJITBuilderSetObjectLinkingLayerCreator;
        if (CHECKS) {
            check(Builder);
            check(Ctx);
        }
        invokePPPV(Builder, F, Ctx, __functionAddress);
    }

    /**
     * Set an {@code ObjectLinkingLayer} creator function for this {@code LLJIT} instance.
     *
     * @since 12
     */
    public static void LLVMOrcLLJITBuilderSetObjectLinkingLayerCreator(@NativeType("LLVMOrcLLJITBuilderRef") long Builder, @NativeType("LLVMOrcObjectLayerRef (*) (void *, LLVMOrcExecutionSessionRef, char const *)") LLVMOrcLLJITBuilderObjectLinkingLayerCreatorFunctionI F, @NativeType("void *") long Ctx) {
        nLLVMOrcLLJITBuilderSetObjectLinkingLayerCreator(Builder, F.address(), Ctx);
    }

    // --- [ LLVMOrcCreateLLJIT ] ---

    /** Unsafe version of: {@link #LLVMOrcCreateLLJIT OrcCreateLLJIT} */
    public static long nLLVMOrcCreateLLJIT(long Result, long Builder) {
        long __functionAddress = Functions.OrcCreateLLJIT;
        if (CHECKS) {
            check(Builder);
        }
        return invokePPP(Result, Builder, __functionAddress);
    }

    /**
     * Create an {@code LLJIT} instance from an {@code LLJITBuilder}.
     * 
     * <p>This operation takes ownership of the {@code Builder} argument: clients should not dispose of the builder after calling this function (even if the
     * function returns an error). If a null {@code Builder} argument is provided then a default-constructed {@code LLJITBuilder} will be used.</p>
     * 
     * <p>On success the resulting {@code LLJIT} instance is uniquely owned by the client and automatically manages the memory of all JIT'd code and all modules
     * that are transferred to it (e.g. via {@link #LLVMOrcLLJITAddLLVMIRModule OrcLLJITAddLLVMIRModule}). Disposing of the {@code LLJIT} instance will free all memory managed by the JIT,
     * including JIT'd code and not-yet compiled modules.</p>
     */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcCreateLLJIT(@NativeType("LLVMOrcLLJITRef *") PointerBuffer Result, @NativeType("LLVMOrcLLJITBuilderRef") long Builder) {
        if (CHECKS) {
            check(Result, 1);
        }
        return nLLVMOrcCreateLLJIT(memAddress(Result), Builder);
    }

    // --- [ LLVMOrcDisposeLLJIT ] ---

    /** Dispose of an LLJIT instance. */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcDisposeLLJIT(@NativeType("LLVMOrcLLJITRef") long J) {
        long __functionAddress = Functions.OrcDisposeLLJIT;
        if (CHECKS) {
            check(J);
        }
        return invokePP(J, __functionAddress);
    }

    // --- [ LLVMOrcLLJITGetExecutionSession ] ---

    /**
     * Get a reference to the {@code ExecutionSession} for this {@code LLJIT} instance.
     * 
     * <p>The {@code ExecutionSession} is owned by the {@code LLJIT} instance. The client is not responsible for managing its memory.</p>
     */
    @NativeType("LLVMOrcExecutionSessionRef")
    public static long LLVMOrcLLJITGetExecutionSession(@NativeType("LLVMOrcLLJITRef") long J) {
        long __functionAddress = Functions.OrcLLJITGetExecutionSession;
        if (CHECKS) {
            check(J);
        }
        return invokePP(J, __functionAddress);
    }

    // --- [ LLVMOrcLLJITGetMainJITDylib ] ---

    /**
     * Return a reference to the Main {@code JITDylib}.
     * 
     * <p>The {@code JITDylib} is owned by the {@code LLJIT} instance. The client is not responsible for managing its memory.</p>
     */
    @NativeType("LLVMOrcJITDylibRef")
    public static long LLVMOrcLLJITGetMainJITDylib(@NativeType("LLVMOrcLLJITRef") long J) {
        long __functionAddress = Functions.OrcLLJITGetMainJITDylib;
        if (CHECKS) {
            check(J);
        }
        return invokePP(J, __functionAddress);
    }

    // --- [ LLVMOrcLLJITGetTripleString ] ---

    /** Unsafe version of: {@link #LLVMOrcLLJITGetTripleString OrcLLJITGetTripleString} */
    public static long nLLVMOrcLLJITGetTripleString(long J) {
        long __functionAddress = Functions.OrcLLJITGetTripleString;
        if (CHECKS) {
            check(J);
        }
        return invokePP(J, __functionAddress);
    }

    /** Return the target triple for this {@code LLJIT} instance. This string is owned by the {@code LLJIT} instance and should not be freed by the client. */
    @Nullable
    @NativeType("char const *")
    public static String LLVMOrcLLJITGetTripleString(@NativeType("LLVMOrcLLJITRef") long J) {
        long __result = nLLVMOrcLLJITGetTripleString(J);
        return memUTF8Safe(__result);
    }

    // --- [ LLVMOrcLLJITGetGlobalPrefix ] ---

    /** Returns the global prefix character according to the {@code LLJIT}'s {@code DataLayout}. */
    @NativeType("char")
    public static byte LLVMOrcLLJITGetGlobalPrefix(@NativeType("LLVMOrcLLJITRef") long J) {
        long __functionAddress = Functions.OrcLLJITGetGlobalPrefix;
        if (CHECKS) {
            check(J);
        }
        return invokePB(J, __functionAddress);
    }

    // --- [ LLVMOrcLLJITMangleAndIntern ] ---

    /** Unsafe version of: {@link #LLVMOrcLLJITMangleAndIntern OrcLLJITMangleAndIntern} */
    public static long nLLVMOrcLLJITMangleAndIntern(long J, long UnmangledName) {
        long __functionAddress = Functions.OrcLLJITMangleAndIntern;
        if (CHECKS) {
            check(J);
        }
        return invokePPP(J, UnmangledName, __functionAddress);
    }

    /**
     * Mangles the given string according to the {@code LLJIT} instance's {@code DataLayout}, then interns the result in the {@code SymbolStringPool} and
     * returns a reference to the pool entry.
     * 
     * <p>Clients should call {@link LLVMOrc#LLVMOrcReleaseSymbolStringPoolEntry OrcReleaseSymbolStringPoolEntry} to decrement the ref-count on the pool entry once they are finished with this value.</p>
     */
    @NativeType("LLVMOrcSymbolStringPoolEntryRef")
    public static long LLVMOrcLLJITMangleAndIntern(@NativeType("LLVMOrcLLJITRef") long J, @NativeType("char const *") ByteBuffer UnmangledName) {
        if (CHECKS) {
            checkNT1(UnmangledName);
        }
        return nLLVMOrcLLJITMangleAndIntern(J, memAddress(UnmangledName));
    }

    /**
     * Mangles the given string according to the {@code LLJIT} instance's {@code DataLayout}, then interns the result in the {@code SymbolStringPool} and
     * returns a reference to the pool entry.
     * 
     * <p>Clients should call {@link LLVMOrc#LLVMOrcReleaseSymbolStringPoolEntry OrcReleaseSymbolStringPoolEntry} to decrement the ref-count on the pool entry once they are finished with this value.</p>
     */
    @NativeType("LLVMOrcSymbolStringPoolEntryRef")
    public static long LLVMOrcLLJITMangleAndIntern(@NativeType("LLVMOrcLLJITRef") long J, @NativeType("char const *") CharSequence UnmangledName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(UnmangledName, true);
            long UnmangledNameEncoded = stack.getPointerAddress();
            return nLLVMOrcLLJITMangleAndIntern(J, UnmangledNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMOrcLLJITAddObjectFile ] ---

    /**
     * Add a buffer representing an object file to the given {@code JITDylib} in the given {@code LLJIT} instance. This operation transfers ownership of the
     * buffer to the {@code LLJIT} instance. The buffer should not be disposed of or referenced once this function returns.
     * 
     * <p>Resources associated with the given object will be tracked by the given {@code JITDylib}'s default resource tracker.</p>
     */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcLLJITAddObjectFile(@NativeType("LLVMOrcLLJITRef") long J, @NativeType("LLVMOrcJITDylibRef") long JD, @NativeType("LLVMMemoryBufferRef") long ObjBuffer) {
        long __functionAddress = Functions.OrcLLJITAddObjectFile;
        if (CHECKS) {
            check(J);
            check(JD);
            check(ObjBuffer);
        }
        return invokePPPP(J, JD, ObjBuffer, __functionAddress);
    }

    // --- [ LLVMOrcLLJITAddObjectFileWithRT ] ---

    /**
     * Add a buffer representing an object file to the given {@code ResourceTracker}'s {@code JITDylib} in the given {@code LLJIT} instance. This operation
     * transfers ownership of the buffer to the {@code LLJIT} instance. The buffer should not be disposed of or referenced once this function returns.
     * 
     * <p>Resources associated with the given object will be tracked by {@code ResourceTracker} {@code RT}.</p>
     *
     * @since 12
     */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcLLJITAddObjectFileWithRT(@NativeType("LLVMOrcLLJITRef") long J, @NativeType("LLVMOrcResourceTrackerRef") long RT, @NativeType("LLVMMemoryBufferRef") long ObjBuffer) {
        long __functionAddress = Functions.OrcLLJITAddObjectFileWithRT;
        if (CHECKS) {
            check(J);
            check(RT);
            check(ObjBuffer);
        }
        return invokePPPP(J, RT, ObjBuffer, __functionAddress);
    }

    // --- [ LLVMOrcLLJITAddLLVMIRModule ] ---

    /**
     * Add an IR module to the given {@code JITDylib} in the given {@code LLJIT} instance. This operation transfers ownership of the {@code TSM} argument to
     * the {@code LLJIT} instance. The {@code TSM} argument should not be disposed of or referenced once this function returns.
     * 
     * <p>Resources associated with the given {@code Module} will be tracked by the given {@code JITDylib}'s default resource tracker.</p>
     */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcLLJITAddLLVMIRModule(@NativeType("LLVMOrcLLJITRef") long J, @NativeType("LLVMOrcJITDylibRef") long JD, @NativeType("LLVMOrcThreadSafeModuleRef") long TSM) {
        long __functionAddress = Functions.OrcLLJITAddLLVMIRModule;
        if (CHECKS) {
            check(J);
            check(JD);
            check(TSM);
        }
        return invokePPPP(J, JD, TSM, __functionAddress);
    }

    // --- [ LLVMOrcLLJITAddLLVMIRModuleWithRT ] ---

    /**
     * Add an IR module to the given {@code ResourceTracker}'s {@code JITDylib} in the given {@code LLJIT} instance. This operation transfers ownership of the
     * {@code TSM} argument to the {@code LLJIT} instance. The {@code TSM} argument should not be disposed of or referenced once this function returns.
     * 
     * <p>Resources associated with the given {@code Module} will be tracked by {@code ResourceTracker} {@code RT}.</p>
     *
     * @since 12
     */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcLLJITAddLLVMIRModuleWithRT(@NativeType("LLVMOrcLLJITRef") long J, @NativeType("LLVMOrcResourceTrackerRef") long JD, @NativeType("LLVMOrcThreadSafeModuleRef") long TSM) {
        long __functionAddress = Functions.OrcLLJITAddLLVMIRModuleWithRT;
        if (CHECKS) {
            check(J);
            check(JD);
            check(TSM);
        }
        return invokePPPP(J, JD, TSM, __functionAddress);
    }

    // --- [ LLVMOrcLLJITLookup ] ---

    /** Unsafe version of: {@link #LLVMOrcLLJITLookup OrcLLJITLookup} */
    public static long nLLVMOrcLLJITLookup(long J, long Result, long Name) {
        long __functionAddress = Functions.OrcLLJITLookup;
        if (CHECKS) {
            check(J);
        }
        return invokePPPP(J, Result, Name, __functionAddress);
    }

    /**
     * Look up the given symbol in the main {@code JITDylib} of the given {@code LLJIT} instance.
     * 
     * <p>This operation does not take ownership of the Name argument.</p>
     */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcLLJITLookup(@NativeType("LLVMOrcLLJITRef") long J, @NativeType("LLVMOrcExecutorAddress *") LongBuffer Result, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            check(Result, 1);
            checkNT1(Name);
        }
        return nLLVMOrcLLJITLookup(J, memAddress(Result), memAddress(Name));
    }

    /**
     * Look up the given symbol in the main {@code JITDylib} of the given {@code LLJIT} instance.
     * 
     * <p>This operation does not take ownership of the Name argument.</p>
     */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcLLJITLookup(@NativeType("LLVMOrcLLJITRef") long J, @NativeType("LLVMOrcExecutorAddress *") LongBuffer Result, @NativeType("char const *") CharSequence Name) {
        if (CHECKS) {
            check(Result, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMOrcLLJITLookup(J, memAddress(Result), NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMOrcLLJITGetObjLinkingLayer ] ---

    /**
     * Returns a non-owning reference to the {@code LLJIT} instance's object linking layer.
     *
     * @since 12
     */
    @NativeType("LLVMOrcObjectLayerRef")
    public static long LLVMOrcLLJITGetObjLinkingLayer(@NativeType("LLVMOrcLLJITRef") long J) {
        long __functionAddress = Functions.OrcLLJITGetObjLinkingLayer;
        if (CHECKS) {
            check(J);
        }
        return invokePP(J, __functionAddress);
    }

    // --- [ LLVMOrcLLJITGetObjTransformLayer ] ---

    /**
     * Returns a non-owning reference to the {@code LLJIT} instance's object linking layer.
     *
     * @since 12
     */
    @NativeType("LLVMOrcObjectTransformLayerRef")
    public static long LLVMOrcLLJITGetObjTransformLayer(@NativeType("LLVMOrcLLJITRef") long J) {
        long __functionAddress = Functions.OrcLLJITGetObjTransformLayer;
        if (CHECKS) {
            check(J);
        }
        return invokePP(J, __functionAddress);
    }

    // --- [ LLVMOrcLLJITGetIRTransformLayer ] ---

    /**
     * Returns a non-owning reference to the {@code LLJIT} instance's IR transform layer.
     *
     * @since 12
     */
    @NativeType("LLVMOrcIRTransformLayerRef")
    public static long LLVMOrcLLJITGetIRTransformLayer(@NativeType("LLVMOrcLLJITRef") long J) {
        long __functionAddress = Functions.OrcLLJITGetIRTransformLayer;
        if (CHECKS) {
            check(J);
        }
        return invokePP(J, __functionAddress);
    }

    // --- [ LLVMOrcLLJITGetDataLayoutStr ] ---

    /** Unsafe version of: {@link #LLVMOrcLLJITGetDataLayoutStr OrcLLJITGetDataLayoutStr} */
    public static long nLLVMOrcLLJITGetDataLayoutStr(long J) {
        long __functionAddress = Functions.OrcLLJITGetDataLayoutStr;
        if (CHECKS) {
            check(J);
        }
        return invokePP(J, __functionAddress);
    }

    /**
     * Get the {@code LLJIT} instance's default data layout string.
     * 
     * <p>This string is owned by the {@code LLJIT} instance and does not need to be freed by the caller.</p>
     *
     * @since 12
     */
    @Nullable
    @NativeType("char const *")
    public static String LLVMOrcLLJITGetDataLayoutStr(@NativeType("LLVMOrcLLJITRef") long J) {
        long __result = nLLVMOrcLLJITGetDataLayoutStr(J);
        return memUTF8Safe(__result);
    }

}