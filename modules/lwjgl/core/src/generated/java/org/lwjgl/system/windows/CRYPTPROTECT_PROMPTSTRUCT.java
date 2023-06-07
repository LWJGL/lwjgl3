/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Provides the text of a prompt and information about when and where that prompt is to be displayed when using the {@link Crypt32#CryptProtectData} and
 * {@link Crypt32#CryptUnprotectData} functions.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CRYPTPROTECT_PROMPTSTRUCT {
 *     DWORD {@link #cbSize};
 *     DWORD {@link #dwPromptFlags};
 *     HWND {@link #hwndApp};
 *     LPCWSTR {@link #szPrompt};
 * }</code></pre>
 */
public class CRYPTPROTECT_PROMPTSTRUCT extends Struct<CRYPTPROTECT_PROMPTSTRUCT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CBSIZE,
        DWPROMPTFLAGS,
        HWNDAPP,
        SZPROMPT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CBSIZE = layout.offsetof(0);
        DWPROMPTFLAGS = layout.offsetof(1);
        HWNDAPP = layout.offsetof(2);
        SZPROMPT = layout.offsetof(3);
    }

    protected CRYPTPROTECT_PROMPTSTRUCT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CRYPTPROTECT_PROMPTSTRUCT create(long address, @Nullable ByteBuffer container) {
        return new CRYPTPROTECT_PROMPTSTRUCT(address, container);
    }

    /**
     * Creates a {@code CRYPTPROTECT_PROMPTSTRUCT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CRYPTPROTECT_PROMPTSTRUCT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the size, in bytes, of this structure */
    @NativeType("DWORD")
    public int cbSize() { return ncbSize(address()); }
    /** flags that indicate when prompts to the user are to be displayed. One or more of:<br><table><tr><td>{@link Crypt32#CRYPTPROTECT_PROMPT_ON_UNPROTECT}</td><td>{@link Crypt32#CRYPTPROTECT_PROMPT_ON_PROTECT}</td></tr></table> */
    @NativeType("DWORD")
    public int dwPromptFlags() { return ndwPromptFlags(address()); }
    /** window handle to the parent window */
    @NativeType("HWND")
    public long hwndApp() { return nhwndApp(address()); }
    /** a string containing the text of a prompt to be displayed */
    @NativeType("LPCWSTR")
    public ByteBuffer szPrompt() { return nszPrompt(address()); }
    /** a string containing the text of a prompt to be displayed */
    @NativeType("LPCWSTR")
    public String szPromptString() { return nszPromptString(address()); }

    /** Sets the specified value to the {@link #cbSize} field. */
    public CRYPTPROTECT_PROMPTSTRUCT cbSize(@NativeType("DWORD") int value) { ncbSize(address(), value); return this; }
    /** Sets the default value to the {@link #cbSize} field. */
    public CRYPTPROTECT_PROMPTSTRUCT cbSize$Default() { return cbSize(SIZEOF); }
    /** Sets the specified value to the {@link #dwPromptFlags} field. */
    public CRYPTPROTECT_PROMPTSTRUCT dwPromptFlags(@NativeType("DWORD") int value) { ndwPromptFlags(address(), value); return this; }
    /** Sets the specified value to the {@link #hwndApp} field. */
    public CRYPTPROTECT_PROMPTSTRUCT hwndApp(@NativeType("HWND") long value) { nhwndApp(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@link #szPrompt} field. */
    public CRYPTPROTECT_PROMPTSTRUCT szPrompt(@NativeType("LPCWSTR") ByteBuffer value) { nszPrompt(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public CRYPTPROTECT_PROMPTSTRUCT set(
        int cbSize,
        int dwPromptFlags,
        long hwndApp,
        ByteBuffer szPrompt
    ) {
        cbSize(cbSize);
        dwPromptFlags(dwPromptFlags);
        hwndApp(hwndApp);
        szPrompt(szPrompt);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CRYPTPROTECT_PROMPTSTRUCT set(CRYPTPROTECT_PROMPTSTRUCT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CRYPTPROTECT_PROMPTSTRUCT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CRYPTPROTECT_PROMPTSTRUCT malloc() {
        return new CRYPTPROTECT_PROMPTSTRUCT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code CRYPTPROTECT_PROMPTSTRUCT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CRYPTPROTECT_PROMPTSTRUCT calloc() {
        return new CRYPTPROTECT_PROMPTSTRUCT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code CRYPTPROTECT_PROMPTSTRUCT} instance allocated with {@link BufferUtils}. */
    public static CRYPTPROTECT_PROMPTSTRUCT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CRYPTPROTECT_PROMPTSTRUCT(memAddress(container), container);
    }

    /** Returns a new {@code CRYPTPROTECT_PROMPTSTRUCT} instance for the specified memory address. */
    public static CRYPTPROTECT_PROMPTSTRUCT create(long address) {
        return new CRYPTPROTECT_PROMPTSTRUCT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CRYPTPROTECT_PROMPTSTRUCT createSafe(long address) {
        return address == NULL ? null : new CRYPTPROTECT_PROMPTSTRUCT(address, null);
    }

    /**
     * Returns a new {@code CRYPTPROTECT_PROMPTSTRUCT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CRYPTPROTECT_PROMPTSTRUCT malloc(MemoryStack stack) {
        return new CRYPTPROTECT_PROMPTSTRUCT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code CRYPTPROTECT_PROMPTSTRUCT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CRYPTPROTECT_PROMPTSTRUCT calloc(MemoryStack stack) {
        return new CRYPTPROTECT_PROMPTSTRUCT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    // -----------------------------------

    /** Unsafe version of {@link #cbSize}. */
    public static int ncbSize(long struct) { return UNSAFE.getInt(null, struct + CRYPTPROTECT_PROMPTSTRUCT.CBSIZE); }
    /** Unsafe version of {@link #dwPromptFlags}. */
    public static int ndwPromptFlags(long struct) { return UNSAFE.getInt(null, struct + CRYPTPROTECT_PROMPTSTRUCT.DWPROMPTFLAGS); }
    /** Unsafe version of {@link #hwndApp}. */
    public static long nhwndApp(long struct) { return memGetAddress(struct + CRYPTPROTECT_PROMPTSTRUCT.HWNDAPP); }
    /** Unsafe version of {@link #szPrompt}. */
    public static ByteBuffer nszPrompt(long struct) { return memByteBufferNT2(memGetAddress(struct + CRYPTPROTECT_PROMPTSTRUCT.SZPROMPT)); }
    /** Unsafe version of {@link #szPromptString}. */
    public static String nszPromptString(long struct) { return memUTF16(memGetAddress(struct + CRYPTPROTECT_PROMPTSTRUCT.SZPROMPT)); }

    /** Unsafe version of {@link #cbSize(int) cbSize}. */
    public static void ncbSize(long struct, int value) { UNSAFE.putInt(null, struct + CRYPTPROTECT_PROMPTSTRUCT.CBSIZE, value); }
    /** Unsafe version of {@link #dwPromptFlags(int) dwPromptFlags}. */
    public static void ndwPromptFlags(long struct, int value) { UNSAFE.putInt(null, struct + CRYPTPROTECT_PROMPTSTRUCT.DWPROMPTFLAGS, value); }
    /** Unsafe version of {@link #hwndApp(long) hwndApp}. */
    public static void nhwndApp(long struct, long value) { memPutAddress(struct + CRYPTPROTECT_PROMPTSTRUCT.HWNDAPP, check(value)); }
    /** Unsafe version of {@link #szPrompt(ByteBuffer) szPrompt}. */
    public static void nszPrompt(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT2(value); }
        memPutAddress(struct + CRYPTPROTECT_PROMPTSTRUCT.SZPROMPT, memAddress(value));
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + CRYPTPROTECT_PROMPTSTRUCT.HWNDAPP));
        check(memGetAddress(struct + CRYPTPROTECT_PROMPTSTRUCT.SZPROMPT));
    }

}