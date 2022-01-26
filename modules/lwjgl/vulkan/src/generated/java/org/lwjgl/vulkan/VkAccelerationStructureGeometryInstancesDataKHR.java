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
 * Structure specifying a geometry consisting of instances of other acceleration structures.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRAccelerationStructure#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_INSTANCES_DATA_KHR STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_INSTANCES_DATA_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkAccelerationStructureGeometryDataKHR}, {@link VkDeviceOrHostAddressConstKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkAccelerationStructureGeometryInstancesDataKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkBool32 {@link #arrayOfPointers};
 *     {@link VkDeviceOrHostAddressConstKHR VkDeviceOrHostAddressConstKHR} {@link #data};
 * }</code></pre>
 */
public class VkAccelerationStructureGeometryInstancesDataKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ARRAYOFPOINTERS,
        DATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(VkDeviceOrHostAddressConstKHR.SIZEOF, VkDeviceOrHostAddressConstKHR.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ARRAYOFPOINTERS = layout.offsetof(2);
        DATA = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkAccelerationStructureGeometryInstancesDataKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAccelerationStructureGeometryInstancesDataKHR(ByteBuffer container) {
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
    /** specifies whether {@code data} is used as an array of addresses or just an array. */
    @NativeType("VkBool32")
    public boolean arrayOfPointers() { return narrayOfPointers(address()) != 0; }
    /** either the address of an array of device or host addresses referencing individual {@link VkAccelerationStructureInstanceKHR} structures or packed motion instance information as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#acceleration-structure-motion-instances">motion instances</a> if {@code arrayOfPointers} is {@link VK10#VK_TRUE TRUE}, or the address of an array of {@link VkAccelerationStructureInstanceKHR} or {@link VkAccelerationStructureMotionInstanceNV} structures. Addresses and {@link VkAccelerationStructureInstanceKHR} structures are tightly packed. {@link VkAccelerationStructureMotionInstanceNV} structures have a stride of 160 bytes. */
    public VkDeviceOrHostAddressConstKHR data() { return ndata(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkAccelerationStructureGeometryInstancesDataKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRAccelerationStructure#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_INSTANCES_DATA_KHR STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_INSTANCES_DATA_KHR} value to the {@link #sType} field. */
    public VkAccelerationStructureGeometryInstancesDataKHR sType$Default() { return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_INSTANCES_DATA_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkAccelerationStructureGeometryInstancesDataKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #arrayOfPointers} field. */
    public VkAccelerationStructureGeometryInstancesDataKHR arrayOfPointers(@NativeType("VkBool32") boolean value) { narrayOfPointers(address(), value ? 1 : 0); return this; }
    /** Copies the specified {@link VkDeviceOrHostAddressConstKHR} to the {@link #data} field. */
    public VkAccelerationStructureGeometryInstancesDataKHR data(VkDeviceOrHostAddressConstKHR value) { ndata(address(), value); return this; }
    /** Passes the {@link #data} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkAccelerationStructureGeometryInstancesDataKHR data(java.util.function.Consumer<VkDeviceOrHostAddressConstKHR> consumer) { consumer.accept(data()); return this; }

    /** Initializes this struct with the specified values. */
    public VkAccelerationStructureGeometryInstancesDataKHR set(
        int sType,
        long pNext,
        boolean arrayOfPointers,
        VkDeviceOrHostAddressConstKHR data
    ) {
        sType(sType);
        pNext(pNext);
        arrayOfPointers(arrayOfPointers);
        data(data);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAccelerationStructureGeometryInstancesDataKHR set(VkAccelerationStructureGeometryInstancesDataKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAccelerationStructureGeometryInstancesDataKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureGeometryInstancesDataKHR malloc() {
        return wrap(VkAccelerationStructureGeometryInstancesDataKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkAccelerationStructureGeometryInstancesDataKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureGeometryInstancesDataKHR calloc() {
        return wrap(VkAccelerationStructureGeometryInstancesDataKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkAccelerationStructureGeometryInstancesDataKHR} instance allocated with {@link BufferUtils}. */
    public static VkAccelerationStructureGeometryInstancesDataKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkAccelerationStructureGeometryInstancesDataKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkAccelerationStructureGeometryInstancesDataKHR} instance for the specified memory address. */
    public static VkAccelerationStructureGeometryInstancesDataKHR create(long address) {
        return wrap(VkAccelerationStructureGeometryInstancesDataKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAccelerationStructureGeometryInstancesDataKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkAccelerationStructureGeometryInstancesDataKHR.class, address);
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometryInstancesDataKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryInstancesDataKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometryInstancesDataKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryInstancesDataKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometryInstancesDataKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryInstancesDataKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkAccelerationStructureGeometryInstancesDataKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryInstancesDataKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAccelerationStructureGeometryInstancesDataKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkAccelerationStructureGeometryInstancesDataKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureGeometryInstancesDataKHR malloc(MemoryStack stack) {
        return wrap(VkAccelerationStructureGeometryInstancesDataKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkAccelerationStructureGeometryInstancesDataKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureGeometryInstancesDataKHR calloc(MemoryStack stack) {
        return wrap(VkAccelerationStructureGeometryInstancesDataKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometryInstancesDataKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryInstancesDataKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometryInstancesDataKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryInstancesDataKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkAccelerationStructureGeometryInstancesDataKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAccelerationStructureGeometryInstancesDataKHR.PNEXT); }
    /** Unsafe version of {@link #arrayOfPointers}. */
    public static int narrayOfPointers(long struct) { return UNSAFE.getInt(null, struct + VkAccelerationStructureGeometryInstancesDataKHR.ARRAYOFPOINTERS); }
    /** Unsafe version of {@link #data}. */
    public static VkDeviceOrHostAddressConstKHR ndata(long struct) { return VkDeviceOrHostAddressConstKHR.create(struct + VkAccelerationStructureGeometryInstancesDataKHR.DATA); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkAccelerationStructureGeometryInstancesDataKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkAccelerationStructureGeometryInstancesDataKHR.PNEXT, value); }
    /** Unsafe version of {@link #arrayOfPointers(boolean) arrayOfPointers}. */
    public static void narrayOfPointers(long struct, int value) { UNSAFE.putInt(null, struct + VkAccelerationStructureGeometryInstancesDataKHR.ARRAYOFPOINTERS, value); }
    /** Unsafe version of {@link #data(VkDeviceOrHostAddressConstKHR) data}. */
    public static void ndata(long struct, VkDeviceOrHostAddressConstKHR value) { memCopy(value.address(), struct + VkAccelerationStructureGeometryInstancesDataKHR.DATA, VkDeviceOrHostAddressConstKHR.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkAccelerationStructureGeometryInstancesDataKHR} structs. */
    public static class Buffer extends StructBuffer<VkAccelerationStructureGeometryInstancesDataKHR, Buffer> implements NativeResource {

        private static final VkAccelerationStructureGeometryInstancesDataKHR ELEMENT_FACTORY = VkAccelerationStructureGeometryInstancesDataKHR.create(-1L);

        /**
         * Creates a new {@code VkAccelerationStructureGeometryInstancesDataKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAccelerationStructureGeometryInstancesDataKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkAccelerationStructureGeometryInstancesDataKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkAccelerationStructureGeometryInstancesDataKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkAccelerationStructureGeometryInstancesDataKHR.nsType(address()); }
        /** @return the value of the {@link VkAccelerationStructureGeometryInstancesDataKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkAccelerationStructureGeometryInstancesDataKHR.npNext(address()); }
        /** @return the value of the {@link VkAccelerationStructureGeometryInstancesDataKHR#arrayOfPointers} field. */
        @NativeType("VkBool32")
        public boolean arrayOfPointers() { return VkAccelerationStructureGeometryInstancesDataKHR.narrayOfPointers(address()) != 0; }
        /** @return a {@link VkDeviceOrHostAddressConstKHR} view of the {@link VkAccelerationStructureGeometryInstancesDataKHR#data} field. */
        public VkDeviceOrHostAddressConstKHR data() { return VkAccelerationStructureGeometryInstancesDataKHR.ndata(address()); }

        /** Sets the specified value to the {@link VkAccelerationStructureGeometryInstancesDataKHR#sType} field. */
        public VkAccelerationStructureGeometryInstancesDataKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkAccelerationStructureGeometryInstancesDataKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRAccelerationStructure#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_INSTANCES_DATA_KHR STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_INSTANCES_DATA_KHR} value to the {@link VkAccelerationStructureGeometryInstancesDataKHR#sType} field. */
        public VkAccelerationStructureGeometryInstancesDataKHR.Buffer sType$Default() { return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_INSTANCES_DATA_KHR); }
        /** Sets the specified value to the {@link VkAccelerationStructureGeometryInstancesDataKHR#pNext} field. */
        public VkAccelerationStructureGeometryInstancesDataKHR.Buffer pNext(@NativeType("void const *") long value) { VkAccelerationStructureGeometryInstancesDataKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkAccelerationStructureGeometryInstancesDataKHR#arrayOfPointers} field. */
        public VkAccelerationStructureGeometryInstancesDataKHR.Buffer arrayOfPointers(@NativeType("VkBool32") boolean value) { VkAccelerationStructureGeometryInstancesDataKHR.narrayOfPointers(address(), value ? 1 : 0); return this; }
        /** Copies the specified {@link VkDeviceOrHostAddressConstKHR} to the {@link VkAccelerationStructureGeometryInstancesDataKHR#data} field. */
        public VkAccelerationStructureGeometryInstancesDataKHR.Buffer data(VkDeviceOrHostAddressConstKHR value) { VkAccelerationStructureGeometryInstancesDataKHR.ndata(address(), value); return this; }
        /** Passes the {@link VkAccelerationStructureGeometryInstancesDataKHR#data} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkAccelerationStructureGeometryInstancesDataKHR.Buffer data(java.util.function.Consumer<VkDeviceOrHostAddressConstKHR> consumer) { consumer.accept(data()); return this; }

    }

}