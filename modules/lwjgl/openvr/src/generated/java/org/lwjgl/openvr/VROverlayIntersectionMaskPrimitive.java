/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VROverlayIntersectionMaskPrimitive_t {
 *     EVROverlayIntersectionMaskPrimitiveType m_nPrimitiveType;
 *     {@link VROverlayIntersectionMaskPrimitiveData VROverlayIntersectionMaskPrimitive_Data_t} m_Primitive;
 * }</code></pre>
 */
@NativeType("struct VROverlayIntersectionMaskPrimitive_t")
public class VROverlayIntersectionMaskPrimitive extends Struct<VROverlayIntersectionMaskPrimitive> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        M_NPRIMITIVETYPE,
        M_PRIMITIVE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(VROverlayIntersectionMaskPrimitiveData.SIZEOF, VROverlayIntersectionMaskPrimitiveData.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        M_NPRIMITIVETYPE = layout.offsetof(0);
        M_PRIMITIVE = layout.offsetof(1);
    }

    protected VROverlayIntersectionMaskPrimitive(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VROverlayIntersectionMaskPrimitive create(long address, @Nullable ByteBuffer container) {
        return new VROverlayIntersectionMaskPrimitive(address, container);
    }

    /**
     * Creates a {@code VROverlayIntersectionMaskPrimitive} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VROverlayIntersectionMaskPrimitive(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code m_nPrimitiveType} field. */
    @NativeType("EVROverlayIntersectionMaskPrimitiveType")
    public int m_nPrimitiveType() { return nm_nPrimitiveType(address()); }
    /** @return a {@link VROverlayIntersectionMaskPrimitiveData} view of the {@code m_Primitive} field. */
    @NativeType("VROverlayIntersectionMaskPrimitive_Data_t")
    public VROverlayIntersectionMaskPrimitiveData m_Primitive() { return nm_Primitive(address()); }

    /** Sets the specified value to the {@code m_nPrimitiveType} field. */
    public VROverlayIntersectionMaskPrimitive m_nPrimitiveType(@NativeType("EVROverlayIntersectionMaskPrimitiveType") int value) { nm_nPrimitiveType(address(), value); return this; }
    /** Copies the specified {@link VROverlayIntersectionMaskPrimitiveData} to the {@code m_Primitive} field. */
    public VROverlayIntersectionMaskPrimitive m_Primitive(@NativeType("VROverlayIntersectionMaskPrimitive_Data_t") VROverlayIntersectionMaskPrimitiveData value) { nm_Primitive(address(), value); return this; }
    /** Passes the {@code m_Primitive} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VROverlayIntersectionMaskPrimitive m_Primitive(java.util.function.Consumer<VROverlayIntersectionMaskPrimitiveData> consumer) { consumer.accept(m_Primitive()); return this; }

    /** Initializes this struct with the specified values. */
    public VROverlayIntersectionMaskPrimitive set(
        int m_nPrimitiveType,
        VROverlayIntersectionMaskPrimitiveData m_Primitive
    ) {
        m_nPrimitiveType(m_nPrimitiveType);
        m_Primitive(m_Primitive);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VROverlayIntersectionMaskPrimitive set(VROverlayIntersectionMaskPrimitive src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VROverlayIntersectionMaskPrimitive} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VROverlayIntersectionMaskPrimitive malloc() {
        return new VROverlayIntersectionMaskPrimitive(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VROverlayIntersectionMaskPrimitive} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VROverlayIntersectionMaskPrimitive calloc() {
        return new VROverlayIntersectionMaskPrimitive(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VROverlayIntersectionMaskPrimitive} instance allocated with {@link BufferUtils}. */
    public static VROverlayIntersectionMaskPrimitive create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VROverlayIntersectionMaskPrimitive(memAddress(container), container);
    }

    /** Returns a new {@code VROverlayIntersectionMaskPrimitive} instance for the specified memory address. */
    public static VROverlayIntersectionMaskPrimitive create(long address) {
        return new VROverlayIntersectionMaskPrimitive(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VROverlayIntersectionMaskPrimitive createSafe(long address) {
        return address == NULL ? null : new VROverlayIntersectionMaskPrimitive(address, null);
    }

    /**
     * Returns a new {@link VROverlayIntersectionMaskPrimitive.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VROverlayIntersectionMaskPrimitive.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VROverlayIntersectionMaskPrimitive.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VROverlayIntersectionMaskPrimitive.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VROverlayIntersectionMaskPrimitive.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VROverlayIntersectionMaskPrimitive.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VROverlayIntersectionMaskPrimitive.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VROverlayIntersectionMaskPrimitive.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VROverlayIntersectionMaskPrimitive.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VROverlayIntersectionMaskPrimitive mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VROverlayIntersectionMaskPrimitive callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VROverlayIntersectionMaskPrimitive mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VROverlayIntersectionMaskPrimitive callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VROverlayIntersectionMaskPrimitive.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VROverlayIntersectionMaskPrimitive.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VROverlayIntersectionMaskPrimitive.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VROverlayIntersectionMaskPrimitive.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VROverlayIntersectionMaskPrimitive} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VROverlayIntersectionMaskPrimitive malloc(MemoryStack stack) {
        return new VROverlayIntersectionMaskPrimitive(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VROverlayIntersectionMaskPrimitive} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VROverlayIntersectionMaskPrimitive calloc(MemoryStack stack) {
        return new VROverlayIntersectionMaskPrimitive(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VROverlayIntersectionMaskPrimitive.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VROverlayIntersectionMaskPrimitive.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VROverlayIntersectionMaskPrimitive.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VROverlayIntersectionMaskPrimitive.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #m_nPrimitiveType}. */
    public static int nm_nPrimitiveType(long struct) { return memGetInt(struct + VROverlayIntersectionMaskPrimitive.M_NPRIMITIVETYPE); }
    /** Unsafe version of {@link #m_Primitive}. */
    public static VROverlayIntersectionMaskPrimitiveData nm_Primitive(long struct) { return VROverlayIntersectionMaskPrimitiveData.create(struct + VROverlayIntersectionMaskPrimitive.M_PRIMITIVE); }

    /** Unsafe version of {@link #m_nPrimitiveType(int) m_nPrimitiveType}. */
    public static void nm_nPrimitiveType(long struct, int value) { memPutInt(struct + VROverlayIntersectionMaskPrimitive.M_NPRIMITIVETYPE, value); }
    /** Unsafe version of {@link #m_Primitive(VROverlayIntersectionMaskPrimitiveData) m_Primitive}. */
    public static void nm_Primitive(long struct, VROverlayIntersectionMaskPrimitiveData value) { memCopy(value.address(), struct + VROverlayIntersectionMaskPrimitive.M_PRIMITIVE, VROverlayIntersectionMaskPrimitiveData.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VROverlayIntersectionMaskPrimitive} structs. */
    public static class Buffer extends StructBuffer<VROverlayIntersectionMaskPrimitive, Buffer> implements NativeResource {

        private static final VROverlayIntersectionMaskPrimitive ELEMENT_FACTORY = VROverlayIntersectionMaskPrimitive.create(-1L);

        /**
         * Creates a new {@code VROverlayIntersectionMaskPrimitive.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VROverlayIntersectionMaskPrimitive#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VROverlayIntersectionMaskPrimitive getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code m_nPrimitiveType} field. */
        @NativeType("EVROverlayIntersectionMaskPrimitiveType")
        public int m_nPrimitiveType() { return VROverlayIntersectionMaskPrimitive.nm_nPrimitiveType(address()); }
        /** @return a {@link VROverlayIntersectionMaskPrimitiveData} view of the {@code m_Primitive} field. */
        @NativeType("VROverlayIntersectionMaskPrimitive_Data_t")
        public VROverlayIntersectionMaskPrimitiveData m_Primitive() { return VROverlayIntersectionMaskPrimitive.nm_Primitive(address()); }

        /** Sets the specified value to the {@code m_nPrimitiveType} field. */
        public VROverlayIntersectionMaskPrimitive.Buffer m_nPrimitiveType(@NativeType("EVROverlayIntersectionMaskPrimitiveType") int value) { VROverlayIntersectionMaskPrimitive.nm_nPrimitiveType(address(), value); return this; }
        /** Copies the specified {@link VROverlayIntersectionMaskPrimitiveData} to the {@code m_Primitive} field. */
        public VROverlayIntersectionMaskPrimitive.Buffer m_Primitive(@NativeType("VROverlayIntersectionMaskPrimitive_Data_t") VROverlayIntersectionMaskPrimitiveData value) { VROverlayIntersectionMaskPrimitive.nm_Primitive(address(), value); return this; }
        /** Passes the {@code m_Primitive} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VROverlayIntersectionMaskPrimitive.Buffer m_Primitive(java.util.function.Consumer<VROverlayIntersectionMaskPrimitiveData> consumer) { consumer.accept(m_Primitive()); return this; }

    }

}