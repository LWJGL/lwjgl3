/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to WinBase.h. */
public class WinBase {

    static { Library.initialize(); }

    /** BOOL return values. */
    public static final int
        FALSE = 0,
        TRUE  = 1;

    protected WinBase() {
        throw new UnsupportedOperationException();
    }

    // --- [ LocalFree ] ---

    /** Unsafe version of: {@link #LocalFree} */
    public static native long nLocalFree(long _GetLastError, long hMem);

    /**
     * Frees the specified local memory object and invalidates its handle.
     *
     * @param _GetLastError optionally returns the result of {@code GetLastError()} after this function is called
     * @param hMem          a handle to the local memory object
     *
     * @return if the function succeeds, the return value is {@code NULL}.
     *         
     *         <p>If the function fails, the return value is equal to a handle to the local memory object. To get extended error information, call {@link #GetLastError}.</p>
     */
    @NativeType("HLOCAL")
    public static long LocalFree(@Nullable @NativeType("DWORD *") IntBuffer _GetLastError, @NativeType("HLOCAL") long hMem) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
            check(hMem);
        }
        return nLocalFree(memAddressSafe(_GetLastError), hMem);
    }

    // --- [ GetLastError ] ---

    /**
     * Retrieves the calling thread's last-error code value. The last-error code is maintained on a per-thread basis. Multiple threads do not overwrite each
     * other's last-error code.
     * 
     * <p><b>LWJGL note</b>: This function cannot be used after another JNI call to a Windows function, because the last-error code resets before that call
     * returns. LWJGL adds a virtual output parameter to functions that may set the last-error code, which may be used to capture its value.</p>
     */
    @NativeType("DWORD")
    public static native int GetLastError();

    // --- [ GetModuleHandle ] ---

    /** Unsafe version of: {@link #GetModuleHandle} */
    public static native long nGetModuleHandle(long _GetLastError, long moduleName);

    /**
     * Retrieves a module handle for the specified module. The module must have been loaded by the calling process.
     *
     * @param _GetLastError optionally returns the result of {@code GetLastError()} after this function is called
     * @param moduleName    the name of the loaded module (either a .dll or .exe file). If the file name extension is omitted, the default library extension .dll is appended.
     *                      The file name string can include a trailing point character (.) to indicate that the module name has no extension. The string does not have to
     *                      specify a path. When specifying a path, be sure to use backslashes (\), not forward slashes (/). The name is compared (case independently) to the
     *                      names of modules currently mapped into the address space of the calling process.
     *                      
     *                      <p>If this parameter is {@code NULL}, {@code GetModuleHandle} returns a handle to the file used to create the calling process (.exe file).</p>
     */
    @NativeType("HMODULE")
    public static long GetModuleHandle(@Nullable @NativeType("DWORD *") IntBuffer _GetLastError, @Nullable @NativeType("LPCTSTR") ByteBuffer moduleName) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
            checkNT2Safe(moduleName);
        }
        return nGetModuleHandle(memAddressSafe(_GetLastError), memAddressSafe(moduleName));
    }

    /**
     * Retrieves a module handle for the specified module. The module must have been loaded by the calling process.
     *
     * @param _GetLastError optionally returns the result of {@code GetLastError()} after this function is called
     * @param moduleName    the name of the loaded module (either a .dll or .exe file). If the file name extension is omitted, the default library extension .dll is appended.
     *                      The file name string can include a trailing point character (.) to indicate that the module name has no extension. The string does not have to
     *                      specify a path. When specifying a path, be sure to use backslashes (\), not forward slashes (/). The name is compared (case independently) to the
     *                      names of modules currently mapped into the address space of the calling process.
     *                      
     *                      <p>If this parameter is {@code NULL}, {@code GetModuleHandle} returns a handle to the file used to create the calling process (.exe file).</p>
     */
    @NativeType("HMODULE")
    public static long GetModuleHandle(@Nullable @NativeType("DWORD *") IntBuffer _GetLastError, @Nullable @NativeType("LPCTSTR") CharSequence moduleName) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF16Safe(moduleName, true);
            long moduleNameEncoded = moduleName == null ? NULL : stack.getPointerAddress();
            return nGetModuleHandle(memAddressSafe(_GetLastError), moduleNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ GetModuleFileName ] ---

    /**
     * Unsafe version of: {@link #GetModuleFileName}
     *
     * @param nSize the size of the {@code lpFilename} buffer, in {@code TCHAR}s.
     */
    public static native int nGetModuleFileName(long _GetLastError, long hModule, long lpFilename, int nSize);

    /**
     * Retrieves the fully qualified path for the file that contains the specified module. The module must have been loaded by the current process.
     *
     * @param _GetLastError optionally returns the result of {@code GetLastError()} after this function is called
     * @param hModule       a handle to the loaded module whose path is being requested.
     *                      
     *                      <p>If this parameter is NULL, {@code GetModuleFileName} retrieves the path of the executable file of the current process.</p>
     * @param lpFilename    a pointer to a buffer that receives the fully qualified path of the module.
     *                      
     *                      <p>If the length of the path is less than the size that the {@code nSize} parameter specifies, the function succeeds and the path is returned as a
     *                      null-terminated string.</p>
     *                      
     *                      <p>If the length of the path exceeds the size that the {@code nSize} parameter specifies, the function succeeds and the string is truncated to
     *                      {@code nSize} characters including the terminating null character.</p>
     *                      
     *                      <p>The string returned will use the same format that was specified when the module was loaded. Therefore, the path can be a long or short file name,
     *                      and can use the prefix "\?".</p>
     *
     * @return if the function succeeds, the return value is the length of the string that is copied to the buffer, in characters, not including the terminating null
     *         character.
     *         
     *         <p>If the buffer is too small to hold the module name, the string is truncated to {@code nSize} characters including the terminating null character, the
     *         function returns {@code nSize}, and the function sets the last error to {@code ERROR_INSUFFICIENT_BUFFER}.</p>
     *         
     *         <p>If the function fails, the return value is 0 (zero). To get extended error information, call {@link #GetLastError}.</p>
     */
    @NativeType("DWORD")
    public static int GetModuleFileName(@Nullable @NativeType("DWORD *") IntBuffer _GetLastError, @NativeType("HMODULE") long hModule, @NativeType("LPTSTR") ByteBuffer lpFilename) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
        }
        return nGetModuleFileName(memAddressSafe(_GetLastError), hModule, memAddress(lpFilename), lpFilename.remaining() >> 1);
    }

    /**
     * Retrieves the fully qualified path for the file that contains the specified module. The module must have been loaded by the current process.
     *
     * @param _GetLastError optionally returns the result of {@code GetLastError()} after this function is called
     * @param hModule       a handle to the loaded module whose path is being requested.
     *                      
     *                      <p>If this parameter is NULL, {@code GetModuleFileName} retrieves the path of the executable file of the current process.</p>
     * @param nSize         the size of the {@code lpFilename} buffer, in {@code TCHAR}s.
     *
     * @return if the function succeeds, the return value is the length of the string that is copied to the buffer, in characters, not including the terminating null
     *         character.
     *         
     *         <p>If the buffer is too small to hold the module name, the string is truncated to {@code nSize} characters including the terminating null character, the
     *         function returns {@code nSize}, and the function sets the last error to {@code ERROR_INSUFFICIENT_BUFFER}.</p>
     *         
     *         <p>If the function fails, the return value is 0 (zero). To get extended error information, call {@link #GetLastError}.</p>
     */
    @NativeType("DWORD")
    public static String GetModuleFileName(@Nullable @NativeType("DWORD *") IntBuffer _GetLastError, @NativeType("HMODULE") long hModule, @NativeType("DWORD") int nSize) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer lpFilename = stack.malloc(nSize << 1);
            int __result = nGetModuleFileName(memAddressSafe(_GetLastError), hModule, memAddress(lpFilename), nSize);
            return memUTF16(lpFilename, __result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LoadLibrary ] ---

    /** Unsafe version of: {@link #LoadLibrary} */
    public static native long nLoadLibrary(long _GetLastError, long name);

    /**
     * Loads the specified module into the address space of the calling process. The specified module may cause other modules to be loaded.
     *
     * @param _GetLastError optionally returns the result of {@code GetLastError()} after this function is called
     * @param name          the name of the module. This can be either a library module (a .dll file) or an executable module (an .exe file). The name specified is the file
     *                      name of the module and is not related to the name stored in the library module itself, as specified by the LIBRARY keyword in the module-definition
     *                      (.def) file.
     *                      
     *                      <p>If the string specifies a full path, the function searches only that path for the module.</p>
     *                      
     *                      <p>If the string specifies a relative path or a module name without a path, the function uses a standard search strategy to find the module.</p>
     *                      
     *                      <p>If the function cannot find the module, the function fails. When specifying a path, be sure to use backslashes (\), not forward slashes (/).</p>
     *                      
     *                      <p>If the string specifies a module name without a path and the file name extension is omitted, the function appends the default library extension
     *                      .dll to the module name. To prevent the function from appending .dll to the module name, include a trailing point character (.) in the module name
     *                      string.</p>
     */
    @NativeType("HMODULE")
    public static long LoadLibrary(@Nullable @NativeType("DWORD *") IntBuffer _GetLastError, @NativeType("LPCTSTR") ByteBuffer name) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
            checkNT2(name);
        }
        return nLoadLibrary(memAddressSafe(_GetLastError), memAddress(name));
    }

    /**
     * Loads the specified module into the address space of the calling process. The specified module may cause other modules to be loaded.
     *
     * @param _GetLastError optionally returns the result of {@code GetLastError()} after this function is called
     * @param name          the name of the module. This can be either a library module (a .dll file) or an executable module (an .exe file). The name specified is the file
     *                      name of the module and is not related to the name stored in the library module itself, as specified by the LIBRARY keyword in the module-definition
     *                      (.def) file.
     *                      
     *                      <p>If the string specifies a full path, the function searches only that path for the module.</p>
     *                      
     *                      <p>If the string specifies a relative path or a module name without a path, the function uses a standard search strategy to find the module.</p>
     *                      
     *                      <p>If the function cannot find the module, the function fails. When specifying a path, be sure to use backslashes (\), not forward slashes (/).</p>
     *                      
     *                      <p>If the string specifies a module name without a path and the file name extension is omitted, the function appends the default library extension
     *                      .dll to the module name. To prevent the function from appending .dll to the module name, include a trailing point character (.) in the module name
     *                      string.</p>
     */
    @NativeType("HMODULE")
    public static long LoadLibrary(@Nullable @NativeType("DWORD *") IntBuffer _GetLastError, @NativeType("LPCTSTR") CharSequence name) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF16(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nLoadLibrary(memAddressSafe(_GetLastError), nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ GetProcAddress ] ---

    /** Unsafe version of: {@link #GetProcAddress} */
    public static native long nGetProcAddress(long _GetLastError, long handle, long name);

    /**
     * Retrieves the address of an exported function or variable from the specified dynamic-link library (DLL).
     *
     * @param _GetLastError optionally returns the result of {@code GetLastError()} after this function is called
     * @param handle        a handle to the DLL module that contains the function or variable
     * @param name          the function or variable name, or the function's ordinal value. If this parameter is an ordinal value, it must be in the low-order word; the
     *                      high-order word must be zero.
     */
    @NativeType("FARPROC")
    public static long GetProcAddress(@Nullable @NativeType("DWORD *") IntBuffer _GetLastError, @NativeType("HMODULE") long handle, @NativeType("LPCSTR") ByteBuffer name) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
            check(handle);
            checkNT1(name);
        }
        return nGetProcAddress(memAddressSafe(_GetLastError), handle, memAddress(name));
    }

    /**
     * Retrieves the address of an exported function or variable from the specified dynamic-link library (DLL).
     *
     * @param _GetLastError optionally returns the result of {@code GetLastError()} after this function is called
     * @param handle        a handle to the DLL module that contains the function or variable
     * @param name          the function or variable name, or the function's ordinal value. If this parameter is an ordinal value, it must be in the low-order word; the
     *                      high-order word must be zero.
     */
    @NativeType("FARPROC")
    public static long GetProcAddress(@Nullable @NativeType("DWORD *") IntBuffer _GetLastError, @NativeType("HMODULE") long handle, @NativeType("LPCSTR") CharSequence name) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
            check(handle);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nGetProcAddress(memAddressSafe(_GetLastError), handle, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ FreeLibrary ] ---

    /** Unsafe version of: {@link #FreeLibrary} */
    public static native int nFreeLibrary(long _GetLastError, long handle);

    /**
     * Frees the loaded dynamic-link library (DLL) module and, if necessary, decrements its reference count. When the reference count reaches zero, the module
     * is unloaded from the address space of the calling process and the handle is no longer valid.
     *
     * @param _GetLastError optionally returns the result of {@code GetLastError()} after this function is called
     * @param handle        a handle to the loaded library module
     */
    @NativeType("BOOL")
    public static boolean FreeLibrary(@Nullable @NativeType("DWORD *") IntBuffer _GetLastError, @NativeType("HMODULE") long handle) {
        if (CHECKS) {
            checkSafe(_GetLastError, 1);
            check(handle);
        }
        return nFreeLibrary(memAddressSafe(_GetLastError), handle) != 0;
    }

}