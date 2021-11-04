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
 * Structure specifying parameters of a newly created validation cache.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code initialDataSize} is not 0, it <b>must</b> be equal to the size of {@code pInitialData}, as returned by {@code vkGetValidationCacheDataEXT} when {@code pInitialData} was originally retrieved</li>
 * <li>If {@code initialDataSize} is not 0, {@code pInitialData} <b>must</b> have been retrieved from a previous call to {@code vkGetValidationCacheDataEXT}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTValidationCache#VK_STRUCTURE_TYPE_VALIDATION_CACHE_CREATE_INFO_EXT STRUCTURE_TYPE_VALIDATION_CACHE_CREATE_INFO_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>If {@code initialDataSize} is not 0, {@code pInitialData} <b>must</b> be a valid pointer to an array of {@code initialDataSize} bytes</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link EXTValidationCache#vkCreateValidationCacheEXT CreateValidationCacheEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkValidationCacheCreateInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkValidationCacheCreateFlagsEXT {@link #flags};
 *     size_t {@link #initialDataSize};
 *     void const * {@link #pInitialData};
 * }</code></pre>
 */
public class VkValidationCacheCreateInfoEXT extends Struct implements NativeResource {

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
     * Creates a {@code VkValidationCacheCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkValidationCacheCreateInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** reserved for future use. */
    @NativeType("VkValidationCacheCreateFlagsEXT")
    public int flags() { return nflags(address()); }
    /** the number of bytes in {@code pInitialData}. If {@code initialDataSize} is zero, the validation cache will initially be empty. */
    @NativeType("size_t")
    public long initialDataSize() { return ninitialDataSize(address()); }
    /** a pointer to previously retrieved validation cache data. If the validation cache data is incompatible (as defined below) with the device, the validation cache will be initially empty. If {@code initialDataSize} is zero, {@code pInitialData} is ignored. */
    @Nullable
    @NativeType("void const *")
    public ByteBuffer pInitialData() { return npInitialData(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkValidationCacheCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTValidationCache#VK_STRUCTURE_TYPE_VALIDATION_CACHE_CREATE_INFO_EXT STRUCTURE_TYPE_VALIDATION_CACHE_CREATE_INFO_EXT} value to the {@link #sType} field. */
    public VkValidationCacheCreateInfoEXT sType$Default() { return sType(EXTValidationCache.VK_STRUCTURE_TYPE_VALIDATION_CACHE_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkValidationCacheCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkValidationCacheCreateInfoEXT flags(@NativeType("VkValidationCacheCreateFlagsEXT") int value) { nflags(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@link #pInitialData} field. */
    public VkValidationCacheCreateInfoEXT pInitialData(@Nullable @NativeType("void const *") ByteBuffer value) { npInitialData(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkValidationCacheCreateInfoEXT set(
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
    public VkValidationCacheCreateInfoEXT set(VkValidationCacheCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkValidationCacheCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkValidationCacheCreateInfoEXT malloc() {
        return wrap(VkValidationCacheCreateInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkValidationCacheCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkValidationCacheCreateInfoEXT calloc() {
        return wrap(VkValidationCacheCreateInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkValidationCacheCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkValidationCacheCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkValidationCacheCreateInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkValidationCacheCreateInfoEXT} instance for the specified memory address. */
    public static VkValidationCacheCreateInfoEXT create(long address) {
        return wrap(VkValidationCacheCreateInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkValidationCacheCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkValidationCacheCreateInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkValidationCacheCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkValidationCacheCreateInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkValidationCacheCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkValidationCacheCreateInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkValidationCacheCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkValidationCacheCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkValidationCacheCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkValidationCacheCreateInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkValidationCacheCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkValidationCacheCreateInfoEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkValidationCacheCreateInfoEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkValidationCacheCreateInfoEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkValidationCacheCreateInfoEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkValidationCacheCreateInfoEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkValidationCacheCreateInfoEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkValidationCacheCreateInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkValidationCacheCreateInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkValidationCacheCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkValidationCacheCreateInfoEXT malloc(MemoryStack stack) {
        return wrap(VkValidationCacheCreateInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkValidationCacheCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkValidationCacheCreateInfoEXT calloc(MemoryStack stack) {
        return wrap(VkValidationCacheCreateInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkValidationCacheCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkValidationCacheCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkValidationCacheCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkValidationCacheCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkValidationCacheCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkValidationCacheCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkValidationCacheCreateInfoEXT.FLAGS); }
    /** Unsafe version of {@link #initialDataSize}. */
    public static long ninitialDataSize(long struct) { return memGetAddress(struct + VkValidationCacheCreateInfoEXT.INITIALDATASIZE); }
    /** Unsafe version of {@link #pInitialData() pInitialData}. */
    @Nullable public static ByteBuffer npInitialData(long struct) { return memByteBufferSafe(memGetAddress(struct + VkValidationCacheCreateInfoEXT.PINITIALDATA), (int)ninitialDataSize(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkValidationCacheCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkValidationCacheCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkValidationCacheCreateInfoEXT.FLAGS, value); }
    /** Sets the specified value to the {@code initialDataSize} field of the specified {@code struct}. */
    public static void ninitialDataSize(long struct, long value) { memPutAddress(struct + VkValidationCacheCreateInfoEXT.INITIALDATASIZE, value); }
    /** Unsafe version of {@link #pInitialData(ByteBuffer) pInitialData}. */
    public static void npInitialData(long struct, @Nullable ByteBuffer value) { memPutAddress(struct + VkValidationCacheCreateInfoEXT.PINITIALDATA, memAddressSafe(value)); ninitialDataSize(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (ninitialDataSize(struct) != 0) {
            check(memGetAddress(struct + VkValidationCacheCreateInfoEXT.PINITIALDATA));
        }
    }

    // -----------------------------------

    /** An array of {@link VkValidationCacheCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkValidationCacheCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkValidationCacheCreateInfoEXT ELEMENT_FACTORY = VkValidationCacheCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkValidationCacheCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkValidationCacheCreateInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkValidationCacheCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkValidationCacheCreateInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkValidationCacheCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkValidationCacheCreateInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkValidationCacheCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkValidationCacheCreateInfoEXT#flags} field. */
        @NativeType("VkValidationCacheCreateFlagsEXT")
        public int flags() { return VkValidationCacheCreateInfoEXT.nflags(address()); }
        /** @return the value of the {@link VkValidationCacheCreateInfoEXT#initialDataSize} field. */
        @NativeType("size_t")
        public long initialDataSize() { return VkValidationCacheCreateInfoEXT.ninitialDataSize(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@link VkValidationCacheCreateInfoEXT#pInitialData} field. */
        @Nullable
        @NativeType("void const *")
        public ByteBuffer pInitialData() { return VkValidationCacheCreateInfoEXT.npInitialData(address()); }

        /** Sets the specified value to the {@link VkValidationCacheCreateInfoEXT#sType} field. */
        public VkValidationCacheCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkValidationCacheCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTValidationCache#VK_STRUCTURE_TYPE_VALIDATION_CACHE_CREATE_INFO_EXT STRUCTURE_TYPE_VALIDATION_CACHE_CREATE_INFO_EXT} value to the {@link VkValidationCacheCreateInfoEXT#sType} field. */
        public VkValidationCacheCreateInfoEXT.Buffer sType$Default() { return sType(EXTValidationCache.VK_STRUCTURE_TYPE_VALIDATION_CACHE_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@link VkValidationCacheCreateInfoEXT#pNext} field. */
        public VkValidationCacheCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkValidationCacheCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkValidationCacheCreateInfoEXT#flags} field. */
        public VkValidationCacheCreateInfoEXT.Buffer flags(@NativeType("VkValidationCacheCreateFlagsEXT") int value) { VkValidationCacheCreateInfoEXT.nflags(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@link VkValidationCacheCreateInfoEXT#pInitialData} field. */
        public VkValidationCacheCreateInfoEXT.Buffer pInitialData(@Nullable @NativeType("void const *") ByteBuffer value) { VkValidationCacheCreateInfoEXT.npInitialData(address(), value); return this; }

    }

}