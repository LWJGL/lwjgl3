/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class ClangBuildSystem {

    /** Contains the function pointers loaded from {@code ClangIndex.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            getBuildSessionTimestamp                   = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_getBuildSessionTimestamp"),
            VirtualFileOverlay_create                  = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_VirtualFileOverlay_create"),
            VirtualFileOverlay_addFileMapping          = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_VirtualFileOverlay_addFileMapping"),
            VirtualFileOverlay_setCaseSensitivity      = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_VirtualFileOverlay_setCaseSensitivity"),
            VirtualFileOverlay_writeToBuffer           = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_VirtualFileOverlay_writeToBuffer"),
            free                                       = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_free"),
            VirtualFileOverlay_dispose                 = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_VirtualFileOverlay_dispose"),
            ModuleMapDescriptor_create                 = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_ModuleMapDescriptor_create"),
            ModuleMapDescriptor_setFrameworkModuleName = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_ModuleMapDescriptor_setFrameworkModuleName"),
            ModuleMapDescriptor_setUmbrellaHeader      = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_ModuleMapDescriptor_setUmbrellaHeader"),
            ModuleMapDescriptor_writeToBuffer          = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_ModuleMapDescriptor_writeToBuffer"),
            ModuleMapDescriptor_dispose                = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_ModuleMapDescriptor_dispose");

    }

    protected ClangBuildSystem() {
        throw new UnsupportedOperationException();
    }

    // --- [ clang_getBuildSessionTimestamp ] ---

    /** {@code unsigned long long clang_getBuildSessionTimestamp(void)} */
    @NativeType("unsigned long long")
    public static long clang_getBuildSessionTimestamp() {
        long __functionAddress = Functions.getBuildSessionTimestamp;
        return invokeJ(__functionAddress);
    }

    // --- [ clang_VirtualFileOverlay_create ] ---

    /** {@code CXVirtualFileOverlay clang_VirtualFileOverlay_create(unsigned int options)} */
    @NativeType("CXVirtualFileOverlay")
    public static long clang_VirtualFileOverlay_create(@NativeType("unsigned int") int options) {
        long __functionAddress = Functions.VirtualFileOverlay_create;
        return invokeP(options, __functionAddress);
    }

    // --- [ clang_VirtualFileOverlay_addFileMapping ] ---

    /** {@code enum CXErrorCode clang_VirtualFileOverlay_addFileMapping(CXVirtualFileOverlay overlay, char const * virtualPath, char const * realPath)} */
    public static int nclang_VirtualFileOverlay_addFileMapping(long overlay, long virtualPath, long realPath) {
        long __functionAddress = Functions.VirtualFileOverlay_addFileMapping;
        if (CHECKS) {
            check(overlay);
        }
        return invokePPPI(overlay, virtualPath, realPath, __functionAddress);
    }

    /** {@code enum CXErrorCode clang_VirtualFileOverlay_addFileMapping(CXVirtualFileOverlay overlay, char const * virtualPath, char const * realPath)} */
    @NativeType("enum CXErrorCode")
    public static int clang_VirtualFileOverlay_addFileMapping(@NativeType("CXVirtualFileOverlay") long overlay, @NativeType("char const *") ByteBuffer virtualPath, @NativeType("char const *") ByteBuffer realPath) {
        if (CHECKS) {
            checkNT1(virtualPath);
            checkNT1(realPath);
        }
        return nclang_VirtualFileOverlay_addFileMapping(overlay, memAddress(virtualPath), memAddress(realPath));
    }

    /** {@code enum CXErrorCode clang_VirtualFileOverlay_addFileMapping(CXVirtualFileOverlay overlay, char const * virtualPath, char const * realPath)} */
    @NativeType("enum CXErrorCode")
    public static int clang_VirtualFileOverlay_addFileMapping(@NativeType("CXVirtualFileOverlay") long overlay, @NativeType("char const *") CharSequence virtualPath, @NativeType("char const *") CharSequence realPath) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(virtualPath, true);
            long virtualPathEncoded = stack.getPointerAddress();
            stack.nASCII(realPath, true);
            long realPathEncoded = stack.getPointerAddress();
            return nclang_VirtualFileOverlay_addFileMapping(overlay, virtualPathEncoded, realPathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clang_VirtualFileOverlay_setCaseSensitivity ] ---

    /** {@code enum CXErrorCode clang_VirtualFileOverlay_setCaseSensitivity(CXVirtualFileOverlay overlay, int caseSensitive)} */
    @NativeType("enum CXErrorCode")
    public static int clang_VirtualFileOverlay_setCaseSensitivity(@NativeType("CXVirtualFileOverlay") long overlay, int caseSensitive) {
        long __functionAddress = Functions.VirtualFileOverlay_setCaseSensitivity;
        if (CHECKS) {
            check(overlay);
        }
        return invokePI(overlay, caseSensitive, __functionAddress);
    }

    // --- [ clang_VirtualFileOverlay_writeToBuffer ] ---

    /** {@code enum CXErrorCode clang_VirtualFileOverlay_writeToBuffer(CXVirtualFileOverlay overlay, unsigned int options, char ** out_buffer_ptr, unsigned int * out_buffer_size)} */
    public static int nclang_VirtualFileOverlay_writeToBuffer(long overlay, int options, long out_buffer_ptr, long out_buffer_size) {
        long __functionAddress = Functions.VirtualFileOverlay_writeToBuffer;
        if (CHECKS) {
            check(overlay);
        }
        return invokePPPI(overlay, options, out_buffer_ptr, out_buffer_size, __functionAddress);
    }

    /** {@code enum CXErrorCode clang_VirtualFileOverlay_writeToBuffer(CXVirtualFileOverlay overlay, unsigned int options, char ** out_buffer_ptr, unsigned int * out_buffer_size)} */
    @NativeType("enum CXErrorCode")
    public static int clang_VirtualFileOverlay_writeToBuffer(@NativeType("CXVirtualFileOverlay") long overlay, @NativeType("unsigned int") int options, @NativeType("char **") PointerBuffer out_buffer_ptr, @NativeType("unsigned int *") IntBuffer out_buffer_size) {
        if (CHECKS) {
            check(out_buffer_ptr, 1);
            check(out_buffer_size, 1);
        }
        return nclang_VirtualFileOverlay_writeToBuffer(overlay, options, memAddress(out_buffer_ptr), memAddress(out_buffer_size));
    }

    // --- [ clang_free ] ---

    /** {@code void clang_free(void * buffer)} */
    public static void nclang_free(long buffer) {
        long __functionAddress = Functions.free;
        invokePV(buffer, __functionAddress);
    }

    /** {@code void clang_free(void * buffer)} */
    public static void clang_free(@NativeType("void *") ByteBuffer buffer) {
        nclang_free(memAddress(buffer));
    }

    // --- [ clang_VirtualFileOverlay_dispose ] ---

    /** {@code void clang_VirtualFileOverlay_dispose(CXVirtualFileOverlay overlay)} */
    public static void clang_VirtualFileOverlay_dispose(@NativeType("CXVirtualFileOverlay") long overlay) {
        long __functionAddress = Functions.VirtualFileOverlay_dispose;
        if (CHECKS) {
            check(overlay);
        }
        invokePV(overlay, __functionAddress);
    }

    // --- [ clang_ModuleMapDescriptor_create ] ---

    /** {@code CXModuleMapDescriptor clang_ModuleMapDescriptor_create(unsigned int options)} */
    @NativeType("CXModuleMapDescriptor")
    public static long clang_ModuleMapDescriptor_create(@NativeType("unsigned int") int options) {
        long __functionAddress = Functions.ModuleMapDescriptor_create;
        return invokeP(options, __functionAddress);
    }

    // --- [ clang_ModuleMapDescriptor_setFrameworkModuleName ] ---

    /** {@code enum CXErrorCode clang_ModuleMapDescriptor_setFrameworkModuleName(CXModuleMapDescriptor descriptor, char const * name)} */
    public static int nclang_ModuleMapDescriptor_setFrameworkModuleName(long descriptor, long name) {
        long __functionAddress = Functions.ModuleMapDescriptor_setFrameworkModuleName;
        if (CHECKS) {
            check(descriptor);
        }
        return invokePPI(descriptor, name, __functionAddress);
    }

    /** {@code enum CXErrorCode clang_ModuleMapDescriptor_setFrameworkModuleName(CXModuleMapDescriptor descriptor, char const * name)} */
    @NativeType("enum CXErrorCode")
    public static int clang_ModuleMapDescriptor_setFrameworkModuleName(@NativeType("CXModuleMapDescriptor") long descriptor, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nclang_ModuleMapDescriptor_setFrameworkModuleName(descriptor, memAddress(name));
    }

    /** {@code enum CXErrorCode clang_ModuleMapDescriptor_setFrameworkModuleName(CXModuleMapDescriptor descriptor, char const * name)} */
    @NativeType("enum CXErrorCode")
    public static int clang_ModuleMapDescriptor_setFrameworkModuleName(@NativeType("CXModuleMapDescriptor") long descriptor, @NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nclang_ModuleMapDescriptor_setFrameworkModuleName(descriptor, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clang_ModuleMapDescriptor_setUmbrellaHeader ] ---

    /** {@code enum CXErrorCode clang_ModuleMapDescriptor_setUmbrellaHeader(CXModuleMapDescriptor descriptor, char const * name)} */
    public static int nclang_ModuleMapDescriptor_setUmbrellaHeader(long descriptor, long name) {
        long __functionAddress = Functions.ModuleMapDescriptor_setUmbrellaHeader;
        if (CHECKS) {
            check(descriptor);
        }
        return invokePPI(descriptor, name, __functionAddress);
    }

    /** {@code enum CXErrorCode clang_ModuleMapDescriptor_setUmbrellaHeader(CXModuleMapDescriptor descriptor, char const * name)} */
    @NativeType("enum CXErrorCode")
    public static int clang_ModuleMapDescriptor_setUmbrellaHeader(@NativeType("CXModuleMapDescriptor") long descriptor, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nclang_ModuleMapDescriptor_setUmbrellaHeader(descriptor, memAddress(name));
    }

    /** {@code enum CXErrorCode clang_ModuleMapDescriptor_setUmbrellaHeader(CXModuleMapDescriptor descriptor, char const * name)} */
    @NativeType("enum CXErrorCode")
    public static int clang_ModuleMapDescriptor_setUmbrellaHeader(@NativeType("CXModuleMapDescriptor") long descriptor, @NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nclang_ModuleMapDescriptor_setUmbrellaHeader(descriptor, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clang_ModuleMapDescriptor_writeToBuffer ] ---

    /** {@code enum CXErrorCode clang_ModuleMapDescriptor_writeToBuffer(CXModuleMapDescriptor descriptor, unsigned int options, char ** out_buffer_ptr, unsigned int * out_buffer_size)} */
    public static int nclang_ModuleMapDescriptor_writeToBuffer(long descriptor, int options, long out_buffer_ptr, long out_buffer_size) {
        long __functionAddress = Functions.ModuleMapDescriptor_writeToBuffer;
        if (CHECKS) {
            check(descriptor);
        }
        return invokePPPI(descriptor, options, out_buffer_ptr, out_buffer_size, __functionAddress);
    }

    /** {@code enum CXErrorCode clang_ModuleMapDescriptor_writeToBuffer(CXModuleMapDescriptor descriptor, unsigned int options, char ** out_buffer_ptr, unsigned int * out_buffer_size)} */
    @NativeType("enum CXErrorCode")
    public static int clang_ModuleMapDescriptor_writeToBuffer(@NativeType("CXModuleMapDescriptor") long descriptor, @NativeType("unsigned int") int options, @NativeType("char **") PointerBuffer out_buffer_ptr, @NativeType("unsigned int *") IntBuffer out_buffer_size) {
        if (CHECKS) {
            check(out_buffer_ptr, 1);
            check(out_buffer_size, 1);
        }
        return nclang_ModuleMapDescriptor_writeToBuffer(descriptor, options, memAddress(out_buffer_ptr), memAddress(out_buffer_size));
    }

    // --- [ clang_ModuleMapDescriptor_dispose ] ---

    /** {@code void clang_ModuleMapDescriptor_dispose(CXModuleMapDescriptor descriptor)} */
    public static void clang_ModuleMapDescriptor_dispose(@NativeType("CXModuleMapDescriptor") long descriptor) {
        long __functionAddress = Functions.ModuleMapDescriptor_dispose;
        if (CHECKS) {
            check(descriptor);
        }
        invokePV(descriptor, __functionAddress);
    }

}