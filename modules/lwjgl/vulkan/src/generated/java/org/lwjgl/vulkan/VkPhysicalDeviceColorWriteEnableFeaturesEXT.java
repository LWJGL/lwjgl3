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
 * Structure describing whether writes to color attachments can be enabled and disabled dynamically.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceColorWriteEnableFeaturesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceColorWriteEnableFeaturesEXT} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTColorWriteEnable#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COLOR_WRITE_ENABLE_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_COLOR_WRITE_ENABLE_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceColorWriteEnableFeaturesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #colorWriteEnable};
 * }</code></pre>
 */
public class VkPhysicalDeviceColorWriteEnableFeaturesEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        COLORWRITEENABLE;

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
        COLORWRITEENABLE = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceColorWriteEnableFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceColorWriteEnableFeaturesEXT(ByteBuffer container) {
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
    /** indicates that the implementation supports the dynamic state {@link EXTColorWriteEnable#VK_DYNAMIC_STATE_COLOR_WRITE_ENABLE_EXT DYNAMIC_STATE_COLOR_WRITE_ENABLE_EXT}. */
    @NativeType("VkBool32")
    public boolean colorWriteEnable() { return ncolorWriteEnable(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceColorWriteEnableFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTColorWriteEnable#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COLOR_WRITE_ENABLE_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_COLOR_WRITE_ENABLE_FEATURES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceColorWriteEnableFeaturesEXT sType$Default() { return sType(EXTColorWriteEnable.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COLOR_WRITE_ENABLE_FEATURES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceColorWriteEnableFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #colorWriteEnable} field. */
    public VkPhysicalDeviceColorWriteEnableFeaturesEXT colorWriteEnable(@NativeType("VkBool32") boolean value) { ncolorWriteEnable(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceColorWriteEnableFeaturesEXT set(
        int sType,
        long pNext,
        boolean colorWriteEnable
    ) {
        sType(sType);
        pNext(pNext);
        colorWriteEnable(colorWriteEnable);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceColorWriteEnableFeaturesEXT set(VkPhysicalDeviceColorWriteEnableFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceColorWriteEnableFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceColorWriteEnableFeaturesEXT malloc() {
        return wrap(VkPhysicalDeviceColorWriteEnableFeaturesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceColorWriteEnableFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceColorWriteEnableFeaturesEXT calloc() {
        return wrap(VkPhysicalDeviceColorWriteEnableFeaturesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceColorWriteEnableFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceColorWriteEnableFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceColorWriteEnableFeaturesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceColorWriteEnableFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceColorWriteEnableFeaturesEXT create(long address) {
        return wrap(VkPhysicalDeviceColorWriteEnableFeaturesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceColorWriteEnableFeaturesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceColorWriteEnableFeaturesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceColorWriteEnableFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceColorWriteEnableFeaturesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceColorWriteEnableFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceColorWriteEnableFeaturesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceColorWriteEnableFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceColorWriteEnableFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceColorWriteEnableFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceColorWriteEnableFeaturesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceColorWriteEnableFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceColorWriteEnableFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceColorWriteEnableFeaturesEXT malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceColorWriteEnableFeaturesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceColorWriteEnableFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceColorWriteEnableFeaturesEXT calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceColorWriteEnableFeaturesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceColorWriteEnableFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceColorWriteEnableFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceColorWriteEnableFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceColorWriteEnableFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceColorWriteEnableFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceColorWriteEnableFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #colorWriteEnable}. */
    public static int ncolorWriteEnable(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceColorWriteEnableFeaturesEXT.COLORWRITEENABLE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceColorWriteEnableFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceColorWriteEnableFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #colorWriteEnable(boolean) colorWriteEnable}. */
    public static void ncolorWriteEnable(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceColorWriteEnableFeaturesEXT.COLORWRITEENABLE, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceColorWriteEnableFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceColorWriteEnableFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceColorWriteEnableFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceColorWriteEnableFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceColorWriteEnableFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceColorWriteEnableFeaturesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceColorWriteEnableFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceColorWriteEnableFeaturesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceColorWriteEnableFeaturesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceColorWriteEnableFeaturesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceColorWriteEnableFeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceColorWriteEnableFeaturesEXT#colorWriteEnable} field. */
        @NativeType("VkBool32")
        public boolean colorWriteEnable() { return VkPhysicalDeviceColorWriteEnableFeaturesEXT.ncolorWriteEnable(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceColorWriteEnableFeaturesEXT#sType} field. */
        public VkPhysicalDeviceColorWriteEnableFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceColorWriteEnableFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTColorWriteEnable#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COLOR_WRITE_ENABLE_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_COLOR_WRITE_ENABLE_FEATURES_EXT} value to the {@link VkPhysicalDeviceColorWriteEnableFeaturesEXT#sType} field. */
        public VkPhysicalDeviceColorWriteEnableFeaturesEXT.Buffer sType$Default() { return sType(EXTColorWriteEnable.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COLOR_WRITE_ENABLE_FEATURES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceColorWriteEnableFeaturesEXT#pNext} field. */
        public VkPhysicalDeviceColorWriteEnableFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceColorWriteEnableFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceColorWriteEnableFeaturesEXT#colorWriteEnable} field. */
        public VkPhysicalDeviceColorWriteEnableFeaturesEXT.Buffer colorWriteEnable(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceColorWriteEnableFeaturesEXT.ncolorWriteEnable(address(), value ? 1 : 0); return this; }

    }

}