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
 * Structure specifying parameters of initialize of the device.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link INTELPerformanceQuery#VK_STRUCTURE_TYPE_INITIALIZE_PERFORMANCE_API_INFO_INTEL STRUCTURE_TYPE_INITIALIZE_PERFORMANCE_API_INFO_INTEL}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link INTELPerformanceQuery#vkInitializePerformanceApiINTEL InitializePerformanceApiINTEL}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkInitializePerformanceApiInfoINTEL {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     void * {@link #pUserData};
 * }</code></pre>
 */
public class VkInitializePerformanceApiInfoINTEL extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PUSERDATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PUSERDATA = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkInitializePerformanceApiInfoINTEL} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkInitializePerformanceApiInfoINTEL(ByteBuffer container) {
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
    /** a pointer for application data. */
    @NativeType("void *")
    public long pUserData() { return npUserData(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkInitializePerformanceApiInfoINTEL sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link INTELPerformanceQuery#VK_STRUCTURE_TYPE_INITIALIZE_PERFORMANCE_API_INFO_INTEL STRUCTURE_TYPE_INITIALIZE_PERFORMANCE_API_INFO_INTEL} value to the {@link #sType} field. */
    public VkInitializePerformanceApiInfoINTEL sType$Default() { return sType(INTELPerformanceQuery.VK_STRUCTURE_TYPE_INITIALIZE_PERFORMANCE_API_INFO_INTEL); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkInitializePerformanceApiInfoINTEL pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #pUserData} field. */
    public VkInitializePerformanceApiInfoINTEL pUserData(@NativeType("void *") long value) { npUserData(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkInitializePerformanceApiInfoINTEL set(
        int sType,
        long pNext,
        long pUserData
    ) {
        sType(sType);
        pNext(pNext);
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
    public VkInitializePerformanceApiInfoINTEL set(VkInitializePerformanceApiInfoINTEL src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkInitializePerformanceApiInfoINTEL} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkInitializePerformanceApiInfoINTEL malloc() {
        return wrap(VkInitializePerformanceApiInfoINTEL.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkInitializePerformanceApiInfoINTEL} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkInitializePerformanceApiInfoINTEL calloc() {
        return wrap(VkInitializePerformanceApiInfoINTEL.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkInitializePerformanceApiInfoINTEL} instance allocated with {@link BufferUtils}. */
    public static VkInitializePerformanceApiInfoINTEL create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkInitializePerformanceApiInfoINTEL.class, memAddress(container), container);
    }

    /** Returns a new {@code VkInitializePerformanceApiInfoINTEL} instance for the specified memory address. */
    public static VkInitializePerformanceApiInfoINTEL create(long address) {
        return wrap(VkInitializePerformanceApiInfoINTEL.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkInitializePerformanceApiInfoINTEL createSafe(long address) {
        return address == NULL ? null : wrap(VkInitializePerformanceApiInfoINTEL.class, address);
    }

    /**
     * Returns a new {@link VkInitializePerformanceApiInfoINTEL.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkInitializePerformanceApiInfoINTEL.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkInitializePerformanceApiInfoINTEL.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkInitializePerformanceApiInfoINTEL.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkInitializePerformanceApiInfoINTEL.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkInitializePerformanceApiInfoINTEL.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkInitializePerformanceApiInfoINTEL.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkInitializePerformanceApiInfoINTEL.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkInitializePerformanceApiInfoINTEL.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkInitializePerformanceApiInfoINTEL mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkInitializePerformanceApiInfoINTEL callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkInitializePerformanceApiInfoINTEL mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkInitializePerformanceApiInfoINTEL callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkInitializePerformanceApiInfoINTEL.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkInitializePerformanceApiInfoINTEL.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkInitializePerformanceApiInfoINTEL.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkInitializePerformanceApiInfoINTEL.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkInitializePerformanceApiInfoINTEL} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkInitializePerformanceApiInfoINTEL malloc(MemoryStack stack) {
        return wrap(VkInitializePerformanceApiInfoINTEL.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkInitializePerformanceApiInfoINTEL} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkInitializePerformanceApiInfoINTEL calloc(MemoryStack stack) {
        return wrap(VkInitializePerformanceApiInfoINTEL.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkInitializePerformanceApiInfoINTEL.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkInitializePerformanceApiInfoINTEL.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkInitializePerformanceApiInfoINTEL.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkInitializePerformanceApiInfoINTEL.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkInitializePerformanceApiInfoINTEL.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkInitializePerformanceApiInfoINTEL.PNEXT); }
    /** Unsafe version of {@link #pUserData}. */
    public static long npUserData(long struct) { return memGetAddress(struct + VkInitializePerformanceApiInfoINTEL.PUSERDATA); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkInitializePerformanceApiInfoINTEL.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkInitializePerformanceApiInfoINTEL.PNEXT, value); }
    /** Unsafe version of {@link #pUserData(long) pUserData}. */
    public static void npUserData(long struct, long value) { memPutAddress(struct + VkInitializePerformanceApiInfoINTEL.PUSERDATA, value); }

    // -----------------------------------

    /** An array of {@link VkInitializePerformanceApiInfoINTEL} structs. */
    public static class Buffer extends StructBuffer<VkInitializePerformanceApiInfoINTEL, Buffer> implements NativeResource {

        private static final VkInitializePerformanceApiInfoINTEL ELEMENT_FACTORY = VkInitializePerformanceApiInfoINTEL.create(-1L);

        /**
         * Creates a new {@code VkInitializePerformanceApiInfoINTEL.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkInitializePerformanceApiInfoINTEL#SIZEOF}, and its mark will be undefined.
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
        protected VkInitializePerformanceApiInfoINTEL getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkInitializePerformanceApiInfoINTEL#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkInitializePerformanceApiInfoINTEL.nsType(address()); }
        /** @return the value of the {@link VkInitializePerformanceApiInfoINTEL#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkInitializePerformanceApiInfoINTEL.npNext(address()); }
        /** @return the value of the {@link VkInitializePerformanceApiInfoINTEL#pUserData} field. */
        @NativeType("void *")
        public long pUserData() { return VkInitializePerformanceApiInfoINTEL.npUserData(address()); }

        /** Sets the specified value to the {@link VkInitializePerformanceApiInfoINTEL#sType} field. */
        public VkInitializePerformanceApiInfoINTEL.Buffer sType(@NativeType("VkStructureType") int value) { VkInitializePerformanceApiInfoINTEL.nsType(address(), value); return this; }
        /** Sets the {@link INTELPerformanceQuery#VK_STRUCTURE_TYPE_INITIALIZE_PERFORMANCE_API_INFO_INTEL STRUCTURE_TYPE_INITIALIZE_PERFORMANCE_API_INFO_INTEL} value to the {@link VkInitializePerformanceApiInfoINTEL#sType} field. */
        public VkInitializePerformanceApiInfoINTEL.Buffer sType$Default() { return sType(INTELPerformanceQuery.VK_STRUCTURE_TYPE_INITIALIZE_PERFORMANCE_API_INFO_INTEL); }
        /** Sets the specified value to the {@link VkInitializePerformanceApiInfoINTEL#pNext} field. */
        public VkInitializePerformanceApiInfoINTEL.Buffer pNext(@NativeType("void const *") long value) { VkInitializePerformanceApiInfoINTEL.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkInitializePerformanceApiInfoINTEL#pUserData} field. */
        public VkInitializePerformanceApiInfoINTEL.Buffer pUserData(@NativeType("void *") long value) { VkInitializePerformanceApiInfoINTEL.npUserData(address(), value); return this; }

    }

}