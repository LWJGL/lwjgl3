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
 * Structure specifying the parameters of a newly created acceleration structure object.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code geometryCount} <b>must</b> be less than or equal to {@link VkPhysicalDeviceRaytracingPropertiesNVX}{@code ::maxGeometryCount}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVXRaytracing#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_NVX STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_NVX}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code type} <b>must</b> be a valid {@code VkAccelerationStructureTypeNVX} value</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkBuildAccelerationStructureFlagBitsNVX} values</li>
 * <li>If {@code geometryCount} is not 0, {@code pGeometries} <b>must</b> be a valid pointer to an array of {@code geometryCount} valid {@link VkGeometryNVX} structures</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkGeometryNVX}, {@link NVXRaytracing#vkCreateAccelerationStructureNVX CreateAccelerationStructureNVX}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code type} &ndash; a {@code VkAccelerationStructureTypeBitsNVX} value that specifies the type of acceleration structure that will be created.</li>
 * <li>{@code flags} &ndash; a set of {@code VkBuildAccelerationStructureFlagBitsNVX} values that specify additional parameters of the acceleration structure.</li>
 * <li>{@code compactedSize} &ndash; the size from the result of {@link NVXRaytracing#vkCmdWriteAccelerationStructurePropertiesNVX CmdWriteAccelerationStructurePropertiesNVX}, if this acceleration structure is going to be the target of compacting copy.</li>
 * <li>{@code instanceCount} &ndash; specifies the number of instances that will be in the new acceleration structure</li>
 * <li>{@code geometryCount} &ndash; specifies the number of geometries that will be in the new acceleration structure</li>
 * <li>{@code pGeometries} &ndash; an array of {@code VkGeometryNVX} structures which contain the scene data being passed into the acceleration structure.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkAccelerationStructureCreateInfoNVX {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkAccelerationStructureTypeNVX type;
 *     VkBuildAccelerationStructureFlagsNVX flags;
 *     VkDeviceSize compactedSize;
 *     uint32_t instanceCount;
 *     uint32_t geometryCount;
 *     {@link VkGeometryNVX VkGeometryNVX const} * pGeometries;
 * }</code></pre>
 */
public class VkAccelerationStructureCreateInfoNVX extends Struct implements NativeResource {

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
        COMPACTEDSIZE,
        INSTANCECOUNT,
        GEOMETRYCOUNT,
        PGEOMETRIES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(8),
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
        COMPACTEDSIZE = layout.offsetof(4);
        INSTANCECOUNT = layout.offsetof(5);
        GEOMETRYCOUNT = layout.offsetof(6);
        PGEOMETRIES = layout.offsetof(7);
    }

    /**
     * Creates a {@link VkAccelerationStructureCreateInfoNVX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAccelerationStructureCreateInfoNVX(ByteBuffer container) {
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
    /** Returns the value of the {@code type} field. */
    @NativeType("VkAccelerationStructureTypeNVX")
    public int type() { return ntype(address()); }
    /** Returns the value of the {@code flags} field. */
    @NativeType("VkBuildAccelerationStructureFlagsNVX")
    public int flags() { return nflags(address()); }
    /** Returns the value of the {@code compactedSize} field. */
    @NativeType("VkDeviceSize")
    public long compactedSize() { return ncompactedSize(address()); }
    /** Returns the value of the {@code instanceCount} field. */
    @NativeType("uint32_t")
    public int instanceCount() { return ninstanceCount(address()); }
    /** Returns the value of the {@code geometryCount} field. */
    @NativeType("uint32_t")
    public int geometryCount() { return ngeometryCount(address()); }
    /** Returns a {@link VkGeometryNVX.Buffer} view of the struct array pointed to by the {@code pGeometries} field. */
    @Nullable
    @NativeType("VkGeometryNVX const *")
    public VkGeometryNVX.Buffer pGeometries() { return npGeometries(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkAccelerationStructureCreateInfoNVX sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkAccelerationStructureCreateInfoNVX pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code type} field. */
    public VkAccelerationStructureCreateInfoNVX type(@NativeType("VkAccelerationStructureTypeNVX") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkAccelerationStructureCreateInfoNVX flags(@NativeType("VkBuildAccelerationStructureFlagsNVX") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code compactedSize} field. */
    public VkAccelerationStructureCreateInfoNVX compactedSize(@NativeType("VkDeviceSize") long value) { ncompactedSize(address(), value); return this; }
    /** Sets the specified value to the {@code instanceCount} field. */
    public VkAccelerationStructureCreateInfoNVX instanceCount(@NativeType("uint32_t") int value) { ninstanceCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkGeometryNVX.Buffer} to the {@code pGeometries} field. */
    public VkAccelerationStructureCreateInfoNVX pGeometries(@Nullable @NativeType("VkGeometryNVX const *") VkGeometryNVX.Buffer value) { npGeometries(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkAccelerationStructureCreateInfoNVX set(
        int sType,
        long pNext,
        int type,
        int flags,
        long compactedSize,
        int instanceCount,
        @Nullable VkGeometryNVX.Buffer pGeometries
    ) {
        sType(sType);
        pNext(pNext);
        type(type);
        flags(flags);
        compactedSize(compactedSize);
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
    public VkAccelerationStructureCreateInfoNVX set(VkAccelerationStructureCreateInfoNVX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkAccelerationStructureCreateInfoNVX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureCreateInfoNVX malloc() {
        return wrap(VkAccelerationStructureCreateInfoNVX.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkAccelerationStructureCreateInfoNVX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureCreateInfoNVX calloc() {
        return wrap(VkAccelerationStructureCreateInfoNVX.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkAccelerationStructureCreateInfoNVX} instance allocated with {@link BufferUtils}. */
    public static VkAccelerationStructureCreateInfoNVX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkAccelerationStructureCreateInfoNVX.class, memAddress(container), container);
    }

    /** Returns a new {@link VkAccelerationStructureCreateInfoNVX} instance for the specified memory address. */
    public static VkAccelerationStructureCreateInfoNVX create(long address) {
        return wrap(VkAccelerationStructureCreateInfoNVX.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAccelerationStructureCreateInfoNVX createSafe(long address) {
        return address == NULL ? null : wrap(VkAccelerationStructureCreateInfoNVX.class, address);
    }

    /**
     * Returns a new {@link VkAccelerationStructureCreateInfoNVX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureCreateInfoNVX.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureCreateInfoNVX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureCreateInfoNVX.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureCreateInfoNVX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureCreateInfoNVX.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkAccelerationStructureCreateInfoNVX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureCreateInfoNVX.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAccelerationStructureCreateInfoNVX.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkAccelerationStructureCreateInfoNVX} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkAccelerationStructureCreateInfoNVX mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkAccelerationStructureCreateInfoNVX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkAccelerationStructureCreateInfoNVX callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkAccelerationStructureCreateInfoNVX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureCreateInfoNVX mallocStack(MemoryStack stack) {
        return wrap(VkAccelerationStructureCreateInfoNVX.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkAccelerationStructureCreateInfoNVX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureCreateInfoNVX callocStack(MemoryStack stack) {
        return wrap(VkAccelerationStructureCreateInfoNVX.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkAccelerationStructureCreateInfoNVX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureCreateInfoNVX.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkAccelerationStructureCreateInfoNVX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureCreateInfoNVX.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkAccelerationStructureCreateInfoNVX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureCreateInfoNVX.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureCreateInfoNVX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureCreateInfoNVX.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkAccelerationStructureCreateInfoNVX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAccelerationStructureCreateInfoNVX.PNEXT); }
    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + VkAccelerationStructureCreateInfoNVX.TYPE); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkAccelerationStructureCreateInfoNVX.FLAGS); }
    /** Unsafe version of {@link #compactedSize}. */
    public static long ncompactedSize(long struct) { return UNSAFE.getLong(null, struct + VkAccelerationStructureCreateInfoNVX.COMPACTEDSIZE); }
    /** Unsafe version of {@link #instanceCount}. */
    public static int ninstanceCount(long struct) { return UNSAFE.getInt(null, struct + VkAccelerationStructureCreateInfoNVX.INSTANCECOUNT); }
    /** Unsafe version of {@link #geometryCount}. */
    public static int ngeometryCount(long struct) { return UNSAFE.getInt(null, struct + VkAccelerationStructureCreateInfoNVX.GEOMETRYCOUNT); }
    /** Unsafe version of {@link #pGeometries}. */
    @Nullable public static VkGeometryNVX.Buffer npGeometries(long struct) { return VkGeometryNVX.createSafe(memGetAddress(struct + VkAccelerationStructureCreateInfoNVX.PGEOMETRIES), ngeometryCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkAccelerationStructureCreateInfoNVX.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkAccelerationStructureCreateInfoNVX.PNEXT, value); }
    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + VkAccelerationStructureCreateInfoNVX.TYPE, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkAccelerationStructureCreateInfoNVX.FLAGS, value); }
    /** Unsafe version of {@link #compactedSize(long) compactedSize}. */
    public static void ncompactedSize(long struct, long value) { UNSAFE.putLong(null, struct + VkAccelerationStructureCreateInfoNVX.COMPACTEDSIZE, value); }
    /** Unsafe version of {@link #instanceCount(int) instanceCount}. */
    public static void ninstanceCount(long struct, int value) { UNSAFE.putInt(null, struct + VkAccelerationStructureCreateInfoNVX.INSTANCECOUNT, value); }
    /** Sets the specified value to the {@code geometryCount} field of the specified {@code struct}. */
    public static void ngeometryCount(long struct, int value) { UNSAFE.putInt(null, struct + VkAccelerationStructureCreateInfoNVX.GEOMETRYCOUNT, value); }
    /** Unsafe version of {@link #pGeometries(VkGeometryNVX.Buffer) pGeometries}. */
    public static void npGeometries(long struct, @Nullable VkGeometryNVX.Buffer value) { memPutAddress(struct + VkAccelerationStructureCreateInfoNVX.PGEOMETRIES, memAddressSafe(value)); ngeometryCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (ngeometryCount(struct) != 0) {
            check(memGetAddress(struct + VkAccelerationStructureCreateInfoNVX.PGEOMETRIES));
        }
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + i * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link VkAccelerationStructureCreateInfoNVX} structs. */
    public static class Buffer extends StructBuffer<VkAccelerationStructureCreateInfoNVX, Buffer> implements NativeResource {

        private static final VkAccelerationStructureCreateInfoNVX ELEMENT_FACTORY = VkAccelerationStructureCreateInfoNVX.create(-1L);

        /**
         * Creates a new {@link VkAccelerationStructureCreateInfoNVX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAccelerationStructureCreateInfoNVX#SIZEOF}, and its mark will be undefined.
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
        protected VkAccelerationStructureCreateInfoNVX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkAccelerationStructureCreateInfoNVX.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkAccelerationStructureCreateInfoNVX.npNext(address()); }
        /** Returns the value of the {@code type} field. */
        @NativeType("VkAccelerationStructureTypeNVX")
        public int type() { return VkAccelerationStructureCreateInfoNVX.ntype(address()); }
        /** Returns the value of the {@code flags} field. */
        @NativeType("VkBuildAccelerationStructureFlagsNVX")
        public int flags() { return VkAccelerationStructureCreateInfoNVX.nflags(address()); }
        /** Returns the value of the {@code compactedSize} field. */
        @NativeType("VkDeviceSize")
        public long compactedSize() { return VkAccelerationStructureCreateInfoNVX.ncompactedSize(address()); }
        /** Returns the value of the {@code instanceCount} field. */
        @NativeType("uint32_t")
        public int instanceCount() { return VkAccelerationStructureCreateInfoNVX.ninstanceCount(address()); }
        /** Returns the value of the {@code geometryCount} field. */
        @NativeType("uint32_t")
        public int geometryCount() { return VkAccelerationStructureCreateInfoNVX.ngeometryCount(address()); }
        /** Returns a {@link VkGeometryNVX.Buffer} view of the struct array pointed to by the {@code pGeometries} field. */
        @Nullable
        @NativeType("VkGeometryNVX const *")
        public VkGeometryNVX.Buffer pGeometries() { return VkAccelerationStructureCreateInfoNVX.npGeometries(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkAccelerationStructureCreateInfoNVX.Buffer sType(@NativeType("VkStructureType") int value) { VkAccelerationStructureCreateInfoNVX.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkAccelerationStructureCreateInfoNVX.Buffer pNext(@NativeType("void const *") long value) { VkAccelerationStructureCreateInfoNVX.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code type} field. */
        public VkAccelerationStructureCreateInfoNVX.Buffer type(@NativeType("VkAccelerationStructureTypeNVX") int value) { VkAccelerationStructureCreateInfoNVX.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkAccelerationStructureCreateInfoNVX.Buffer flags(@NativeType("VkBuildAccelerationStructureFlagsNVX") int value) { VkAccelerationStructureCreateInfoNVX.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code compactedSize} field. */
        public VkAccelerationStructureCreateInfoNVX.Buffer compactedSize(@NativeType("VkDeviceSize") long value) { VkAccelerationStructureCreateInfoNVX.ncompactedSize(address(), value); return this; }
        /** Sets the specified value to the {@code instanceCount} field. */
        public VkAccelerationStructureCreateInfoNVX.Buffer instanceCount(@NativeType("uint32_t") int value) { VkAccelerationStructureCreateInfoNVX.ninstanceCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkGeometryNVX.Buffer} to the {@code pGeometries} field. */
        public VkAccelerationStructureCreateInfoNVX.Buffer pGeometries(@Nullable @NativeType("VkGeometryNVX const *") VkGeometryNVX.Buffer value) { VkAccelerationStructureCreateInfoNVX.npGeometries(address(), value); return this; }

    }

}