/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VROverlayIntersectionParams_t {
 *     {@link HmdVector3 HmdVector3_t} vSource;
 *     {@link HmdVector3 HmdVector3_t} vDirection;
 *     ETrackingUniverseOrigin eOrigin;
 * }</code></pre>
 */
@NativeType("struct VROverlayIntersectionParams_t")
public class VROverlayIntersectionParams extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        VSOURCE,
        VDIRECTION,
        EORIGIN;

    static {
        Layout layout = __struct(
            __member(HmdVector3.SIZEOF, HmdVector3.ALIGNOF),
            __member(HmdVector3.SIZEOF, HmdVector3.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        VSOURCE = layout.offsetof(0);
        VDIRECTION = layout.offsetof(1);
        EORIGIN = layout.offsetof(2);
    }

    /**
     * Creates a {@code VROverlayIntersectionParams} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VROverlayIntersectionParams(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link HmdVector3} view of the {@code vSource} field. */
    @NativeType("HmdVector3_t")
    public HmdVector3 vSource() { return nvSource(address()); }
    /** @return a {@link HmdVector3} view of the {@code vDirection} field. */
    @NativeType("HmdVector3_t")
    public HmdVector3 vDirection() { return nvDirection(address()); }
    /** @return the value of the {@code eOrigin} field. */
    @NativeType("ETrackingUniverseOrigin")
    public int eOrigin() { return neOrigin(address()); }

    /** Copies the specified {@link HmdVector3} to the {@code vSource} field. */
    public VROverlayIntersectionParams vSource(@NativeType("HmdVector3_t") HmdVector3 value) { nvSource(address(), value); return this; }
    /** Passes the {@code vSource} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VROverlayIntersectionParams vSource(java.util.function.Consumer<HmdVector3> consumer) { consumer.accept(vSource()); return this; }
    /** Copies the specified {@link HmdVector3} to the {@code vDirection} field. */
    public VROverlayIntersectionParams vDirection(@NativeType("HmdVector3_t") HmdVector3 value) { nvDirection(address(), value); return this; }
    /** Passes the {@code vDirection} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VROverlayIntersectionParams vDirection(java.util.function.Consumer<HmdVector3> consumer) { consumer.accept(vDirection()); return this; }
    /** Sets the specified value to the {@code eOrigin} field. */
    public VROverlayIntersectionParams eOrigin(@NativeType("ETrackingUniverseOrigin") int value) { neOrigin(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VROverlayIntersectionParams set(
        HmdVector3 vSource,
        HmdVector3 vDirection,
        int eOrigin
    ) {
        vSource(vSource);
        vDirection(vDirection);
        eOrigin(eOrigin);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VROverlayIntersectionParams set(VROverlayIntersectionParams src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VROverlayIntersectionParams} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VROverlayIntersectionParams malloc() {
        return wrap(VROverlayIntersectionParams.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VROverlayIntersectionParams} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VROverlayIntersectionParams calloc() {
        return wrap(VROverlayIntersectionParams.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VROverlayIntersectionParams} instance allocated with {@link BufferUtils}. */
    public static VROverlayIntersectionParams create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VROverlayIntersectionParams.class, memAddress(container), container);
    }

    /** Returns a new {@code VROverlayIntersectionParams} instance for the specified memory address. */
    public static VROverlayIntersectionParams create(long address) {
        return wrap(VROverlayIntersectionParams.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VROverlayIntersectionParams createSafe(long address) {
        return address == NULL ? null : wrap(VROverlayIntersectionParams.class, address);
    }

    /**
     * Returns a new {@link VROverlayIntersectionParams.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VROverlayIntersectionParams.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VROverlayIntersectionParams.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VROverlayIntersectionParams.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VROverlayIntersectionParams.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VROverlayIntersectionParams.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VROverlayIntersectionParams.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VROverlayIntersectionParams.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VROverlayIntersectionParams.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VROverlayIntersectionParams mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VROverlayIntersectionParams callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VROverlayIntersectionParams mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VROverlayIntersectionParams callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VROverlayIntersectionParams.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VROverlayIntersectionParams.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VROverlayIntersectionParams.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VROverlayIntersectionParams.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VROverlayIntersectionParams} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VROverlayIntersectionParams malloc(MemoryStack stack) {
        return wrap(VROverlayIntersectionParams.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VROverlayIntersectionParams} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VROverlayIntersectionParams calloc(MemoryStack stack) {
        return wrap(VROverlayIntersectionParams.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VROverlayIntersectionParams.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VROverlayIntersectionParams.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VROverlayIntersectionParams.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VROverlayIntersectionParams.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #vSource}. */
    public static HmdVector3 nvSource(long struct) { return HmdVector3.create(struct + VROverlayIntersectionParams.VSOURCE); }
    /** Unsafe version of {@link #vDirection}. */
    public static HmdVector3 nvDirection(long struct) { return HmdVector3.create(struct + VROverlayIntersectionParams.VDIRECTION); }
    /** Unsafe version of {@link #eOrigin}. */
    public static int neOrigin(long struct) { return UNSAFE.getInt(null, struct + VROverlayIntersectionParams.EORIGIN); }

    /** Unsafe version of {@link #vSource(HmdVector3) vSource}. */
    public static void nvSource(long struct, HmdVector3 value) { memCopy(value.address(), struct + VROverlayIntersectionParams.VSOURCE, HmdVector3.SIZEOF); }
    /** Unsafe version of {@link #vDirection(HmdVector3) vDirection}. */
    public static void nvDirection(long struct, HmdVector3 value) { memCopy(value.address(), struct + VROverlayIntersectionParams.VDIRECTION, HmdVector3.SIZEOF); }
    /** Unsafe version of {@link #eOrigin(int) eOrigin}. */
    public static void neOrigin(long struct, int value) { UNSAFE.putInt(null, struct + VROverlayIntersectionParams.EORIGIN, value); }

    // -----------------------------------

    /** An array of {@link VROverlayIntersectionParams} structs. */
    public static class Buffer extends StructBuffer<VROverlayIntersectionParams, Buffer> implements NativeResource {

        private static final VROverlayIntersectionParams ELEMENT_FACTORY = VROverlayIntersectionParams.create(-1L);

        /**
         * Creates a new {@code VROverlayIntersectionParams.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VROverlayIntersectionParams#SIZEOF}, and its mark will be undefined.
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
        protected VROverlayIntersectionParams getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link HmdVector3} view of the {@code vSource} field. */
        @NativeType("HmdVector3_t")
        public HmdVector3 vSource() { return VROverlayIntersectionParams.nvSource(address()); }
        /** @return a {@link HmdVector3} view of the {@code vDirection} field. */
        @NativeType("HmdVector3_t")
        public HmdVector3 vDirection() { return VROverlayIntersectionParams.nvDirection(address()); }
        /** @return the value of the {@code eOrigin} field. */
        @NativeType("ETrackingUniverseOrigin")
        public int eOrigin() { return VROverlayIntersectionParams.neOrigin(address()); }

        /** Copies the specified {@link HmdVector3} to the {@code vSource} field. */
        public VROverlayIntersectionParams.Buffer vSource(@NativeType("HmdVector3_t") HmdVector3 value) { VROverlayIntersectionParams.nvSource(address(), value); return this; }
        /** Passes the {@code vSource} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VROverlayIntersectionParams.Buffer vSource(java.util.function.Consumer<HmdVector3> consumer) { consumer.accept(vSource()); return this; }
        /** Copies the specified {@link HmdVector3} to the {@code vDirection} field. */
        public VROverlayIntersectionParams.Buffer vDirection(@NativeType("HmdVector3_t") HmdVector3 value) { VROverlayIntersectionParams.nvDirection(address(), value); return this; }
        /** Passes the {@code vDirection} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VROverlayIntersectionParams.Buffer vDirection(java.util.function.Consumer<HmdVector3> consumer) { consumer.accept(vDirection()); return this; }
        /** Sets the specified value to the {@code eOrigin} field. */
        public VROverlayIntersectionParams.Buffer eOrigin(@NativeType("ETrackingUniverseOrigin") int value) { VROverlayIntersectionParams.neOrigin(address(), value); return this; }

    }

}