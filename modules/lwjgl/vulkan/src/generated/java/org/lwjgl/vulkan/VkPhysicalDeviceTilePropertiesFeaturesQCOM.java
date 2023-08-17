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
 * Structure describing tile properties features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceTilePropertiesFeaturesQCOM} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceTilePropertiesFeaturesQCOM} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link QCOMTileProperties#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_PROPERTIES_FEATURES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_PROPERTIES_FEATURES_QCOM}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceTilePropertiesFeaturesQCOM {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #tileProperties};
 * }</code></pre>
 */
public class VkPhysicalDeviceTilePropertiesFeaturesQCOM extends Struct<VkPhysicalDeviceTilePropertiesFeaturesQCOM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        TILEPROPERTIES;

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
        TILEPROPERTIES = layout.offsetof(2);
    }

    protected VkPhysicalDeviceTilePropertiesFeaturesQCOM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceTilePropertiesFeaturesQCOM create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceTilePropertiesFeaturesQCOM(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceTilePropertiesFeaturesQCOM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceTilePropertiesFeaturesQCOM(ByteBuffer container) {
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
    /** indicates that the implementation supports queries for returning tile properties. */
    @NativeType("VkBool32")
    public boolean tileProperties() { return ntileProperties(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceTilePropertiesFeaturesQCOM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link QCOMTileProperties#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_PROPERTIES_FEATURES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_PROPERTIES_FEATURES_QCOM} value to the {@link #sType} field. */
    public VkPhysicalDeviceTilePropertiesFeaturesQCOM sType$Default() { return sType(QCOMTileProperties.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_PROPERTIES_FEATURES_QCOM); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceTilePropertiesFeaturesQCOM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #tileProperties} field. */
    public VkPhysicalDeviceTilePropertiesFeaturesQCOM tileProperties(@NativeType("VkBool32") boolean value) { ntileProperties(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceTilePropertiesFeaturesQCOM set(
        int sType,
        long pNext,
        boolean tileProperties
    ) {
        sType(sType);
        pNext(pNext);
        tileProperties(tileProperties);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceTilePropertiesFeaturesQCOM set(VkPhysicalDeviceTilePropertiesFeaturesQCOM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceTilePropertiesFeaturesQCOM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceTilePropertiesFeaturesQCOM malloc() {
        return new VkPhysicalDeviceTilePropertiesFeaturesQCOM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceTilePropertiesFeaturesQCOM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceTilePropertiesFeaturesQCOM calloc() {
        return new VkPhysicalDeviceTilePropertiesFeaturesQCOM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceTilePropertiesFeaturesQCOM} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceTilePropertiesFeaturesQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceTilePropertiesFeaturesQCOM(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceTilePropertiesFeaturesQCOM} instance for the specified memory address. */
    public static VkPhysicalDeviceTilePropertiesFeaturesQCOM create(long address) {
        return new VkPhysicalDeviceTilePropertiesFeaturesQCOM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceTilePropertiesFeaturesQCOM createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceTilePropertiesFeaturesQCOM(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTilePropertiesFeaturesQCOM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTilePropertiesFeaturesQCOM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTilePropertiesFeaturesQCOM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTilePropertiesFeaturesQCOM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTilePropertiesFeaturesQCOM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTilePropertiesFeaturesQCOM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceTilePropertiesFeaturesQCOM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTilePropertiesFeaturesQCOM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceTilePropertiesFeaturesQCOM.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceTilePropertiesFeaturesQCOM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceTilePropertiesFeaturesQCOM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceTilePropertiesFeaturesQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceTilePropertiesFeaturesQCOM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceTilePropertiesFeaturesQCOM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceTilePropertiesFeaturesQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTilePropertiesFeaturesQCOM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTilePropertiesFeaturesQCOM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTilePropertiesFeaturesQCOM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTilePropertiesFeaturesQCOM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceTilePropertiesFeaturesQCOM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceTilePropertiesFeaturesQCOM.PNEXT); }
    /** Unsafe version of {@link #tileProperties}. */
    public static int ntileProperties(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceTilePropertiesFeaturesQCOM.TILEPROPERTIES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceTilePropertiesFeaturesQCOM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceTilePropertiesFeaturesQCOM.PNEXT, value); }
    /** Unsafe version of {@link #tileProperties(boolean) tileProperties}. */
    public static void ntileProperties(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceTilePropertiesFeaturesQCOM.TILEPROPERTIES, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceTilePropertiesFeaturesQCOM} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceTilePropertiesFeaturesQCOM, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceTilePropertiesFeaturesQCOM ELEMENT_FACTORY = VkPhysicalDeviceTilePropertiesFeaturesQCOM.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceTilePropertiesFeaturesQCOM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceTilePropertiesFeaturesQCOM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceTilePropertiesFeaturesQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceTilePropertiesFeaturesQCOM#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceTilePropertiesFeaturesQCOM.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceTilePropertiesFeaturesQCOM#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceTilePropertiesFeaturesQCOM.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceTilePropertiesFeaturesQCOM#tileProperties} field. */
        @NativeType("VkBool32")
        public boolean tileProperties() { return VkPhysicalDeviceTilePropertiesFeaturesQCOM.ntileProperties(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceTilePropertiesFeaturesQCOM#sType} field. */
        public VkPhysicalDeviceTilePropertiesFeaturesQCOM.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceTilePropertiesFeaturesQCOM.nsType(address(), value); return this; }
        /** Sets the {@link QCOMTileProperties#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_PROPERTIES_FEATURES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_PROPERTIES_FEATURES_QCOM} value to the {@link VkPhysicalDeviceTilePropertiesFeaturesQCOM#sType} field. */
        public VkPhysicalDeviceTilePropertiesFeaturesQCOM.Buffer sType$Default() { return sType(QCOMTileProperties.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_PROPERTIES_FEATURES_QCOM); }
        /** Sets the specified value to the {@link VkPhysicalDeviceTilePropertiesFeaturesQCOM#pNext} field. */
        public VkPhysicalDeviceTilePropertiesFeaturesQCOM.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceTilePropertiesFeaturesQCOM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceTilePropertiesFeaturesQCOM#tileProperties} field. */
        public VkPhysicalDeviceTilePropertiesFeaturesQCOM.Buffer tileProperties(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceTilePropertiesFeaturesQCOM.ntileProperties(address(), value ? 1 : 0); return this; }

    }

}