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

import static org.lwjgl.vulkan.VK10.*;

/**
 * Structure containing driver identification information.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceDriverProperties} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <p>These are properties of the driver corresponding to a physical device.</p>
 * 
 * <p>{@code driverID} <b>must</b> be immutable for a given driver across instances, processes, driver versions, and system reboots.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DRIVER_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_DRIVER_PROPERTIES}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkConformanceVersion}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceDriverProperties {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkDriverId {@link #driverID};
 *     char {@link #driverName}[VK_MAX_DRIVER_NAME_SIZE];
 *     char {@link #driverInfo}[VK_MAX_DRIVER_INFO_SIZE];
 *     {@link VkConformanceVersion VkConformanceVersion} {@link #conformanceVersion};
 * }</code></pre>
 */
public class VkPhysicalDeviceDriverProperties extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DRIVERID,
        DRIVERNAME,
        DRIVERINFO,
        CONFORMANCEVERSION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __array(1, VK_MAX_DRIVER_NAME_SIZE),
            __array(1, VK_MAX_DRIVER_INFO_SIZE),
            __member(VkConformanceVersion.SIZEOF, VkConformanceVersion.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DRIVERID = layout.offsetof(2);
        DRIVERNAME = layout.offsetof(3);
        DRIVERINFO = layout.offsetof(4);
        CONFORMANCEVERSION = layout.offsetof(5);
    }

    /**
     * Creates a {@code VkPhysicalDeviceDriverProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceDriverProperties(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** a unique identifier for the driver of the physical device. */
    @NativeType("VkDriverId")
    public int driverID() { return ndriverID(address()); }
    /** an array of {@link VK10#VK_MAX_DRIVER_NAME_SIZE MAX_DRIVER_NAME_SIZE} {@code char} containing a null-terminated UTF-8 string which is the name of the driver. */
    @NativeType("char[VK_MAX_DRIVER_NAME_SIZE]")
    public ByteBuffer driverName() { return ndriverName(address()); }
    /** an array of {@link VK10#VK_MAX_DRIVER_NAME_SIZE MAX_DRIVER_NAME_SIZE} {@code char} containing a null-terminated UTF-8 string which is the name of the driver. */
    @NativeType("char[VK_MAX_DRIVER_NAME_SIZE]")
    public String driverNameString() { return ndriverNameString(address()); }
    /** an array of {@link VK10#VK_MAX_DRIVER_INFO_SIZE MAX_DRIVER_INFO_SIZE} {@code char} containing a null-terminated UTF-8 string with additional information about the driver. */
    @NativeType("char[VK_MAX_DRIVER_INFO_SIZE]")
    public ByteBuffer driverInfo() { return ndriverInfo(address()); }
    /** an array of {@link VK10#VK_MAX_DRIVER_INFO_SIZE MAX_DRIVER_INFO_SIZE} {@code char} containing a null-terminated UTF-8 string with additional information about the driver. */
    @NativeType("char[VK_MAX_DRIVER_INFO_SIZE]")
    public String driverInfoString() { return ndriverInfoString(address()); }
    /** the version of the Vulkan conformance test this driver is conformant against (see {@link VkConformanceVersion}). */
    public VkConformanceVersion conformanceVersion() { return nconformanceVersion(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceDriverProperties sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DRIVER_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_DRIVER_PROPERTIES} value to the {@link #sType} field. */
    public VkPhysicalDeviceDriverProperties sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DRIVER_PROPERTIES); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceDriverProperties pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceDriverProperties set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceDriverProperties set(VkPhysicalDeviceDriverProperties src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceDriverProperties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDriverProperties malloc() {
        return wrap(VkPhysicalDeviceDriverProperties.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceDriverProperties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDriverProperties calloc() {
        return wrap(VkPhysicalDeviceDriverProperties.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceDriverProperties} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceDriverProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceDriverProperties.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceDriverProperties} instance for the specified memory address. */
    public static VkPhysicalDeviceDriverProperties create(long address) {
        return wrap(VkPhysicalDeviceDriverProperties.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceDriverProperties createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceDriverProperties.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDriverProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDriverProperties.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDriverProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDriverProperties.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDriverProperties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDriverProperties.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceDriverProperties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDriverProperties.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceDriverProperties.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDriverProperties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDriverProperties malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceDriverProperties.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDriverProperties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDriverProperties calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceDriverProperties.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDriverProperties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDriverProperties.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDriverProperties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDriverProperties.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDriverProperties.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceDriverProperties.PNEXT); }
    /** Unsafe version of {@link #driverID}. */
    public static int ndriverID(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDriverProperties.DRIVERID); }
    /** Unsafe version of {@link #driverName}. */
    public static ByteBuffer ndriverName(long struct) { return memByteBuffer(struct + VkPhysicalDeviceDriverProperties.DRIVERNAME, VK_MAX_DRIVER_NAME_SIZE); }
    /** Unsafe version of {@link #driverNameString}. */
    public static String ndriverNameString(long struct) { return memUTF8(struct + VkPhysicalDeviceDriverProperties.DRIVERNAME); }
    /** Unsafe version of {@link #driverInfo}. */
    public static ByteBuffer ndriverInfo(long struct) { return memByteBuffer(struct + VkPhysicalDeviceDriverProperties.DRIVERINFO, VK_MAX_DRIVER_INFO_SIZE); }
    /** Unsafe version of {@link #driverInfoString}. */
    public static String ndriverInfoString(long struct) { return memUTF8(struct + VkPhysicalDeviceDriverProperties.DRIVERINFO); }
    /** Unsafe version of {@link #conformanceVersion}. */
    public static VkConformanceVersion nconformanceVersion(long struct) { return VkConformanceVersion.create(struct + VkPhysicalDeviceDriverProperties.CONFORMANCEVERSION); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDriverProperties.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceDriverProperties.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceDriverProperties} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDriverProperties, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceDriverProperties ELEMENT_FACTORY = VkPhysicalDeviceDriverProperties.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceDriverProperties.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceDriverProperties#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceDriverProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceDriverProperties#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceDriverProperties.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDriverProperties#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceDriverProperties.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDriverProperties#driverID} field. */
        @NativeType("VkDriverId")
        public int driverID() { return VkPhysicalDeviceDriverProperties.ndriverID(address()); }
        /** @return a {@link ByteBuffer} view of the {@link VkPhysicalDeviceDriverProperties#driverName} field. */
        @NativeType("char[VK_MAX_DRIVER_NAME_SIZE]")
        public ByteBuffer driverName() { return VkPhysicalDeviceDriverProperties.ndriverName(address()); }
        /** @return the null-terminated string stored in the {@link VkPhysicalDeviceDriverProperties#driverName} field. */
        @NativeType("char[VK_MAX_DRIVER_NAME_SIZE]")
        public String driverNameString() { return VkPhysicalDeviceDriverProperties.ndriverNameString(address()); }
        /** @return a {@link ByteBuffer} view of the {@link VkPhysicalDeviceDriverProperties#driverInfo} field. */
        @NativeType("char[VK_MAX_DRIVER_INFO_SIZE]")
        public ByteBuffer driverInfo() { return VkPhysicalDeviceDriverProperties.ndriverInfo(address()); }
        /** @return the null-terminated string stored in the {@link VkPhysicalDeviceDriverProperties#driverInfo} field. */
        @NativeType("char[VK_MAX_DRIVER_INFO_SIZE]")
        public String driverInfoString() { return VkPhysicalDeviceDriverProperties.ndriverInfoString(address()); }
        /** @return a {@link VkConformanceVersion} view of the {@link VkPhysicalDeviceDriverProperties#conformanceVersion} field. */
        public VkConformanceVersion conformanceVersion() { return VkPhysicalDeviceDriverProperties.nconformanceVersion(address()); }

        /** Sets the specified value to the {@link VkPhysicalDeviceDriverProperties#sType} field. */
        public VkPhysicalDeviceDriverProperties.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceDriverProperties.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DRIVER_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_DRIVER_PROPERTIES} value to the {@link VkPhysicalDeviceDriverProperties#sType} field. */
        public VkPhysicalDeviceDriverProperties.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DRIVER_PROPERTIES); }
        /** Sets the specified value to the {@link VkPhysicalDeviceDriverProperties#pNext} field. */
        public VkPhysicalDeviceDriverProperties.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceDriverProperties.npNext(address(), value); return this; }

    }

}