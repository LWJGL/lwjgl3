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
 * Structure describing an available display plane.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRGetDisplayProperties2#VK_STRUCTURE_TYPE_DISPLAY_PLANE_PROPERTIES_2_KHR STRUCTURE_TYPE_DISPLAY_PLANE_PROPERTIES_2_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDisplayPlanePropertiesKHR}, {@link KHRGetDisplayProperties2#vkGetPhysicalDeviceDisplayPlaneProperties2KHR GetPhysicalDeviceDisplayPlaneProperties2KHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDisplayPlaneProperties2KHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     {@link VkDisplayPlanePropertiesKHR VkDisplayPlanePropertiesKHR} {@link #displayPlaneProperties};
 * }</code></pre>
 */
public class VkDisplayPlaneProperties2KHR extends Struct<VkDisplayPlaneProperties2KHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DISPLAYPLANEPROPERTIES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkDisplayPlanePropertiesKHR.SIZEOF, VkDisplayPlanePropertiesKHR.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DISPLAYPLANEPROPERTIES = layout.offsetof(2);
    }

    protected VkDisplayPlaneProperties2KHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDisplayPlaneProperties2KHR create(long address, @Nullable ByteBuffer container) {
        return new VkDisplayPlaneProperties2KHR(address, container);
    }

    /**
     * Creates a {@code VkDisplayPlaneProperties2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDisplayPlaneProperties2KHR(ByteBuffer container) {
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
    /** a {@link VkDisplayPlanePropertiesKHR} structure. */
    public VkDisplayPlanePropertiesKHR displayPlaneProperties() { return ndisplayPlaneProperties(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkDisplayPlaneProperties2KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRGetDisplayProperties2#VK_STRUCTURE_TYPE_DISPLAY_PLANE_PROPERTIES_2_KHR STRUCTURE_TYPE_DISPLAY_PLANE_PROPERTIES_2_KHR} value to the {@link #sType} field. */
    public VkDisplayPlaneProperties2KHR sType$Default() { return sType(KHRGetDisplayProperties2.VK_STRUCTURE_TYPE_DISPLAY_PLANE_PROPERTIES_2_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDisplayPlaneProperties2KHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDisplayPlaneProperties2KHR set(
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
    public VkDisplayPlaneProperties2KHR set(VkDisplayPlaneProperties2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDisplayPlaneProperties2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDisplayPlaneProperties2KHR malloc() {
        return new VkDisplayPlaneProperties2KHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDisplayPlaneProperties2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDisplayPlaneProperties2KHR calloc() {
        return new VkDisplayPlaneProperties2KHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDisplayPlaneProperties2KHR} instance allocated with {@link BufferUtils}. */
    public static VkDisplayPlaneProperties2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDisplayPlaneProperties2KHR(memAddress(container), container);
    }

    /** Returns a new {@code VkDisplayPlaneProperties2KHR} instance for the specified memory address. */
    public static VkDisplayPlaneProperties2KHR create(long address) {
        return new VkDisplayPlaneProperties2KHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDisplayPlaneProperties2KHR createSafe(long address) {
        return address == NULL ? null : new VkDisplayPlaneProperties2KHR(address, null);
    }

    /**
     * Returns a new {@link VkDisplayPlaneProperties2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayPlaneProperties2KHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDisplayPlaneProperties2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayPlaneProperties2KHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDisplayPlaneProperties2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayPlaneProperties2KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDisplayPlaneProperties2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDisplayPlaneProperties2KHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDisplayPlaneProperties2KHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDisplayPlaneProperties2KHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDisplayPlaneProperties2KHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDisplayPlaneProperties2KHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDisplayPlaneProperties2KHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDisplayPlaneProperties2KHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDisplayPlaneProperties2KHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDisplayPlaneProperties2KHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDisplayPlaneProperties2KHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDisplayPlaneProperties2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDisplayPlaneProperties2KHR malloc(MemoryStack stack) {
        return new VkDisplayPlaneProperties2KHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDisplayPlaneProperties2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDisplayPlaneProperties2KHR calloc(MemoryStack stack) {
        return new VkDisplayPlaneProperties2KHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDisplayPlaneProperties2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDisplayPlaneProperties2KHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDisplayPlaneProperties2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDisplayPlaneProperties2KHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDisplayPlaneProperties2KHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDisplayPlaneProperties2KHR.PNEXT); }
    /** Unsafe version of {@link #displayPlaneProperties}. */
    public static VkDisplayPlanePropertiesKHR ndisplayPlaneProperties(long struct) { return VkDisplayPlanePropertiesKHR.create(struct + VkDisplayPlaneProperties2KHR.DISPLAYPLANEPROPERTIES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDisplayPlaneProperties2KHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDisplayPlaneProperties2KHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkDisplayPlaneProperties2KHR} structs. */
    public static class Buffer extends StructBuffer<VkDisplayPlaneProperties2KHR, Buffer> implements NativeResource {

        private static final VkDisplayPlaneProperties2KHR ELEMENT_FACTORY = VkDisplayPlaneProperties2KHR.create(-1L);

        /**
         * Creates a new {@code VkDisplayPlaneProperties2KHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDisplayPlaneProperties2KHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDisplayPlaneProperties2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDisplayPlaneProperties2KHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDisplayPlaneProperties2KHR.nsType(address()); }
        /** @return the value of the {@link VkDisplayPlaneProperties2KHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkDisplayPlaneProperties2KHR.npNext(address()); }
        /** @return a {@link VkDisplayPlanePropertiesKHR} view of the {@link VkDisplayPlaneProperties2KHR#displayPlaneProperties} field. */
        public VkDisplayPlanePropertiesKHR displayPlaneProperties() { return VkDisplayPlaneProperties2KHR.ndisplayPlaneProperties(address()); }

        /** Sets the specified value to the {@link VkDisplayPlaneProperties2KHR#sType} field. */
        public VkDisplayPlaneProperties2KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkDisplayPlaneProperties2KHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRGetDisplayProperties2#VK_STRUCTURE_TYPE_DISPLAY_PLANE_PROPERTIES_2_KHR STRUCTURE_TYPE_DISPLAY_PLANE_PROPERTIES_2_KHR} value to the {@link VkDisplayPlaneProperties2KHR#sType} field. */
        public VkDisplayPlaneProperties2KHR.Buffer sType$Default() { return sType(KHRGetDisplayProperties2.VK_STRUCTURE_TYPE_DISPLAY_PLANE_PROPERTIES_2_KHR); }
        /** Sets the specified value to the {@link VkDisplayPlaneProperties2KHR#pNext} field. */
        public VkDisplayPlaneProperties2KHR.Buffer pNext(@NativeType("void *") long value) { VkDisplayPlaneProperties2KHR.npNext(address(), value); return this; }

    }

}