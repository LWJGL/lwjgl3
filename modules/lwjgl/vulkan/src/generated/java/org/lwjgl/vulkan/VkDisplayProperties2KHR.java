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
 * Structure describing an available display device.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRGetDisplayProperties2#VK_STRUCTURE_TYPE_DISPLAY_PROPERTIES_2_KHR STRUCTURE_TYPE_DISPLAY_PROPERTIES_2_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDisplayPropertiesKHR}, {@link KHRGetDisplayProperties2#vkGetPhysicalDeviceDisplayProperties2KHR GetPhysicalDeviceDisplayProperties2KHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDisplayProperties2KHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     {@link VkDisplayPropertiesKHR VkDisplayPropertiesKHR} {@link #displayProperties};
 * }</code></pre>
 */
public class VkDisplayProperties2KHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DISPLAYPROPERTIES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkDisplayPropertiesKHR.SIZEOF, VkDisplayPropertiesKHR.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DISPLAYPROPERTIES = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkDisplayProperties2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDisplayProperties2KHR(ByteBuffer container) {
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
    /** a {@link VkDisplayPropertiesKHR} structure. */
    public VkDisplayPropertiesKHR displayProperties() { return ndisplayProperties(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkDisplayProperties2KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRGetDisplayProperties2#VK_STRUCTURE_TYPE_DISPLAY_PROPERTIES_2_KHR STRUCTURE_TYPE_DISPLAY_PROPERTIES_2_KHR} value to the {@link #sType} field. */
    public VkDisplayProperties2KHR sType$Default() { return sType(KHRGetDisplayProperties2.VK_STRUCTURE_TYPE_DISPLAY_PROPERTIES_2_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDisplayProperties2KHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDisplayProperties2KHR set(
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
    public VkDisplayProperties2KHR set(VkDisplayProperties2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDisplayProperties2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDisplayProperties2KHR malloc() {
        return wrap(VkDisplayProperties2KHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDisplayProperties2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDisplayProperties2KHR calloc() {
        return wrap(VkDisplayProperties2KHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDisplayProperties2KHR} instance allocated with {@link BufferUtils}. */
    public static VkDisplayProperties2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDisplayProperties2KHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDisplayProperties2KHR} instance for the specified memory address. */
    public static VkDisplayProperties2KHR create(long address) {
        return wrap(VkDisplayProperties2KHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDisplayProperties2KHR createSafe(long address) {
        return address == NULL ? null : wrap(VkDisplayProperties2KHR.class, address);
    }

    /**
     * Returns a new {@link VkDisplayProperties2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayProperties2KHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDisplayProperties2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayProperties2KHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDisplayProperties2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayProperties2KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDisplayProperties2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDisplayProperties2KHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDisplayProperties2KHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDisplayProperties2KHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDisplayProperties2KHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDisplayProperties2KHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDisplayProperties2KHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDisplayProperties2KHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDisplayProperties2KHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDisplayProperties2KHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDisplayProperties2KHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDisplayProperties2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDisplayProperties2KHR malloc(MemoryStack stack) {
        return wrap(VkDisplayProperties2KHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDisplayProperties2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDisplayProperties2KHR calloc(MemoryStack stack) {
        return wrap(VkDisplayProperties2KHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDisplayProperties2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDisplayProperties2KHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDisplayProperties2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDisplayProperties2KHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDisplayProperties2KHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDisplayProperties2KHR.PNEXT); }
    /** Unsafe version of {@link #displayProperties}. */
    public static VkDisplayPropertiesKHR ndisplayProperties(long struct) { return VkDisplayPropertiesKHR.create(struct + VkDisplayProperties2KHR.DISPLAYPROPERTIES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDisplayProperties2KHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDisplayProperties2KHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkDisplayProperties2KHR} structs. */
    public static class Buffer extends StructBuffer<VkDisplayProperties2KHR, Buffer> implements NativeResource {

        private static final VkDisplayProperties2KHR ELEMENT_FACTORY = VkDisplayProperties2KHR.create(-1L);

        /**
         * Creates a new {@code VkDisplayProperties2KHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDisplayProperties2KHR#SIZEOF}, and its mark will be undefined.
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
        protected VkDisplayProperties2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDisplayProperties2KHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDisplayProperties2KHR.nsType(address()); }
        /** @return the value of the {@link VkDisplayProperties2KHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkDisplayProperties2KHR.npNext(address()); }
        /** @return a {@link VkDisplayPropertiesKHR} view of the {@link VkDisplayProperties2KHR#displayProperties} field. */
        public VkDisplayPropertiesKHR displayProperties() { return VkDisplayProperties2KHR.ndisplayProperties(address()); }

        /** Sets the specified value to the {@link VkDisplayProperties2KHR#sType} field. */
        public VkDisplayProperties2KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkDisplayProperties2KHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRGetDisplayProperties2#VK_STRUCTURE_TYPE_DISPLAY_PROPERTIES_2_KHR STRUCTURE_TYPE_DISPLAY_PROPERTIES_2_KHR} value to the {@link VkDisplayProperties2KHR#sType} field. */
        public VkDisplayProperties2KHR.Buffer sType$Default() { return sType(KHRGetDisplayProperties2.VK_STRUCTURE_TYPE_DISPLAY_PROPERTIES_2_KHR); }
        /** Sets the specified value to the {@link VkDisplayProperties2KHR#pNext} field. */
        public VkDisplayProperties2KHR.Buffer pNext(@NativeType("void *") long value) { VkDisplayProperties2KHR.npNext(address(), value); return this; }

    }

}