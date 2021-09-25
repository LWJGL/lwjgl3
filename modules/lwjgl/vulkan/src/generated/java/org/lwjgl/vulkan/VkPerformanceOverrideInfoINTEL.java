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
 * Performance override information.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link INTELPerformanceQuery#VK_STRUCTURE_TYPE_PERFORMANCE_OVERRIDE_INFO_INTEL STRUCTURE_TYPE_PERFORMANCE_OVERRIDE_INFO_INTEL}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code type} <b>must</b> be a valid {@code VkPerformanceOverrideTypeINTEL} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link INTELPerformanceQuery#vkCmdSetPerformanceOverrideINTEL CmdSetPerformanceOverrideINTEL}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPerformanceOverrideInfoINTEL {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkPerformanceOverrideTypeINTEL {@link #type};
 *     VkBool32 {@link #enable};
 *     uint64_t {@link #parameter};
 * }</code></pre>
 */
public class VkPerformanceOverrideInfoINTEL extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        TYPE,
        ENABLE,
        PARAMETER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TYPE = layout.offsetof(2);
        ENABLE = layout.offsetof(3);
        PARAMETER = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkPerformanceOverrideInfoINTEL} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPerformanceOverrideInfoINTEL(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the particular {@code VkPerformanceOverrideTypeINTEL} to set. */
    @NativeType("VkPerformanceOverrideTypeINTEL")
    public int type() { return ntype(address()); }
    /** defines whether the override is enabled. */
    @NativeType("VkBool32")
    public boolean enable() { return nenable(address()) != 0; }
    /** a potential required parameter for the override. */
    @NativeType("uint64_t")
    public long parameter() { return nparameter(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPerformanceOverrideInfoINTEL sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link INTELPerformanceQuery#VK_STRUCTURE_TYPE_PERFORMANCE_OVERRIDE_INFO_INTEL STRUCTURE_TYPE_PERFORMANCE_OVERRIDE_INFO_INTEL} value to the {@code sType} field. */
    public VkPerformanceOverrideInfoINTEL sType$Default() { return sType(INTELPerformanceQuery.VK_STRUCTURE_TYPE_PERFORMANCE_OVERRIDE_INFO_INTEL); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPerformanceOverrideInfoINTEL pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #type} field. */
    public VkPerformanceOverrideInfoINTEL type(@NativeType("VkPerformanceOverrideTypeINTEL") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@link #enable} field. */
    public VkPerformanceOverrideInfoINTEL enable(@NativeType("VkBool32") boolean value) { nenable(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #parameter} field. */
    public VkPerformanceOverrideInfoINTEL parameter(@NativeType("uint64_t") long value) { nparameter(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPerformanceOverrideInfoINTEL set(
        int sType,
        long pNext,
        int type,
        boolean enable,
        long parameter
    ) {
        sType(sType);
        pNext(pNext);
        type(type);
        enable(enable);
        parameter(parameter);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPerformanceOverrideInfoINTEL set(VkPerformanceOverrideInfoINTEL src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPerformanceOverrideInfoINTEL} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPerformanceOverrideInfoINTEL malloc() {
        return wrap(VkPerformanceOverrideInfoINTEL.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPerformanceOverrideInfoINTEL} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPerformanceOverrideInfoINTEL calloc() {
        return wrap(VkPerformanceOverrideInfoINTEL.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPerformanceOverrideInfoINTEL} instance allocated with {@link BufferUtils}. */
    public static VkPerformanceOverrideInfoINTEL create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPerformanceOverrideInfoINTEL.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPerformanceOverrideInfoINTEL} instance for the specified memory address. */
    public static VkPerformanceOverrideInfoINTEL create(long address) {
        return wrap(VkPerformanceOverrideInfoINTEL.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPerformanceOverrideInfoINTEL createSafe(long address) {
        return address == NULL ? null : wrap(VkPerformanceOverrideInfoINTEL.class, address);
    }

    /**
     * Returns a new {@link VkPerformanceOverrideInfoINTEL.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPerformanceOverrideInfoINTEL.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPerformanceOverrideInfoINTEL.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPerformanceOverrideInfoINTEL.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPerformanceOverrideInfoINTEL.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPerformanceOverrideInfoINTEL.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPerformanceOverrideInfoINTEL.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPerformanceOverrideInfoINTEL.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPerformanceOverrideInfoINTEL.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPerformanceOverrideInfoINTEL mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPerformanceOverrideInfoINTEL callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPerformanceOverrideInfoINTEL mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPerformanceOverrideInfoINTEL callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPerformanceOverrideInfoINTEL.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPerformanceOverrideInfoINTEL.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPerformanceOverrideInfoINTEL.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPerformanceOverrideInfoINTEL.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPerformanceOverrideInfoINTEL} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPerformanceOverrideInfoINTEL malloc(MemoryStack stack) {
        return wrap(VkPerformanceOverrideInfoINTEL.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPerformanceOverrideInfoINTEL} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPerformanceOverrideInfoINTEL calloc(MemoryStack stack) {
        return wrap(VkPerformanceOverrideInfoINTEL.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPerformanceOverrideInfoINTEL.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPerformanceOverrideInfoINTEL.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPerformanceOverrideInfoINTEL.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPerformanceOverrideInfoINTEL.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPerformanceOverrideInfoINTEL.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPerformanceOverrideInfoINTEL.PNEXT); }
    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + VkPerformanceOverrideInfoINTEL.TYPE); }
    /** Unsafe version of {@link #enable}. */
    public static int nenable(long struct) { return UNSAFE.getInt(null, struct + VkPerformanceOverrideInfoINTEL.ENABLE); }
    /** Unsafe version of {@link #parameter}. */
    public static long nparameter(long struct) { return UNSAFE.getLong(null, struct + VkPerformanceOverrideInfoINTEL.PARAMETER); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPerformanceOverrideInfoINTEL.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPerformanceOverrideInfoINTEL.PNEXT, value); }
    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + VkPerformanceOverrideInfoINTEL.TYPE, value); }
    /** Unsafe version of {@link #enable(boolean) enable}. */
    public static void nenable(long struct, int value) { UNSAFE.putInt(null, struct + VkPerformanceOverrideInfoINTEL.ENABLE, value); }
    /** Unsafe version of {@link #parameter(long) parameter}. */
    public static void nparameter(long struct, long value) { UNSAFE.putLong(null, struct + VkPerformanceOverrideInfoINTEL.PARAMETER, value); }

    // -----------------------------------

    /** An array of {@link VkPerformanceOverrideInfoINTEL} structs. */
    public static class Buffer extends StructBuffer<VkPerformanceOverrideInfoINTEL, Buffer> implements NativeResource {

        private static final VkPerformanceOverrideInfoINTEL ELEMENT_FACTORY = VkPerformanceOverrideInfoINTEL.create(-1L);

        /**
         * Creates a new {@code VkPerformanceOverrideInfoINTEL.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPerformanceOverrideInfoINTEL#SIZEOF}, and its mark will be undefined.
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
        protected VkPerformanceOverrideInfoINTEL getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPerformanceOverrideInfoINTEL.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPerformanceOverrideInfoINTEL.npNext(address()); }
        /** @return the value of the {@link VkPerformanceOverrideInfoINTEL#type} field. */
        @NativeType("VkPerformanceOverrideTypeINTEL")
        public int type() { return VkPerformanceOverrideInfoINTEL.ntype(address()); }
        /** @return the value of the {@link VkPerformanceOverrideInfoINTEL#enable} field. */
        @NativeType("VkBool32")
        public boolean enable() { return VkPerformanceOverrideInfoINTEL.nenable(address()) != 0; }
        /** @return the value of the {@link VkPerformanceOverrideInfoINTEL#parameter} field. */
        @NativeType("uint64_t")
        public long parameter() { return VkPerformanceOverrideInfoINTEL.nparameter(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPerformanceOverrideInfoINTEL.Buffer sType(@NativeType("VkStructureType") int value) { VkPerformanceOverrideInfoINTEL.nsType(address(), value); return this; }
        /** Sets the {@link INTELPerformanceQuery#VK_STRUCTURE_TYPE_PERFORMANCE_OVERRIDE_INFO_INTEL STRUCTURE_TYPE_PERFORMANCE_OVERRIDE_INFO_INTEL} value to the {@code sType} field. */
        public VkPerformanceOverrideInfoINTEL.Buffer sType$Default() { return sType(INTELPerformanceQuery.VK_STRUCTURE_TYPE_PERFORMANCE_OVERRIDE_INFO_INTEL); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPerformanceOverrideInfoINTEL.Buffer pNext(@NativeType("void const *") long value) { VkPerformanceOverrideInfoINTEL.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPerformanceOverrideInfoINTEL#type} field. */
        public VkPerformanceOverrideInfoINTEL.Buffer type(@NativeType("VkPerformanceOverrideTypeINTEL") int value) { VkPerformanceOverrideInfoINTEL.ntype(address(), value); return this; }
        /** Sets the specified value to the {@link VkPerformanceOverrideInfoINTEL#enable} field. */
        public VkPerformanceOverrideInfoINTEL.Buffer enable(@NativeType("VkBool32") boolean value) { VkPerformanceOverrideInfoINTEL.nenable(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPerformanceOverrideInfoINTEL#parameter} field. */
        public VkPerformanceOverrideInfoINTEL.Buffer parameter(@NativeType("uint64_t") long value) { VkPerformanceOverrideInfoINTEL.nparameter(address(), value); return this; }

    }

}