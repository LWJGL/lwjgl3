/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/** Native bindings to Kernel32 library. */
public class Kernel32 {

    private static final SharedLibrary KERNEL32 = Library.loadNative(Kernel32.class, "org.lwjgl", "kernel32");

    /** Contains the function pointers loaded from the kernel32 {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GetCurrentProcess         = apiGetFunctionAddress(KERNEL32, "GetCurrentProcess"),
            GetCurrentProcessId       = apiGetFunctionAddress(KERNEL32, "GetCurrentProcessId"),
            GetProcessId              = apiGetFunctionAddress(KERNEL32, "GetProcessId"),
            GetCurrentThread          = apiGetFunctionAddress(KERNEL32, "GetCurrentThread"),
            GetCurrentThreadId        = apiGetFunctionAddress(KERNEL32, "GetCurrentThreadId"),
            GetThreadId               = apiGetFunctionAddressOptional(KERNEL32, "GetThreadId"),
            GetProcessIdOfThread      = apiGetFunctionAddressOptional(KERNEL32, "GetProcessIdOfThread"),
            GetCurrentProcessorNumber = apiGetFunctionAddressOptional(KERNEL32, "GetCurrentProcessorNumber");

    }

    /** Returns the kernel32 {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return KERNEL32;
    }

    protected Kernel32() {
        throw new UnsupportedOperationException();
    }

    // --- [ GetCurrentProcess ] ---

    @NativeType("HANDLE")
    public static long GetCurrentProcess() {
        long __functionAddress = Functions.GetCurrentProcess;
        return callP(__functionAddress);
    }

    // --- [ GetCurrentProcessId ] ---

    @NativeType("DWORD")
    public static int GetCurrentProcessId() {
        long __functionAddress = Functions.GetCurrentProcessId;
        return callI(__functionAddress);
    }

    // --- [ GetProcessId ] ---

    @NativeType("DWORD")
    public static int GetProcessId(@NativeType("HANDLE") long Process) {
        long __functionAddress = Functions.GetProcessId;
        if (CHECKS) {
            check(Process);
        }
        return callPI(Process, __functionAddress);
    }

    // --- [ GetCurrentThread ] ---

    @NativeType("HANDLE")
    public static long GetCurrentThread() {
        long __functionAddress = Functions.GetCurrentThread;
        return callP(__functionAddress);
    }

    // --- [ GetCurrentThreadId ] ---

    @NativeType("DWORD")
    public static int GetCurrentThreadId() {
        long __functionAddress = Functions.GetCurrentThreadId;
        return callI(__functionAddress);
    }

    // --- [ GetThreadId ] ---

    @NativeType("DWORD")
    public static int GetThreadId(@NativeType("HANDLE") long Thread) {
        long __functionAddress = Functions.GetThreadId;
        if (CHECKS) {
            check(__functionAddress);
            check(Thread);
        }
        return callPI(Thread, __functionAddress);
    }

    // --- [ GetProcessIdOfThread ] ---

    @NativeType("DWORD")
    public static int GetProcessIdOfThread(@NativeType("HANDLE") long Thread) {
        long __functionAddress = Functions.GetProcessIdOfThread;
        if (CHECKS) {
            check(__functionAddress);
            check(Thread);
        }
        return callPI(Thread, __functionAddress);
    }

    // --- [ GetCurrentProcessorNumber ] ---

    @NativeType("DWORD")
    public static int GetCurrentProcessorNumber() {
        long __functionAddress = Functions.GetCurrentProcessorNumber;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(__functionAddress);
    }

}