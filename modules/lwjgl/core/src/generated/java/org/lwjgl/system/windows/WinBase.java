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

    /** BOOL return values. */
    public static final int
        FALSE = 0,
        TRUE  = 1;

    static { Library.initialize(); }

    protected WinBase() {
        throw new UnsupportedOperationException();
    }

    // --- [ GetLastError ] ---

    /**
     * Retrieves the calling thread's last-error code value. The last-error code is maintained on a per-thread basis. Multiple threads do not overwrite each
     * other's last-error code.
     * 
     * <p><b>LWJGL note</b>: This function cannot be used after another JNI call to a Windows function, because the last error resets before that call returns.
     * For this reason, LWJGL stores the last error in thread-local storage, you can use {@link #getLastError} to access it.</p>
     */
    @NativeType("DWORD")
    public static native int GetLastError();

    // --- [ getLastError ] ---

    /**
     * Retrieves the calling thread's last-error code value. The last-error code is maintained on a per-thread basis. Multiple threads do not overwrite each
     * other's last-error code.
     * 
     * <p><b>LWJGL note</b>: This method has a meaningful value only after another LWJGL JNI call. It does not call {@code GetLastError()} from WinBase.h, it
     * returns the thread-local error code stored by a previous JNI call.</p>
     */
    @NativeType("DWORD")
    public static native int getLastError();

    // --- [ GetModuleHandle ] ---

    /** Unsafe version of: {@link #GetModuleHandle} */
    public static native long nGetModuleHandle(long moduleName);

    /**
     * Retrieves a module handle for the specified module. The module must have been loaded by the calling process.
     *
     * @param moduleName the name of the loaded module (either a .dll or .exe file). If the file name extension is omitted, the default library extension .dll is appended.
     *                   The file name string can include a trailing point character (.) to indicate that the module name has no extension. The string does not have to
     *                   specify a path. When specifying a path, be sure to use backslashes (\), not forward slashes (/). The name is compared (case independently) to the
     *                   names of modules currently mapped into the address space of the calling process.
     *                   
     *                   <p>If this parameter is {@code NULL}, {@code GetModuleHandle} returns a handle to the file used to create the calling process (.exe file).</p>
     */
    @NativeType("HMODULE")
    public static long GetModuleHandle(@Nullable @NativeType("LPCTSTR") ByteBuffer moduleName) {
        if (CHECKS) {
            checkNT2Safe(moduleName);
        }
        return nGetModuleHandle(memAddressSafe(moduleName));
    }

    /**
     * Retrieves a module handle for the specified module. The module must have been loaded by the calling process.
     *
     * @param moduleName the name of the loaded module (either a .dll or .exe file). If the file name extension is omitted, the default library extension .dll is appended.
     *                   The file name string can include a trailing point character (.) to indicate that the module name has no extension. The string does not have to
     *                   specify a path. When specifying a path, be sure to use backslashes (\), not forward slashes (/). The name is compared (case independently) to the
     *                   names of modules currently mapped into the address space of the calling process.
     *                   
     *                   <p>If this parameter is {@code NULL}, {@code GetModuleHandle} returns a handle to the file used to create the calling process (.exe file).</p>
     */
    @NativeType("HMODULE")
    public static long GetModuleHandle(@Nullable @NativeType("LPCTSTR") CharSequence moduleName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF16Safe(moduleName, true);
            long moduleNameEncoded = moduleName == null ? NULL : stack.getPointerAddress();
            return nGetModuleHandle(moduleNameEncoded);
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
    public static native int nGetModuleFileName(long hModule, long lpFilename, int nSize);

    /**
     * Retrieves the fully qualified path for the file that contains the specified module. The module must have been loaded by the current process.
     *
     * @param hModule    a handle to the loaded module whose path is being requested.
     *                   
     *                   <p>If this parameter is NULL, {@code GetModuleFileName} retrieves the path of the executable file of the current process.</p>
     * @param lpFilename a pointer to a buffer that receives the fully qualified path of the module.
     *                   
     *                   <p>If the length of the path is less than the size that the {@code nSize} parameter specifies, the function succeeds and the path is returned as a
     *                   null-terminated string.</p>
     *                   
     *                   <p>If the length of the path exceeds the size that the {@code nSize} parameter specifies, the function succeeds and the string is truncated to
     *                   {@code nSize} characters including the terminating null character.</p>
     *                   
     *                   <p>The string returned will use the same format that was specified when the module was loaded. Therefore, the path can be a long or short file name,
     *                   and can use the prefix "\?".</p>
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
    public static int GetModuleFileName(@NativeType("HMODULE") long hModule, @NativeType("LPTSTR") ByteBuffer lpFilename) {
        return nGetModuleFileName(hModule, memAddress(lpFilename), lpFilename.remaining() >> 1);
    }

    /**
     * Retrieves the fully qualified path for the file that contains the specified module. The module must have been loaded by the current process.
     *
     * @param hModule a handle to the loaded module whose path is being requested.
     *                
     *                <p>If this parameter is NULL, {@code GetModuleFileName} retrieves the path of the executable file of the current process.</p>
     * @param nSize   the size of the {@code lpFilename} buffer, in {@code TCHAR}s.
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
    public static String GetModuleFileName(@NativeType("HMODULE") long hModule, @NativeType("DWORD") int nSize) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer lpFilename = stack.malloc(nSize);
            int __result = nGetModuleFileName(hModule, memAddress(lpFilename), nSize);
            return memUTF16(lpFilename, __result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LoadLibrary ] ---

    /** Unsafe version of: {@link #LoadLibrary} */
    public static native long nLoadLibrary(long name);

    /**
     * Loads the specified module into the address space of the calling process. The specified module may cause other modules to be loaded.
     *
     * @param name the name of the module. This can be either a library module (a .dll file) or an executable module (an .exe file). The name specified is the file
     *             name of the module and is not related to the name stored in the library module itself, as specified by the LIBRARY keyword in the module-definition
     *             (.def) file.
     *             
     *             <p>If the string specifies a full path, the function searches only that path for the module.</p>
     *             
     *             <p>If the string specifies a relative path or a module name without a path, the function uses a standard search strategy to find the module.</p>
     *             
     *             <p>If the function cannot find the module, the function fails. When specifying a path, be sure to use backslashes (\), not forward slashes (/).</p>
     *             
     *             <p>If the string specifies a module name without a path and the file name extension is omitted, the function appends the default library extension
     *             .dll to the module name. To prevent the function from appending .dll to the module name, include a trailing point character (.) in the module name
     *             string.</p>
     */
    @NativeType("HMODULE")
    public static long LoadLibrary(@NativeType("LPCTSTR") ByteBuffer name) {
        if (CHECKS) {
            checkNT2(name);
        }
        return nLoadLibrary(memAddress(name));
    }

    /**
     * Loads the specified module into the address space of the calling process. The specified module may cause other modules to be loaded.
     *
     * @param name the name of the module. This can be either a library module (a .dll file) or an executable module (an .exe file). The name specified is the file
     *             name of the module and is not related to the name stored in the library module itself, as specified by the LIBRARY keyword in the module-definition
     *             (.def) file.
     *             
     *             <p>If the string specifies a full path, the function searches only that path for the module.</p>
     *             
     *             <p>If the string specifies a relative path or a module name without a path, the function uses a standard search strategy to find the module.</p>
     *             
     *             <p>If the function cannot find the module, the function fails. When specifying a path, be sure to use backslashes (\), not forward slashes (/).</p>
     *             
     *             <p>If the string specifies a module name without a path and the file name extension is omitted, the function appends the default library extension
     *             .dll to the module name. To prevent the function from appending .dll to the module name, include a trailing point character (.) in the module name
     *             string.</p>
     */
    @NativeType("HMODULE")
    public static long LoadLibrary(@NativeType("LPCTSTR") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF16(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nLoadLibrary(nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ GetProcAddress ] ---

    /** Unsafe version of: {@link #GetProcAddress} */
    public static native long nGetProcAddress(long handle, long name);

    /**
     * Retrieves the address of an exported function or variable from the specified dynamic-link library (DLL).
     *
     * @param handle a handle to the DLL module that contains the function or variable
     * @param name   the function or variable name, or the function's ordinal value. If this parameter is an ordinal value, it must be in the low-order word; the
     *               high-order word must be zero.
     */
    @NativeType("FARPROC")
    public static long GetProcAddress(@NativeType("HMODULE") long handle, @NativeType("LPCSTR") ByteBuffer name) {
        if (CHECKS) {
            check(handle);
            checkNT1(name);
        }
        return nGetProcAddress(handle, memAddress(name));
    }

    /**
     * Retrieves the address of an exported function or variable from the specified dynamic-link library (DLL).
     *
     * @param handle a handle to the DLL module that contains the function or variable
     * @param name   the function or variable name, or the function's ordinal value. If this parameter is an ordinal value, it must be in the low-order word; the
     *               high-order word must be zero.
     */
    @NativeType("FARPROC")
    public static long GetProcAddress(@NativeType("HMODULE") long handle, @NativeType("LPCSTR") CharSequence name) {
        if (CHECKS) {
            check(handle);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nGetProcAddress(handle, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ FreeLibrary ] ---

    /** Unsafe version of: {@link #FreeLibrary} */
    public static native int nFreeLibrary(long handle);

    /**
     * Frees the loaded dynamic-link library (DLL) module and, if necessary, decrements its reference count. When the reference count reaches zero, the module
     * is unloaded from the address space of the calling process and the handle is no longer valid.
     *
     * @param handle a handle to the loaded library module
     */
    @NativeType("BOOL")
    public static boolean FreeLibrary(@NativeType("HMODULE") long handle) {
        if (CHECKS) {
            check(handle);
        }
        return nFreeLibrary(handle) != 0;
    }

}