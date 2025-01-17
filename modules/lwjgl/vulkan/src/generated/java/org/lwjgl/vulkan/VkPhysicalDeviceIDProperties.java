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

import static org.lwjgl.vulkan.VK10.*;
import static org.lwjgl.vulkan.VK11.*;

/**
 * <pre>{@code
 * struct VkPhysicalDeviceIDProperties {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint8_t deviceUUID[VK_UUID_SIZE];
 *     uint8_t driverUUID[VK_UUID_SIZE];
 *     uint8_t deviceLUID[VK_LUID_SIZE];
 *     uint32_t deviceNodeMask;
 *     VkBool32 deviceLUIDValid;
 * }}</pre>
 */
public class VkPhysicalDeviceIDProperties extends Struct<VkPhysicalDeviceIDProperties> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DEVICEUUID,
        DRIVERUUID,
        DEVICELUID,
        DEVICENODEMASK,
        DEVICELUIDVALID;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __array(1, VK_UUID_SIZE),
            __array(1, VK_UUID_SIZE),
            __array(1, VK_LUID_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DEVICEUUID = layout.offsetof(2);
        DRIVERUUID = layout.offsetof(3);
        DEVICELUID = layout.offsetof(4);
        DEVICENODEMASK = layout.offsetof(5);
        DEVICELUIDVALID = layout.offsetof(6);
    }

    protected VkPhysicalDeviceIDProperties(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceIDProperties create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceIDProperties(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceIDProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceIDProperties(ByteBuffer container) {
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
    /** @return a {@link ByteBuffer} view of the {@code deviceUUID} field. */
    @NativeType("uint8_t[VK_UUID_SIZE]")
    public ByteBuffer deviceUUID() { return ndeviceUUID(address()); }
    /** @return the value at the specified index of the {@code deviceUUID} field. */
    @NativeType("uint8_t")
    public byte deviceUUID(int index) { return ndeviceUUID(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code driverUUID} field. */
    @NativeType("uint8_t[VK_UUID_SIZE]")
    public ByteBuffer driverUUID() { return ndriverUUID(address()); }
    /** @return the value at the specified index of the {@code driverUUID} field. */
    @NativeType("uint8_t")
    public byte driverUUID(int index) { return ndriverUUID(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code deviceLUID} field. */
    @NativeType("uint8_t[VK_LUID_SIZE]")
    public ByteBuffer deviceLUID() { return ndeviceLUID(address()); }
    /** @return the value at the specified index of the {@code deviceLUID} field. */
    @NativeType("uint8_t")
    public byte deviceLUID(int index) { return ndeviceLUID(address(), index); }
    /** @return the value of the {@code deviceNodeMask} field. */
    @NativeType("uint32_t")
    public int deviceNodeMask() { return ndeviceNodeMask(address()); }
    /** @return the value of the {@code deviceLUIDValid} field. */
    @NativeType("VkBool32")
    public boolean deviceLUIDValid() { return ndeviceLUIDValid(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceIDProperties sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES} value to the {@code sType} field. */
    public VkPhysicalDeviceIDProperties sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceIDProperties pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceIDProperties set(
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
    public VkPhysicalDeviceIDProperties set(VkPhysicalDeviceIDProperties src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceIDProperties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceIDProperties malloc() {
        return new VkPhysicalDeviceIDProperties(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceIDProperties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceIDProperties calloc() {
        return new VkPhysicalDeviceIDProperties(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceIDProperties} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceIDProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceIDProperties(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceIDProperties} instance for the specified memory address. */
    public static VkPhysicalDeviceIDProperties create(long address) {
        return new VkPhysicalDeviceIDProperties(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceIDProperties createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceIDProperties(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceIDProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceIDProperties.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceIDProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceIDProperties.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceIDProperties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceIDProperties.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceIDProperties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceIDProperties.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceIDProperties.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceIDProperties mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceIDProperties callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceIDProperties mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceIDProperties callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceIDProperties.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceIDProperties.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceIDProperties.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceIDProperties.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceIDProperties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceIDProperties malloc(MemoryStack stack) {
        return new VkPhysicalDeviceIDProperties(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceIDProperties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceIDProperties calloc(MemoryStack stack) {
        return new VkPhysicalDeviceIDProperties(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceIDProperties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceIDProperties.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceIDProperties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceIDProperties.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceIDProperties.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceIDProperties.PNEXT); }
    /** Unsafe version of {@link #deviceUUID}. */
    public static ByteBuffer ndeviceUUID(long struct) { return memByteBuffer(struct + VkPhysicalDeviceIDProperties.DEVICEUUID, VK_UUID_SIZE); }
    /** Unsafe version of {@link #deviceUUID(int) deviceUUID}. */
    public static byte ndeviceUUID(long struct, int index) {
        return memGetByte(struct + VkPhysicalDeviceIDProperties.DEVICEUUID + check(index, VK_UUID_SIZE) * 1);
    }
    /** Unsafe version of {@link #driverUUID}. */
    public static ByteBuffer ndriverUUID(long struct) { return memByteBuffer(struct + VkPhysicalDeviceIDProperties.DRIVERUUID, VK_UUID_SIZE); }
    /** Unsafe version of {@link #driverUUID(int) driverUUID}. */
    public static byte ndriverUUID(long struct, int index) {
        return memGetByte(struct + VkPhysicalDeviceIDProperties.DRIVERUUID + check(index, VK_UUID_SIZE) * 1);
    }
    /** Unsafe version of {@link #deviceLUID}. */
    public static ByteBuffer ndeviceLUID(long struct) { return memByteBuffer(struct + VkPhysicalDeviceIDProperties.DEVICELUID, VK_LUID_SIZE); }
    /** Unsafe version of {@link #deviceLUID(int) deviceLUID}. */
    public static byte ndeviceLUID(long struct, int index) {
        return memGetByte(struct + VkPhysicalDeviceIDProperties.DEVICELUID + check(index, VK_LUID_SIZE) * 1);
    }
    /** Unsafe version of {@link #deviceNodeMask}. */
    public static int ndeviceNodeMask(long struct) { return memGetInt(struct + VkPhysicalDeviceIDProperties.DEVICENODEMASK); }
    /** Unsafe version of {@link #deviceLUIDValid}. */
    public static int ndeviceLUIDValid(long struct) { return memGetInt(struct + VkPhysicalDeviceIDProperties.DEVICELUIDVALID); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceIDProperties.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceIDProperties.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceIDProperties} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceIDProperties, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceIDProperties ELEMENT_FACTORY = VkPhysicalDeviceIDProperties.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceIDProperties.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceIDProperties#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceIDProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceIDProperties.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceIDProperties.npNext(address()); }
        /** @return a {@link ByteBuffer} view of the {@code deviceUUID} field. */
        @NativeType("uint8_t[VK_UUID_SIZE]")
        public ByteBuffer deviceUUID() { return VkPhysicalDeviceIDProperties.ndeviceUUID(address()); }
        /** @return the value at the specified index of the {@code deviceUUID} field. */
        @NativeType("uint8_t")
        public byte deviceUUID(int index) { return VkPhysicalDeviceIDProperties.ndeviceUUID(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code driverUUID} field. */
        @NativeType("uint8_t[VK_UUID_SIZE]")
        public ByteBuffer driverUUID() { return VkPhysicalDeviceIDProperties.ndriverUUID(address()); }
        /** @return the value at the specified index of the {@code driverUUID} field. */
        @NativeType("uint8_t")
        public byte driverUUID(int index) { return VkPhysicalDeviceIDProperties.ndriverUUID(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code deviceLUID} field. */
        @NativeType("uint8_t[VK_LUID_SIZE]")
        public ByteBuffer deviceLUID() { return VkPhysicalDeviceIDProperties.ndeviceLUID(address()); }
        /** @return the value at the specified index of the {@code deviceLUID} field. */
        @NativeType("uint8_t")
        public byte deviceLUID(int index) { return VkPhysicalDeviceIDProperties.ndeviceLUID(address(), index); }
        /** @return the value of the {@code deviceNodeMask} field. */
        @NativeType("uint32_t")
        public int deviceNodeMask() { return VkPhysicalDeviceIDProperties.ndeviceNodeMask(address()); }
        /** @return the value of the {@code deviceLUIDValid} field. */
        @NativeType("VkBool32")
        public boolean deviceLUIDValid() { return VkPhysicalDeviceIDProperties.ndeviceLUIDValid(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceIDProperties.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceIDProperties.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES} value to the {@code sType} field. */
        public VkPhysicalDeviceIDProperties.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceIDProperties.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceIDProperties.npNext(address(), value); return this; }

    }

}