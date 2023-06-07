/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CUaccessPolicyWindow {
 *     void * base_ptr;
 *     size_t num_bytes;
 *     float hitRatio;
 *     CUaccessProperty hitProp;
 *     CUaccessProperty missProp;
 * }</code></pre>
 */
public class CUaccessPolicyWindow extends Struct<CUaccessPolicyWindow> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BASE_PTR,
        NUM_BYTES,
        HITRATIO,
        HITPROP,
        MISSPROP;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BASE_PTR = layout.offsetof(0);
        NUM_BYTES = layout.offsetof(1);
        HITRATIO = layout.offsetof(2);
        HITPROP = layout.offsetof(3);
        MISSPROP = layout.offsetof(4);
    }

    protected CUaccessPolicyWindow(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CUaccessPolicyWindow create(long address, @Nullable ByteBuffer container) {
        return new CUaccessPolicyWindow(address, container);
    }

    /**
     * Creates a {@code CUaccessPolicyWindow} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUaccessPolicyWindow(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code base_ptr} field. */
    @NativeType("void *")
    public long base_ptr() { return nbase_ptr(address()); }
    /** @return the value of the {@code num_bytes} field. */
    @NativeType("size_t")
    public long num_bytes() { return nnum_bytes(address()); }
    /** @return the value of the {@code hitRatio} field. */
    public float hitRatio() { return nhitRatio(address()); }
    /** @return the value of the {@code hitProp} field. */
    @NativeType("CUaccessProperty")
    public int hitProp() { return nhitProp(address()); }
    /** @return the value of the {@code missProp} field. */
    @NativeType("CUaccessProperty")
    public int missProp() { return nmissProp(address()); }

    /** Sets the specified value to the {@code base_ptr} field. */
    public CUaccessPolicyWindow base_ptr(@NativeType("void *") long value) { nbase_ptr(address(), value); return this; }
    /** Sets the specified value to the {@code num_bytes} field. */
    public CUaccessPolicyWindow num_bytes(@NativeType("size_t") long value) { nnum_bytes(address(), value); return this; }
    /** Sets the specified value to the {@code hitRatio} field. */
    public CUaccessPolicyWindow hitRatio(float value) { nhitRatio(address(), value); return this; }
    /** Sets the specified value to the {@code hitProp} field. */
    public CUaccessPolicyWindow hitProp(@NativeType("CUaccessProperty") int value) { nhitProp(address(), value); return this; }
    /** Sets the specified value to the {@code missProp} field. */
    public CUaccessPolicyWindow missProp(@NativeType("CUaccessProperty") int value) { nmissProp(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public CUaccessPolicyWindow set(
        long base_ptr,
        long num_bytes,
        float hitRatio,
        int hitProp,
        int missProp
    ) {
        base_ptr(base_ptr);
        num_bytes(num_bytes);
        hitRatio(hitRatio);
        hitProp(hitProp);
        missProp(missProp);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CUaccessPolicyWindow set(CUaccessPolicyWindow src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CUaccessPolicyWindow} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUaccessPolicyWindow malloc() {
        return new CUaccessPolicyWindow(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code CUaccessPolicyWindow} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUaccessPolicyWindow calloc() {
        return new CUaccessPolicyWindow(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code CUaccessPolicyWindow} instance allocated with {@link BufferUtils}. */
    public static CUaccessPolicyWindow create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CUaccessPolicyWindow(memAddress(container), container);
    }

    /** Returns a new {@code CUaccessPolicyWindow} instance for the specified memory address. */
    public static CUaccessPolicyWindow create(long address) {
        return new CUaccessPolicyWindow(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUaccessPolicyWindow createSafe(long address) {
        return address == NULL ? null : new CUaccessPolicyWindow(address, null);
    }

    /**
     * Returns a new {@link CUaccessPolicyWindow.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUaccessPolicyWindow.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUaccessPolicyWindow.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUaccessPolicyWindow.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUaccessPolicyWindow.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUaccessPolicyWindow.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link CUaccessPolicyWindow.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUaccessPolicyWindow.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUaccessPolicyWindow.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code CUaccessPolicyWindow} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUaccessPolicyWindow malloc(MemoryStack stack) {
        return new CUaccessPolicyWindow(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code CUaccessPolicyWindow} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUaccessPolicyWindow calloc(MemoryStack stack) {
        return new CUaccessPolicyWindow(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link CUaccessPolicyWindow.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUaccessPolicyWindow.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUaccessPolicyWindow.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUaccessPolicyWindow.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #base_ptr}. */
    public static long nbase_ptr(long struct) { return memGetAddress(struct + CUaccessPolicyWindow.BASE_PTR); }
    /** Unsafe version of {@link #num_bytes}. */
    public static long nnum_bytes(long struct) { return memGetAddress(struct + CUaccessPolicyWindow.NUM_BYTES); }
    /** Unsafe version of {@link #hitRatio}. */
    public static float nhitRatio(long struct) { return UNSAFE.getFloat(null, struct + CUaccessPolicyWindow.HITRATIO); }
    /** Unsafe version of {@link #hitProp}. */
    public static int nhitProp(long struct) { return UNSAFE.getInt(null, struct + CUaccessPolicyWindow.HITPROP); }
    /** Unsafe version of {@link #missProp}. */
    public static int nmissProp(long struct) { return UNSAFE.getInt(null, struct + CUaccessPolicyWindow.MISSPROP); }

    /** Unsafe version of {@link #base_ptr(long) base_ptr}. */
    public static void nbase_ptr(long struct, long value) { memPutAddress(struct + CUaccessPolicyWindow.BASE_PTR, check(value)); }
    /** Unsafe version of {@link #num_bytes(long) num_bytes}. */
    public static void nnum_bytes(long struct, long value) { memPutAddress(struct + CUaccessPolicyWindow.NUM_BYTES, value); }
    /** Unsafe version of {@link #hitRatio(float) hitRatio}. */
    public static void nhitRatio(long struct, float value) { UNSAFE.putFloat(null, struct + CUaccessPolicyWindow.HITRATIO, value); }
    /** Unsafe version of {@link #hitProp(int) hitProp}. */
    public static void nhitProp(long struct, int value) { UNSAFE.putInt(null, struct + CUaccessPolicyWindow.HITPROP, value); }
    /** Unsafe version of {@link #missProp(int) missProp}. */
    public static void nmissProp(long struct, int value) { UNSAFE.putInt(null, struct + CUaccessPolicyWindow.MISSPROP, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + CUaccessPolicyWindow.BASE_PTR));
    }

    // -----------------------------------

    /** An array of {@link CUaccessPolicyWindow} structs. */
    public static class Buffer extends StructBuffer<CUaccessPolicyWindow, Buffer> implements NativeResource {

        private static final CUaccessPolicyWindow ELEMENT_FACTORY = CUaccessPolicyWindow.create(-1L);

        /**
         * Creates a new {@code CUaccessPolicyWindow.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUaccessPolicyWindow#SIZEOF}, and its mark will be undefined.</p>
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
        protected CUaccessPolicyWindow getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code base_ptr} field. */
        @NativeType("void *")
        public long base_ptr() { return CUaccessPolicyWindow.nbase_ptr(address()); }
        /** @return the value of the {@code num_bytes} field. */
        @NativeType("size_t")
        public long num_bytes() { return CUaccessPolicyWindow.nnum_bytes(address()); }
        /** @return the value of the {@code hitRatio} field. */
        public float hitRatio() { return CUaccessPolicyWindow.nhitRatio(address()); }
        /** @return the value of the {@code hitProp} field. */
        @NativeType("CUaccessProperty")
        public int hitProp() { return CUaccessPolicyWindow.nhitProp(address()); }
        /** @return the value of the {@code missProp} field. */
        @NativeType("CUaccessProperty")
        public int missProp() { return CUaccessPolicyWindow.nmissProp(address()); }

        /** Sets the specified value to the {@code base_ptr} field. */
        public CUaccessPolicyWindow.Buffer base_ptr(@NativeType("void *") long value) { CUaccessPolicyWindow.nbase_ptr(address(), value); return this; }
        /** Sets the specified value to the {@code num_bytes} field. */
        public CUaccessPolicyWindow.Buffer num_bytes(@NativeType("size_t") long value) { CUaccessPolicyWindow.nnum_bytes(address(), value); return this; }
        /** Sets the specified value to the {@code hitRatio} field. */
        public CUaccessPolicyWindow.Buffer hitRatio(float value) { CUaccessPolicyWindow.nhitRatio(address(), value); return this; }
        /** Sets the specified value to the {@code hitProp} field. */
        public CUaccessPolicyWindow.Buffer hitProp(@NativeType("CUaccessProperty") int value) { CUaccessPolicyWindow.nhitProp(address(), value); return this; }
        /** Sets the specified value to the {@code missProp} field. */
        public CUaccessPolicyWindow.Buffer missProp(@NativeType("CUaccessProperty") int value) { CUaccessPolicyWindow.nmissProp(address(), value); return this; }

    }

}