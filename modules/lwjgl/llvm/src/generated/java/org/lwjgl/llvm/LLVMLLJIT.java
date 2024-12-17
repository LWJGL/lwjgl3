/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

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

    /** {@code LLVMOrcLLJITBuilderRef LLVMOrcCreateLLJITBuilder(void)} */
    @NativeType("LLVMOrcLLJITBuilderRef")
    public static long LLVMOrcCreateLLJITBuilder() {
        long __functionAddress = Functions.OrcCreateLLJITBuilder;
        return invokeP(__functionAddress);
    }

    // --- [ LLVMOrcDisposeLLJITBuilder ] ---

    /** {@code void LLVMOrcDisposeLLJITBuilder(LLVMOrcLLJITBuilderRef Builder)} */
    public static void LLVMOrcDisposeLLJITBuilder(@NativeType("LLVMOrcLLJITBuilderRef") long Builder) {
        long __functionAddress = Functions.OrcDisposeLLJITBuilder;
        if (CHECKS) {
            check(Builder);
        }
        invokePV(Builder, __functionAddress);
    }

    // --- [ LLVMOrcLLJITBuilderSetJITTargetMachineBuilder ] ---

    /** {@code void LLVMOrcLLJITBuilderSetJITTargetMachineBuilder(LLVMOrcLLJITBuilderRef Builder, LLVMOrcJITTargetMachineBuilderRef JTMB)} */
    public static void LLVMOrcLLJITBuilderSetJITTargetMachineBuilder(@NativeType("LLVMOrcLLJITBuilderRef") long Builder, @NativeType("LLVMOrcJITTargetMachineBuilderRef") long JTMB) {
        long __functionAddress = Functions.OrcLLJITBuilderSetJITTargetMachineBuilder;
        if (CHECKS) {
            check(Builder);
            check(JTMB);
        }
        invokePPV(Builder, JTMB, __functionAddress);
    }

    // --- [ LLVMOrcLLJITBuilderSetObjectLinkingLayerCreator ] ---

    /** {@code void LLVMOrcLLJITBuilderSetObjectLinkingLayerCreator(LLVMOrcLLJITBuilderRef Builder, LLVMOrcObjectLayerRef (*) (void *, LLVMOrcExecutionSessionRef, char const *) F, void * Ctx)} */
    public static void nLLVMOrcLLJITBuilderSetObjectLinkingLayerCreator(long Builder, long F, long Ctx) {
        long __functionAddress = Functions.OrcLLJITBuilderSetObjectLinkingLayerCreator;
        if (CHECKS) {
            check(Builder);
            check(Ctx);
        }
        invokePPPV(Builder, F, Ctx, __functionAddress);
    }

    /** {@code void LLVMOrcLLJITBuilderSetObjectLinkingLayerCreator(LLVMOrcLLJITBuilderRef Builder, LLVMOrcObjectLayerRef (*) (void *, LLVMOrcExecutionSessionRef, char const *) F, void * Ctx)} */
    public static void LLVMOrcLLJITBuilderSetObjectLinkingLayerCreator(@NativeType("LLVMOrcLLJITBuilderRef") long Builder, @NativeType("LLVMOrcObjectLayerRef (*) (void *, LLVMOrcExecutionSessionRef, char const *)") LLVMOrcLLJITBuilderObjectLinkingLayerCreatorFunctionI F, @NativeType("void *") long Ctx) {
        nLLVMOrcLLJITBuilderSetObjectLinkingLayerCreator(Builder, F.address(), Ctx);
    }

    // --- [ LLVMOrcCreateLLJIT ] ---

    /** {@code LLVMErrorRef LLVMOrcCreateLLJIT(LLVMOrcLLJITRef * Result, LLVMOrcLLJITBuilderRef Builder)} */
    public static long nLLVMOrcCreateLLJIT(long Result, long Builder) {
        long __functionAddress = Functions.OrcCreateLLJIT;
        if (CHECKS) {
            check(Builder);
        }
        return invokePPP(Result, Builder, __functionAddress);
    }

    /** {@code LLVMErrorRef LLVMOrcCreateLLJIT(LLVMOrcLLJITRef * Result, LLVMOrcLLJITBuilderRef Builder)} */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcCreateLLJIT(@NativeType("LLVMOrcLLJITRef *") PointerBuffer Result, @NativeType("LLVMOrcLLJITBuilderRef") long Builder) {
        if (CHECKS) {
            check(Result, 1);
        }
        return nLLVMOrcCreateLLJIT(memAddress(Result), Builder);
    }

    // --- [ LLVMOrcDisposeLLJIT ] ---

    /** {@code LLVMErrorRef LLVMOrcDisposeLLJIT(LLVMOrcLLJITRef J)} */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcDisposeLLJIT(@NativeType("LLVMOrcLLJITRef") long J) {
        long __functionAddress = Functions.OrcDisposeLLJIT;
        if (CHECKS) {
            check(J);
        }
        return invokePP(J, __functionAddress);
    }

    // --- [ LLVMOrcLLJITGetExecutionSession ] ---

    /** {@code LLVMOrcExecutionSessionRef LLVMOrcLLJITGetExecutionSession(LLVMOrcLLJITRef J)} */
    @NativeType("LLVMOrcExecutionSessionRef")
    public static long LLVMOrcLLJITGetExecutionSession(@NativeType("LLVMOrcLLJITRef") long J) {
        long __functionAddress = Functions.OrcLLJITGetExecutionSession;
        if (CHECKS) {
            check(J);
        }
        return invokePP(J, __functionAddress);
    }

    // --- [ LLVMOrcLLJITGetMainJITDylib ] ---

    /** {@code LLVMOrcJITDylibRef LLVMOrcLLJITGetMainJITDylib(LLVMOrcLLJITRef J)} */
    @NativeType("LLVMOrcJITDylibRef")
    public static long LLVMOrcLLJITGetMainJITDylib(@NativeType("LLVMOrcLLJITRef") long J) {
        long __functionAddress = Functions.OrcLLJITGetMainJITDylib;
        if (CHECKS) {
            check(J);
        }
        return invokePP(J, __functionAddress);
    }

    // --- [ LLVMOrcLLJITGetTripleString ] ---

    /** {@code char const * LLVMOrcLLJITGetTripleString(LLVMOrcLLJITRef J)} */
    public static long nLLVMOrcLLJITGetTripleString(long J) {
        long __functionAddress = Functions.OrcLLJITGetTripleString;
        if (CHECKS) {
            check(J);
        }
        return invokePP(J, __functionAddress);
    }

    /** {@code char const * LLVMOrcLLJITGetTripleString(LLVMOrcLLJITRef J)} */
    @NativeType("char const *")
    public static @Nullable String LLVMOrcLLJITGetTripleString(@NativeType("LLVMOrcLLJITRef") long J) {
        long __result = nLLVMOrcLLJITGetTripleString(J);
        return memUTF8Safe(__result);
    }

    // --- [ LLVMOrcLLJITGetGlobalPrefix ] ---

    /** {@code char LLVMOrcLLJITGetGlobalPrefix(LLVMOrcLLJITRef J)} */
    @NativeType("char")
    public static byte LLVMOrcLLJITGetGlobalPrefix(@NativeType("LLVMOrcLLJITRef") long J) {
        long __functionAddress = Functions.OrcLLJITGetGlobalPrefix;
        if (CHECKS) {
            check(J);
        }
        return invokePB(J, __functionAddress);
    }

    // --- [ LLVMOrcLLJITMangleAndIntern ] ---

    /** {@code LLVMOrcSymbolStringPoolEntryRef LLVMOrcLLJITMangleAndIntern(LLVMOrcLLJITRef J, char const * UnmangledName)} */
    public static long nLLVMOrcLLJITMangleAndIntern(long J, long UnmangledName) {
        long __functionAddress = Functions.OrcLLJITMangleAndIntern;
        if (CHECKS) {
            check(J);
        }
        return invokePPP(J, UnmangledName, __functionAddress);
    }

    /** {@code LLVMOrcSymbolStringPoolEntryRef LLVMOrcLLJITMangleAndIntern(LLVMOrcLLJITRef J, char const * UnmangledName)} */
    @NativeType("LLVMOrcSymbolStringPoolEntryRef")
    public static long LLVMOrcLLJITMangleAndIntern(@NativeType("LLVMOrcLLJITRef") long J, @NativeType("char const *") ByteBuffer UnmangledName) {
        if (CHECKS) {
            checkNT1(UnmangledName);
        }
        return nLLVMOrcLLJITMangleAndIntern(J, memAddress(UnmangledName));
    }

    /** {@code LLVMOrcSymbolStringPoolEntryRef LLVMOrcLLJITMangleAndIntern(LLVMOrcLLJITRef J, char const * UnmangledName)} */
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

    /** {@code LLVMErrorRef LLVMOrcLLJITAddObjectFile(LLVMOrcLLJITRef J, LLVMOrcJITDylibRef JD, LLVMMemoryBufferRef ObjBuffer)} */
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

    /** {@code LLVMErrorRef LLVMOrcLLJITAddObjectFileWithRT(LLVMOrcLLJITRef J, LLVMOrcResourceTrackerRef RT, LLVMMemoryBufferRef ObjBuffer)} */
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

    /** {@code LLVMErrorRef LLVMOrcLLJITAddLLVMIRModule(LLVMOrcLLJITRef J, LLVMOrcJITDylibRef JD, LLVMOrcThreadSafeModuleRef TSM)} */
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

    /** {@code LLVMErrorRef LLVMOrcLLJITAddLLVMIRModuleWithRT(LLVMOrcLLJITRef J, LLVMOrcResourceTrackerRef JD, LLVMOrcThreadSafeModuleRef TSM)} */
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

    /** {@code LLVMErrorRef LLVMOrcLLJITLookup(LLVMOrcLLJITRef J, LLVMOrcExecutorAddress * Result, char const * Name)} */
    public static long nLLVMOrcLLJITLookup(long J, long Result, long Name) {
        long __functionAddress = Functions.OrcLLJITLookup;
        if (CHECKS) {
            check(J);
        }
        return invokePPPP(J, Result, Name, __functionAddress);
    }

    /** {@code LLVMErrorRef LLVMOrcLLJITLookup(LLVMOrcLLJITRef J, LLVMOrcExecutorAddress * Result, char const * Name)} */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcLLJITLookup(@NativeType("LLVMOrcLLJITRef") long J, @NativeType("LLVMOrcExecutorAddress *") LongBuffer Result, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            check(Result, 1);
            checkNT1(Name);
        }
        return nLLVMOrcLLJITLookup(J, memAddress(Result), memAddress(Name));
    }

    /** {@code LLVMErrorRef LLVMOrcLLJITLookup(LLVMOrcLLJITRef J, LLVMOrcExecutorAddress * Result, char const * Name)} */
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

    /** {@code LLVMOrcObjectLayerRef LLVMOrcLLJITGetObjLinkingLayer(LLVMOrcLLJITRef J)} */
    @NativeType("LLVMOrcObjectLayerRef")
    public static long LLVMOrcLLJITGetObjLinkingLayer(@NativeType("LLVMOrcLLJITRef") long J) {
        long __functionAddress = Functions.OrcLLJITGetObjLinkingLayer;
        if (CHECKS) {
            check(J);
        }
        return invokePP(J, __functionAddress);
    }

    // --- [ LLVMOrcLLJITGetObjTransformLayer ] ---

    /** {@code LLVMOrcObjectTransformLayerRef LLVMOrcLLJITGetObjTransformLayer(LLVMOrcLLJITRef J)} */
    @NativeType("LLVMOrcObjectTransformLayerRef")
    public static long LLVMOrcLLJITGetObjTransformLayer(@NativeType("LLVMOrcLLJITRef") long J) {
        long __functionAddress = Functions.OrcLLJITGetObjTransformLayer;
        if (CHECKS) {
            check(J);
        }
        return invokePP(J, __functionAddress);
    }

    // --- [ LLVMOrcLLJITGetIRTransformLayer ] ---

    /** {@code LLVMOrcIRTransformLayerRef LLVMOrcLLJITGetIRTransformLayer(LLVMOrcLLJITRef J)} */
    @NativeType("LLVMOrcIRTransformLayerRef")
    public static long LLVMOrcLLJITGetIRTransformLayer(@NativeType("LLVMOrcLLJITRef") long J) {
        long __functionAddress = Functions.OrcLLJITGetIRTransformLayer;
        if (CHECKS) {
            check(J);
        }
        return invokePP(J, __functionAddress);
    }

    // --- [ LLVMOrcLLJITGetDataLayoutStr ] ---

    /** {@code char const * LLVMOrcLLJITGetDataLayoutStr(LLVMOrcLLJITRef J)} */
    public static long nLLVMOrcLLJITGetDataLayoutStr(long J) {
        long __functionAddress = Functions.OrcLLJITGetDataLayoutStr;
        if (CHECKS) {
            check(J);
        }
        return invokePP(J, __functionAddress);
    }

    /** {@code char const * LLVMOrcLLJITGetDataLayoutStr(LLVMOrcLLJITRef J)} */
    @NativeType("char const *")
    public static @Nullable String LLVMOrcLLJITGetDataLayoutStr(@NativeType("LLVMOrcLLJITRef") long J) {
        long __result = nLLVMOrcLLJITGetDataLayoutStr(J);
        return memUTF8Safe(__result);
    }

}