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
 * Stub description of VkPhysicalDeviceAmigoProfilingFeaturesSEC.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link SECAmigoProfiling#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_AMIGO_PROFILING_FEATURES_SEC STRUCTURE_TYPE_PHYSICAL_DEVICE_AMIGO_PROFILING_FEATURES_SEC}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceAmigoProfilingFeaturesSEC {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 amigoProfiling;
 * }</code></pre>
 */
public class VkPhysicalDeviceAmigoProfilingFeaturesSEC extends Struct<VkPhysicalDeviceAmigoProfilingFeaturesSEC> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        AMIGOPROFILING;

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
        AMIGOPROFILING = layout.offsetof(2);
    }

    protected VkPhysicalDeviceAmigoProfilingFeaturesSEC(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceAmigoProfilingFeaturesSEC create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceAmigoProfilingFeaturesSEC(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceAmigoProfilingFeaturesSEC} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceAmigoProfilingFeaturesSEC(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code amigoProfiling} field. */
    @NativeType("VkBool32")
    public boolean amigoProfiling() { return namigoProfiling(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceAmigoProfilingFeaturesSEC sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link SECAmigoProfiling#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_AMIGO_PROFILING_FEATURES_SEC STRUCTURE_TYPE_PHYSICAL_DEVICE_AMIGO_PROFILING_FEATURES_SEC} value to the {@code sType} field. */
    public VkPhysicalDeviceAmigoProfilingFeaturesSEC sType$Default() { return sType(SECAmigoProfiling.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_AMIGO_PROFILING_FEATURES_SEC); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceAmigoProfilingFeaturesSEC pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code amigoProfiling} field. */
    public VkPhysicalDeviceAmigoProfilingFeaturesSEC amigoProfiling(@NativeType("VkBool32") boolean value) { namigoProfiling(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceAmigoProfilingFeaturesSEC set(
        int sType,
        long pNext,
        boolean amigoProfiling
    ) {
        sType(sType);
        pNext(pNext);
        amigoProfiling(amigoProfiling);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceAmigoProfilingFeaturesSEC set(VkPhysicalDeviceAmigoProfilingFeaturesSEC src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceAmigoProfilingFeaturesSEC} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceAmigoProfilingFeaturesSEC malloc() {
        return new VkPhysicalDeviceAmigoProfilingFeaturesSEC(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceAmigoProfilingFeaturesSEC} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceAmigoProfilingFeaturesSEC calloc() {
        return new VkPhysicalDeviceAmigoProfilingFeaturesSEC(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceAmigoProfilingFeaturesSEC} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceAmigoProfilingFeaturesSEC create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceAmigoProfilingFeaturesSEC(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceAmigoProfilingFeaturesSEC} instance for the specified memory address. */
    public static VkPhysicalDeviceAmigoProfilingFeaturesSEC create(long address) {
        return new VkPhysicalDeviceAmigoProfilingFeaturesSEC(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceAmigoProfilingFeaturesSEC createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceAmigoProfilingFeaturesSEC(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceAmigoProfilingFeaturesSEC.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAmigoProfilingFeaturesSEC.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceAmigoProfilingFeaturesSEC.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAmigoProfilingFeaturesSEC.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceAmigoProfilingFeaturesSEC.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAmigoProfilingFeaturesSEC.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceAmigoProfilingFeaturesSEC.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAmigoProfilingFeaturesSEC.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceAmigoProfilingFeaturesSEC.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceAmigoProfilingFeaturesSEC} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceAmigoProfilingFeaturesSEC malloc(MemoryStack stack) {
        return new VkPhysicalDeviceAmigoProfilingFeaturesSEC(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceAmigoProfilingFeaturesSEC} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceAmigoProfilingFeaturesSEC calloc(MemoryStack stack) {
        return new VkPhysicalDeviceAmigoProfilingFeaturesSEC(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceAmigoProfilingFeaturesSEC.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAmigoProfilingFeaturesSEC.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceAmigoProfilingFeaturesSEC.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAmigoProfilingFeaturesSEC.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceAmigoProfilingFeaturesSEC.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceAmigoProfilingFeaturesSEC.PNEXT); }
    /** Unsafe version of {@link #amigoProfiling}. */
    public static int namigoProfiling(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceAmigoProfilingFeaturesSEC.AMIGOPROFILING); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceAmigoProfilingFeaturesSEC.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceAmigoProfilingFeaturesSEC.PNEXT, value); }
    /** Unsafe version of {@link #amigoProfiling(boolean) amigoProfiling}. */
    public static void namigoProfiling(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceAmigoProfilingFeaturesSEC.AMIGOPROFILING, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceAmigoProfilingFeaturesSEC} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceAmigoProfilingFeaturesSEC, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceAmigoProfilingFeaturesSEC ELEMENT_FACTORY = VkPhysicalDeviceAmigoProfilingFeaturesSEC.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceAmigoProfilingFeaturesSEC.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceAmigoProfilingFeaturesSEC#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceAmigoProfilingFeaturesSEC getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceAmigoProfilingFeaturesSEC.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceAmigoProfilingFeaturesSEC.npNext(address()); }
        /** @return the value of the {@code amigoProfiling} field. */
        @NativeType("VkBool32")
        public boolean amigoProfiling() { return VkPhysicalDeviceAmigoProfilingFeaturesSEC.namigoProfiling(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceAmigoProfilingFeaturesSEC.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceAmigoProfilingFeaturesSEC.nsType(address(), value); return this; }
        /** Sets the {@link SECAmigoProfiling#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_AMIGO_PROFILING_FEATURES_SEC STRUCTURE_TYPE_PHYSICAL_DEVICE_AMIGO_PROFILING_FEATURES_SEC} value to the {@code sType} field. */
        public VkPhysicalDeviceAmigoProfilingFeaturesSEC.Buffer sType$Default() { return sType(SECAmigoProfiling.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_AMIGO_PROFILING_FEATURES_SEC); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceAmigoProfilingFeaturesSEC.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceAmigoProfilingFeaturesSEC.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code amigoProfiling} field. */
        public VkPhysicalDeviceAmigoProfilingFeaturesSEC.Buffer amigoProfiling(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceAmigoProfilingFeaturesSEC.namigoProfiling(address(), value ? 1 : 0); return this; }

    }

}