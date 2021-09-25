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
 * Structure containing PCI bus information of a physical device.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDevicePCIBusInfoPropertiesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <p>These are properties of the PCI bus information of a physical device.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTPciBusInfo#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PCI_BUS_INFO_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_PCI_BUS_INFO_PROPERTIES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDevicePCIBusInfoPropertiesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     uint32_t {@link #pciDomain};
 *     uint32_t {@link #pciBus};
 *     uint32_t {@link #pciDevice};
 *     uint32_t {@link #pciFunction};
 * }</code></pre>
 */
public class VkPhysicalDevicePCIBusInfoPropertiesEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PCIDOMAIN,
        PCIBUS,
        PCIDEVICE,
        PCIFUNCTION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PCIDOMAIN = layout.offsetof(2);
        PCIBUS = layout.offsetof(3);
        PCIDEVICE = layout.offsetof(4);
        PCIFUNCTION = layout.offsetof(5);
    }

    /**
     * Creates a {@code VkPhysicalDevicePCIBusInfoPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDevicePCIBusInfoPropertiesEXT(ByteBuffer container) {
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
    /** the PCI bus domain. */
    @NativeType("uint32_t")
    public int pciDomain() { return npciDomain(address()); }
    /** the PCI bus identifier. */
    @NativeType("uint32_t")
    public int pciBus() { return npciBus(address()); }
    /** the PCI device identifier. */
    @NativeType("uint32_t")
    public int pciDevice() { return npciDevice(address()); }
    /** the PCI device function identifier. */
    @NativeType("uint32_t")
    public int pciFunction() { return npciFunction(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDevicePCIBusInfoPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTPciBusInfo#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PCI_BUS_INFO_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_PCI_BUS_INFO_PROPERTIES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDevicePCIBusInfoPropertiesEXT sType$Default() { return sType(EXTPciBusInfo.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PCI_BUS_INFO_PROPERTIES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDevicePCIBusInfoPropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDevicePCIBusInfoPropertiesEXT set(
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
    public VkPhysicalDevicePCIBusInfoPropertiesEXT set(VkPhysicalDevicePCIBusInfoPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDevicePCIBusInfoPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePCIBusInfoPropertiesEXT malloc() {
        return wrap(VkPhysicalDevicePCIBusInfoPropertiesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDevicePCIBusInfoPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePCIBusInfoPropertiesEXT calloc() {
        return wrap(VkPhysicalDevicePCIBusInfoPropertiesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDevicePCIBusInfoPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDevicePCIBusInfoPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDevicePCIBusInfoPropertiesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDevicePCIBusInfoPropertiesEXT} instance for the specified memory address. */
    public static VkPhysicalDevicePCIBusInfoPropertiesEXT create(long address) {
        return wrap(VkPhysicalDevicePCIBusInfoPropertiesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDevicePCIBusInfoPropertiesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDevicePCIBusInfoPropertiesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePCIBusInfoPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePCIBusInfoPropertiesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePCIBusInfoPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePCIBusInfoPropertiesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePCIBusInfoPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePCIBusInfoPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDevicePCIBusInfoPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePCIBusInfoPropertiesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDevicePCIBusInfoPropertiesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDevicePCIBusInfoPropertiesEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDevicePCIBusInfoPropertiesEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDevicePCIBusInfoPropertiesEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDevicePCIBusInfoPropertiesEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDevicePCIBusInfoPropertiesEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDevicePCIBusInfoPropertiesEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDevicePCIBusInfoPropertiesEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDevicePCIBusInfoPropertiesEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDevicePCIBusInfoPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePCIBusInfoPropertiesEXT malloc(MemoryStack stack) {
        return wrap(VkPhysicalDevicePCIBusInfoPropertiesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDevicePCIBusInfoPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePCIBusInfoPropertiesEXT calloc(MemoryStack stack) {
        return wrap(VkPhysicalDevicePCIBusInfoPropertiesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDevicePCIBusInfoPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePCIBusInfoPropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePCIBusInfoPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePCIBusInfoPropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDevicePCIBusInfoPropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDevicePCIBusInfoPropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #pciDomain}. */
    public static int npciDomain(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDevicePCIBusInfoPropertiesEXT.PCIDOMAIN); }
    /** Unsafe version of {@link #pciBus}. */
    public static int npciBus(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDevicePCIBusInfoPropertiesEXT.PCIBUS); }
    /** Unsafe version of {@link #pciDevice}. */
    public static int npciDevice(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDevicePCIBusInfoPropertiesEXT.PCIDEVICE); }
    /** Unsafe version of {@link #pciFunction}. */
    public static int npciFunction(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDevicePCIBusInfoPropertiesEXT.PCIFUNCTION); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDevicePCIBusInfoPropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDevicePCIBusInfoPropertiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDevicePCIBusInfoPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePCIBusInfoPropertiesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDevicePCIBusInfoPropertiesEXT ELEMENT_FACTORY = VkPhysicalDevicePCIBusInfoPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDevicePCIBusInfoPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDevicePCIBusInfoPropertiesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDevicePCIBusInfoPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDevicePCIBusInfoPropertiesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDevicePCIBusInfoPropertiesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDevicePCIBusInfoPropertiesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDevicePCIBusInfoPropertiesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDevicePCIBusInfoPropertiesEXT#pciDomain} field. */
        @NativeType("uint32_t")
        public int pciDomain() { return VkPhysicalDevicePCIBusInfoPropertiesEXT.npciDomain(address()); }
        /** @return the value of the {@link VkPhysicalDevicePCIBusInfoPropertiesEXT#pciBus} field. */
        @NativeType("uint32_t")
        public int pciBus() { return VkPhysicalDevicePCIBusInfoPropertiesEXT.npciBus(address()); }
        /** @return the value of the {@link VkPhysicalDevicePCIBusInfoPropertiesEXT#pciDevice} field. */
        @NativeType("uint32_t")
        public int pciDevice() { return VkPhysicalDevicePCIBusInfoPropertiesEXT.npciDevice(address()); }
        /** @return the value of the {@link VkPhysicalDevicePCIBusInfoPropertiesEXT#pciFunction} field. */
        @NativeType("uint32_t")
        public int pciFunction() { return VkPhysicalDevicePCIBusInfoPropertiesEXT.npciFunction(address()); }

        /** Sets the specified value to the {@link VkPhysicalDevicePCIBusInfoPropertiesEXT#sType} field. */
        public VkPhysicalDevicePCIBusInfoPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDevicePCIBusInfoPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTPciBusInfo#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PCI_BUS_INFO_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_PCI_BUS_INFO_PROPERTIES_EXT} value to the {@link VkPhysicalDevicePCIBusInfoPropertiesEXT#sType} field. */
        public VkPhysicalDevicePCIBusInfoPropertiesEXT.Buffer sType$Default() { return sType(EXTPciBusInfo.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PCI_BUS_INFO_PROPERTIES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDevicePCIBusInfoPropertiesEXT#pNext} field. */
        public VkPhysicalDevicePCIBusInfoPropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDevicePCIBusInfoPropertiesEXT.npNext(address(), value); return this; }

    }

}