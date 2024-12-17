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
 * struct VkPhysicalDeviceHdrVividFeaturesHUAWEI {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 hdrVivid;
 * }}</pre>
 */
public class VkPhysicalDeviceHdrVividFeaturesHUAWEI extends Struct<VkPhysicalDeviceHdrVividFeaturesHUAWEI> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        HDRVIVID;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        HDRVIVID = layout.offsetof(2);
    }

    protected VkPhysicalDeviceHdrVividFeaturesHUAWEI(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceHdrVividFeaturesHUAWEI create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceHdrVividFeaturesHUAWEI(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceHdrVividFeaturesHUAWEI} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceHdrVividFeaturesHUAWEI(ByteBuffer container) {
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
    /** @return the value of the {@code hdrVivid} field. */
    @NativeType("VkBool32")
    public boolean hdrVivid() { return nhdrVivid(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceHdrVividFeaturesHUAWEI sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link HUAWEIHdrVivid#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HDR_VIVID_FEATURES_HUAWEI STRUCTURE_TYPE_PHYSICAL_DEVICE_HDR_VIVID_FEATURES_HUAWEI} value to the {@code sType} field. */
    public VkPhysicalDeviceHdrVividFeaturesHUAWEI sType$Default() { return sType(HUAWEIHdrVivid.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HDR_VIVID_FEATURES_HUAWEI); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceHdrVividFeaturesHUAWEI pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code hdrVivid} field. */
    public VkPhysicalDeviceHdrVividFeaturesHUAWEI hdrVivid(@NativeType("VkBool32") boolean value) { nhdrVivid(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceHdrVividFeaturesHUAWEI set(
        int sType,
        long pNext,
        boolean hdrVivid
    ) {
        sType(sType);
        pNext(pNext);
        hdrVivid(hdrVivid);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceHdrVividFeaturesHUAWEI set(VkPhysicalDeviceHdrVividFeaturesHUAWEI src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceHdrVividFeaturesHUAWEI} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceHdrVividFeaturesHUAWEI malloc() {
        return new VkPhysicalDeviceHdrVividFeaturesHUAWEI(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceHdrVividFeaturesHUAWEI} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceHdrVividFeaturesHUAWEI calloc() {
        return new VkPhysicalDeviceHdrVividFeaturesHUAWEI(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceHdrVividFeaturesHUAWEI} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceHdrVividFeaturesHUAWEI create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceHdrVividFeaturesHUAWEI(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceHdrVividFeaturesHUAWEI} instance for the specified memory address. */
    public static VkPhysicalDeviceHdrVividFeaturesHUAWEI create(long address) {
        return new VkPhysicalDeviceHdrVividFeaturesHUAWEI(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceHdrVividFeaturesHUAWEI createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceHdrVividFeaturesHUAWEI(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceHdrVividFeaturesHUAWEI.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceHdrVividFeaturesHUAWEI.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceHdrVividFeaturesHUAWEI.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceHdrVividFeaturesHUAWEI.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceHdrVividFeaturesHUAWEI.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceHdrVividFeaturesHUAWEI.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceHdrVividFeaturesHUAWEI.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceHdrVividFeaturesHUAWEI.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceHdrVividFeaturesHUAWEI.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceHdrVividFeaturesHUAWEI} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceHdrVividFeaturesHUAWEI malloc(MemoryStack stack) {
        return new VkPhysicalDeviceHdrVividFeaturesHUAWEI(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceHdrVividFeaturesHUAWEI} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceHdrVividFeaturesHUAWEI calloc(MemoryStack stack) {
        return new VkPhysicalDeviceHdrVividFeaturesHUAWEI(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceHdrVividFeaturesHUAWEI.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceHdrVividFeaturesHUAWEI.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceHdrVividFeaturesHUAWEI.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceHdrVividFeaturesHUAWEI.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceHdrVividFeaturesHUAWEI.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceHdrVividFeaturesHUAWEI.PNEXT); }
    /** Unsafe version of {@link #hdrVivid}. */
    public static int nhdrVivid(long struct) { return memGetInt(struct + VkPhysicalDeviceHdrVividFeaturesHUAWEI.HDRVIVID); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceHdrVividFeaturesHUAWEI.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceHdrVividFeaturesHUAWEI.PNEXT, value); }
    /** Unsafe version of {@link #hdrVivid(boolean) hdrVivid}. */
    public static void nhdrVivid(long struct, int value) { memPutInt(struct + VkPhysicalDeviceHdrVividFeaturesHUAWEI.HDRVIVID, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceHdrVividFeaturesHUAWEI} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceHdrVividFeaturesHUAWEI, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceHdrVividFeaturesHUAWEI ELEMENT_FACTORY = VkPhysicalDeviceHdrVividFeaturesHUAWEI.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceHdrVividFeaturesHUAWEI.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceHdrVividFeaturesHUAWEI#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceHdrVividFeaturesHUAWEI getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceHdrVividFeaturesHUAWEI.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceHdrVividFeaturesHUAWEI.npNext(address()); }
        /** @return the value of the {@code hdrVivid} field. */
        @NativeType("VkBool32")
        public boolean hdrVivid() { return VkPhysicalDeviceHdrVividFeaturesHUAWEI.nhdrVivid(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceHdrVividFeaturesHUAWEI.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceHdrVividFeaturesHUAWEI.nsType(address(), value); return this; }
        /** Sets the {@link HUAWEIHdrVivid#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HDR_VIVID_FEATURES_HUAWEI STRUCTURE_TYPE_PHYSICAL_DEVICE_HDR_VIVID_FEATURES_HUAWEI} value to the {@code sType} field. */
        public VkPhysicalDeviceHdrVividFeaturesHUAWEI.Buffer sType$Default() { return sType(HUAWEIHdrVivid.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HDR_VIVID_FEATURES_HUAWEI); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceHdrVividFeaturesHUAWEI.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceHdrVividFeaturesHUAWEI.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code hdrVivid} field. */
        public VkPhysicalDeviceHdrVividFeaturesHUAWEI.Buffer hdrVivid(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceHdrVividFeaturesHUAWEI.nhdrVivid(address(), value ? 1 : 0); return this; }

    }

}