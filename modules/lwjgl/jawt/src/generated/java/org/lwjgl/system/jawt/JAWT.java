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
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code version} &ndash; Version of this structure. This must always be set before calling JAWT_GetAWT()</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct JAWT {
 *     jint version;
 *     void * GetDrawingSurface;
 *     void * FreeDrawingSurface;
 *     void * Lock;
 *     void * Unlock;
 *     void * GetComponent;
 *     void * CreateEmbeddedFrame;
 *     void * SetBounds;
 *     void * SynthesizeWindowActivation;
 * }</pre></code>
 */
public class JAWT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

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

    JAWT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link JAWT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public JAWT(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code version} field. */
    @NativeType("jint")
    public int version() { return nversion(address()); }
    /** Returns the value of the {@code GetDrawingSurface} field. */
    @NativeType("void *")
    public long GetDrawingSurface() { return nGetDrawingSurface(address()); }
    /** Returns the value of the {@code FreeDrawingSurface} field. */
    @NativeType("void *")
    public long FreeDrawingSurface() { return nFreeDrawingSurface(address()); }
    /** Returns the value of the {@code Lock} field. */
    @NativeType("void *")
    public long Lock() { return nLock(address()); }
    /** Returns the value of the {@code Unlock} field. */
    @NativeType("void *")
    public long Unlock() { return nUnlock(address()); }
    /** Returns the value of the {@code GetComponent} field. */
    @NativeType("void *")
    public long GetComponent() { return nGetComponent(address()); }
    /** Returns the value of the {@code CreateEmbeddedFrame} field. */
    @NativeType("void *")
    public long CreateEmbeddedFrame() { return nCreateEmbeddedFrame(address()); }
    /** Returns the value of the {@code SetBounds} field. */
    @NativeType("void *")
    public long SetBounds() { return nSetBounds(address()); }
    /** Returns the value of the {@code SynthesizeWindowActivation} field. */
    @NativeType("void *")
    public long SynthesizeWindowActivation() { return nSynthesizeWindowActivation(address()); }

    /** Sets the specified value to the {@code version} field. */
    public JAWT version(@NativeType("jint") int value) { nversion(address(), value); return this; }
    /** Sets the specified value to the {@code GetDrawingSurface} field. */
    public JAWT GetDrawingSurface(@NativeType("void *") long value) { nGetDrawingSurface(address(), value); return this; }
    /** Sets the specified value to the {@code FreeDrawingSurface} field. */
    public JAWT FreeDrawingSurface(@NativeType("void *") long value) { nFreeDrawingSurface(address(), value); return this; }
    /** Sets the specified value to the {@code Lock} field. */
    public JAWT Lock(@NativeType("void *") long value) { nLock(address(), value); return this; }
    /** Sets the specified value to the {@code Unlock} field. */
    public JAWT Unlock(@NativeType("void *") long value) { nUnlock(address(), value); return this; }
    /** Sets the specified value to the {@code GetComponent} field. */
    public JAWT GetComponent(@NativeType("void *") long value) { nGetComponent(address(), value); return this; }
    /** Sets the specified value to the {@code CreateEmbeddedFrame} field. */
    public JAWT CreateEmbeddedFrame(@NativeType("void *") long value) { nCreateEmbeddedFrame(address(), value); return this; }
    /** Sets the specified value to the {@code SetBounds} field. */
    public JAWT SetBounds(@NativeType("void *") long value) { nSetBounds(address(), value); return this; }
    /** Sets the specified value to the {@code SynthesizeWindowActivation} field. */
    public JAWT SynthesizeWindowActivation(@NativeType("void *") long value) { nSynthesizeWindowActivation(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public JAWT set(
        int version,
        long GetDrawingSurface,
        long FreeDrawingSurface,
        long Lock,
        long Unlock,
        long GetComponent,
        long CreateEmbeddedFrame,
        long SetBounds,
        long SynthesizeWindowActivation
    ) {
        version(version);
        GetDrawingSurface(GetDrawingSurface);
        FreeDrawingSurface(FreeDrawingSurface);
        Lock(Lock);
        Unlock(Unlock);
        GetComponent(GetComponent);
        CreateEmbeddedFrame(CreateEmbeddedFrame);
        SetBounds(SetBounds);
        SynthesizeWindowActivation(SynthesizeWindowActivation);

        return this;
    }

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

    /** Returns a new {@link JAWT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static JAWT malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link JAWT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static JAWT calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link JAWT} instance allocated with {@link BufferUtils}. */
    public static JAWT create() {
        return new JAWT(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link JAWT} instance for the specified memory address. */
    public static JAWT create(long address) {
        return new JAWT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static JAWT createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link JAWT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static JAWT.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link JAWT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static JAWT.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link JAWT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static JAWT.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link JAWT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static JAWT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static JAWT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link JAWT} instance allocated on the thread-local {@link MemoryStack}. */
    public static JAWT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link JAWT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static JAWT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link JAWT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static JAWT mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link JAWT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static JAWT callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link JAWT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static JAWT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link JAWT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static JAWT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link JAWT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static JAWT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link JAWT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static JAWT.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #version}. */
    public static int nversion(long struct) { return memGetInt(struct + JAWT.VERSION); }
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
    public static void nversion(long struct, int value) { memPutInt(struct + JAWT.VERSION, value); }
    /** Unsafe version of {@link #GetDrawingSurface(long) GetDrawingSurface}. */
    public static void nGetDrawingSurface(long struct, long value) { memPutAddress(struct + JAWT.GETDRAWINGSURFACE, value); }
    /** Unsafe version of {@link #FreeDrawingSurface(long) FreeDrawingSurface}. */
    public static void nFreeDrawingSurface(long struct, long value) { memPutAddress(struct + JAWT.FREEDRAWINGSURFACE, value); }
    /** Unsafe version of {@link #Lock(long) Lock}. */
    public static void nLock(long struct, long value) { memPutAddress(struct + JAWT.LOCK, value); }
    /** Unsafe version of {@link #Unlock(long) Unlock}. */
    public static void nUnlock(long struct, long value) { memPutAddress(struct + JAWT.UNLOCK, value); }
    /** Unsafe version of {@link #GetComponent(long) GetComponent}. */
    public static void nGetComponent(long struct, long value) { memPutAddress(struct + JAWT.GETCOMPONENT, value); }
    /** Unsafe version of {@link #CreateEmbeddedFrame(long) CreateEmbeddedFrame}. */
    public static void nCreateEmbeddedFrame(long struct, long value) { memPutAddress(struct + JAWT.CREATEEMBEDDEDFRAME, value); }
    /** Unsafe version of {@link #SetBounds(long) SetBounds}. */
    public static void nSetBounds(long struct, long value) { memPutAddress(struct + JAWT.SETBOUNDS, value); }
    /** Unsafe version of {@link #SynthesizeWindowActivation(long) SynthesizeWindowActivation}. */
    public static void nSynthesizeWindowActivation(long struct, long value) { memPutAddress(struct + JAWT.SYNTHESIZEWINDOWACTIVATION, value); }

    // -----------------------------------

    /** An array of {@link JAWT} structs. */
    public static class Buffer extends StructBuffer<JAWT, Buffer> implements NativeResource {

        /**
         * Creates a new {@link JAWT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link JAWT#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected JAWT newInstance(long address) {
            return new JAWT(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code version} field. */
        @NativeType("jint")
        public int version() { return JAWT.nversion(address()); }
        /** Returns the value of the {@code GetDrawingSurface} field. */
        @NativeType("void *")
        public long GetDrawingSurface() { return JAWT.nGetDrawingSurface(address()); }
        /** Returns the value of the {@code FreeDrawingSurface} field. */
        @NativeType("void *")
        public long FreeDrawingSurface() { return JAWT.nFreeDrawingSurface(address()); }
        /** Returns the value of the {@code Lock} field. */
        @NativeType("void *")
        public long Lock() { return JAWT.nLock(address()); }
        /** Returns the value of the {@code Unlock} field. */
        @NativeType("void *")
        public long Unlock() { return JAWT.nUnlock(address()); }
        /** Returns the value of the {@code GetComponent} field. */
        @NativeType("void *")
        public long GetComponent() { return JAWT.nGetComponent(address()); }
        /** Returns the value of the {@code CreateEmbeddedFrame} field. */
        @NativeType("void *")
        public long CreateEmbeddedFrame() { return JAWT.nCreateEmbeddedFrame(address()); }
        /** Returns the value of the {@code SetBounds} field. */
        @NativeType("void *")
        public long SetBounds() { return JAWT.nSetBounds(address()); }
        /** Returns the value of the {@code SynthesizeWindowActivation} field. */
        @NativeType("void *")
        public long SynthesizeWindowActivation() { return JAWT.nSynthesizeWindowActivation(address()); }

        /** Sets the specified value to the {@code version} field. */
        public JAWT.Buffer version(@NativeType("jint") int value) { JAWT.nversion(address(), value); return this; }
        /** Sets the specified value to the {@code GetDrawingSurface} field. */
        public JAWT.Buffer GetDrawingSurface(@NativeType("void *") long value) { JAWT.nGetDrawingSurface(address(), value); return this; }
        /** Sets the specified value to the {@code FreeDrawingSurface} field. */
        public JAWT.Buffer FreeDrawingSurface(@NativeType("void *") long value) { JAWT.nFreeDrawingSurface(address(), value); return this; }
        /** Sets the specified value to the {@code Lock} field. */
        public JAWT.Buffer Lock(@NativeType("void *") long value) { JAWT.nLock(address(), value); return this; }
        /** Sets the specified value to the {@code Unlock} field. */
        public JAWT.Buffer Unlock(@NativeType("void *") long value) { JAWT.nUnlock(address(), value); return this; }
        /** Sets the specified value to the {@code GetComponent} field. */
        public JAWT.Buffer GetComponent(@NativeType("void *") long value) { JAWT.nGetComponent(address(), value); return this; }
        /** Sets the specified value to the {@code CreateEmbeddedFrame} field. */
        public JAWT.Buffer CreateEmbeddedFrame(@NativeType("void *") long value) { JAWT.nCreateEmbeddedFrame(address(), value); return this; }
        /** Sets the specified value to the {@code SetBounds} field. */
        public JAWT.Buffer SetBounds(@NativeType("void *") long value) { JAWT.nSetBounds(address(), value); return this; }
        /** Sets the specified value to the {@code SynthesizeWindowActivation} field. */
        public JAWT.Buffer SynthesizeWindowActivation(@NativeType("void *") long value) { JAWT.nSynthesizeWindowActivation(address(), value); return this; }

    }

}