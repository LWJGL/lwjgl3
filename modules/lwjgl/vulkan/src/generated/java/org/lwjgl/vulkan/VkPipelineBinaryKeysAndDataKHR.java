/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkPipelineBinaryKeysAndDataKHR {
 *     uint32_t binaryCount;
 *     {@link VkPipelineBinaryKeyKHR VkPipelineBinaryKeyKHR} const * pPipelineBinaryKeys;
 *     {@link VkPipelineBinaryDataKHR VkPipelineBinaryDataKHR} const * pPipelineBinaryData;
 * }}</pre>
 */
public class VkPipelineBinaryKeysAndDataKHR extends Struct<VkPipelineBinaryKeysAndDataKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BINARYCOUNT,
        PPIPELINEBINARYKEYS,
        PPIPELINEBINARYDATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BINARYCOUNT = layout.offsetof(0);
        PPIPELINEBINARYKEYS = layout.offsetof(1);
        PPIPELINEBINARYDATA = layout.offsetof(2);
    }

    protected VkPipelineBinaryKeysAndDataKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPipelineBinaryKeysAndDataKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPipelineBinaryKeysAndDataKHR(address, container);
    }

    /**
     * Creates a {@code VkPipelineBinaryKeysAndDataKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineBinaryKeysAndDataKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code binaryCount} field. */
    @NativeType("uint32_t")
    public int binaryCount() { return nbinaryCount(address()); }
    /** @return a {@link VkPipelineBinaryKeyKHR.Buffer} view of the struct array pointed to by the {@code pPipelineBinaryKeys} field. */
    @NativeType("VkPipelineBinaryKeyKHR const *")
    public VkPipelineBinaryKeyKHR.Buffer pPipelineBinaryKeys() { return npPipelineBinaryKeys(address()); }
    /** @return a {@link VkPipelineBinaryDataKHR.Buffer} view of the struct array pointed to by the {@code pPipelineBinaryData} field. */
    @NativeType("VkPipelineBinaryDataKHR const *")
    public VkPipelineBinaryDataKHR.Buffer pPipelineBinaryData() { return npPipelineBinaryData(address()); }

    /** Sets the specified value to the {@code binaryCount} field. */
    public VkPipelineBinaryKeysAndDataKHR binaryCount(@NativeType("uint32_t") int value) { nbinaryCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineBinaryKeyKHR.Buffer} to the {@code pPipelineBinaryKeys} field. */
    public VkPipelineBinaryKeysAndDataKHR pPipelineBinaryKeys(@NativeType("VkPipelineBinaryKeyKHR const *") VkPipelineBinaryKeyKHR.Buffer value) { npPipelineBinaryKeys(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineBinaryDataKHR.Buffer} to the {@code pPipelineBinaryData} field. */
    public VkPipelineBinaryKeysAndDataKHR pPipelineBinaryData(@NativeType("VkPipelineBinaryDataKHR const *") VkPipelineBinaryDataKHR.Buffer value) { npPipelineBinaryData(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineBinaryKeysAndDataKHR set(
        int binaryCount,
        VkPipelineBinaryKeyKHR.Buffer pPipelineBinaryKeys,
        VkPipelineBinaryDataKHR.Buffer pPipelineBinaryData
    ) {
        binaryCount(binaryCount);
        pPipelineBinaryKeys(pPipelineBinaryKeys);
        pPipelineBinaryData(pPipelineBinaryData);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineBinaryKeysAndDataKHR set(VkPipelineBinaryKeysAndDataKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineBinaryKeysAndDataKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineBinaryKeysAndDataKHR malloc() {
        return new VkPipelineBinaryKeysAndDataKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineBinaryKeysAndDataKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineBinaryKeysAndDataKHR calloc() {
        return new VkPipelineBinaryKeysAndDataKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineBinaryKeysAndDataKHR} instance allocated with {@link BufferUtils}. */
    public static VkPipelineBinaryKeysAndDataKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineBinaryKeysAndDataKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineBinaryKeysAndDataKHR} instance for the specified memory address. */
    public static VkPipelineBinaryKeysAndDataKHR create(long address) {
        return new VkPipelineBinaryKeysAndDataKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPipelineBinaryKeysAndDataKHR createSafe(long address) {
        return address == NULL ? null : new VkPipelineBinaryKeysAndDataKHR(address, null);
    }

    /**
     * Returns a new {@link VkPipelineBinaryKeysAndDataKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineBinaryKeysAndDataKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineBinaryKeysAndDataKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineBinaryKeysAndDataKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineBinaryKeysAndDataKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineBinaryKeysAndDataKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPipelineBinaryKeysAndDataKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineBinaryKeysAndDataKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPipelineBinaryKeysAndDataKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPipelineBinaryKeysAndDataKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineBinaryKeysAndDataKHR malloc(MemoryStack stack) {
        return new VkPipelineBinaryKeysAndDataKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPipelineBinaryKeysAndDataKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineBinaryKeysAndDataKHR calloc(MemoryStack stack) {
        return new VkPipelineBinaryKeysAndDataKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPipelineBinaryKeysAndDataKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineBinaryKeysAndDataKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineBinaryKeysAndDataKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineBinaryKeysAndDataKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #binaryCount}. */
    public static int nbinaryCount(long struct) { return memGetInt(struct + VkPipelineBinaryKeysAndDataKHR.BINARYCOUNT); }
    /** Unsafe version of {@link #pPipelineBinaryKeys}. */
    public static VkPipelineBinaryKeyKHR.Buffer npPipelineBinaryKeys(long struct) { return VkPipelineBinaryKeyKHR.create(memGetAddress(struct + VkPipelineBinaryKeysAndDataKHR.PPIPELINEBINARYKEYS), nbinaryCount(struct)); }
    /** Unsafe version of {@link #pPipelineBinaryData}. */
    public static VkPipelineBinaryDataKHR.Buffer npPipelineBinaryData(long struct) { return VkPipelineBinaryDataKHR.create(memGetAddress(struct + VkPipelineBinaryKeysAndDataKHR.PPIPELINEBINARYDATA), nbinaryCount(struct)); }

    /** Sets the specified value to the {@code binaryCount} field of the specified {@code struct}. */
    public static void nbinaryCount(long struct, int value) { memPutInt(struct + VkPipelineBinaryKeysAndDataKHR.BINARYCOUNT, value); }
    /** Unsafe version of {@link #pPipelineBinaryKeys(VkPipelineBinaryKeyKHR.Buffer) pPipelineBinaryKeys}. */
    public static void npPipelineBinaryKeys(long struct, VkPipelineBinaryKeyKHR.Buffer value) { memPutAddress(struct + VkPipelineBinaryKeysAndDataKHR.PPIPELINEBINARYKEYS, value.address()); }
    /** Unsafe version of {@link #pPipelineBinaryData(VkPipelineBinaryDataKHR.Buffer) pPipelineBinaryData}. */
    public static void npPipelineBinaryData(long struct, VkPipelineBinaryDataKHR.Buffer value) { memPutAddress(struct + VkPipelineBinaryKeysAndDataKHR.PPIPELINEBINARYDATA, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int binaryCount = nbinaryCount(struct);
        check(memGetAddress(struct + VkPipelineBinaryKeysAndDataKHR.PPIPELINEBINARYKEYS));
        long pPipelineBinaryData = memGetAddress(struct + VkPipelineBinaryKeysAndDataKHR.PPIPELINEBINARYDATA);
        check(pPipelineBinaryData);
        validate(pPipelineBinaryData, binaryCount, VkPipelineBinaryDataKHR.SIZEOF, VkPipelineBinaryDataKHR::validate);
    }

    // -----------------------------------

    /** An array of {@link VkPipelineBinaryKeysAndDataKHR} structs. */
    public static class Buffer extends StructBuffer<VkPipelineBinaryKeysAndDataKHR, Buffer> implements NativeResource {

        private static final VkPipelineBinaryKeysAndDataKHR ELEMENT_FACTORY = VkPipelineBinaryKeysAndDataKHR.create(-1L);

        /**
         * Creates a new {@code VkPipelineBinaryKeysAndDataKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineBinaryKeysAndDataKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPipelineBinaryKeysAndDataKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code binaryCount} field. */
        @NativeType("uint32_t")
        public int binaryCount() { return VkPipelineBinaryKeysAndDataKHR.nbinaryCount(address()); }
        /** @return a {@link VkPipelineBinaryKeyKHR.Buffer} view of the struct array pointed to by the {@code pPipelineBinaryKeys} field. */
        @NativeType("VkPipelineBinaryKeyKHR const *")
        public VkPipelineBinaryKeyKHR.Buffer pPipelineBinaryKeys() { return VkPipelineBinaryKeysAndDataKHR.npPipelineBinaryKeys(address()); }
        /** @return a {@link VkPipelineBinaryDataKHR.Buffer} view of the struct array pointed to by the {@code pPipelineBinaryData} field. */
        @NativeType("VkPipelineBinaryDataKHR const *")
        public VkPipelineBinaryDataKHR.Buffer pPipelineBinaryData() { return VkPipelineBinaryKeysAndDataKHR.npPipelineBinaryData(address()); }

        /** Sets the specified value to the {@code binaryCount} field. */
        public VkPipelineBinaryKeysAndDataKHR.Buffer binaryCount(@NativeType("uint32_t") int value) { VkPipelineBinaryKeysAndDataKHR.nbinaryCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineBinaryKeyKHR.Buffer} to the {@code pPipelineBinaryKeys} field. */
        public VkPipelineBinaryKeysAndDataKHR.Buffer pPipelineBinaryKeys(@NativeType("VkPipelineBinaryKeyKHR const *") VkPipelineBinaryKeyKHR.Buffer value) { VkPipelineBinaryKeysAndDataKHR.npPipelineBinaryKeys(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineBinaryDataKHR.Buffer} to the {@code pPipelineBinaryData} field. */
        public VkPipelineBinaryKeysAndDataKHR.Buffer pPipelineBinaryData(@NativeType("VkPipelineBinaryDataKHR const *") VkPipelineBinaryDataKHR.Buffer value) { VkPipelineBinaryKeysAndDataKHR.npPipelineBinaryData(address(), value); return this; }

    }

}