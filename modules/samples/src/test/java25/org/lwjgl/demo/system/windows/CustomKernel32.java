/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.system.windows;

import org.jspecify.annotations.*;
import org.lwjgl.system.ffm.*;
import org.lwjgl.system.windows.*;

import java.lang.foreign.*;
import java.lang.invoke.*;
import java.nio.*;
import java.nio.charset.*;
import java.util.*;

import static org.lwjgl.system.SegmentStack.*;
import static org.lwjgl.system.ffm.FFM.*;
import static org.lwjgl.system.ffm.FFMCharset.Type.*;
import static org.testng.Assert.*;

public class CustomKernel32 {

    @FFMCharset(UTF16)
    public interface MyKernel32Bindings {
        @FFMDefinition("HMODULE GetModuleHandle(LPCWSTR lpModuleName)")
        @FFMName("GetModuleHandleW")
        MemorySegment GetModuleHandle(@FFMCaptureCallState("GetLastError") MemorySegment pLastError, @Nullable String lpModuleName);

        // ----------------------------

        @FFMDefinition("DWORD GetModuleFileNameW(HMODULE hModule, LPTSTR lpFileName, DWORD nSize)")
        @FFMName("GetModuleFileNameW")
        int GetModuleFileName(@FFMCaptureCallState("GetLastError") MemorySegment pLastError, MemorySegment hModule, MemorySegment lpFileName, @FFMReturn.Size int nSize);

        @FFMDefinition("DWORD GetModuleFileNameW(HMODULE hModule, LPTSTR lpFileName, DWORD nSize)")
        @FFMName("GetModuleFileNameW") @FFMReturn(1)
        String GetModuleFileName(@FFMCaptureCallState("GetLastError") MemorySegment pLastError, MemorySegment hModule, @FFMReturn.Size int nSize);

        @FFMDefinition("DWORD GetModuleFileNameW(HMODULE hModule, LPTSTR lpFileName, DWORD nSize)")
        @FFMName("GetModuleFileNameW") @FFMReturn(1)
        String GetModuleFileName(SegmentAllocator allocator, @FFMCaptureCallState("GetLastError") MemorySegment pLastError, MemorySegment hModule, @FFMReturn.Size int nSize);

        @FFMDefinition("DWORD GetModuleFileNameW(HMODULE hModule, LPTSTR lpFileName, DWORD nSize)")
        @FFMName("GetModuleFileNameW") @FFMReturn(1)
        String GetModuleFileName(StackAllocator<?> allocator, @FFMCaptureCallState("GetLastError") MemorySegment pLastError, MemorySegment hModule, @FFMReturn.Size int nSize);

        // ----------------------------

        @FFMDefinition("HMODULE LoadLibrary(LPCTSTR lpLibFileName)")
        @FFMName("LoadLibraryW")
        MemorySegment LoadLibrary(@FFMCaptureCallState("GetLastError") MemorySegment pLastError, String lpLibFileName);

        @FFMDefinition("FARPROC GetProcAddress(HMODULE hModule, LPCSTR lpProcName)")
        MemorySegment GetProcAddress(@FFMCaptureCallState("GetLastError") MemorySegment pLastError, MemorySegment hModule, @FFMCharset(ISO_8859_1) String lpProcName);

        @FFMDefinition("BOOL FreeLibrary(HMODULE hLibModule)")
        @FFMBooleanInt(binary = true)
        boolean FreeLibrary(@FFMCaptureCallState("GetLastError") MemorySegment pLastError, MemorySegment hLibModule);
    }

    private static final SymbolLookup LOADER = SymbolLookup.libraryLookup(Objects.requireNonNull(Kernel32.getLibrary().getPath()), Arena.global());

    private static final MyKernel32Bindings KERNEL32 = ffmGenerate(
        MyKernel32Bindings.class,
        ffmConfigBuilder(MethodHandles.lookup())
            .withSymbolLookup(LOADER)
            .build()
    );

    public static void main(String[] ignored) {
        try (var stack = stackPush()) {
            var LastError = stack.allocate(Linker.Option.captureStateLayout());

            var process = KERNEL32.GetModuleHandle(LastError, null);
            check(LastError);

            assertEquals(
                process.address(),
                WinBase.GetModuleHandle(null, (ByteBuffer)null)
            );

            var moduleFileNameRef = WinBase.GetModuleFileName(null, process.address(), 512);

            // Case A: External buffer
            try (var frame = stack.push()) {
                var lpFileName = frame.allocate(512 * 2);

                var length = KERNEL32.GetModuleFileName(LastError, process, lpFileName, 512);
                assertEquals(
                    new String(lpFileName.asSlice(0L, length * 2).toArray(ValueLayout.JAVA_BYTE), StandardCharsets.UTF_16LE),
                    moduleFileNameRef
                );
                check(LastError);
            }

            // Case B: Internal buffer, thread-local stack lookup, push/pop
            var pointer = stack.getPointer();
            {
                assertEquals(
                    KERNEL32.GetModuleFileName(LastError, process, 512),
                    moduleFileNameRef
                );
                check(LastError);
                assertEquals(stack.getPointer(), pointer);
            }

            // Case C: Internal buffer, explicit stack (no lookup), push/pop
            {
                assertEquals(
                    KERNEL32.GetModuleFileName(stack, LastError, process, 512),
                    moduleFileNameRef
                );
                check(LastError);
                assertEquals(stack.getPointer(), pointer);
            }

            // Case D: Internal buffer, explicit allocator, no push/pop
            try (var frame = stack.push()) {
                assertEquals(
                    KERNEL32.GetModuleFileName((SegmentAllocator)frame, LastError, process, 512),
                    moduleFileNameRef
                );
                check(LastError);
                assertEquals(frame.getPointer(), (pointer & -ValueLayout.ADDRESS.byteAlignment()) - (512 * 2));
            }
            assertEquals(stack.getPointer(), pointer);

            var kernel32    = KERNEL32.LoadLibrary(LastError, "kernel32.dll");
            var kernel32Ref = WinBase.LoadLibrary(null, "kernel32.dll");
            check(LastError);
            assertEquals(
                kernel32.address(),
                kernel32Ref
            );

            assertEquals(
                KERNEL32.GetProcAddress(LastError, kernel32, "VirtualAlloc").address(),
                WinBase.GetProcAddress(null, kernel32Ref, "VirtualAlloc")
            );
            check(LastError);

            assertEquals(
                KERNEL32.FreeLibrary(LastError, kernel32),
                WinBase.FreeLibrary(null, kernel32Ref)
            );
            check(LastError);
        }
    }

    private static final VarHandle GET_LAST_ERROR = Linker.Option.captureStateLayout()
        .varHandle(MemoryLayout.PathElement.groupElement("GetLastError"))
        .withInvokeExactBehavior();

    private static void check(MemorySegment LastError) {
        var error = (int)GET_LAST_ERROR.get(LastError, 0L);
        if (error != 0) {
            throw new IllegalStateException("Operation failed with error code: " + error);
        }
    }

}