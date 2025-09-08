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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre><code>
 * struct VkAllocationCallbacks {
 *     void * pUserData;
 *     {@link VkAllocationFunctionI PFN_vkAllocationFunction} pfnAllocation;
 *     {@link VkReallocationFunctionI PFN_vkReallocationFunction} pfnReallocation;
 *     {@link VkFreeFunctionI PFN_vkFreeFunction} pfnFree;
 *     {@link VkInternalAllocationNotificationI PFN_vkInternalAllocationNotification} pfnInternalAllocation;
 *     {@link VkInternalFreeNotificationI PFN_vkInternalFreeNotification} pfnInternalFree;
 * }</code></pre>
 */
public class VkAllocationCallbacks extends Struct<VkAllocationCallbacks> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PUSERDATA,
        PFNALLOCATION,
        PFNREALLOCATION,
        PFNFREE,
        PFNINTERNALALLOCATION,
        PFNINTERNALFREE;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PUSERDATA = layout.offsetof(0);
        PFNALLOCATION = layout.offsetof(1);
        PFNREALLOCATION = layout.offsetof(2);
        PFNFREE = layout.offsetof(3);
        PFNINTERNALALLOCATION = layout.offsetof(4);
        PFNINTERNALFREE = layout.offsetof(5);
    }

    protected VkAllocationCallbacks(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkAllocationCallbacks create(long address, @Nullable ByteBuffer container) {
        return new VkAllocationCallbacks(address, container);
    }

    /**
     * Creates a {@code VkAllocationCallbacks} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAllocationCallbacks(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code pUserData} field. */
    @NativeType("void *")
    public long pUserData() { return npUserData(address()); }
    /** @return the value of the {@code pfnAllocation} field. */
    @NativeType("PFN_vkAllocationFunction")
    public @Nullable VkAllocationFunction pfnAllocation() { return npfnAllocation(address()); }
    /** @return the value of the {@code pfnReallocation} field. */
    @NativeType("PFN_vkReallocationFunction")
    public @Nullable VkReallocationFunction pfnReallocation() { return npfnReallocation(address()); }
    /** @return the value of the {@code pfnFree} field. */
    @NativeType("PFN_vkFreeFunction")
    public @Nullable VkFreeFunction pfnFree() { return npfnFree(address()); }
    /** @return the value of the {@code pfnInternalAllocation} field. */
    @NativeType("PFN_vkInternalAllocationNotification")
    public @Nullable VkInternalAllocationNotification pfnInternalAllocation() { return npfnInternalAllocation(address()); }
    /** @return the value of the {@code pfnInternalFree} field. */
    @NativeType("PFN_vkInternalFreeNotification")
    public @Nullable VkInternalFreeNotification pfnInternalFree() { return npfnInternalFree(address()); }

    /** Sets the specified value to the {@code pUserData} field. */
    public VkAllocationCallbacks pUserData(@NativeType("void *") long value) { npUserData(address(), value); return this; }
    /** Sets the specified value to the {@code pfnAllocation} field. */
    public VkAllocationCallbacks pfnAllocation(@Nullable @NativeType("PFN_vkAllocationFunction") VkAllocationFunctionI value) { npfnAllocation(address(), value); return this; }
    /** Sets the specified value to the {@code pfnReallocation} field. */
    public VkAllocationCallbacks pfnReallocation(@Nullable @NativeType("PFN_vkReallocationFunction") VkReallocationFunctionI value) { npfnReallocation(address(), value); return this; }
    /** Sets the specified value to the {@code pfnFree} field. */
    public VkAllocationCallbacks pfnFree(@Nullable @NativeType("PFN_vkFreeFunction") VkFreeFunctionI value) { npfnFree(address(), value); return this; }
    /** Sets the specified value to the {@code pfnInternalAllocation} field. */
    public VkAllocationCallbacks pfnInternalAllocation(@Nullable @NativeType("PFN_vkInternalAllocationNotification") VkInternalAllocationNotificationI value) { npfnInternalAllocation(address(), value); return this; }
    /** Sets the specified value to the {@code pfnInternalFree} field. */
    public VkAllocationCallbacks pfnInternalFree(@Nullable @NativeType("PFN_vkInternalFreeNotification") VkInternalFreeNotificationI value) { npfnInternalFree(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkAllocationCallbacks set(
        long pUserData,
        VkAllocationFunctionI pfnAllocation,
        VkReallocationFunctionI pfnReallocation,
        VkFreeFunctionI pfnFree,
        VkInternalAllocationNotificationI pfnInternalAllocation,
        VkInternalFreeNotificationI pfnInternalFree
    ) {
        pUserData(pUserData);
        pfnAllocation(pfnAllocation);
        pfnReallocation(pfnReallocation);
        pfnFree(pfnFree);
        pfnInternalAllocation(pfnInternalAllocation);
        pfnInternalFree(pfnInternalFree);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAllocationCallbacks set(VkAllocationCallbacks src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAllocationCallbacks} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAllocationCallbacks malloc() {
        return new VkAllocationCallbacks(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkAllocationCallbacks} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAllocationCallbacks calloc() {
        return new VkAllocationCallbacks(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkAllocationCallbacks} instance allocated with {@link BufferUtils}. */
    public static VkAllocationCallbacks create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAllocationCallbacks(memAddress(container), container);
    }

    /** Returns a new {@code VkAllocationCallbacks} instance for the specified memory address. */
    public static VkAllocationCallbacks create(long address) {
        return new VkAllocationCallbacks(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkAllocationCallbacks createSafe(long address) {
        return address == NULL ? null : new VkAllocationCallbacks(address, null);
    }

    /**
     * Returns a new {@link VkAllocationCallbacks.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAllocationCallbacks.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAllocationCallbacks.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAllocationCallbacks.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAllocationCallbacks.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAllocationCallbacks.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkAllocationCallbacks.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAllocationCallbacks.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkAllocationCallbacks.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkAllocationCallbacks mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkAllocationCallbacks callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkAllocationCallbacks mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkAllocationCallbacks callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkAllocationCallbacks.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkAllocationCallbacks.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkAllocationCallbacks.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkAllocationCallbacks.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkAllocationCallbacks} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAllocationCallbacks malloc(MemoryStack stack) {
        return new VkAllocationCallbacks(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkAllocationCallbacks} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAllocationCallbacks calloc(MemoryStack stack) {
        return new VkAllocationCallbacks(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkAllocationCallbacks.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAllocationCallbacks.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAllocationCallbacks.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAllocationCallbacks.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #pUserData}. */
    public static long npUserData(long struct) { return memGetAddress(struct + VkAllocationCallbacks.PUSERDATA); }
    /** Unsafe version of {@link #pfnAllocation}. */
    public static @Nullable VkAllocationFunction npfnAllocation(long struct) { return VkAllocationFunction.createSafe(memGetAddress(struct + VkAllocationCallbacks.PFNALLOCATION)); }
    /** Unsafe version of {@link #pfnReallocation}. */
    public static @Nullable VkReallocationFunction npfnReallocation(long struct) { return VkReallocationFunction.createSafe(memGetAddress(struct + VkAllocationCallbacks.PFNREALLOCATION)); }
    /** Unsafe version of {@link #pfnFree}. */
    public static @Nullable VkFreeFunction npfnFree(long struct) { return VkFreeFunction.createSafe(memGetAddress(struct + VkAllocationCallbacks.PFNFREE)); }
    /** Unsafe version of {@link #pfnInternalAllocation}. */
    public static @Nullable VkInternalAllocationNotification npfnInternalAllocation(long struct) { return VkInternalAllocationNotification.createSafe(memGetAddress(struct + VkAllocationCallbacks.PFNINTERNALALLOCATION)); }
    /** Unsafe version of {@link #pfnInternalFree}. */
    public static @Nullable VkInternalFreeNotification npfnInternalFree(long struct) { return VkInternalFreeNotification.createSafe(memGetAddress(struct + VkAllocationCallbacks.PFNINTERNALFREE)); }

    /** Unsafe version of {@link #pUserData(long) pUserData}. */
    public static void npUserData(long struct, long value) { memPutAddress(struct + VkAllocationCallbacks.PUSERDATA, value); }
    /** Unsafe version of {@link #pfnAllocation(VkAllocationFunctionI) pfnAllocation}. */
    public static void npfnAllocation(long struct, @Nullable VkAllocationFunctionI value) { memPutAddress(struct + VkAllocationCallbacks.PFNALLOCATION, memAddressSafe(value)); }
    /** Unsafe version of {@link #pfnReallocation(VkReallocationFunctionI) pfnReallocation}. */
    public static void npfnReallocation(long struct, @Nullable VkReallocationFunctionI value) { memPutAddress(struct + VkAllocationCallbacks.PFNREALLOCATION, memAddressSafe(value)); }
    /** Unsafe version of {@link #pfnFree(VkFreeFunctionI) pfnFree}. */
    public static void npfnFree(long struct, @Nullable VkFreeFunctionI value) { memPutAddress(struct + VkAllocationCallbacks.PFNFREE, memAddressSafe(value)); }
    /** Unsafe version of {@link #pfnInternalAllocation(VkInternalAllocationNotificationI) pfnInternalAllocation}. */
    public static void npfnInternalAllocation(long struct, @Nullable VkInternalAllocationNotificationI value) { memPutAddress(struct + VkAllocationCallbacks.PFNINTERNALALLOCATION, memAddressSafe(value)); }
    /** Unsafe version of {@link #pfnInternalFree(VkInternalFreeNotificationI) pfnInternalFree}. */
    public static void npfnInternalFree(long struct, @Nullable VkInternalFreeNotificationI value) { memPutAddress(struct + VkAllocationCallbacks.PFNINTERNALFREE, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link VkAllocationCallbacks} structs. */
    public static class Buffer extends StructBuffer<VkAllocationCallbacks, Buffer> implements NativeResource {

        private static final VkAllocationCallbacks ELEMENT_FACTORY = VkAllocationCallbacks.create(-1L);

        /**
         * Creates a new {@code VkAllocationCallbacks.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAllocationCallbacks#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkAllocationCallbacks getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code pUserData} field. */
        @NativeType("void *")
        public long pUserData() { return VkAllocationCallbacks.npUserData(address()); }
        /** @return the value of the {@code pfnAllocation} field. */
        @NativeType("PFN_vkAllocationFunction")
        public @Nullable VkAllocationFunction pfnAllocation() { return VkAllocationCallbacks.npfnAllocation(address()); }
        /** @return the value of the {@code pfnReallocation} field. */
        @NativeType("PFN_vkReallocationFunction")
        public @Nullable VkReallocationFunction pfnReallocation() { return VkAllocationCallbacks.npfnReallocation(address()); }
        /** @return the value of the {@code pfnFree} field. */
        @NativeType("PFN_vkFreeFunction")
        public @Nullable VkFreeFunction pfnFree() { return VkAllocationCallbacks.npfnFree(address()); }
        /** @return the value of the {@code pfnInternalAllocation} field. */
        @NativeType("PFN_vkInternalAllocationNotification")
        public @Nullable VkInternalAllocationNotification pfnInternalAllocation() { return VkAllocationCallbacks.npfnInternalAllocation(address()); }
        /** @return the value of the {@code pfnInternalFree} field. */
        @NativeType("PFN_vkInternalFreeNotification")
        public @Nullable VkInternalFreeNotification pfnInternalFree() { return VkAllocationCallbacks.npfnInternalFree(address()); }

        /** Sets the specified value to the {@code pUserData} field. */
        public VkAllocationCallbacks.Buffer pUserData(@NativeType("void *") long value) { VkAllocationCallbacks.npUserData(address(), value); return this; }
        /** Sets the specified value to the {@code pfnAllocation} field. */
        public VkAllocationCallbacks.Buffer pfnAllocation(@Nullable @NativeType("PFN_vkAllocationFunction") VkAllocationFunctionI value) { VkAllocationCallbacks.npfnAllocation(address(), value); return this; }
        /** Sets the specified value to the {@code pfnReallocation} field. */
        public VkAllocationCallbacks.Buffer pfnReallocation(@Nullable @NativeType("PFN_vkReallocationFunction") VkReallocationFunctionI value) { VkAllocationCallbacks.npfnReallocation(address(), value); return this; }
        /** Sets the specified value to the {@code pfnFree} field. */
        public VkAllocationCallbacks.Buffer pfnFree(@Nullable @NativeType("PFN_vkFreeFunction") VkFreeFunctionI value) { VkAllocationCallbacks.npfnFree(address(), value); return this; }
        /** Sets the specified value to the {@code pfnInternalAllocation} field. */
        public VkAllocationCallbacks.Buffer pfnInternalAllocation(@Nullable @NativeType("PFN_vkInternalAllocationNotification") VkInternalAllocationNotificationI value) { VkAllocationCallbacks.npfnInternalAllocation(address(), value); return this; }
        /** Sets the specified value to the {@code pfnInternalFree} field. */
        public VkAllocationCallbacks.Buffer pfnInternalFree(@Nullable @NativeType("PFN_vkInternalFreeNotification") VkInternalFreeNotificationI value) { VkAllocationCallbacks.npfnInternalFree(address(), value); return this; }

    }

}