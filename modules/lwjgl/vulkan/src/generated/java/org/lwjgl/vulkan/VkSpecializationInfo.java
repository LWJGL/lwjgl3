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
 * <pre><code>
 * struct VkSpecializationInfo {
 *     uint32_t mapEntryCount;
 *     {@link VkSpecializationMapEntry VkSpecializationMapEntry} const * pMapEntries;
 *     size_t dataSize;
 *     void const * pData;
 * }</code></pre>
 */
public class VkSpecializationInfo extends Struct<VkSpecializationInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MAPENTRYCOUNT,
        PMAPENTRIES,
        DATASIZE,
        PDATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MAPENTRYCOUNT = layout.offsetof(0);
        PMAPENTRIES = layout.offsetof(1);
        DATASIZE = layout.offsetof(2);
        PDATA = layout.offsetof(3);
    }

    protected VkSpecializationInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSpecializationInfo create(long address, @Nullable ByteBuffer container) {
        return new VkSpecializationInfo(address, container);
    }

    /**
     * Creates a {@code VkSpecializationInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSpecializationInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code mapEntryCount} field. */
    @NativeType("uint32_t")
    public int mapEntryCount() { return nmapEntryCount(address()); }
    /** @return a {@link VkSpecializationMapEntry.Buffer} view of the struct array pointed to by the {@code pMapEntries} field. */
    @NativeType("VkSpecializationMapEntry const *")
    public VkSpecializationMapEntry.@Nullable Buffer pMapEntries() { return npMapEntries(address()); }
    /** @return the value of the {@code dataSize} field. */
    @NativeType("size_t")
    public long dataSize() { return ndataSize(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code pData} field. */
    @NativeType("void const *")
    public @Nullable ByteBuffer pData() { return npData(address()); }

    /** Sets the address of the specified {@link VkSpecializationMapEntry.Buffer} to the {@code pMapEntries} field. */
    public VkSpecializationInfo pMapEntries(@NativeType("VkSpecializationMapEntry const *") VkSpecializationMapEntry.@Nullable Buffer value) { npMapEntries(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code pData} field. */
    public VkSpecializationInfo pData(@Nullable @NativeType("void const *") ByteBuffer value) { npData(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSpecializationInfo set(
        VkSpecializationMapEntry.@Nullable Buffer pMapEntries,
        @Nullable ByteBuffer pData
    ) {
        pMapEntries(pMapEntries);
        pData(pData);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSpecializationInfo set(VkSpecializationInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSpecializationInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSpecializationInfo malloc() {
        return new VkSpecializationInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSpecializationInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSpecializationInfo calloc() {
        return new VkSpecializationInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSpecializationInfo} instance allocated with {@link BufferUtils}. */
    public static VkSpecializationInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSpecializationInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkSpecializationInfo} instance for the specified memory address. */
    public static VkSpecializationInfo create(long address) {
        return new VkSpecializationInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSpecializationInfo createSafe(long address) {
        return address == NULL ? null : new VkSpecializationInfo(address, null);
    }

    /**
     * Returns a new {@link VkSpecializationInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSpecializationInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSpecializationInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSpecializationInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSpecializationInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSpecializationInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSpecializationInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSpecializationInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSpecializationInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSpecializationInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSpecializationInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSpecializationInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSpecializationInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSpecializationInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSpecializationInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSpecializationInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSpecializationInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkSpecializationInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSpecializationInfo malloc(MemoryStack stack) {
        return new VkSpecializationInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSpecializationInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSpecializationInfo calloc(MemoryStack stack) {
        return new VkSpecializationInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSpecializationInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSpecializationInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSpecializationInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSpecializationInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mapEntryCount}. */
    public static int nmapEntryCount(long struct) { return memGetInt(struct + VkSpecializationInfo.MAPENTRYCOUNT); }
    /** Unsafe version of {@link #pMapEntries}. */
    public static VkSpecializationMapEntry.@Nullable Buffer npMapEntries(long struct) { return VkSpecializationMapEntry.createSafe(memGetAddress(struct + VkSpecializationInfo.PMAPENTRIES), nmapEntryCount(struct)); }
    /** Unsafe version of {@link #dataSize}. */
    public static long ndataSize(long struct) { return memGetAddress(struct + VkSpecializationInfo.DATASIZE); }
    /** Unsafe version of {@link #pData() pData}. */
    public static @Nullable ByteBuffer npData(long struct) { return memByteBufferSafe(memGetAddress(struct + VkSpecializationInfo.PDATA), (int)ndataSize(struct)); }

    /** Sets the specified value to the {@code mapEntryCount} field of the specified {@code struct}. */
    public static void nmapEntryCount(long struct, int value) { memPutInt(struct + VkSpecializationInfo.MAPENTRYCOUNT, value); }
    /** Unsafe version of {@link #pMapEntries(VkSpecializationMapEntry.Buffer) pMapEntries}. */
    public static void npMapEntries(long struct, VkSpecializationMapEntry.@Nullable Buffer value) { memPutAddress(struct + VkSpecializationInfo.PMAPENTRIES, memAddressSafe(value)); nmapEntryCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code dataSize} field of the specified {@code struct}. */
    public static void ndataSize(long struct, long value) { memPutAddress(struct + VkSpecializationInfo.DATASIZE, value); }
    /** Unsafe version of {@link #pData(ByteBuffer) pData}. */
    public static void npData(long struct, @Nullable ByteBuffer value) { memPutAddress(struct + VkSpecializationInfo.PDATA, memAddressSafe(value)); ndataSize(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nmapEntryCount(struct) != 0) {
            check(memGetAddress(struct + VkSpecializationInfo.PMAPENTRIES));
        }
        if (ndataSize(struct) != 0) {
            check(memGetAddress(struct + VkSpecializationInfo.PDATA));
        }
    }

    // -----------------------------------

    /** An array of {@link VkSpecializationInfo} structs. */
    public static class Buffer extends StructBuffer<VkSpecializationInfo, Buffer> implements NativeResource {

        private static final VkSpecializationInfo ELEMENT_FACTORY = VkSpecializationInfo.create(-1L);

        /**
         * Creates a new {@code VkSpecializationInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSpecializationInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSpecializationInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code mapEntryCount} field. */
        @NativeType("uint32_t")
        public int mapEntryCount() { return VkSpecializationInfo.nmapEntryCount(address()); }
        /** @return a {@link VkSpecializationMapEntry.Buffer} view of the struct array pointed to by the {@code pMapEntries} field. */
        @NativeType("VkSpecializationMapEntry const *")
        public VkSpecializationMapEntry.@Nullable Buffer pMapEntries() { return VkSpecializationInfo.npMapEntries(address()); }
        /** @return the value of the {@code dataSize} field. */
        @NativeType("size_t")
        public long dataSize() { return VkSpecializationInfo.ndataSize(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code pData} field. */
        @NativeType("void const *")
        public @Nullable ByteBuffer pData() { return VkSpecializationInfo.npData(address()); }

        /** Sets the address of the specified {@link VkSpecializationMapEntry.Buffer} to the {@code pMapEntries} field. */
        public VkSpecializationInfo.Buffer pMapEntries(@NativeType("VkSpecializationMapEntry const *") VkSpecializationMapEntry.@Nullable Buffer value) { VkSpecializationInfo.npMapEntries(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code pData} field. */
        public VkSpecializationInfo.Buffer pData(@Nullable @NativeType("void const *") ByteBuffer value) { VkSpecializationInfo.npData(address(), value); return this; }

    }

}