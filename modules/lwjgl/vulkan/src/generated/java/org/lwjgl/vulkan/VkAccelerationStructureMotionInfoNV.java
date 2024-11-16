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
 * Structure specifying the parameters of a newly created acceleration structure object.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVRayTracingMotionBlur#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_MOTION_INFO_NV STRUCTURE_TYPE_ACCELERATION_STRUCTURE_MOTION_INFO_NV}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkAccelerationStructureMotionInfoNV {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #maxInstances};
 *     VkAccelerationStructureMotionInfoFlagsNV {@link #flags};
 * }</code></pre>
 */
public class VkAccelerationStructureMotionInfoNV extends Struct<VkAccelerationStructureMotionInfoNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXINSTANCES,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXINSTANCES = layout.offsetof(2);
        FLAGS = layout.offsetof(3);
    }

    protected VkAccelerationStructureMotionInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkAccelerationStructureMotionInfoNV create(long address, @Nullable ByteBuffer container) {
        return new VkAccelerationStructureMotionInfoNV(address, container);
    }

    /**
     * Creates a {@code VkAccelerationStructureMotionInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAccelerationStructureMotionInfoNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the maximum number of instances that <b>may</b> be used in the motion top-level acceleration structure. */
    @NativeType("uint32_t")
    public int maxInstances() { return nmaxInstances(address()); }
    /** 0 and reserved for future use. */
    @NativeType("VkAccelerationStructureMotionInfoFlagsNV")
    public int flags() { return nflags(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkAccelerationStructureMotionInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVRayTracingMotionBlur#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_MOTION_INFO_NV STRUCTURE_TYPE_ACCELERATION_STRUCTURE_MOTION_INFO_NV} value to the {@link #sType} field. */
    public VkAccelerationStructureMotionInfoNV sType$Default() { return sType(NVRayTracingMotionBlur.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_MOTION_INFO_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkAccelerationStructureMotionInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #maxInstances} field. */
    public VkAccelerationStructureMotionInfoNV maxInstances(@NativeType("uint32_t") int value) { nmaxInstances(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkAccelerationStructureMotionInfoNV flags(@NativeType("VkAccelerationStructureMotionInfoFlagsNV") int value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkAccelerationStructureMotionInfoNV set(
        int sType,
        long pNext,
        int maxInstances,
        int flags
    ) {
        sType(sType);
        pNext(pNext);
        maxInstances(maxInstances);
        flags(flags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAccelerationStructureMotionInfoNV set(VkAccelerationStructureMotionInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAccelerationStructureMotionInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureMotionInfoNV malloc() {
        return new VkAccelerationStructureMotionInfoNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkAccelerationStructureMotionInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureMotionInfoNV calloc() {
        return new VkAccelerationStructureMotionInfoNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkAccelerationStructureMotionInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkAccelerationStructureMotionInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAccelerationStructureMotionInfoNV(memAddress(container), container);
    }

    /** Returns a new {@code VkAccelerationStructureMotionInfoNV} instance for the specified memory address. */
    public static VkAccelerationStructureMotionInfoNV create(long address) {
        return new VkAccelerationStructureMotionInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkAccelerationStructureMotionInfoNV createSafe(long address) {
        return address == NULL ? null : new VkAccelerationStructureMotionInfoNV(address, null);
    }

    /**
     * Returns a new {@link VkAccelerationStructureMotionInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureMotionInfoNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureMotionInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureMotionInfoNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureMotionInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureMotionInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkAccelerationStructureMotionInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureMotionInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkAccelerationStructureMotionInfoNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkAccelerationStructureMotionInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureMotionInfoNV malloc(MemoryStack stack) {
        return new VkAccelerationStructureMotionInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkAccelerationStructureMotionInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureMotionInfoNV calloc(MemoryStack stack) {
        return new VkAccelerationStructureMotionInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkAccelerationStructureMotionInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureMotionInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureMotionInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureMotionInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkAccelerationStructureMotionInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAccelerationStructureMotionInfoNV.PNEXT); }
    /** Unsafe version of {@link #maxInstances}. */
    public static int nmaxInstances(long struct) { return memGetInt(struct + VkAccelerationStructureMotionInfoNV.MAXINSTANCES); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkAccelerationStructureMotionInfoNV.FLAGS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkAccelerationStructureMotionInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkAccelerationStructureMotionInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #maxInstances(int) maxInstances}. */
    public static void nmaxInstances(long struct, int value) { memPutInt(struct + VkAccelerationStructureMotionInfoNV.MAXINSTANCES, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkAccelerationStructureMotionInfoNV.FLAGS, value); }

    // -----------------------------------

    /** An array of {@link VkAccelerationStructureMotionInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkAccelerationStructureMotionInfoNV, Buffer> implements NativeResource {

        private static final VkAccelerationStructureMotionInfoNV ELEMENT_FACTORY = VkAccelerationStructureMotionInfoNV.create(-1L);

        /**
         * Creates a new {@code VkAccelerationStructureMotionInfoNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAccelerationStructureMotionInfoNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkAccelerationStructureMotionInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkAccelerationStructureMotionInfoNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkAccelerationStructureMotionInfoNV.nsType(address()); }
        /** @return the value of the {@link VkAccelerationStructureMotionInfoNV#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkAccelerationStructureMotionInfoNV.npNext(address()); }
        /** @return the value of the {@link VkAccelerationStructureMotionInfoNV#maxInstances} field. */
        @NativeType("uint32_t")
        public int maxInstances() { return VkAccelerationStructureMotionInfoNV.nmaxInstances(address()); }
        /** @return the value of the {@link VkAccelerationStructureMotionInfoNV#flags} field. */
        @NativeType("VkAccelerationStructureMotionInfoFlagsNV")
        public int flags() { return VkAccelerationStructureMotionInfoNV.nflags(address()); }

        /** Sets the specified value to the {@link VkAccelerationStructureMotionInfoNV#sType} field. */
        public VkAccelerationStructureMotionInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkAccelerationStructureMotionInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVRayTracingMotionBlur#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_MOTION_INFO_NV STRUCTURE_TYPE_ACCELERATION_STRUCTURE_MOTION_INFO_NV} value to the {@link VkAccelerationStructureMotionInfoNV#sType} field. */
        public VkAccelerationStructureMotionInfoNV.Buffer sType$Default() { return sType(NVRayTracingMotionBlur.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_MOTION_INFO_NV); }
        /** Sets the specified value to the {@link VkAccelerationStructureMotionInfoNV#pNext} field. */
        public VkAccelerationStructureMotionInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkAccelerationStructureMotionInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkAccelerationStructureMotionInfoNV#maxInstances} field. */
        public VkAccelerationStructureMotionInfoNV.Buffer maxInstances(@NativeType("uint32_t") int value) { VkAccelerationStructureMotionInfoNV.nmaxInstances(address(), value); return this; }
        /** Sets the specified value to the {@link VkAccelerationStructureMotionInfoNV#flags} field. */
        public VkAccelerationStructureMotionInfoNV.Buffer flags(@NativeType("VkAccelerationStructureMotionInfoFlagsNV") int value) { VkAccelerationStructureMotionInfoNV.nflags(address(), value); return this; }

    }

}