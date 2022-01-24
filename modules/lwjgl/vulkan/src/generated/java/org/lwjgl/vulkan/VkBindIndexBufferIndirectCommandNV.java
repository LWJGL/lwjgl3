/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying input data for a single index buffer command token.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The buffer’s usage flag from which the address was acquired <b>must</b> have the {@link VK10#VK_BUFFER_USAGE_INDEX_BUFFER_BIT BUFFER_USAGE_INDEX_BUFFER_BIT} bit set</li>
 * <li>The {@code bufferAddress} <b>must</b> be aligned to the {@code indexType} used</li>
 * <li>Each element of the buffer from which the address was acquired and that is non-sparse <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code indexType} <b>must</b> be a valid {@code VkIndexType} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkBindIndexBufferIndirectCommandNV {
 *     VkDeviceAddress {@link #bufferAddress};
 *     uint32_t {@link #size};
 *     VkIndexType {@link #indexType};
 * }</code></pre>
 */
public class VkBindIndexBufferIndirectCommandNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BUFFERADDRESS,
        SIZE,
        INDEXTYPE;

    static {
        Layout layout = __struct(
            __member(8),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BUFFERADDRESS = layout.offsetof(0);
        SIZE = layout.offsetof(1);
        INDEXTYPE = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkBindIndexBufferIndirectCommandNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBindIndexBufferIndirectCommandNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** specifies a physical address of the {@code VkBuffer} used as index buffer. */
    @NativeType("VkDeviceAddress")
    public long bufferAddress() { return nbufferAddress(address()); }
    /** the byte size range which is available for this operation from the provided address. */
    @NativeType("uint32_t")
    public int size() { return nsize(address()); }
    /** a {@code VkIndexType} value specifying how indices are treated. Instead of the Vulkan enum values, a custom {@code uint32_t} value <b>can</b> be mapped to an {@code VkIndexType} by specifying the {@link VkIndirectCommandsLayoutTokenNV}{@code ::pIndexTypes} and {@link VkIndirectCommandsLayoutTokenNV}{@code ::pIndexTypeValues} arrays. */
    @NativeType("VkIndexType")
    public int indexType() { return nindexType(address()); }

    /** Sets the specified value to the {@link #bufferAddress} field. */
    public VkBindIndexBufferIndirectCommandNV bufferAddress(@NativeType("VkDeviceAddress") long value) { nbufferAddress(address(), value); return this; }
    /** Sets the specified value to the {@link #size} field. */
    public VkBindIndexBufferIndirectCommandNV size(@NativeType("uint32_t") int value) { nsize(address(), value); return this; }
    /** Sets the specified value to the {@link #indexType} field. */
    public VkBindIndexBufferIndirectCommandNV indexType(@NativeType("VkIndexType") int value) { nindexType(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkBindIndexBufferIndirectCommandNV set(
        long bufferAddress,
        int size,
        int indexType
    ) {
        bufferAddress(bufferAddress);
        size(size);
        indexType(indexType);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBindIndexBufferIndirectCommandNV set(VkBindIndexBufferIndirectCommandNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBindIndexBufferIndirectCommandNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBindIndexBufferIndirectCommandNV malloc() {
        return wrap(VkBindIndexBufferIndirectCommandNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkBindIndexBufferIndirectCommandNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBindIndexBufferIndirectCommandNV calloc() {
        return wrap(VkBindIndexBufferIndirectCommandNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkBindIndexBufferIndirectCommandNV} instance allocated with {@link BufferUtils}. */
    public static VkBindIndexBufferIndirectCommandNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkBindIndexBufferIndirectCommandNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkBindIndexBufferIndirectCommandNV} instance for the specified memory address. */
    public static VkBindIndexBufferIndirectCommandNV create(long address) {
        return wrap(VkBindIndexBufferIndirectCommandNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBindIndexBufferIndirectCommandNV createSafe(long address) {
        return address == NULL ? null : wrap(VkBindIndexBufferIndirectCommandNV.class, address);
    }

    /**
     * Returns a new {@link VkBindIndexBufferIndirectCommandNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindIndexBufferIndirectCommandNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBindIndexBufferIndirectCommandNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindIndexBufferIndirectCommandNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindIndexBufferIndirectCommandNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindIndexBufferIndirectCommandNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkBindIndexBufferIndirectCommandNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBindIndexBufferIndirectCommandNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBindIndexBufferIndirectCommandNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkBindIndexBufferIndirectCommandNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindIndexBufferIndirectCommandNV malloc(MemoryStack stack) {
        return wrap(VkBindIndexBufferIndirectCommandNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkBindIndexBufferIndirectCommandNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindIndexBufferIndirectCommandNV calloc(MemoryStack stack) {
        return wrap(VkBindIndexBufferIndirectCommandNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkBindIndexBufferIndirectCommandNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindIndexBufferIndirectCommandNV.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindIndexBufferIndirectCommandNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindIndexBufferIndirectCommandNV.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #bufferAddress}. */
    public static long nbufferAddress(long struct) { return UNSAFE.getLong(null, struct + VkBindIndexBufferIndirectCommandNV.BUFFERADDRESS); }
    /** Unsafe version of {@link #size}. */
    public static int nsize(long struct) { return UNSAFE.getInt(null, struct + VkBindIndexBufferIndirectCommandNV.SIZE); }
    /** Unsafe version of {@link #indexType}. */
    public static int nindexType(long struct) { return UNSAFE.getInt(null, struct + VkBindIndexBufferIndirectCommandNV.INDEXTYPE); }

    /** Unsafe version of {@link #bufferAddress(long) bufferAddress}. */
    public static void nbufferAddress(long struct, long value) { UNSAFE.putLong(null, struct + VkBindIndexBufferIndirectCommandNV.BUFFERADDRESS, value); }
    /** Unsafe version of {@link #size(int) size}. */
    public static void nsize(long struct, int value) { UNSAFE.putInt(null, struct + VkBindIndexBufferIndirectCommandNV.SIZE, value); }
    /** Unsafe version of {@link #indexType(int) indexType}. */
    public static void nindexType(long struct, int value) { UNSAFE.putInt(null, struct + VkBindIndexBufferIndirectCommandNV.INDEXTYPE, value); }

    // -----------------------------------

    /** An array of {@link VkBindIndexBufferIndirectCommandNV} structs. */
    public static class Buffer extends StructBuffer<VkBindIndexBufferIndirectCommandNV, Buffer> implements NativeResource {

        private static final VkBindIndexBufferIndirectCommandNV ELEMENT_FACTORY = VkBindIndexBufferIndirectCommandNV.create(-1L);

        /**
         * Creates a new {@code VkBindIndexBufferIndirectCommandNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBindIndexBufferIndirectCommandNV#SIZEOF}, and its mark will be undefined.
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
        protected VkBindIndexBufferIndirectCommandNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkBindIndexBufferIndirectCommandNV#bufferAddress} field. */
        @NativeType("VkDeviceAddress")
        public long bufferAddress() { return VkBindIndexBufferIndirectCommandNV.nbufferAddress(address()); }
        /** @return the value of the {@link VkBindIndexBufferIndirectCommandNV#size} field. */
        @NativeType("uint32_t")
        public int size() { return VkBindIndexBufferIndirectCommandNV.nsize(address()); }
        /** @return the value of the {@link VkBindIndexBufferIndirectCommandNV#indexType} field. */
        @NativeType("VkIndexType")
        public int indexType() { return VkBindIndexBufferIndirectCommandNV.nindexType(address()); }

        /** Sets the specified value to the {@link VkBindIndexBufferIndirectCommandNV#bufferAddress} field. */
        public VkBindIndexBufferIndirectCommandNV.Buffer bufferAddress(@NativeType("VkDeviceAddress") long value) { VkBindIndexBufferIndirectCommandNV.nbufferAddress(address(), value); return this; }
        /** Sets the specified value to the {@link VkBindIndexBufferIndirectCommandNV#size} field. */
        public VkBindIndexBufferIndirectCommandNV.Buffer size(@NativeType("uint32_t") int value) { VkBindIndexBufferIndirectCommandNV.nsize(address(), value); return this; }
        /** Sets the specified value to the {@link VkBindIndexBufferIndirectCommandNV#indexType} field. */
        public VkBindIndexBufferIndirectCommandNV.Buffer indexType(@NativeType("VkIndexType") int value) { VkBindIndexBufferIndirectCommandNV.nindexType(address(), value); return this; }

    }

}