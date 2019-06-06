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
 * struct VROverlayIntersectionMaskPrimitive_t {
 *     EVROverlayIntersectionMaskPrimitiveType m_nPrimitiveType;
 *     {@link VROverlayIntersectionMaskPrimitiveData VROverlayIntersectionMaskPrimitive_Data_t} m_Primitive;
 * }</code></pre>
 */
@NativeType("struct VROverlayIntersectionMaskPrimitive_t")
public class VROverlayIntersectionMaskPrimitive extends Struct implements NativeResource {

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

    /** Returns the value of the {@code m_nPrimitiveType} field. */
    @NativeType("EVROverlayIntersectionMaskPrimitiveType")
    public int m_nPrimitiveType() { return nm_nPrimitiveType(address()); }
    /** Returns a {@link VROverlayIntersectionMaskPrimitiveData} view of the {@code m_Primitive} field. */
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
        return wrap(VROverlayIntersectionMaskPrimitive.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VROverlayIntersectionMaskPrimitive} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VROverlayIntersectionMaskPrimitive calloc() {
        return wrap(VROverlayIntersectionMaskPrimitive.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VROverlayIntersectionMaskPrimitive} instance allocated with {@link BufferUtils}. */
    public static VROverlayIntersectionMaskPrimitive create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VROverlayIntersectionMaskPrimitive.class, memAddress(container), container);
    }

    /** Returns a new {@code VROverlayIntersectionMaskPrimitive} instance for the specified memory address. */
    public static VROverlayIntersectionMaskPrimitive create(long address) {
        return wrap(VROverlayIntersectionMaskPrimitive.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VROverlayIntersectionMaskPrimitive createSafe(long address) {
        return address == NULL ? null : wrap(VROverlayIntersectionMaskPrimitive.class, address);
    }

    /**
     * Returns a new {@link VROverlayIntersectionMaskPrimitive.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VROverlayIntersectionMaskPrimitive.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VROverlayIntersectionMaskPrimitive.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VROverlayIntersectionMaskPrimitive.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VROverlayIntersectionMaskPrimitive.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VROverlayIntersectionMaskPrimitive.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VROverlayIntersectionMaskPrimitive.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VROverlayIntersectionMaskPrimitive.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VROverlayIntersectionMaskPrimitive.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VROverlayIntersectionMaskPrimitive} instance allocated on the thread-local {@link MemoryStack}. */
    public static VROverlayIntersectionMaskPrimitive mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VROverlayIntersectionMaskPrimitive} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VROverlayIntersectionMaskPrimitive callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VROverlayIntersectionMaskPrimitive} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VROverlayIntersectionMaskPrimitive mallocStack(MemoryStack stack) {
        return wrap(VROverlayIntersectionMaskPrimitive.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VROverlayIntersectionMaskPrimitive} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VROverlayIntersectionMaskPrimitive callocStack(MemoryStack stack) {
        return wrap(VROverlayIntersectionMaskPrimitive.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VROverlayIntersectionMaskPrimitive.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VROverlayIntersectionMaskPrimitive.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VROverlayIntersectionMaskPrimitive.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VROverlayIntersectionMaskPrimitive.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VROverlayIntersectionMaskPrimitive.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VROverlayIntersectionMaskPrimitive.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VROverlayIntersectionMaskPrimitive.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VROverlayIntersectionMaskPrimitive.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #m_nPrimitiveType}. */
    public static int nm_nPrimitiveType(long struct) { return UNSAFE.getInt(null, struct + VROverlayIntersectionMaskPrimitive.M_NPRIMITIVETYPE); }
    /** Unsafe version of {@link #m_Primitive}. */
    public static VROverlayIntersectionMaskPrimitiveData nm_Primitive(long struct) { return VROverlayIntersectionMaskPrimitiveData.create(struct + VROverlayIntersectionMaskPrimitive.M_PRIMITIVE); }

    /** Unsafe version of {@link #m_nPrimitiveType(int) m_nPrimitiveType}. */
    public static void nm_nPrimitiveType(long struct, int value) { UNSAFE.putInt(null, struct + VROverlayIntersectionMaskPrimitive.M_NPRIMITIVETYPE, value); }
    /** Unsafe version of {@link #m_Primitive(VROverlayIntersectionMaskPrimitiveData) m_Primitive}. */
    public static void nm_Primitive(long struct, VROverlayIntersectionMaskPrimitiveData value) { memCopy(value.address(), struct + VROverlayIntersectionMaskPrimitive.M_PRIMITIVE, VROverlayIntersectionMaskPrimitiveData.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VROverlayIntersectionMaskPrimitive} structs. */
    public static class Buffer extends StructBuffer<VROverlayIntersectionMaskPrimitive, Buffer> implements NativeResource {

        private static final VROverlayIntersectionMaskPrimitive ELEMENT_FACTORY = VROverlayIntersectionMaskPrimitive.create(-1L);

        /**
         * Creates a new {@code VROverlayIntersectionMaskPrimitive.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VROverlayIntersectionMaskPrimitive#SIZEOF}, and its mark will be undefined.
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
        protected VROverlayIntersectionMaskPrimitive getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code m_nPrimitiveType} field. */
        @NativeType("EVROverlayIntersectionMaskPrimitiveType")
        public int m_nPrimitiveType() { return VROverlayIntersectionMaskPrimitive.nm_nPrimitiveType(address()); }
        /** Returns a {@link VROverlayIntersectionMaskPrimitiveData} view of the {@code m_Primitive} field. */
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