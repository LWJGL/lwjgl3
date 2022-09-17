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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying the parameters of acceleration structure object.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@link VkAccelerationStructureInfoNV} contains information that is used both for acceleration structure creation with {@link NVRayTracing#vkCreateAccelerationStructureNV CreateAccelerationStructureNV} and in combination with the actual geometric data to build the acceleration structure with {@link NVRayTracing#vkCmdBuildAccelerationStructureNV CmdBuildAccelerationStructureNV}.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code geometryCount} <b>must</b> be less than or equal to {@link VkPhysicalDeviceRayTracingPropertiesNV}{@code ::maxGeometryCount}</li>
 * <li>{@code instanceCount} <b>must</b> be less than or equal to {@link VkPhysicalDeviceRayTracingPropertiesNV}{@code ::maxInstanceCount}</li>
 * <li>The total number of triangles in all geometries <b>must</b> be less than or equal to {@link VkPhysicalDeviceRayTracingPropertiesNV}{@code ::maxTriangleCount}</li>
 * <li>If {@code type} is {@link NVRayTracing#VK_ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_NV ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_NV} then {@code geometryCount} <b>must</b> be 0</li>
 * <li>If {@code type} is {@link NVRayTracing#VK_ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_NV ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_NV} then {@code instanceCount} <b>must</b> be 0</li>
 * <li>If {@code type} is {@link NVRayTracing#VK_ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_NV ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_NV} then the {@code geometryType} member of each geometry in {@code pGeometries} <b>must</b> be the same</li>
 * <li>{@code type} <b>must</b> not be {@link KHRAccelerationStructure#VK_ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR}</li>
 * <li>If {@code flags} has the {@link NVRayTracing#VK_BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_TRACE_BIT_NV BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_TRACE_BIT_NV} bit set, then it <b>must</b> not have the {@link NVRayTracing#VK_BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_BUILD_BIT_NV BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_BUILD_BIT_NV} bit set</li>
 * <li>{@code scratch} <b>must</b> have been created with {@link NVRayTracing#VK_BUFFER_USAGE_RAY_TRACING_BIT_NV BUFFER_USAGE_RAY_TRACING_BIT_NV} usage flag</li>
 * <li>If {@code instanceData} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code instanceData} <b>must</b> have been created with {@link NVRayTracing#VK_BUFFER_USAGE_RAY_TRACING_BIT_NV BUFFER_USAGE_RAY_TRACING_BIT_NV} usage flag</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVRayTracing#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_INFO_NV STRUCTURE_TYPE_ACCELERATION_STRUCTURE_INFO_NV}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code type} <b>must</b> be a valid {@code VkAccelerationStructureTypeKHR} value</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkBuildAccelerationStructureFlagBitsNV} values</li>
 * <li>If {@code geometryCount} is not 0, {@code pGeometries} <b>must</b> be a valid pointer to an array of {@code geometryCount} valid {@link VkGeometryNV} structures</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkAccelerationStructureCreateInfoNV}, {@link VkGeometryNV}, {@link NVRayTracing#vkCmdBuildAccelerationStructureNV CmdBuildAccelerationStructureNV}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkAccelerationStructureInfoNV {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkAccelerationStructureTypeKHR {@link #type};
 *     VkBuildAccelerationStructureFlagsNV {@link #flags};
 *     uint32_t {@link #instanceCount};
 *     uint32_t {@link #geometryCount};
 *     {@link VkGeometryNV VkGeometryNV} const * {@link #pGeometries};
 * }</code></pre>
 */
public class VkAccelerationStructureInfoNV extends Struct implements NativeResource {

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

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** a {@code VkAccelerationStructureTypeNV} value specifying the type of acceleration structure that will be created. */
    @NativeType("VkAccelerationStructureTypeKHR")
    public int type() { return ntype(address()); }
    /** a bitmask of {@code VkBuildAccelerationStructureFlagBitsNV} specifying additional parameters of the acceleration structure. */
    @NativeType("VkBuildAccelerationStructureFlagsNV")
    public int flags() { return nflags(address()); }
    /** specifies the number of instances that will be in the new acceleration structure. */
    @NativeType("uint32_t")
    public int instanceCount() { return ninstanceCount(address()); }
    /** specifies the number of geometries that will be in the new acceleration structure. */
    @NativeType("uint32_t")
    public int geometryCount() { return ngeometryCount(address()); }
    /** a pointer to an array of {@code geometryCount} {@link VkGeometryNV} structures containing the scene data being passed into the acceleration structure. */
    @Nullable
    @NativeType("VkGeometryNV const *")
    public VkGeometryNV.Buffer pGeometries() { return npGeometries(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkAccelerationStructureInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVRayTracing#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_INFO_NV STRUCTURE_TYPE_ACCELERATION_STRUCTURE_INFO_NV} value to the {@link #sType} field. */
    public VkAccelerationStructureInfoNV sType$Default() { return sType(NVRayTracing.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_INFO_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkAccelerationStructureInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #type} field. */
    public VkAccelerationStructureInfoNV type(@NativeType("VkAccelerationStructureTypeKHR") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkAccelerationStructureInfoNV flags(@NativeType("VkBuildAccelerationStructureFlagsNV") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #instanceCount} field. */
    public VkAccelerationStructureInfoNV instanceCount(@NativeType("uint32_t") int value) { ninstanceCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkGeometryNV.Buffer} to the {@link #pGeometries} field. */
    public VkAccelerationStructureInfoNV pGeometries(@Nullable @NativeType("VkGeometryNV const *") VkGeometryNV.Buffer value) { npGeometries(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkAccelerationStructureInfoNV set(
        int sType,
        long pNext,
        int type,
        int flags,
        int instanceCount,
        @Nullable VkGeometryNV.Buffer pGeometries
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
        return wrap(VkAccelerationStructureInfoNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkAccelerationStructureInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureInfoNV calloc() {
        return wrap(VkAccelerationStructureInfoNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkAccelerationStructureInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkAccelerationStructureInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkAccelerationStructureInfoNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkAccelerationStructureInfoNV} instance for the specified memory address. */
    public static VkAccelerationStructureInfoNV create(long address) {
        return wrap(VkAccelerationStructureInfoNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAccelerationStructureInfoNV createSafe(long address) {
        return address == NULL ? null : wrap(VkAccelerationStructureInfoNV.class, address);
    }

    /**
     * Returns a new {@link VkAccelerationStructureInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureInfoNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureInfoNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkAccelerationStructureInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureInfoNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAccelerationStructureInfoNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
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
        return wrap(VkAccelerationStructureInfoNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkAccelerationStructureInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureInfoNV calloc(MemoryStack stack) {
        return wrap(VkAccelerationStructureInfoNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkAccelerationStructureInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkAccelerationStructureInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAccelerationStructureInfoNV.PNEXT); }
    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + VkAccelerationStructureInfoNV.TYPE); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkAccelerationStructureInfoNV.FLAGS); }
    /** Unsafe version of {@link #instanceCount}. */
    public static int ninstanceCount(long struct) { return UNSAFE.getInt(null, struct + VkAccelerationStructureInfoNV.INSTANCECOUNT); }
    /** Unsafe version of {@link #geometryCount}. */
    public static int ngeometryCount(long struct) { return UNSAFE.getInt(null, struct + VkAccelerationStructureInfoNV.GEOMETRYCOUNT); }
    /** Unsafe version of {@link #pGeometries}. */
    @Nullable public static VkGeometryNV.Buffer npGeometries(long struct) { return VkGeometryNV.createSafe(memGetAddress(struct + VkAccelerationStructureInfoNV.PGEOMETRIES), ngeometryCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkAccelerationStructureInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkAccelerationStructureInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + VkAccelerationStructureInfoNV.TYPE, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkAccelerationStructureInfoNV.FLAGS, value); }
    /** Unsafe version of {@link #instanceCount(int) instanceCount}. */
    public static void ninstanceCount(long struct, int value) { UNSAFE.putInt(null, struct + VkAccelerationStructureInfoNV.INSTANCECOUNT, value); }
    /** Sets the specified value to the {@code geometryCount} field of the specified {@code struct}. */
    public static void ngeometryCount(long struct, int value) { UNSAFE.putInt(null, struct + VkAccelerationStructureInfoNV.GEOMETRYCOUNT, value); }
    /** Unsafe version of {@link #pGeometries(VkGeometryNV.Buffer) pGeometries}. */
    public static void npGeometries(long struct, @Nullable VkGeometryNV.Buffer value) { memPutAddress(struct + VkAccelerationStructureInfoNV.PGEOMETRIES, memAddressSafe(value)); ngeometryCount(struct, value == null ? 0 : value.remaining()); }

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
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAccelerationStructureInfoNV#SIZEOF}, and its mark will be undefined.
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
        protected VkAccelerationStructureInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkAccelerationStructureInfoNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkAccelerationStructureInfoNV.nsType(address()); }
        /** @return the value of the {@link VkAccelerationStructureInfoNV#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkAccelerationStructureInfoNV.npNext(address()); }
        /** @return the value of the {@link VkAccelerationStructureInfoNV#type} field. */
        @NativeType("VkAccelerationStructureTypeKHR")
        public int type() { return VkAccelerationStructureInfoNV.ntype(address()); }
        /** @return the value of the {@link VkAccelerationStructureInfoNV#flags} field. */
        @NativeType("VkBuildAccelerationStructureFlagsNV")
        public int flags() { return VkAccelerationStructureInfoNV.nflags(address()); }
        /** @return the value of the {@link VkAccelerationStructureInfoNV#instanceCount} field. */
        @NativeType("uint32_t")
        public int instanceCount() { return VkAccelerationStructureInfoNV.ninstanceCount(address()); }
        /** @return the value of the {@link VkAccelerationStructureInfoNV#geometryCount} field. */
        @NativeType("uint32_t")
        public int geometryCount() { return VkAccelerationStructureInfoNV.ngeometryCount(address()); }
        /** @return a {@link VkGeometryNV.Buffer} view of the struct array pointed to by the {@link VkAccelerationStructureInfoNV#pGeometries} field. */
        @Nullable
        @NativeType("VkGeometryNV const *")
        public VkGeometryNV.Buffer pGeometries() { return VkAccelerationStructureInfoNV.npGeometries(address()); }

        /** Sets the specified value to the {@link VkAccelerationStructureInfoNV#sType} field. */
        public VkAccelerationStructureInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkAccelerationStructureInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVRayTracing#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_INFO_NV STRUCTURE_TYPE_ACCELERATION_STRUCTURE_INFO_NV} value to the {@link VkAccelerationStructureInfoNV#sType} field. */
        public VkAccelerationStructureInfoNV.Buffer sType$Default() { return sType(NVRayTracing.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_INFO_NV); }
        /** Sets the specified value to the {@link VkAccelerationStructureInfoNV#pNext} field. */
        public VkAccelerationStructureInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkAccelerationStructureInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkAccelerationStructureInfoNV#type} field. */
        public VkAccelerationStructureInfoNV.Buffer type(@NativeType("VkAccelerationStructureTypeKHR") int value) { VkAccelerationStructureInfoNV.ntype(address(), value); return this; }
        /** Sets the specified value to the {@link VkAccelerationStructureInfoNV#flags} field. */
        public VkAccelerationStructureInfoNV.Buffer flags(@NativeType("VkBuildAccelerationStructureFlagsNV") int value) { VkAccelerationStructureInfoNV.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkAccelerationStructureInfoNV#instanceCount} field. */
        public VkAccelerationStructureInfoNV.Buffer instanceCount(@NativeType("uint32_t") int value) { VkAccelerationStructureInfoNV.ninstanceCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkGeometryNV.Buffer} to the {@link VkAccelerationStructureInfoNV#pGeometries} field. */
        public VkAccelerationStructureInfoNV.Buffer pGeometries(@Nullable @NativeType("VkGeometryNV const *") VkGeometryNV.Buffer value) { VkAccelerationStructureInfoNV.npGeometries(address(), value); return this; }

    }

}