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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre><code>
 * struct VkAccelerationStructureInfoNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkAccelerationStructureTypeNV type;
 *     VkBuildAccelerationStructureFlagsNV flags;
 *     uint32_t instanceCount;
 *     uint32_t geometryCount;
 *     {@link VkGeometryNV VkGeometryNV} const * pGeometries;
 * }</code></pre>
 */
public class VkAccelerationStructureInfoNV extends Struct<VkAccelerationStructureInfoNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        TYPE,
        FLAGS,
        INSTANCECOUNT,
        GEOMETRYCOUNT,
        PGEOMETRIES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TYPE = layout.offsetof(2);
        FLAGS = layout.offsetof(3);
        INSTANCECOUNT = layout.offsetof(4);
        GEOMETRYCOUNT = layout.offsetof(5);
        PGEOMETRIES = layout.offsetof(6);
    }

    protected VkAccelerationStructureInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkAccelerationStructureInfoNV create(long address, @Nullable ByteBuffer container) {
        return new VkAccelerationStructureInfoNV(address, container);
    }

    /**
     * Creates a {@code VkAccelerationStructureInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAccelerationStructureInfoNV(ByteBuffer container) {
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
    @NativeType("VkAccelerationStructureTypeNV")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("VkBuildAccelerationStructureFlagsNV")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code instanceCount} field. */
    @NativeType("uint32_t")
    public int instanceCount() { return ninstanceCount(address()); }
    /** @return the value of the {@code geometryCount} field. */
    @NativeType("uint32_t")
    public int geometryCount() { return ngeometryCount(address()); }
    /** @return a {@link VkGeometryNV.Buffer} view of the struct array pointed to by the {@code pGeometries} field. */
    @NativeType("VkGeometryNV const *")
    public VkGeometryNV.@Nullable Buffer pGeometries() { return npGeometries(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkAccelerationStructureInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVRayTracing#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_INFO_NV STRUCTURE_TYPE_ACCELERATION_STRUCTURE_INFO_NV} value to the {@code sType} field. */
    public VkAccelerationStructureInfoNV sType$Default() { return sType(NVRayTracing.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_INFO_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkAccelerationStructureInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code type} field. */
    public VkAccelerationStructureInfoNV type(@NativeType("VkAccelerationStructureTypeNV") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkAccelerationStructureInfoNV flags(@NativeType("VkBuildAccelerationStructureFlagsNV") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code instanceCount} field. */
    public VkAccelerationStructureInfoNV instanceCount(@NativeType("uint32_t") int value) { ninstanceCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkGeometryNV.Buffer} to the {@code pGeometries} field. */
    public VkAccelerationStructureInfoNV pGeometries(@NativeType("VkGeometryNV const *") VkGeometryNV.@Nullable Buffer value) { npGeometries(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkAccelerationStructureInfoNV set(
        int sType,
        long pNext,
        int type,
        int flags,
        int instanceCount,
        VkGeometryNV.@Nullable Buffer pGeometries
    ) {
        sType(sType);
        pNext(pNext);
        type(type);
        flags(flags);
        instanceCount(instanceCount);
        pGeometries(pGeometries);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAccelerationStructureInfoNV set(VkAccelerationStructureInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAccelerationStructureInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureInfoNV malloc() {
        return new VkAccelerationStructureInfoNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkAccelerationStructureInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureInfoNV calloc() {
        return new VkAccelerationStructureInfoNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkAccelerationStructureInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkAccelerationStructureInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAccelerationStructureInfoNV(memAddress(container), container);
    }

    /** Returns a new {@code VkAccelerationStructureInfoNV} instance for the specified memory address. */
    public static VkAccelerationStructureInfoNV create(long address) {
        return new VkAccelerationStructureInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkAccelerationStructureInfoNV createSafe(long address) {
        return address == NULL ? null : new VkAccelerationStructureInfoNV(address, null);
    }

    /**
     * Returns a new {@link VkAccelerationStructureInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureInfoNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureInfoNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkAccelerationStructureInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkAccelerationStructureInfoNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkAccelerationStructureInfoNV mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkAccelerationStructureInfoNV callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkAccelerationStructureInfoNV mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkAccelerationStructureInfoNV callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkAccelerationStructureInfoNV.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkAccelerationStructureInfoNV.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkAccelerationStructureInfoNV.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkAccelerationStructureInfoNV.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkAccelerationStructureInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureInfoNV malloc(MemoryStack stack) {
        return new VkAccelerationStructureInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkAccelerationStructureInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureInfoNV calloc(MemoryStack stack) {
        return new VkAccelerationStructureInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkAccelerationStructureInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkAccelerationStructureInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAccelerationStructureInfoNV.PNEXT); }
    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + VkAccelerationStructureInfoNV.TYPE); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkAccelerationStructureInfoNV.FLAGS); }
    /** Unsafe version of {@link #instanceCount}. */
    public static int ninstanceCount(long struct) { return memGetInt(struct + VkAccelerationStructureInfoNV.INSTANCECOUNT); }
    /** Unsafe version of {@link #geometryCount}. */
    public static int ngeometryCount(long struct) { return memGetInt(struct + VkAccelerationStructureInfoNV.GEOMETRYCOUNT); }
    /** Unsafe version of {@link #pGeometries}. */
    public static VkGeometryNV.@Nullable Buffer npGeometries(long struct) { return VkGeometryNV.createSafe(memGetAddress(struct + VkAccelerationStructureInfoNV.PGEOMETRIES), ngeometryCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkAccelerationStructureInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkAccelerationStructureInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + VkAccelerationStructureInfoNV.TYPE, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkAccelerationStructureInfoNV.FLAGS, value); }
    /** Unsafe version of {@link #instanceCount(int) instanceCount}. */
    public static void ninstanceCount(long struct, int value) { memPutInt(struct + VkAccelerationStructureInfoNV.INSTANCECOUNT, value); }
    /** Sets the specified value to the {@code geometryCount} field of the specified {@code struct}. */
    public static void ngeometryCount(long struct, int value) { memPutInt(struct + VkAccelerationStructureInfoNV.GEOMETRYCOUNT, value); }
    /** Unsafe version of {@link #pGeometries(VkGeometryNV.Buffer) pGeometries}. */
    public static void npGeometries(long struct, VkGeometryNV.@Nullable Buffer value) { memPutAddress(struct + VkAccelerationStructureInfoNV.PGEOMETRIES, memAddressSafe(value)); ngeometryCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (ngeometryCount(struct) != 0) {
            check(memGetAddress(struct + VkAccelerationStructureInfoNV.PGEOMETRIES));
        }
    }

    // -----------------------------------

    /** An array of {@link VkAccelerationStructureInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkAccelerationStructureInfoNV, Buffer> implements NativeResource {

        private static final VkAccelerationStructureInfoNV ELEMENT_FACTORY = VkAccelerationStructureInfoNV.create(-1L);

        /**
         * Creates a new {@code VkAccelerationStructureInfoNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAccelerationStructureInfoNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkAccelerationStructureInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkAccelerationStructureInfoNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkAccelerationStructureInfoNV.npNext(address()); }
        /** @return the value of the {@code type} field. */
        @NativeType("VkAccelerationStructureTypeNV")
        public int type() { return VkAccelerationStructureInfoNV.ntype(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkBuildAccelerationStructureFlagsNV")
        public int flags() { return VkAccelerationStructureInfoNV.nflags(address()); }
        /** @return the value of the {@code instanceCount} field. */
        @NativeType("uint32_t")
        public int instanceCount() { return VkAccelerationStructureInfoNV.ninstanceCount(address()); }
        /** @return the value of the {@code geometryCount} field. */
        @NativeType("uint32_t")
        public int geometryCount() { return VkAccelerationStructureInfoNV.ngeometryCount(address()); }
        /** @return a {@link VkGeometryNV.Buffer} view of the struct array pointed to by the {@code pGeometries} field. */
        @NativeType("VkGeometryNV const *")
        public VkGeometryNV.@Nullable Buffer pGeometries() { return VkAccelerationStructureInfoNV.npGeometries(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkAccelerationStructureInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkAccelerationStructureInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVRayTracing#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_INFO_NV STRUCTURE_TYPE_ACCELERATION_STRUCTURE_INFO_NV} value to the {@code sType} field. */
        public VkAccelerationStructureInfoNV.Buffer sType$Default() { return sType(NVRayTracing.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_INFO_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkAccelerationStructureInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkAccelerationStructureInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code type} field. */
        public VkAccelerationStructureInfoNV.Buffer type(@NativeType("VkAccelerationStructureTypeNV") int value) { VkAccelerationStructureInfoNV.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkAccelerationStructureInfoNV.Buffer flags(@NativeType("VkBuildAccelerationStructureFlagsNV") int value) { VkAccelerationStructureInfoNV.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code instanceCount} field. */
        public VkAccelerationStructureInfoNV.Buffer instanceCount(@NativeType("uint32_t") int value) { VkAccelerationStructureInfoNV.ninstanceCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkGeometryNV.Buffer} to the {@code pGeometries} field. */
        public VkAccelerationStructureInfoNV.Buffer pGeometries(@NativeType("VkGeometryNV const *") VkGeometryNV.@Nullable Buffer value) { VkAccelerationStructureInfoNV.npGeometries(address(), value); return this; }

    }

}