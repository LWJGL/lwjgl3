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
 * Acquire a configuration to capture performance data.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link INTELPerformanceQuery#VK_STRUCTURE_TYPE_PERFORMANCE_CONFIGURATION_ACQUIRE_INFO_INTEL STRUCTURE_TYPE_PERFORMANCE_CONFIGURATION_ACQUIRE_INFO_INTEL}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code type} <b>must</b> be a valid {@code VkPerformanceConfigurationTypeINTEL} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link INTELPerformanceQuery#vkAcquirePerformanceConfigurationINTEL AcquirePerformanceConfigurationINTEL}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPerformanceConfigurationAcquireInfoINTEL {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkPerformanceConfigurationTypeINTEL {@link #type};
 * }</code></pre>
 */
public class VkPerformanceConfigurationAcquireInfoINTEL extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        TYPE;

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
        TYPE = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPerformanceConfigurationAcquireInfoINTEL} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPerformanceConfigurationAcquireInfoINTEL(ByteBuffer container) {
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
    /** one of the {@code VkPerformanceConfigurationTypeINTEL} type of performance configuration that will be acquired. */
    @NativeType("VkPerformanceConfigurationTypeINTEL")
    public int type() { return ntype(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPerformanceConfigurationAcquireInfoINTEL sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link INTELPerformanceQuery#VK_STRUCTURE_TYPE_PERFORMANCE_CONFIGURATION_ACQUIRE_INFO_INTEL STRUCTURE_TYPE_PERFORMANCE_CONFIGURATION_ACQUIRE_INFO_INTEL} value to the {@link #sType} field. */
    public VkPerformanceConfigurationAcquireInfoINTEL sType$Default() { return sType(INTELPerformanceQuery.VK_STRUCTURE_TYPE_PERFORMANCE_CONFIGURATION_ACQUIRE_INFO_INTEL); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPerformanceConfigurationAcquireInfoINTEL pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #type} field. */
    public VkPerformanceConfigurationAcquireInfoINTEL type(@NativeType("VkPerformanceConfigurationTypeINTEL") int value) { ntype(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPerformanceConfigurationAcquireInfoINTEL set(
        int sType,
        long pNext,
        int type
    ) {
        sType(sType);
        pNext(pNext);
        type(type);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPerformanceConfigurationAcquireInfoINTEL set(VkPerformanceConfigurationAcquireInfoINTEL src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPerformanceConfigurationAcquireInfoINTEL} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPerformanceConfigurationAcquireInfoINTEL malloc() {
        return wrap(VkPerformanceConfigurationAcquireInfoINTEL.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPerformanceConfigurationAcquireInfoINTEL} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPerformanceConfigurationAcquireInfoINTEL calloc() {
        return wrap(VkPerformanceConfigurationAcquireInfoINTEL.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPerformanceConfigurationAcquireInfoINTEL} instance allocated with {@link BufferUtils}. */
    public static VkPerformanceConfigurationAcquireInfoINTEL create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPerformanceConfigurationAcquireInfoINTEL.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPerformanceConfigurationAcquireInfoINTEL} instance for the specified memory address. */
    public static VkPerformanceConfigurationAcquireInfoINTEL create(long address) {
        return wrap(VkPerformanceConfigurationAcquireInfoINTEL.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPerformanceConfigurationAcquireInfoINTEL createSafe(long address) {
        return address == NULL ? null : wrap(VkPerformanceConfigurationAcquireInfoINTEL.class, address);
    }

    /**
     * Returns a new {@link VkPerformanceConfigurationAcquireInfoINTEL.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPerformanceConfigurationAcquireInfoINTEL.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPerformanceConfigurationAcquireInfoINTEL.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPerformanceConfigurationAcquireInfoINTEL.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPerformanceConfigurationAcquireInfoINTEL.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPerformanceConfigurationAcquireInfoINTEL.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPerformanceConfigurationAcquireInfoINTEL.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPerformanceConfigurationAcquireInfoINTEL.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPerformanceConfigurationAcquireInfoINTEL.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPerformanceConfigurationAcquireInfoINTEL mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPerformanceConfigurationAcquireInfoINTEL callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPerformanceConfigurationAcquireInfoINTEL mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPerformanceConfigurationAcquireInfoINTEL callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPerformanceConfigurationAcquireInfoINTEL.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPerformanceConfigurationAcquireInfoINTEL.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPerformanceConfigurationAcquireInfoINTEL.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPerformanceConfigurationAcquireInfoINTEL.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPerformanceConfigurationAcquireInfoINTEL} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPerformanceConfigurationAcquireInfoINTEL malloc(MemoryStack stack) {
        return wrap(VkPerformanceConfigurationAcquireInfoINTEL.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPerformanceConfigurationAcquireInfoINTEL} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPerformanceConfigurationAcquireInfoINTEL calloc(MemoryStack stack) {
        return wrap(VkPerformanceConfigurationAcquireInfoINTEL.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPerformanceConfigurationAcquireInfoINTEL.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPerformanceConfigurationAcquireInfoINTEL.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPerformanceConfigurationAcquireInfoINTEL.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPerformanceConfigurationAcquireInfoINTEL.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPerformanceConfigurationAcquireInfoINTEL.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPerformanceConfigurationAcquireInfoINTEL.PNEXT); }
    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + VkPerformanceConfigurationAcquireInfoINTEL.TYPE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPerformanceConfigurationAcquireInfoINTEL.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPerformanceConfigurationAcquireInfoINTEL.PNEXT, value); }
    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + VkPerformanceConfigurationAcquireInfoINTEL.TYPE, value); }

    // -----------------------------------

    /** An array of {@link VkPerformanceConfigurationAcquireInfoINTEL} structs. */
    public static class Buffer extends StructBuffer<VkPerformanceConfigurationAcquireInfoINTEL, Buffer> implements NativeResource {

        private static final VkPerformanceConfigurationAcquireInfoINTEL ELEMENT_FACTORY = VkPerformanceConfigurationAcquireInfoINTEL.create(-1L);

        /**
         * Creates a new {@code VkPerformanceConfigurationAcquireInfoINTEL.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPerformanceConfigurationAcquireInfoINTEL#SIZEOF}, and its mark will be undefined.
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
        protected VkPerformanceConfigurationAcquireInfoINTEL getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPerformanceConfigurationAcquireInfoINTEL#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPerformanceConfigurationAcquireInfoINTEL.nsType(address()); }
        /** @return the value of the {@link VkPerformanceConfigurationAcquireInfoINTEL#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPerformanceConfigurationAcquireInfoINTEL.npNext(address()); }
        /** @return the value of the {@link VkPerformanceConfigurationAcquireInfoINTEL#type} field. */
        @NativeType("VkPerformanceConfigurationTypeINTEL")
        public int type() { return VkPerformanceConfigurationAcquireInfoINTEL.ntype(address()); }

        /** Sets the specified value to the {@link VkPerformanceConfigurationAcquireInfoINTEL#sType} field. */
        public VkPerformanceConfigurationAcquireInfoINTEL.Buffer sType(@NativeType("VkStructureType") int value) { VkPerformanceConfigurationAcquireInfoINTEL.nsType(address(), value); return this; }
        /** Sets the {@link INTELPerformanceQuery#VK_STRUCTURE_TYPE_PERFORMANCE_CONFIGURATION_ACQUIRE_INFO_INTEL STRUCTURE_TYPE_PERFORMANCE_CONFIGURATION_ACQUIRE_INFO_INTEL} value to the {@link VkPerformanceConfigurationAcquireInfoINTEL#sType} field. */
        public VkPerformanceConfigurationAcquireInfoINTEL.Buffer sType$Default() { return sType(INTELPerformanceQuery.VK_STRUCTURE_TYPE_PERFORMANCE_CONFIGURATION_ACQUIRE_INFO_INTEL); }
        /** Sets the specified value to the {@link VkPerformanceConfigurationAcquireInfoINTEL#pNext} field. */
        public VkPerformanceConfigurationAcquireInfoINTEL.Buffer pNext(@NativeType("void const *") long value) { VkPerformanceConfigurationAcquireInfoINTEL.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPerformanceConfigurationAcquireInfoINTEL#type} field. */
        public VkPerformanceConfigurationAcquireInfoINTEL.Buffer type(@NativeType("VkPerformanceConfigurationTypeINTEL") int value) { VkPerformanceConfigurationAcquireInfoINTEL.ntype(address(), value); return this; }

    }

}