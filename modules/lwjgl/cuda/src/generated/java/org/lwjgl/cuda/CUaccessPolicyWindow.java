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
 * Specifies an access policy for a window, a contiguous extent of memory beginning at {@code base_ptr} and ending at {@code base_ptr + num_bytes}.
 * 
 * <p>{@code num_bytes} is limited by {@link CU#CU_DEVICE_ATTRIBUTE_MAX_ACCESS_POLICY_WINDOW_SIZE DEVICE_ATTRIBUTE_MAX_ACCESS_POLICY_WINDOW_SIZE}. Partition into many segments and assign segments such that: sum of
 * "hit segments" / window == approx. ratio. sum of "miss segments" / window == approx 1-ratio. Segments and ratio specifications are fitted to the
 * capabilities of the architecture. Accesses in a hit segment apply the hitProp access policy. Accesses in a miss segment apply the missProp access
 * policy.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CUaccessPolicyWindow {
 *     void * {@link #base_ptr};
 *     size_t {@link #num_bytes};
 *     float {@link #hitRatio};
 *     CUaccessProperty {@link #hitProp};
 *     CUaccessProperty {@link #missProp};
 * }</code></pre>
 */
public class CUaccessPolicyWindow extends Struct implements NativeResource {

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

    /** starting address of the access policy window. CUDA driver may align it. */
    @NativeType("void *")
    public long base_ptr() { return nbase_ptr(address()); }
    /** size in bytes of the window policy. CUDA driver may restrict the maximum size and alignment. */
    @NativeType("size_t")
    public long num_bytes() { return nnum_bytes(address()); }
    /** specifies percentage of lines assigned {@code hitProp}, rest are assigned {@code missProp} */
    public float hitRatio() { return nhitRatio(address()); }
    /** {@code CUaccessProperty} set for hit */
    @NativeType("CUaccessProperty")
    public int hitProp() { return nhitProp(address()); }
    /** {@code CUaccessProperty} set for miss. Must be either {@link CU#CU_ACCESS_PROPERTY_NORMAL ACCESS_PROPERTY_NORMAL} or {@link CU#CU_ACCESS_PROPERTY_STREAMING ACCESS_PROPERTY_STREAMING} */
    @NativeType("CUaccessProperty")
    public int missProp() { return nmissProp(address()); }

    /** Sets the specified value to the {@link #base_ptr} field. */
    public CUaccessPolicyWindow base_ptr(@NativeType("void *") long value) { nbase_ptr(address(), value); return this; }
    /** Sets the specified value to the {@link #num_bytes} field. */
    public CUaccessPolicyWindow num_bytes(@NativeType("size_t") long value) { nnum_bytes(address(), value); return this; }
    /** Sets the specified value to the {@link #hitRatio} field. */
    public CUaccessPolicyWindow hitRatio(float value) { nhitRatio(address(), value); return this; }
    /** Sets the specified value to the {@link #hitProp} field. */
    public CUaccessPolicyWindow hitProp(@NativeType("CUaccessProperty") int value) { nhitProp(address(), value); return this; }
    /** Sets the specified value to the {@link #missProp} field. */
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
        return wrap(CUaccessPolicyWindow.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code CUaccessPolicyWindow} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUaccessPolicyWindow calloc() {
        return wrap(CUaccessPolicyWindow.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code CUaccessPolicyWindow} instance allocated with {@link BufferUtils}. */
    public static CUaccessPolicyWindow create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(CUaccessPolicyWindow.class, memAddress(container), container);
    }

    /** Returns a new {@code CUaccessPolicyWindow} instance for the specified memory address. */
    public static CUaccessPolicyWindow create(long address) {
        return wrap(CUaccessPolicyWindow.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUaccessPolicyWindow createSafe(long address) {
        return address == NULL ? null : wrap(CUaccessPolicyWindow.class, address);
    }

    /**
     * Returns a new {@link CUaccessPolicyWindow.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUaccessPolicyWindow.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUaccessPolicyWindow.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUaccessPolicyWindow.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUaccessPolicyWindow.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUaccessPolicyWindow.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link CUaccessPolicyWindow.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUaccessPolicyWindow.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUaccessPolicyWindow.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code CUaccessPolicyWindow} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUaccessPolicyWindow malloc(MemoryStack stack) {
        return wrap(CUaccessPolicyWindow.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code CUaccessPolicyWindow} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUaccessPolicyWindow calloc(MemoryStack stack) {
        return wrap(CUaccessPolicyWindow.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CUaccessPolicyWindow.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUaccessPolicyWindow.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUaccessPolicyWindow.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUaccessPolicyWindow.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
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
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUaccessPolicyWindow#SIZEOF}, and its mark will be undefined.
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

        /** @return the value of the {@link CUaccessPolicyWindow#base_ptr} field. */
        @NativeType("void *")
        public long base_ptr() { return CUaccessPolicyWindow.nbase_ptr(address()); }
        /** @return the value of the {@link CUaccessPolicyWindow#num_bytes} field. */
        @NativeType("size_t")
        public long num_bytes() { return CUaccessPolicyWindow.nnum_bytes(address()); }
        /** @return the value of the {@link CUaccessPolicyWindow#hitRatio} field. */
        public float hitRatio() { return CUaccessPolicyWindow.nhitRatio(address()); }
        /** @return the value of the {@link CUaccessPolicyWindow#hitProp} field. */
        @NativeType("CUaccessProperty")
        public int hitProp() { return CUaccessPolicyWindow.nhitProp(address()); }
        /** @return the value of the {@link CUaccessPolicyWindow#missProp} field. */
        @NativeType("CUaccessProperty")
        public int missProp() { return CUaccessPolicyWindow.nmissProp(address()); }

        /** Sets the specified value to the {@link CUaccessPolicyWindow#base_ptr} field. */
        public CUaccessPolicyWindow.Buffer base_ptr(@NativeType("void *") long value) { CUaccessPolicyWindow.nbase_ptr(address(), value); return this; }
        /** Sets the specified value to the {@link CUaccessPolicyWindow#num_bytes} field. */
        public CUaccessPolicyWindow.Buffer num_bytes(@NativeType("size_t") long value) { CUaccessPolicyWindow.nnum_bytes(address(), value); return this; }
        /** Sets the specified value to the {@link CUaccessPolicyWindow#hitRatio} field. */
        public CUaccessPolicyWindow.Buffer hitRatio(float value) { CUaccessPolicyWindow.nhitRatio(address(), value); return this; }
        /** Sets the specified value to the {@link CUaccessPolicyWindow#hitProp} field. */
        public CUaccessPolicyWindow.Buffer hitProp(@NativeType("CUaccessProperty") int value) { CUaccessPolicyWindow.nhitProp(address(), value); return this; }
        /** Sets the specified value to the {@link CUaccessPolicyWindow#missProp} field. */
        public CUaccessPolicyWindow.Buffer missProp(@NativeType("CUaccessProperty") int value) { CUaccessPolicyWindow.nmissProp(address(), value); return this; }

    }

}