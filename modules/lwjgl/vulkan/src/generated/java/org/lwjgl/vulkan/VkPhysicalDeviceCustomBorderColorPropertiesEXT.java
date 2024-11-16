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
 * Structure describing whether custom border colors can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceCustomBorderColorPropertiesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTCustomBorderColor#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_BORDER_COLOR_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_BORDER_COLOR_PROPERTIES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceCustomBorderColorPropertiesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t {@link #maxCustomBorderColorSamplers};
 * }</code></pre>
 */
public class VkPhysicalDeviceCustomBorderColorPropertiesEXT extends Struct<VkPhysicalDeviceCustomBorderColorPropertiesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXCUSTOMBORDERCOLORSAMPLERS;

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
        MAXCUSTOMBORDERCOLORSAMPLERS = layout.offsetof(2);
    }

    protected VkPhysicalDeviceCustomBorderColorPropertiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceCustomBorderColorPropertiesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceCustomBorderColorPropertiesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceCustomBorderColorPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceCustomBorderColorPropertiesEXT(ByteBuffer container) {
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
    /** indicates the maximum number of samplers with custom border colors which <b>can</b> simultaneously exist on a device. */
    @NativeType("uint32_t")
    public int maxCustomBorderColorSamplers() { return nmaxCustomBorderColorSamplers(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceCustomBorderColorPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTCustomBorderColor#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_BORDER_COLOR_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_BORDER_COLOR_PROPERTIES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceCustomBorderColorPropertiesEXT sType$Default() { return sType(EXTCustomBorderColor.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_BORDER_COLOR_PROPERTIES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceCustomBorderColorPropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceCustomBorderColorPropertiesEXT set(
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
    public VkPhysicalDeviceCustomBorderColorPropertiesEXT set(VkPhysicalDeviceCustomBorderColorPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceCustomBorderColorPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceCustomBorderColorPropertiesEXT malloc() {
        return new VkPhysicalDeviceCustomBorderColorPropertiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceCustomBorderColorPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceCustomBorderColorPropertiesEXT calloc() {
        return new VkPhysicalDeviceCustomBorderColorPropertiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceCustomBorderColorPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceCustomBorderColorPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceCustomBorderColorPropertiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceCustomBorderColorPropertiesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceCustomBorderColorPropertiesEXT create(long address) {
        return new VkPhysicalDeviceCustomBorderColorPropertiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceCustomBorderColorPropertiesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceCustomBorderColorPropertiesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCustomBorderColorPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCustomBorderColorPropertiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCustomBorderColorPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCustomBorderColorPropertiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCustomBorderColorPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCustomBorderColorPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceCustomBorderColorPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCustomBorderColorPropertiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceCustomBorderColorPropertiesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceCustomBorderColorPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceCustomBorderColorPropertiesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceCustomBorderColorPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceCustomBorderColorPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceCustomBorderColorPropertiesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceCustomBorderColorPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCustomBorderColorPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCustomBorderColorPropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCustomBorderColorPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCustomBorderColorPropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceCustomBorderColorPropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceCustomBorderColorPropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #maxCustomBorderColorSamplers}. */
    public static int nmaxCustomBorderColorSamplers(long struct) { return memGetInt(struct + VkPhysicalDeviceCustomBorderColorPropertiesEXT.MAXCUSTOMBORDERCOLORSAMPLERS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceCustomBorderColorPropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceCustomBorderColorPropertiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceCustomBorderColorPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceCustomBorderColorPropertiesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceCustomBorderColorPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceCustomBorderColorPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceCustomBorderColorPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceCustomBorderColorPropertiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceCustomBorderColorPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceCustomBorderColorPropertiesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceCustomBorderColorPropertiesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceCustomBorderColorPropertiesEXT#maxCustomBorderColorSamplers} field. */
        @NativeType("uint32_t")
        public int maxCustomBorderColorSamplers() { return VkPhysicalDeviceCustomBorderColorPropertiesEXT.nmaxCustomBorderColorSamplers(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceCustomBorderColorPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceCustomBorderColorPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTCustomBorderColor#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_BORDER_COLOR_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_BORDER_COLOR_PROPERTIES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceCustomBorderColorPropertiesEXT.Buffer sType$Default() { return sType(EXTCustomBorderColor.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_BORDER_COLOR_PROPERTIES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceCustomBorderColorPropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceCustomBorderColorPropertiesEXT.npNext(address(), value); return this; }

    }

}