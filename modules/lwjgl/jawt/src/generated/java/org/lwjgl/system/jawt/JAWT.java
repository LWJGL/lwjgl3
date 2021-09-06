/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jawt;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure for containing native AWT functions.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct JAWT {
 *     jint {@link #version};
 *     void * GetDrawingSurface;
 *     void * FreeDrawingSurface;
 *     void * Lock;
 *     void * Unlock;
 *     void * GetComponent;
 *     void * CreateEmbeddedFrame;
 *     void * SetBounds;
 *     void * SynthesizeWindowActivation;
 * }</code></pre>
 */
public class JAWT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        VERSION,
        GETDRAWINGSURFACE,
        FREEDRAWINGSURFACE,
        LOCK,
        UNLOCK,
        GETCOMPONENT,
        CREATEEMBEDDEDFRAME,
        SETBOUNDS,
        SYNTHESIZEWINDOWACTIVATION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        VERSION = layout.offsetof(0);
        GETDRAWINGSURFACE = layout.offsetof(1);
        FREEDRAWINGSURFACE = layout.offsetof(2);
        LOCK = layout.offsetof(3);
        UNLOCK = layout.offsetof(4);
        GETCOMPONENT = layout.offsetof(5);
        CREATEEMBEDDEDFRAME = layout.offsetof(6);
        SETBOUNDS = layout.offsetof(7);
        SYNTHESIZEWINDOWACTIVATION = layout.offsetof(8);
    }

    /**
     * Creates a {@code JAWT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public JAWT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Version of this structure. This must always be set before calling JAWT_GetAWT() */
    @NativeType("jint")
    public int version() { return nversion(address()); }
    /** @return the value of the {@code GetDrawingSurface} field. */
    @NativeType("void *")
    public long GetDrawingSurface() { return nGetDrawingSurface(address()); }
    /** @return the value of the {@code FreeDrawingSurface} field. */
    @NativeType("void *")
    public long FreeDrawingSurface() { return nFreeDrawingSurface(address()); }
    /** @return the value of the {@code Lock} field. */
    @NativeType("void *")
    public long Lock() { return nLock(address()); }
    /** @return the value of the {@code Unlock} field. */
    @NativeType("void *")
    public long Unlock() { return nUnlock(address()); }
    /** @return the value of the {@code GetComponent} field. */
    @NativeType("void *")
    public long GetComponent() { return nGetComponent(address()); }
    /** @return the value of the {@code CreateEmbeddedFrame} field. */
    @NativeType("void *")
    public long CreateEmbeddedFrame() { return nCreateEmbeddedFrame(address()); }
    /** @return the value of the {@code SetBounds} field. */
    @NativeType("void *")
    public long SetBounds() { return nSetBounds(address()); }
    /** @return the value of the {@code SynthesizeWindowActivation} field. */
    @NativeType("void *")
    public long SynthesizeWindowActivation() { return nSynthesizeWindowActivation(address()); }

    /** Sets the specified value to the {@link #version} field. */
    public JAWT version(@NativeType("jint") int value) { nversion(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public JAWT set(JAWT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code JAWT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static JAWT malloc() {
        return wrap(JAWT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code JAWT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static JAWT calloc() {
        return wrap(JAWT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code JAWT} instance allocated with {@link BufferUtils}. */
    public static JAWT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(JAWT.class, memAddress(container), container);
    }

    /** Returns a new {@code JAWT} instance for the specified memory address. */
    public static JAWT create(long address) {
        return wrap(JAWT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static JAWT createSafe(long address) {
        return address == NULL ? null : wrap(JAWT.class, address);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static JAWT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static JAWT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static JAWT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static JAWT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */

    /**
     * Returns a new {@code JAWT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static JAWT malloc(MemoryStack stack) {
        return wrap(JAWT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code JAWT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static JAWT calloc(MemoryStack stack) {
        return wrap(JAWT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    // -----------------------------------

    /** Unsafe version of {@link #version}. */
    public static int nversion(long struct) { return UNSAFE.getInt(null, struct + JAWT.VERSION); }
    /** Unsafe version of {@link #GetDrawingSurface}. */
    public static long nGetDrawingSurface(long struct) { return memGetAddress(struct + JAWT.GETDRAWINGSURFACE); }
    /** Unsafe version of {@link #FreeDrawingSurface}. */
    public static long nFreeDrawingSurface(long struct) { return memGetAddress(struct + JAWT.FREEDRAWINGSURFACE); }
    /** Unsafe version of {@link #Lock}. */
    public static long nLock(long struct) { return memGetAddress(struct + JAWT.LOCK); }
    /** Unsafe version of {@link #Unlock}. */
    public static long nUnlock(long struct) { return memGetAddress(struct + JAWT.UNLOCK); }
    /** Unsafe version of {@link #GetComponent}. */
    public static long nGetComponent(long struct) { return memGetAddress(struct + JAWT.GETCOMPONENT); }
    /** Unsafe version of {@link #CreateEmbeddedFrame}. */
    public static long nCreateEmbeddedFrame(long struct) { return memGetAddress(struct + JAWT.CREATEEMBEDDEDFRAME); }
    /** Unsafe version of {@link #SetBounds}. */
    public static long nSetBounds(long struct) { return memGetAddress(struct + JAWT.SETBOUNDS); }
    /** Unsafe version of {@link #SynthesizeWindowActivation}. */
    public static long nSynthesizeWindowActivation(long struct) { return memGetAddress(struct + JAWT.SYNTHESIZEWINDOWACTIVATION); }

    /** Unsafe version of {@link #version(int) version}. */
    public static void nversion(long struct, int value) { UNSAFE.putInt(null, struct + JAWT.VERSION, value); }

}