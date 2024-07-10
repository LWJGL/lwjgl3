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
 * Structure describing a single layered implementation underneath the Vulkan physical device.
 * 
 * <h5>Description</h5>
 * 
 * <p>If {@code layeredAPI} is {@link KHRMaintenance7#VK_PHYSICAL_DEVICE_LAYERED_API_VULKAN_KHR PHYSICAL_DEVICE_LAYERED_API_VULKAN_KHR}, additional Vulkan-specific information can be queried by including the {@link VkPhysicalDeviceLayeredApiVulkanPropertiesKHR} structure in the {@code pNext} chain. Otherwise if such a structure is included in the {@code pNext} chain, it is ignored.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRMaintenance7#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL} or a pointer to a valid instance of {@link VkPhysicalDeviceLayeredApiVulkanPropertiesKHR}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkPhysicalDeviceLayeredApiPropertiesListKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceLayeredApiPropertiesKHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     uint32_t {@link #vendorID};
 *     uint32_t {@link #deviceID};
 *     VkPhysicalDeviceLayeredApiKHR {@link #layeredAPI};
 *     char {@link #deviceName}[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE];
 * }</code></pre>
 */
public class VkPhysicalDeviceLayeredApiPropertiesKHR extends Struct<VkPhysicalDeviceLayeredApiPropertiesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        VENDORID,
        DEVICEID,
        LAYEREDAPI,
        DEVICENAME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __array(1, VK_MAX_PHYSICAL_DEVICE_NAME_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        VENDORID = layout.offsetof(2);
        DEVICEID = layout.offsetof(3);
        LAYEREDAPI = layout.offsetof(4);
        DEVICENAME = layout.offsetof(5);
    }

    protected VkPhysicalDeviceLayeredApiPropertiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceLayeredApiPropertiesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceLayeredApiPropertiesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceLayeredApiPropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceLayeredApiPropertiesKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** a unique identifier for the vendor of the layered implementation. */
    @NativeType("uint32_t")
    public int vendorID() { return nvendorID(address()); }
    /** a unique identifier for the layered implementation among devices available from the vendor. */
    @NativeType("uint32_t")
    public int deviceID() { return ndeviceID(address()); }
    /** a {@code VkPhysicalDeviceLayeredApiKHR} specifying the API implemented by the layered implementation. */
    @NativeType("VkPhysicalDeviceLayeredApiKHR")
    public int layeredAPI() { return nlayeredAPI(address()); }
    /** an array of {@link VK10#VK_MAX_PHYSICAL_DEVICE_NAME_SIZE MAX_PHYSICAL_DEVICE_NAME_SIZE} {@code char} containing a null-terminated UTF-8 string which is the name of the device. */
    @NativeType("char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]")
    public ByteBuffer deviceName() { return ndeviceName(address()); }
    /** an array of {@link VK10#VK_MAX_PHYSICAL_DEVICE_NAME_SIZE MAX_PHYSICAL_DEVICE_NAME_SIZE} {@code char} containing a null-terminated UTF-8 string which is the name of the device. */
    @NativeType("char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]")
    public String deviceNameString() { return ndeviceNameString(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceLayeredApiPropertiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRMaintenance7#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_KHR} value to the {@link #sType} field. */
    public VkPhysicalDeviceLayeredApiPropertiesKHR sType$Default() { return sType(KHRMaintenance7.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceLayeredApiPropertiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkPhysicalDeviceLayeredApiVulkanPropertiesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceLayeredApiPropertiesKHR pNext(VkPhysicalDeviceLayeredApiVulkanPropertiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceLayeredApiPropertiesKHR set(
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
    public VkPhysicalDeviceLayeredApiPropertiesKHR set(VkPhysicalDeviceLayeredApiPropertiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceLayeredApiPropertiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceLayeredApiPropertiesKHR malloc() {
        return new VkPhysicalDeviceLayeredApiPropertiesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceLayeredApiPropertiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceLayeredApiPropertiesKHR calloc() {
        return new VkPhysicalDeviceLayeredApiPropertiesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceLayeredApiPropertiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceLayeredApiPropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceLayeredApiPropertiesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceLayeredApiPropertiesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceLayeredApiPropertiesKHR create(long address) {
        return new VkPhysicalDeviceLayeredApiPropertiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceLayeredApiPropertiesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceLayeredApiPropertiesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLayeredApiPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLayeredApiPropertiesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLayeredApiPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLayeredApiPropertiesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLayeredApiPropertiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLayeredApiPropertiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceLayeredApiPropertiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLayeredApiPropertiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceLayeredApiPropertiesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceLayeredApiPropertiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceLayeredApiPropertiesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceLayeredApiPropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceLayeredApiPropertiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceLayeredApiPropertiesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceLayeredApiPropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLayeredApiPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLayeredApiPropertiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLayeredApiPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLayeredApiPropertiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLayeredApiPropertiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceLayeredApiPropertiesKHR.PNEXT); }
    /** Unsafe version of {@link #vendorID}. */
    public static int nvendorID(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLayeredApiPropertiesKHR.VENDORID); }
    /** Unsafe version of {@link #deviceID}. */
    public static int ndeviceID(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLayeredApiPropertiesKHR.DEVICEID); }
    /** Unsafe version of {@link #layeredAPI}. */
    public static int nlayeredAPI(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLayeredApiPropertiesKHR.LAYEREDAPI); }
    /** Unsafe version of {@link #deviceName}. */
    public static ByteBuffer ndeviceName(long struct) { return memByteBuffer(struct + VkPhysicalDeviceLayeredApiPropertiesKHR.DEVICENAME, VK_MAX_PHYSICAL_DEVICE_NAME_SIZE); }
    /** Unsafe version of {@link #deviceNameString}. */
    public static String ndeviceNameString(long struct) { return memUTF8(struct + VkPhysicalDeviceLayeredApiPropertiesKHR.DEVICENAME); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceLayeredApiPropertiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceLayeredApiPropertiesKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceLayeredApiPropertiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceLayeredApiPropertiesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceLayeredApiPropertiesKHR ELEMENT_FACTORY = VkPhysicalDeviceLayeredApiPropertiesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceLayeredApiPropertiesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceLayeredApiPropertiesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceLayeredApiPropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceLayeredApiPropertiesKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceLayeredApiPropertiesKHR.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLayeredApiPropertiesKHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceLayeredApiPropertiesKHR.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLayeredApiPropertiesKHR#vendorID} field. */
        @NativeType("uint32_t")
        public int vendorID() { return VkPhysicalDeviceLayeredApiPropertiesKHR.nvendorID(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLayeredApiPropertiesKHR#deviceID} field. */
        @NativeType("uint32_t")
        public int deviceID() { return VkPhysicalDeviceLayeredApiPropertiesKHR.ndeviceID(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLayeredApiPropertiesKHR#layeredAPI} field. */
        @NativeType("VkPhysicalDeviceLayeredApiKHR")
        public int layeredAPI() { return VkPhysicalDeviceLayeredApiPropertiesKHR.nlayeredAPI(address()); }
        /** @return a {@link ByteBuffer} view of the {@link VkPhysicalDeviceLayeredApiPropertiesKHR#deviceName} field. */
        @NativeType("char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]")
        public ByteBuffer deviceName() { return VkPhysicalDeviceLayeredApiPropertiesKHR.ndeviceName(address()); }
        /** @return the null-terminated string stored in the {@link VkPhysicalDeviceLayeredApiPropertiesKHR#deviceName} field. */
        @NativeType("char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]")
        public String deviceNameString() { return VkPhysicalDeviceLayeredApiPropertiesKHR.ndeviceNameString(address()); }

        /** Sets the specified value to the {@link VkPhysicalDeviceLayeredApiPropertiesKHR#sType} field. */
        public VkPhysicalDeviceLayeredApiPropertiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceLayeredApiPropertiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRMaintenance7#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_KHR} value to the {@link VkPhysicalDeviceLayeredApiPropertiesKHR#sType} field. */
        public VkPhysicalDeviceLayeredApiPropertiesKHR.Buffer sType$Default() { return sType(KHRMaintenance7.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_KHR); }
        /** Sets the specified value to the {@link VkPhysicalDeviceLayeredApiPropertiesKHR#pNext} field. */
        public VkPhysicalDeviceLayeredApiPropertiesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceLayeredApiPropertiesKHR.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkPhysicalDeviceLayeredApiVulkanPropertiesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceLayeredApiPropertiesKHR.Buffer pNext(VkPhysicalDeviceLayeredApiVulkanPropertiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }

    }

}