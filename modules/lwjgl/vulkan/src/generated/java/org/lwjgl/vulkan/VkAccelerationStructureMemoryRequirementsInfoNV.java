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
 * <pre>{@code
 * struct VkAccelerationStructureMemoryRequirementsInfoNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkAccelerationStructureMemoryRequirementsTypeNV type;
 *     VkAccelerationStructureNV accelerationStructure;
 * }}</pre>
 */
public class VkAccelerationStructureMemoryRequirementsInfoNV extends Struct<VkAccelerationStructureMemoryRequirementsInfoNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        TYPE,
        ACCELERATIONSTRUCTURE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TYPE = layout.offsetof(2);
        ACCELERATIONSTRUCTURE = layout.offsetof(3);
    }

    protected VkAccelerationStructureMemoryRequirementsInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkAccelerationStructureMemoryRequirementsInfoNV create(long address, @Nullable ByteBuffer container) {
        return new VkAccelerationStructureMemoryRequirementsInfoNV(address, container);
    }

    /**
     * Creates a {@code VkAccelerationStructureMemoryRequirementsInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAccelerationStructureMemoryRequirementsInfoNV(ByteBuffer container) {
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
    /** @return the value of the {@code type} field. */
    @NativeType("VkAccelerationStructureMemoryRequirementsTypeNV")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code accelerationStructure} field. */
    @NativeType("VkAccelerationStructureNV")
    public long accelerationStructure() { return naccelerationStructure(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkAccelerationStructureMemoryRequirementsInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVRayTracing#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_INFO_NV STRUCTURE_TYPE_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_INFO_NV} value to the {@code sType} field. */
    public VkAccelerationStructureMemoryRequirementsInfoNV sType$Default() { return sType(NVRayTracing.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_INFO_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkAccelerationStructureMemoryRequirementsInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code type} field. */
    public VkAccelerationStructureMemoryRequirementsInfoNV type(@NativeType("VkAccelerationStructureMemoryRequirementsTypeNV") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code accelerationStructure} field. */
    public VkAccelerationStructureMemoryRequirementsInfoNV accelerationStructure(@NativeType("VkAccelerationStructureNV") long value) { naccelerationStructure(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkAccelerationStructureMemoryRequirementsInfoNV set(
        int sType,
        long pNext,
        int type,
        long accelerationStructure
    ) {
        sType(sType);
        pNext(pNext);
        type(type);
        accelerationStructure(accelerationStructure);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAccelerationStructureMemoryRequirementsInfoNV set(VkAccelerationStructureMemoryRequirementsInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAccelerationStructureMemoryRequirementsInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureMemoryRequirementsInfoNV malloc() {
        return new VkAccelerationStructureMemoryRequirementsInfoNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkAccelerationStructureMemoryRequirementsInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureMemoryRequirementsInfoNV calloc() {
        return new VkAccelerationStructureMemoryRequirementsInfoNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkAccelerationStructureMemoryRequirementsInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkAccelerationStructureMemoryRequirementsInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAccelerationStructureMemoryRequirementsInfoNV(memAddress(container), container);
    }

    /** Returns a new {@code VkAccelerationStructureMemoryRequirementsInfoNV} instance for the specified memory address. */
    public static VkAccelerationStructureMemoryRequirementsInfoNV create(long address) {
        return new VkAccelerationStructureMemoryRequirementsInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkAccelerationStructureMemoryRequirementsInfoNV createSafe(long address) {
        return address == NULL ? null : new VkAccelerationStructureMemoryRequirementsInfoNV(address, null);
    }

    /**
     * Returns a new {@link VkAccelerationStructureMemoryRequirementsInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureMemoryRequirementsInfoNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureMemoryRequirementsInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureMemoryRequirementsInfoNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureMemoryRequirementsInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureMemoryRequirementsInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkAccelerationStructureMemoryRequirementsInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureMemoryRequirementsInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkAccelerationStructureMemoryRequirementsInfoNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkAccelerationStructureMemoryRequirementsInfoNV mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkAccelerationStructureMemoryRequirementsInfoNV callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkAccelerationStructureMemoryRequirementsInfoNV mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkAccelerationStructureMemoryRequirementsInfoNV callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkAccelerationStructureMemoryRequirementsInfoNV.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkAccelerationStructureMemoryRequirementsInfoNV.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkAccelerationStructureMemoryRequirementsInfoNV.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkAccelerationStructureMemoryRequirementsInfoNV.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkAccelerationStructureMemoryRequirementsInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureMemoryRequirementsInfoNV malloc(MemoryStack stack) {
        return new VkAccelerationStructureMemoryRequirementsInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkAccelerationStructureMemoryRequirementsInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureMemoryRequirementsInfoNV calloc(MemoryStack stack) {
        return new VkAccelerationStructureMemoryRequirementsInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkAccelerationStructureMemoryRequirementsInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureMemoryRequirementsInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureMemoryRequirementsInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureMemoryRequirementsInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkAccelerationStructureMemoryRequirementsInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAccelerationStructureMemoryRequirementsInfoNV.PNEXT); }
    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + VkAccelerationStructureMemoryRequirementsInfoNV.TYPE); }
    /** Unsafe version of {@link #accelerationStructure}. */
    public static long naccelerationStructure(long struct) { return memGetLong(struct + VkAccelerationStructureMemoryRequirementsInfoNV.ACCELERATIONSTRUCTURE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkAccelerationStructureMemoryRequirementsInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkAccelerationStructureMemoryRequirementsInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + VkAccelerationStructureMemoryRequirementsInfoNV.TYPE, value); }
    /** Unsafe version of {@link #accelerationStructure(long) accelerationStructure}. */
    public static void naccelerationStructure(long struct, long value) { memPutLong(struct + VkAccelerationStructureMemoryRequirementsInfoNV.ACCELERATIONSTRUCTURE, value); }

    // -----------------------------------

    /** An array of {@link VkAccelerationStructureMemoryRequirementsInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkAccelerationStructureMemoryRequirementsInfoNV, Buffer> implements NativeResource {

        private static final VkAccelerationStructureMemoryRequirementsInfoNV ELEMENT_FACTORY = VkAccelerationStructureMemoryRequirementsInfoNV.create(-1L);

        /**
         * Creates a new {@code VkAccelerationStructureMemoryRequirementsInfoNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAccelerationStructureMemoryRequirementsInfoNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkAccelerationStructureMemoryRequirementsInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkAccelerationStructureMemoryRequirementsInfoNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkAccelerationStructureMemoryRequirementsInfoNV.npNext(address()); }
        /** @return the value of the {@code type} field. */
        @NativeType("VkAccelerationStructureMemoryRequirementsTypeNV")
        public int type() { return VkAccelerationStructureMemoryRequirementsInfoNV.ntype(address()); }
        /** @return the value of the {@code accelerationStructure} field. */
        @NativeType("VkAccelerationStructureNV")
        public long accelerationStructure() { return VkAccelerationStructureMemoryRequirementsInfoNV.naccelerationStructure(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkAccelerationStructureMemoryRequirementsInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkAccelerationStructureMemoryRequirementsInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVRayTracing#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_INFO_NV STRUCTURE_TYPE_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_INFO_NV} value to the {@code sType} field. */
        public VkAccelerationStructureMemoryRequirementsInfoNV.Buffer sType$Default() { return sType(NVRayTracing.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_INFO_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkAccelerationStructureMemoryRequirementsInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkAccelerationStructureMemoryRequirementsInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code type} field. */
        public VkAccelerationStructureMemoryRequirementsInfoNV.Buffer type(@NativeType("VkAccelerationStructureMemoryRequirementsTypeNV") int value) { VkAccelerationStructureMemoryRequirementsInfoNV.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code accelerationStructure} field. */
        public VkAccelerationStructureMemoryRequirementsInfoNV.Buffer accelerationStructure(@NativeType("VkAccelerationStructureNV") long value) { VkAccelerationStructureMemoryRequirementsInfoNV.naccelerationStructure(address(), value); return this; }

    }

}