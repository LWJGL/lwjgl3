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
 * Structure describing features to disable seamless cube maps.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTNonSeamlessCubeMap#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_NON_SEAMLESS_CUBE_MAP_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_NON_SEAMLESS_CUBE_MAP_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #nonSeamlessCubeMap};
 * }</code></pre>
 */
public class VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT extends Struct<VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        NONSEAMLESSCUBEMAP;

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
        NONSEAMLESSCUBEMAP = layout.offsetof(2);
    }

    protected VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT(ByteBuffer container) {
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
    /** indicates that the implementation supports {@link EXTNonSeamlessCubeMap#VK_SAMPLER_CREATE_NON_SEAMLESS_CUBE_MAP_BIT_EXT SAMPLER_CREATE_NON_SEAMLESS_CUBE_MAP_BIT_EXT}. */
    @NativeType("VkBool32")
    public boolean nonSeamlessCubeMap() { return nnonSeamlessCubeMap(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTNonSeamlessCubeMap#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_NON_SEAMLESS_CUBE_MAP_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_NON_SEAMLESS_CUBE_MAP_FEATURES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT sType$Default() { return sType(EXTNonSeamlessCubeMap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_NON_SEAMLESS_CUBE_MAP_FEATURES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #nonSeamlessCubeMap} field. */
    public VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT nonSeamlessCubeMap(@NativeType("VkBool32") boolean value) { nnonSeamlessCubeMap(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT set(
        int sType,
        long pNext,
        boolean nonSeamlessCubeMap
    ) {
        sType(sType);
        pNext(pNext);
        nonSeamlessCubeMap(nonSeamlessCubeMap);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT set(VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT malloc() {
        return new VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT calloc() {
        return new VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT create(long address) {
        return new VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #nonSeamlessCubeMap}. */
    public static int nnonSeamlessCubeMap(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT.NONSEAMLESSCUBEMAP); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #nonSeamlessCubeMap(boolean) nonSeamlessCubeMap}. */
    public static void nnonSeamlessCubeMap(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT.NONSEAMLESSCUBEMAP, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT#nonSeamlessCubeMap} field. */
        @NativeType("VkBool32")
        public boolean nonSeamlessCubeMap() { return VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT.nnonSeamlessCubeMap(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT#sType} field. */
        public VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTNonSeamlessCubeMap#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_NON_SEAMLESS_CUBE_MAP_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_NON_SEAMLESS_CUBE_MAP_FEATURES_EXT} value to the {@link VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT#sType} field. */
        public VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT.Buffer sType$Default() { return sType(EXTNonSeamlessCubeMap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_NON_SEAMLESS_CUBE_MAP_FEATURES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT#pNext} field. */
        public VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT#nonSeamlessCubeMap} field. */
        public VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT.Buffer nonSeamlessCubeMap(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT.nnonSeamlessCubeMap(address(), value ? 1 : 0); return this; }

    }

}