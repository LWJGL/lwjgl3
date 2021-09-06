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
 * Data required for passing Vulkan textures to {@link VRCompositor#VRCompositor_Submit Submit}. Be sure to call {@link VR#VR_ShutdownInternal ShutdownInternal} before destroying these resources.
 * 
 * <p>Please see <a href="https://github.com/ValveSoftware/openvr/wiki/Vulkan">https://github.com/ValveSoftware/openvr/wiki/Vulkan</a> for Vulkan-specific
 * documentation.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VRVulkanTextureArrayData_t {
 *     uint32_t m_unArrayIndex;
 *     uint32_t m_unArraySize;
 * }</code></pre>
 */
@NativeType("struct VRVulkanTextureArrayData_t")
public class VRVulkanTextureArrayData extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        M_UNARRAYINDEX,
        M_UNARRAYSIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        M_UNARRAYINDEX = layout.offsetof(0);
        M_UNARRAYSIZE = layout.offsetof(1);
    }

    /**
     * Creates a {@code VRVulkanTextureArrayData} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VRVulkanTextureArrayData(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code m_unArrayIndex} field. */
    @NativeType("uint32_t")
    public int m_unArrayIndex() { return nm_unArrayIndex(address()); }
    /** @return the value of the {@code m_unArraySize} field. */
    @NativeType("uint32_t")
    public int m_unArraySize() { return nm_unArraySize(address()); }

    /** Sets the specified value to the {@code m_unArrayIndex} field. */
    public VRVulkanTextureArrayData m_unArrayIndex(@NativeType("uint32_t") int value) { nm_unArrayIndex(address(), value); return this; }
    /** Sets the specified value to the {@code m_unArraySize} field. */
    public VRVulkanTextureArrayData m_unArraySize(@NativeType("uint32_t") int value) { nm_unArraySize(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VRVulkanTextureArrayData set(
        int m_unArrayIndex,
        int m_unArraySize
    ) {
        m_unArrayIndex(m_unArrayIndex);
        m_unArraySize(m_unArraySize);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VRVulkanTextureArrayData set(VRVulkanTextureArrayData src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VRVulkanTextureArrayData} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VRVulkanTextureArrayData malloc() {
        return wrap(VRVulkanTextureArrayData.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VRVulkanTextureArrayData} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VRVulkanTextureArrayData calloc() {
        return wrap(VRVulkanTextureArrayData.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VRVulkanTextureArrayData} instance allocated with {@link BufferUtils}. */
    public static VRVulkanTextureArrayData create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VRVulkanTextureArrayData.class, memAddress(container), container);
    }

    /** Returns a new {@code VRVulkanTextureArrayData} instance for the specified memory address. */
    public static VRVulkanTextureArrayData create(long address) {
        return wrap(VRVulkanTextureArrayData.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VRVulkanTextureArrayData createSafe(long address) {
        return address == NULL ? null : wrap(VRVulkanTextureArrayData.class, address);
    }

    /**
     * Returns a new {@link VRVulkanTextureArrayData.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VRVulkanTextureArrayData.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VRVulkanTextureArrayData.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VRVulkanTextureArrayData.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VRVulkanTextureArrayData.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VRVulkanTextureArrayData.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VRVulkanTextureArrayData.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VRVulkanTextureArrayData.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VRVulkanTextureArrayData.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }


    /**
     * Returns a new {@code VRVulkanTextureArrayData} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VRVulkanTextureArrayData malloc(MemoryStack stack) {
        return wrap(VRVulkanTextureArrayData.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VRVulkanTextureArrayData} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VRVulkanTextureArrayData calloc(MemoryStack stack) {
        return wrap(VRVulkanTextureArrayData.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VRVulkanTextureArrayData.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VRVulkanTextureArrayData.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VRVulkanTextureArrayData.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VRVulkanTextureArrayData.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #m_unArrayIndex}. */
    public static int nm_unArrayIndex(long struct) { return UNSAFE.getInt(null, struct + VRVulkanTextureArrayData.M_UNARRAYINDEX); }
    /** Unsafe version of {@link #m_unArraySize}. */
    public static int nm_unArraySize(long struct) { return UNSAFE.getInt(null, struct + VRVulkanTextureArrayData.M_UNARRAYSIZE); }

    /** Unsafe version of {@link #m_unArrayIndex(int) m_unArrayIndex}. */
    public static void nm_unArrayIndex(long struct, int value) { UNSAFE.putInt(null, struct + VRVulkanTextureArrayData.M_UNARRAYINDEX, value); }
    /** Unsafe version of {@link #m_unArraySize(int) m_unArraySize}. */
    public static void nm_unArraySize(long struct, int value) { UNSAFE.putInt(null, struct + VRVulkanTextureArrayData.M_UNARRAYSIZE, value); }

    // -----------------------------------

    /** An array of {@link VRVulkanTextureArrayData} structs. */
    public static class Buffer extends StructBuffer<VRVulkanTextureArrayData, Buffer> implements NativeResource {

        private static final VRVulkanTextureArrayData ELEMENT_FACTORY = VRVulkanTextureArrayData.create(-1L);

        /**
         * Creates a new {@code VRVulkanTextureArrayData.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VRVulkanTextureArrayData#SIZEOF}, and its mark will be undefined.
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
        protected VRVulkanTextureArrayData getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code m_unArrayIndex} field. */
        @NativeType("uint32_t")
        public int m_unArrayIndex() { return VRVulkanTextureArrayData.nm_unArrayIndex(address()); }
        /** @return the value of the {@code m_unArraySize} field. */
        @NativeType("uint32_t")
        public int m_unArraySize() { return VRVulkanTextureArrayData.nm_unArraySize(address()); }

        /** Sets the specified value to the {@code m_unArrayIndex} field. */
        public VRVulkanTextureArrayData.Buffer m_unArrayIndex(@NativeType("uint32_t") int value) { VRVulkanTextureArrayData.nm_unArrayIndex(address(), value); return this; }
        /** Sets the specified value to the {@code m_unArraySize} field. */
        public VRVulkanTextureArrayData.Buffer m_unArraySize(@NativeType("uint32_t") int value) { VRVulkanTextureArrayData.nm_unArraySize(address(), value); return this; }

    }

}