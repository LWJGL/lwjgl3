/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.vma;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Set of callbacks that the library will call for {@code vkAllocateMemory} and {@code vkFreeMemory}.
 * 
 * <p>Provided for informative purpose, e.g. to gather statistics about number of allocations or total amount of memory allocated in Vulkan.</p>
 * 
 * <p>Used in {@link VmaAllocatorCreateInfo}{@code ::pDeviceMemoryCallbacks}.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VmaDeviceMemoryCallbacks {
 *     {@link VmaAllocateDeviceMemoryFunctionI PFN_vmaAllocateDeviceMemoryFunction} pfnAllocate;
 *     {@link VmaFreeDeviceMemoryFunctionI PFN_vmaFreeDeviceMemoryFunction} pfnFree;
 *     void * pUserData;
 * }</code></pre>
 */
public class VmaDeviceMemoryCallbacks extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PFNALLOCATE,
        PFNFREE,
        PUSERDATA;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PFNALLOCATE = layout.offsetof(0);
        PFNFREE = layout.offsetof(1);
        PUSERDATA = layout.offsetof(2);
    }

    /**
     * Creates a {@code VmaDeviceMemoryCallbacks} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VmaDeviceMemoryCallbacks(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code pfnAllocate} field. */
    @Nullable
    @NativeType("PFN_vmaAllocateDeviceMemoryFunction")
    public VmaAllocateDeviceMemoryFunction pfnAllocate() { return npfnAllocate(address()); }
    /** @return the value of the {@code pfnFree} field. */
    @Nullable
    @NativeType("PFN_vmaFreeDeviceMemoryFunction")
    public VmaFreeDeviceMemoryFunction pfnFree() { return npfnFree(address()); }
    /** @return the value of the {@code pUserData} field. */
    @NativeType("void *")
    public long pUserData() { return npUserData(address()); }

    /** Sets the specified value to the {@code pfnAllocate} field. */
    public VmaDeviceMemoryCallbacks pfnAllocate(@Nullable @NativeType("PFN_vmaAllocateDeviceMemoryFunction") VmaAllocateDeviceMemoryFunctionI value) { npfnAllocate(address(), value); return this; }
    /** Sets the specified value to the {@code pfnFree} field. */
    public VmaDeviceMemoryCallbacks pfnFree(@Nullable @NativeType("PFN_vmaFreeDeviceMemoryFunction") VmaFreeDeviceMemoryFunctionI value) { npfnFree(address(), value); return this; }
    /** Sets the specified value to the {@code pUserData} field. */
    public VmaDeviceMemoryCallbacks pUserData(@NativeType("void *") long value) { npUserData(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VmaDeviceMemoryCallbacks set(
        VmaAllocateDeviceMemoryFunctionI pfnAllocate,
        VmaFreeDeviceMemoryFunctionI pfnFree,
        long pUserData
    ) {
        pfnAllocate(pfnAllocate);
        pfnFree(pfnFree);
        pUserData(pUserData);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VmaDeviceMemoryCallbacks set(VmaDeviceMemoryCallbacks src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VmaDeviceMemoryCallbacks} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VmaDeviceMemoryCallbacks malloc() {
        return wrap(VmaDeviceMemoryCallbacks.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VmaDeviceMemoryCallbacks} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VmaDeviceMemoryCallbacks calloc() {
        return wrap(VmaDeviceMemoryCallbacks.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VmaDeviceMemoryCallbacks} instance allocated with {@link BufferUtils}. */
    public static VmaDeviceMemoryCallbacks create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VmaDeviceMemoryCallbacks.class, memAddress(container), container);
    }

    /** Returns a new {@code VmaDeviceMemoryCallbacks} instance for the specified memory address. */
    public static VmaDeviceMemoryCallbacks create(long address) {
        return wrap(VmaDeviceMemoryCallbacks.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VmaDeviceMemoryCallbacks createSafe(long address) {
        return address == NULL ? null : wrap(VmaDeviceMemoryCallbacks.class, address);
    }

    /**
     * Returns a new {@link VmaDeviceMemoryCallbacks.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaDeviceMemoryCallbacks.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VmaDeviceMemoryCallbacks.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaDeviceMemoryCallbacks.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaDeviceMemoryCallbacks.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VmaDeviceMemoryCallbacks.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VmaDeviceMemoryCallbacks.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VmaDeviceMemoryCallbacks.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VmaDeviceMemoryCallbacks.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VmaDeviceMemoryCallbacks mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VmaDeviceMemoryCallbacks callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VmaDeviceMemoryCallbacks mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VmaDeviceMemoryCallbacks callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VmaDeviceMemoryCallbacks.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VmaDeviceMemoryCallbacks.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VmaDeviceMemoryCallbacks.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VmaDeviceMemoryCallbacks.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VmaDeviceMemoryCallbacks} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaDeviceMemoryCallbacks malloc(MemoryStack stack) {
        return wrap(VmaDeviceMemoryCallbacks.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VmaDeviceMemoryCallbacks} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaDeviceMemoryCallbacks calloc(MemoryStack stack) {
        return wrap(VmaDeviceMemoryCallbacks.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VmaDeviceMemoryCallbacks.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaDeviceMemoryCallbacks.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaDeviceMemoryCallbacks.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaDeviceMemoryCallbacks.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #pfnAllocate}. */
    @Nullable public static VmaAllocateDeviceMemoryFunction npfnAllocate(long struct) { return VmaAllocateDeviceMemoryFunction.createSafe(memGetAddress(struct + VmaDeviceMemoryCallbacks.PFNALLOCATE)); }
    /** Unsafe version of {@link #pfnFree}. */
    @Nullable public static VmaFreeDeviceMemoryFunction npfnFree(long struct) { return VmaFreeDeviceMemoryFunction.createSafe(memGetAddress(struct + VmaDeviceMemoryCallbacks.PFNFREE)); }
    /** Unsafe version of {@link #pUserData}. */
    public static long npUserData(long struct) { return memGetAddress(struct + VmaDeviceMemoryCallbacks.PUSERDATA); }

    /** Unsafe version of {@link #pfnAllocate(VmaAllocateDeviceMemoryFunctionI) pfnAllocate}. */
    public static void npfnAllocate(long struct, @Nullable VmaAllocateDeviceMemoryFunctionI value) { memPutAddress(struct + VmaDeviceMemoryCallbacks.PFNALLOCATE, memAddressSafe(value)); }
    /** Unsafe version of {@link #pfnFree(VmaFreeDeviceMemoryFunctionI) pfnFree}. */
    public static void npfnFree(long struct, @Nullable VmaFreeDeviceMemoryFunctionI value) { memPutAddress(struct + VmaDeviceMemoryCallbacks.PFNFREE, memAddressSafe(value)); }
    /** Unsafe version of {@link #pUserData(long) pUserData}. */
    public static void npUserData(long struct, long value) { memPutAddress(struct + VmaDeviceMemoryCallbacks.PUSERDATA, value); }

    // -----------------------------------

    /** An array of {@link VmaDeviceMemoryCallbacks} structs. */
    public static class Buffer extends StructBuffer<VmaDeviceMemoryCallbacks, Buffer> implements NativeResource {

        private static final VmaDeviceMemoryCallbacks ELEMENT_FACTORY = VmaDeviceMemoryCallbacks.create(-1L);

        /**
         * Creates a new {@code VmaDeviceMemoryCallbacks.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VmaDeviceMemoryCallbacks#SIZEOF}, and its mark will be undefined.
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
        protected VmaDeviceMemoryCallbacks getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code pfnAllocate} field. */
        @Nullable
        @NativeType("PFN_vmaAllocateDeviceMemoryFunction")
        public VmaAllocateDeviceMemoryFunction pfnAllocate() { return VmaDeviceMemoryCallbacks.npfnAllocate(address()); }
        /** @return the value of the {@code pfnFree} field. */
        @Nullable
        @NativeType("PFN_vmaFreeDeviceMemoryFunction")
        public VmaFreeDeviceMemoryFunction pfnFree() { return VmaDeviceMemoryCallbacks.npfnFree(address()); }
        /** @return the value of the {@code pUserData} field. */
        @NativeType("void *")
        public long pUserData() { return VmaDeviceMemoryCallbacks.npUserData(address()); }

        /** Sets the specified value to the {@code pfnAllocate} field. */
        public VmaDeviceMemoryCallbacks.Buffer pfnAllocate(@Nullable @NativeType("PFN_vmaAllocateDeviceMemoryFunction") VmaAllocateDeviceMemoryFunctionI value) { VmaDeviceMemoryCallbacks.npfnAllocate(address(), value); return this; }
        /** Sets the specified value to the {@code pfnFree} field. */
        public VmaDeviceMemoryCallbacks.Buffer pfnFree(@Nullable @NativeType("PFN_vmaFreeDeviceMemoryFunction") VmaFreeDeviceMemoryFunctionI value) { VmaDeviceMemoryCallbacks.npfnFree(address(), value); return this; }
        /** Sets the specified value to the {@code pUserData} field. */
        public VmaDeviceMemoryCallbacks.Buffer pUserData(@NativeType("void *") long value) { VmaDeviceMemoryCallbacks.npUserData(address(), value); return this; }

    }

}