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
 * Holds the transform for a single bone.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VRBoneTransform_t {
 *     {@link HmdVector4 HmdVector4_t} position;
 *     {@link HmdQuaternionf HmdQuaternionf_t} orientation;
 * }</code></pre>
 */
@NativeType("struct VRBoneTransform_t")
public class VRBoneTransform extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        POSITION,
        ORIENTATION;

    static {
        Layout layout = __struct(
            __member(HmdVector4.SIZEOF, HmdVector4.ALIGNOF),
            __member(HmdQuaternionf.SIZEOF, HmdQuaternionf.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        POSITION = layout.offsetof(0);
        ORIENTATION = layout.offsetof(1);
    }

    /**
     * Creates a {@code VRBoneTransform} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VRBoneTransform(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link HmdVector4} view of the {@code position} field. */
    @NativeType("HmdVector4_t")
    public HmdVector4 position$() { return nposition$(address()); }
    /** @return a {@link HmdQuaternionf} view of the {@code orientation} field. */
    @NativeType("HmdQuaternionf_t")
    public HmdQuaternionf orientation() { return norientation(address()); }

    // -----------------------------------

    /** Returns a new {@code VRBoneTransform} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VRBoneTransform malloc() {
        return wrap(VRBoneTransform.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VRBoneTransform} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VRBoneTransform calloc() {
        return wrap(VRBoneTransform.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VRBoneTransform} instance allocated with {@link BufferUtils}. */
    public static VRBoneTransform create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VRBoneTransform.class, memAddress(container), container);
    }

    /** Returns a new {@code VRBoneTransform} instance for the specified memory address. */
    public static VRBoneTransform create(long address) {
        return wrap(VRBoneTransform.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VRBoneTransform createSafe(long address) {
        return address == NULL ? null : wrap(VRBoneTransform.class, address);
    }

    /**
     * Returns a new {@link VRBoneTransform.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VRBoneTransform.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VRBoneTransform.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VRBoneTransform.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VRBoneTransform.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VRBoneTransform.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VRBoneTransform.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VRBoneTransform.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VRBoneTransform.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VRBoneTransform mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VRBoneTransform callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VRBoneTransform mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VRBoneTransform callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VRBoneTransform.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VRBoneTransform.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VRBoneTransform.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VRBoneTransform.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VRBoneTransform} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VRBoneTransform malloc(MemoryStack stack) {
        return wrap(VRBoneTransform.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VRBoneTransform} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VRBoneTransform calloc(MemoryStack stack) {
        return wrap(VRBoneTransform.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VRBoneTransform.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VRBoneTransform.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VRBoneTransform.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VRBoneTransform.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #position$}. */
    public static HmdVector4 nposition$(long struct) { return HmdVector4.create(struct + VRBoneTransform.POSITION); }
    /** Unsafe version of {@link #orientation}. */
    public static HmdQuaternionf norientation(long struct) { return HmdQuaternionf.create(struct + VRBoneTransform.ORIENTATION); }

    // -----------------------------------

    /** An array of {@link VRBoneTransform} structs. */
    public static class Buffer extends StructBuffer<VRBoneTransform, Buffer> implements NativeResource {

        private static final VRBoneTransform ELEMENT_FACTORY = VRBoneTransform.create(-1L);

        /**
         * Creates a new {@code VRBoneTransform.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VRBoneTransform#SIZEOF}, and its mark will be undefined.
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
        protected VRBoneTransform getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link HmdVector4} view of the {@code position} field. */
        @NativeType("HmdVector4_t")
        public HmdVector4 position$() { return VRBoneTransform.nposition$(address()); }
        /** @return a {@link HmdQuaternionf} view of the {@code orientation} field. */
        @NativeType("HmdQuaternionf_t")
        public HmdQuaternionf orientation() { return VRBoneTransform.norientation(address()); }

    }

}