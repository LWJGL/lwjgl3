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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying specialization info.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@code pMapEntries} is a pointer to a {@link VkSpecializationMapEntry} structure.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The {@code offset} member of each element of {@code pMapEntries} <b>must</b> be less than {@code dataSize}</li>
 * <li>The {@code size} member of each element of {@code pMapEntries} <b>must</b> be less than or equal to {@code dataSize} minus {@code offset}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>If {@code mapEntryCount} is not 0, {@code pMapEntries} <b>must</b> be a valid pointer to an array of {@code mapEntryCount} valid {@link VkSpecializationMapEntry} structures</li>
 * <li>If {@code dataSize} is not 0, {@code pData} <b>must</b> be a valid pointer to an array of {@code dataSize} bytes</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkPipelineShaderStageCreateInfo}, {@link VkSpecializationMapEntry}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code mapEntryCount} &ndash; the number of entries in the {@code pMapEntries} array.</li>
 * <li>{@code pMapEntries} &ndash; a pointer to an array of {@link VkSpecializationMapEntry} structures which map constant IDs to offsets in {@code pData}.</li>
 * <li>{@code dataSize} &ndash; the byte size of the {@code pData} buffer.</li>
 * <li>{@code pData} &ndash; contains the actual constant values to specialize with.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSpecializationInfo {
 *     uint32_t mapEntryCount;
 *     {@link VkSpecializationMapEntry VkSpecializationMapEntry} const * pMapEntries;
 *     size_t dataSize;
 *     void const * pData;
 * }</code></pre>
 */
public class VkSpecializationInfo extends Struct implements NativeResource {

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

    /** Returns the value of the {@code mapEntryCount} field. */
    @NativeType("uint32_t")
    public int mapEntryCount() { return nmapEntryCount(address()); }
    /** Returns a {@link VkSpecializationMapEntry.Buffer} view of the struct array pointed to by the {@code pMapEntries} field. */
    @Nullable
    @NativeType("VkSpecializationMapEntry const *")
    public VkSpecializationMapEntry.Buffer pMapEntries() { return npMapEntries(address()); }
    /** Returns the value of the {@code dataSize} field. */
    @NativeType("size_t")
    public long dataSize() { return ndataSize(address()); }
    /** Returns a {@link ByteBuffer} view of the data pointed to by the {@code pData} field. */
    @Nullable
    @NativeType("void const *")
    public ByteBuffer pData() { return npData(address()); }

    /** Sets the address of the specified {@link VkSpecializationMapEntry.Buffer} to the {@code pMapEntries} field. */
    public VkSpecializationInfo pMapEntries(@Nullable @NativeType("VkSpecializationMapEntry const *") VkSpecializationMapEntry.Buffer value) { npMapEntries(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code pData} field. */
    public VkSpecializationInfo pData(@Nullable @NativeType("void const *") ByteBuffer value) { npData(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSpecializationInfo set(
        @Nullable VkSpecializationMapEntry.Buffer pMapEntries,
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
        return wrap(VkSpecializationInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkSpecializationInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSpecializationInfo calloc() {
        return wrap(VkSpecializationInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkSpecializationInfo} instance allocated with {@link BufferUtils}. */
    public static VkSpecializationInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkSpecializationInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkSpecializationInfo} instance for the specified memory address. */
    public static VkSpecializationInfo create(long address) {
        return wrap(VkSpecializationInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSpecializationInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkSpecializationInfo.class, address);
    }

    /**
     * Returns a new {@link VkSpecializationInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSpecializationInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSpecializationInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSpecializationInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSpecializationInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSpecializationInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkSpecializationInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSpecializationInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSpecializationInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkSpecializationInfo} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkSpecializationInfo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkSpecializationInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkSpecializationInfo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkSpecializationInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSpecializationInfo mallocStack(MemoryStack stack) {
        return wrap(VkSpecializationInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSpecializationInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSpecializationInfo callocStack(MemoryStack stack) {
        return wrap(VkSpecializationInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSpecializationInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSpecializationInfo.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSpecializationInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkSpecializationInfo.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSpecializationInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSpecializationInfo.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSpecializationInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSpecializationInfo.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mapEntryCount}. */
    public static int nmapEntryCount(long struct) { return UNSAFE.getInt(null, struct + VkSpecializationInfo.MAPENTRYCOUNT); }
    /** Unsafe version of {@link #pMapEntries}. */
    @Nullable public static VkSpecializationMapEntry.Buffer npMapEntries(long struct) { return VkSpecializationMapEntry.createSafe(memGetAddress(struct + VkSpecializationInfo.PMAPENTRIES), nmapEntryCount(struct)); }
    /** Unsafe version of {@link #dataSize}. */
    public static long ndataSize(long struct) { return memGetAddress(struct + VkSpecializationInfo.DATASIZE); }
    /** Unsafe version of {@link #pData() pData}. */
    @Nullable public static ByteBuffer npData(long struct) { return memByteBufferSafe(memGetAddress(struct + VkSpecializationInfo.PDATA), (int)ndataSize(struct)); }

    /** Sets the specified value to the {@code mapEntryCount} field of the specified {@code struct}. */
    public static void nmapEntryCount(long struct, int value) { UNSAFE.putInt(null, struct + VkSpecializationInfo.MAPENTRYCOUNT, value); }
    /** Unsafe version of {@link #pMapEntries(VkSpecializationMapEntry.Buffer) pMapEntries}. */
    public static void npMapEntries(long struct, @Nullable VkSpecializationMapEntry.Buffer value) { memPutAddress(struct + VkSpecializationInfo.PMAPENTRIES, memAddressSafe(value)); nmapEntryCount(struct, value == null ? 0 : value.remaining()); }
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

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link VkSpecializationInfo} structs. */
    public static class Buffer extends StructBuffer<VkSpecializationInfo, Buffer> implements NativeResource {

        private static final VkSpecializationInfo ELEMENT_FACTORY = VkSpecializationInfo.create(-1L);

        /**
         * Creates a new {@code VkSpecializationInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSpecializationInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkSpecializationInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code mapEntryCount} field. */
        @NativeType("uint32_t")
        public int mapEntryCount() { return VkSpecializationInfo.nmapEntryCount(address()); }
        /** Returns a {@link VkSpecializationMapEntry.Buffer} view of the struct array pointed to by the {@code pMapEntries} field. */
        @Nullable
        @NativeType("VkSpecializationMapEntry const *")
        public VkSpecializationMapEntry.Buffer pMapEntries() { return VkSpecializationInfo.npMapEntries(address()); }
        /** Returns the value of the {@code dataSize} field. */
        @NativeType("size_t")
        public long dataSize() { return VkSpecializationInfo.ndataSize(address()); }
        /** Returns a {@link ByteBuffer} view of the data pointed to by the {@code pData} field. */
        @Nullable
        @NativeType("void const *")
        public ByteBuffer pData() { return VkSpecializationInfo.npData(address()); }

        /** Sets the address of the specified {@link VkSpecializationMapEntry.Buffer} to the {@code pMapEntries} field. */
        public VkSpecializationInfo.Buffer pMapEntries(@Nullable @NativeType("VkSpecializationMapEntry const *") VkSpecializationMapEntry.Buffer value) { VkSpecializationInfo.npMapEntries(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code pData} field. */
        public VkSpecializationInfo.Buffer pData(@Nullable @NativeType("void const *") ByteBuffer value) { VkSpecializationInfo.npData(address(), value); return this; }

    }

}