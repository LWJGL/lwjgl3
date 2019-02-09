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
 * Structure specifying parameters of a newly created pipeline cache.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code initialDataSize} is not 0, it <b>must</b> be equal to the size of {@code pInitialData}, as returned by {@code vkGetPipelineCacheData} when {@code pInitialData} was originally retrieved</li>
 * <li>If {@code initialDataSize} is not 0, {@code pInitialData} <b>must</b> have been retrieved from a previous call to {@code vkGetPipelineCacheData}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_PIPELINE_CACHE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_CACHE_CREATE_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>If {@code initialDataSize} is not 0, {@code pInitialData} <b>must</b> be a valid pointer to an array of {@code initialDataSize} bytes</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VK10#vkCreatePipelineCache CreatePipelineCache}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code flags} &ndash; reserved for future use.</li>
 * <li>{@code initialDataSize} &ndash; the number of bytes in {@code pInitialData}. If {@code initialDataSize} is zero, the pipeline cache will initially be empty.</li>
 * <li>{@code pInitialData} &ndash; a pointer to previously retrieved pipeline cache data. If the pipeline cache data is incompatible (as defined below) with the device, the pipeline cache will be initially empty. If {@code initialDataSize} is zero, {@code pInitialData} is ignored.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineCacheCreateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkPipelineCacheCreateFlags flags;
 *     size_t initialDataSize;
 *     void const * pInitialData;
 * }</code></pre>
 */
public class VkPipelineCacheCreateInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        INITIALDATASIZE,
        PINITIALDATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        INITIALDATASIZE = layout.offsetof(3);
        PINITIALDATA = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkPipelineCacheCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineCacheCreateInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code flags} field. */
    @NativeType("VkPipelineCacheCreateFlags")
    public int flags() { return nflags(address()); }
    /** Returns the value of the {@code initialDataSize} field. */
    @NativeType("size_t")
    public long initialDataSize() { return ninitialDataSize(address()); }
    /** Returns a {@link ByteBuffer} view of the data pointed to by the {@code pInitialData} field. */
    @Nullable
    @NativeType("void const *")
    public ByteBuffer pInitialData() { return npInitialData(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPipelineCacheCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPipelineCacheCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkPipelineCacheCreateInfo flags(@NativeType("VkPipelineCacheCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code pInitialData} field. */
    public VkPipelineCacheCreateInfo pInitialData(@Nullable @NativeType("void const *") ByteBuffer value) { npInitialData(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineCacheCreateInfo set(
        int sType,
        long pNext,
        int flags,
        @Nullable ByteBuffer pInitialData
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pInitialData(pInitialData);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineCacheCreateInfo set(VkPipelineCacheCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineCacheCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineCacheCreateInfo malloc() {
        return wrap(VkPipelineCacheCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPipelineCacheCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineCacheCreateInfo calloc() {
        return wrap(VkPipelineCacheCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPipelineCacheCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkPipelineCacheCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPipelineCacheCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineCacheCreateInfo} instance for the specified memory address. */
    public static VkPipelineCacheCreateInfo create(long address) {
        return wrap(VkPipelineCacheCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineCacheCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkPipelineCacheCreateInfo.class, address);
    }

    /**
     * Returns a new {@link VkPipelineCacheCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineCacheCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineCacheCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineCacheCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineCacheCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineCacheCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPipelineCacheCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineCacheCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineCacheCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineCacheCreateInfo} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPipelineCacheCreateInfo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPipelineCacheCreateInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPipelineCacheCreateInfo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPipelineCacheCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineCacheCreateInfo mallocStack(MemoryStack stack) {
        return wrap(VkPipelineCacheCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPipelineCacheCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineCacheCreateInfo callocStack(MemoryStack stack) {
        return wrap(VkPipelineCacheCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineCacheCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineCacheCreateInfo.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPipelineCacheCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineCacheCreateInfo.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPipelineCacheCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineCacheCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineCacheCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineCacheCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPipelineCacheCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineCacheCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkPipelineCacheCreateInfo.FLAGS); }
    /** Unsafe version of {@link #initialDataSize}. */
    public static long ninitialDataSize(long struct) { return memGetAddress(struct + VkPipelineCacheCreateInfo.INITIALDATASIZE); }
    /** Unsafe version of {@link #pInitialData() pInitialData}. */
    @Nullable public static ByteBuffer npInitialData(long struct) { return memByteBufferSafe(memGetAddress(struct + VkPipelineCacheCreateInfo.PINITIALDATA), (int)ninitialDataSize(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineCacheCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineCacheCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineCacheCreateInfo.FLAGS, value); }
    /** Sets the specified value to the {@code initialDataSize} field of the specified {@code struct}. */
    public static void ninitialDataSize(long struct, long value) { memPutAddress(struct + VkPipelineCacheCreateInfo.INITIALDATASIZE, value); }
    /** Unsafe version of {@link #pInitialData(ByteBuffer) pInitialData}. */
    public static void npInitialData(long struct, @Nullable ByteBuffer value) { memPutAddress(struct + VkPipelineCacheCreateInfo.PINITIALDATA, memAddressSafe(value)); ninitialDataSize(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (ninitialDataSize(struct) != 0) {
            check(memGetAddress(struct + VkPipelineCacheCreateInfo.PINITIALDATA));
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

    /** An array of {@link VkPipelineCacheCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkPipelineCacheCreateInfo, Buffer> implements NativeResource {

        private static final VkPipelineCacheCreateInfo ELEMENT_FACTORY = VkPipelineCacheCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkPipelineCacheCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineCacheCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkPipelineCacheCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineCacheCreateInfo.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineCacheCreateInfo.npNext(address()); }
        /** Returns the value of the {@code flags} field. */
        @NativeType("VkPipelineCacheCreateFlags")
        public int flags() { return VkPipelineCacheCreateInfo.nflags(address()); }
        /** Returns the value of the {@code initialDataSize} field. */
        @NativeType("size_t")
        public long initialDataSize() { return VkPipelineCacheCreateInfo.ninitialDataSize(address()); }
        /** Returns a {@link ByteBuffer} view of the data pointed to by the {@code pInitialData} field. */
        @Nullable
        @NativeType("void const *")
        public ByteBuffer pInitialData() { return VkPipelineCacheCreateInfo.npInitialData(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPipelineCacheCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineCacheCreateInfo.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPipelineCacheCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkPipelineCacheCreateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkPipelineCacheCreateInfo.Buffer flags(@NativeType("VkPipelineCacheCreateFlags") int value) { VkPipelineCacheCreateInfo.nflags(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code pInitialData} field. */
        public VkPipelineCacheCreateInfo.Buffer pInitialData(@Nullable @NativeType("void const *") ByteBuffer value) { VkPipelineCacheCreateInfo.npInitialData(address(), value); return this; }

    }

}