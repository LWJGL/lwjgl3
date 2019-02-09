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
 * Specify that a buffer is bound to a dedicated memory resource.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVDedicatedAllocation#VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_BUFFER_CREATE_INFO_NV STRUCTURE_TYPE_DEDICATED_ALLOCATION_BUFFER_CREATE_INFO_NV}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code dedicatedAllocation} &ndash; specifies whether the buffer will have a dedicated allocation bound to it.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDedicatedAllocationBufferCreateInfoNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkBool32 dedicatedAllocation;
 * }</code></pre>
 */
public class VkDedicatedAllocationBufferCreateInfoNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DEDICATEDALLOCATION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DEDICATEDALLOCATION = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkDedicatedAllocationBufferCreateInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDedicatedAllocationBufferCreateInfoNV(ByteBuffer container) {
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
    /** Returns the value of the {@code dedicatedAllocation} field. */
    @NativeType("VkBool32")
    public boolean dedicatedAllocation() { return ndedicatedAllocation(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkDedicatedAllocationBufferCreateInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDedicatedAllocationBufferCreateInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code dedicatedAllocation} field. */
    public VkDedicatedAllocationBufferCreateInfoNV dedicatedAllocation(@NativeType("VkBool32") boolean value) { ndedicatedAllocation(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkDedicatedAllocationBufferCreateInfoNV set(
        int sType,
        long pNext,
        boolean dedicatedAllocation
    ) {
        sType(sType);
        pNext(pNext);
        dedicatedAllocation(dedicatedAllocation);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDedicatedAllocationBufferCreateInfoNV set(VkDedicatedAllocationBufferCreateInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDedicatedAllocationBufferCreateInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDedicatedAllocationBufferCreateInfoNV malloc() {
        return wrap(VkDedicatedAllocationBufferCreateInfoNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDedicatedAllocationBufferCreateInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDedicatedAllocationBufferCreateInfoNV calloc() {
        return wrap(VkDedicatedAllocationBufferCreateInfoNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDedicatedAllocationBufferCreateInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkDedicatedAllocationBufferCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDedicatedAllocationBufferCreateInfoNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDedicatedAllocationBufferCreateInfoNV} instance for the specified memory address. */
    public static VkDedicatedAllocationBufferCreateInfoNV create(long address) {
        return wrap(VkDedicatedAllocationBufferCreateInfoNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDedicatedAllocationBufferCreateInfoNV createSafe(long address) {
        return address == NULL ? null : wrap(VkDedicatedAllocationBufferCreateInfoNV.class, address);
    }

    /**
     * Returns a new {@link VkDedicatedAllocationBufferCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDedicatedAllocationBufferCreateInfoNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDedicatedAllocationBufferCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDedicatedAllocationBufferCreateInfoNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDedicatedAllocationBufferCreateInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDedicatedAllocationBufferCreateInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDedicatedAllocationBufferCreateInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDedicatedAllocationBufferCreateInfoNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDedicatedAllocationBufferCreateInfoNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkDedicatedAllocationBufferCreateInfoNV} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkDedicatedAllocationBufferCreateInfoNV mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkDedicatedAllocationBufferCreateInfoNV} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkDedicatedAllocationBufferCreateInfoNV callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkDedicatedAllocationBufferCreateInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDedicatedAllocationBufferCreateInfoNV mallocStack(MemoryStack stack) {
        return wrap(VkDedicatedAllocationBufferCreateInfoNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDedicatedAllocationBufferCreateInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDedicatedAllocationBufferCreateInfoNV callocStack(MemoryStack stack) {
        return wrap(VkDedicatedAllocationBufferCreateInfoNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDedicatedAllocationBufferCreateInfoNV.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDedicatedAllocationBufferCreateInfoNV.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDedicatedAllocationBufferCreateInfoNV.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkDedicatedAllocationBufferCreateInfoNV.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDedicatedAllocationBufferCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDedicatedAllocationBufferCreateInfoNV.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDedicatedAllocationBufferCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDedicatedAllocationBufferCreateInfoNV.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDedicatedAllocationBufferCreateInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDedicatedAllocationBufferCreateInfoNV.PNEXT); }
    /** Unsafe version of {@link #dedicatedAllocation}. */
    public static int ndedicatedAllocation(long struct) { return UNSAFE.getInt(null, struct + VkDedicatedAllocationBufferCreateInfoNV.DEDICATEDALLOCATION); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDedicatedAllocationBufferCreateInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDedicatedAllocationBufferCreateInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #dedicatedAllocation(boolean) dedicatedAllocation}. */
    public static void ndedicatedAllocation(long struct, int value) { UNSAFE.putInt(null, struct + VkDedicatedAllocationBufferCreateInfoNV.DEDICATEDALLOCATION, value); }

    // -----------------------------------

    /** An array of {@link VkDedicatedAllocationBufferCreateInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkDedicatedAllocationBufferCreateInfoNV, Buffer> implements NativeResource {

        private static final VkDedicatedAllocationBufferCreateInfoNV ELEMENT_FACTORY = VkDedicatedAllocationBufferCreateInfoNV.create(-1L);

        /**
         * Creates a new {@code VkDedicatedAllocationBufferCreateInfoNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDedicatedAllocationBufferCreateInfoNV#SIZEOF}, and its mark will be undefined.
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
        protected VkDedicatedAllocationBufferCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDedicatedAllocationBufferCreateInfoNV.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDedicatedAllocationBufferCreateInfoNV.npNext(address()); }
        /** Returns the value of the {@code dedicatedAllocation} field. */
        @NativeType("VkBool32")
        public boolean dedicatedAllocation() { return VkDedicatedAllocationBufferCreateInfoNV.ndedicatedAllocation(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkDedicatedAllocationBufferCreateInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkDedicatedAllocationBufferCreateInfoNV.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDedicatedAllocationBufferCreateInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkDedicatedAllocationBufferCreateInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code dedicatedAllocation} field. */
        public VkDedicatedAllocationBufferCreateInfoNV.Buffer dedicatedAllocation(@NativeType("VkBool32") boolean value) { VkDedicatedAllocationBufferCreateInfoNV.ndedicatedAllocation(address(), value ? 1 : 0); return this; }

    }

}