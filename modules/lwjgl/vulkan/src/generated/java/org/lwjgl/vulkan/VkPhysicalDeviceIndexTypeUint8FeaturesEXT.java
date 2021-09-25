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
 * Structure describing whether uint8 index type can be used.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceIndexTypeUint8FeaturesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceIndexTypeUint8FeaturesEXT} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTIndexTypeUint8#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INDEX_TYPE_UINT8_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_INDEX_TYPE_UINT8_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceIndexTypeUint8FeaturesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #indexTypeUint8};
 * }</code></pre>
 */
public class VkPhysicalDeviceIndexTypeUint8FeaturesEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        INDEXTYPEUINT8;

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
        INDEXTYPEUINT8 = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceIndexTypeUint8FeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceIndexTypeUint8FeaturesEXT(ByteBuffer container) {
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
    /** indicates that {@link EXTIndexTypeUint8#VK_INDEX_TYPE_UINT8_EXT INDEX_TYPE_UINT8_EXT} can be used with {@link VK10#vkCmdBindIndexBuffer CmdBindIndexBuffer}. */
    @NativeType("VkBool32")
    public boolean indexTypeUint8() { return nindexTypeUint8(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceIndexTypeUint8FeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTIndexTypeUint8#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INDEX_TYPE_UINT8_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_INDEX_TYPE_UINT8_FEATURES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceIndexTypeUint8FeaturesEXT sType$Default() { return sType(EXTIndexTypeUint8.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INDEX_TYPE_UINT8_FEATURES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceIndexTypeUint8FeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #indexTypeUint8} field. */
    public VkPhysicalDeviceIndexTypeUint8FeaturesEXT indexTypeUint8(@NativeType("VkBool32") boolean value) { nindexTypeUint8(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceIndexTypeUint8FeaturesEXT set(
        int sType,
        long pNext,
        boolean indexTypeUint8
    ) {
        sType(sType);
        pNext(pNext);
        indexTypeUint8(indexTypeUint8);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceIndexTypeUint8FeaturesEXT set(VkPhysicalDeviceIndexTypeUint8FeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceIndexTypeUint8FeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceIndexTypeUint8FeaturesEXT malloc() {
        return wrap(VkPhysicalDeviceIndexTypeUint8FeaturesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceIndexTypeUint8FeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceIndexTypeUint8FeaturesEXT calloc() {
        return wrap(VkPhysicalDeviceIndexTypeUint8FeaturesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceIndexTypeUint8FeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceIndexTypeUint8FeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceIndexTypeUint8FeaturesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceIndexTypeUint8FeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceIndexTypeUint8FeaturesEXT create(long address) {
        return wrap(VkPhysicalDeviceIndexTypeUint8FeaturesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceIndexTypeUint8FeaturesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceIndexTypeUint8FeaturesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceIndexTypeUint8FeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceIndexTypeUint8FeaturesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceIndexTypeUint8FeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceIndexTypeUint8FeaturesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceIndexTypeUint8FeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceIndexTypeUint8FeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceIndexTypeUint8FeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceIndexTypeUint8FeaturesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceIndexTypeUint8FeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceIndexTypeUint8FeaturesEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceIndexTypeUint8FeaturesEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceIndexTypeUint8FeaturesEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceIndexTypeUint8FeaturesEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceIndexTypeUint8FeaturesEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceIndexTypeUint8FeaturesEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceIndexTypeUint8FeaturesEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceIndexTypeUint8FeaturesEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceIndexTypeUint8FeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceIndexTypeUint8FeaturesEXT malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceIndexTypeUint8FeaturesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceIndexTypeUint8FeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceIndexTypeUint8FeaturesEXT calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceIndexTypeUint8FeaturesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceIndexTypeUint8FeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceIndexTypeUint8FeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceIndexTypeUint8FeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceIndexTypeUint8FeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceIndexTypeUint8FeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceIndexTypeUint8FeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #indexTypeUint8}. */
    public static int nindexTypeUint8(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceIndexTypeUint8FeaturesEXT.INDEXTYPEUINT8); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceIndexTypeUint8FeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceIndexTypeUint8FeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #indexTypeUint8(boolean) indexTypeUint8}. */
    public static void nindexTypeUint8(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceIndexTypeUint8FeaturesEXT.INDEXTYPEUINT8, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceIndexTypeUint8FeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceIndexTypeUint8FeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceIndexTypeUint8FeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceIndexTypeUint8FeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceIndexTypeUint8FeaturesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceIndexTypeUint8FeaturesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceIndexTypeUint8FeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceIndexTypeUint8FeaturesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceIndexTypeUint8FeaturesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceIndexTypeUint8FeaturesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceIndexTypeUint8FeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceIndexTypeUint8FeaturesEXT#indexTypeUint8} field. */
        @NativeType("VkBool32")
        public boolean indexTypeUint8() { return VkPhysicalDeviceIndexTypeUint8FeaturesEXT.nindexTypeUint8(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceIndexTypeUint8FeaturesEXT#sType} field. */
        public VkPhysicalDeviceIndexTypeUint8FeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceIndexTypeUint8FeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTIndexTypeUint8#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INDEX_TYPE_UINT8_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_INDEX_TYPE_UINT8_FEATURES_EXT} value to the {@link VkPhysicalDeviceIndexTypeUint8FeaturesEXT#sType} field. */
        public VkPhysicalDeviceIndexTypeUint8FeaturesEXT.Buffer sType$Default() { return sType(EXTIndexTypeUint8.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INDEX_TYPE_UINT8_FEATURES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceIndexTypeUint8FeaturesEXT#pNext} field. */
        public VkPhysicalDeviceIndexTypeUint8FeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceIndexTypeUint8FeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceIndexTypeUint8FeaturesEXT#indexTypeUint8} field. */
        public VkPhysicalDeviceIndexTypeUint8FeaturesEXT.Buffer indexTypeUint8(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceIndexTypeUint8FeaturesEXT.nindexTypeUint8(address(), value ? 1 : 0); return this; }

    }

}