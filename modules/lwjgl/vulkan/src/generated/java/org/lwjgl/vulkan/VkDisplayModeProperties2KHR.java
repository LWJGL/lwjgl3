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
 * Structure describing an available display mode.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRGetDisplayProperties2#VK_STRUCTURE_TYPE_DISPLAY_MODE_PROPERTIES_2_KHR STRUCTURE_TYPE_DISPLAY_MODE_PROPERTIES_2_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDisplayModePropertiesKHR}, {@link KHRGetDisplayProperties2#vkGetDisplayModeProperties2KHR GetDisplayModeProperties2KHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDisplayModeProperties2KHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     {@link VkDisplayModePropertiesKHR VkDisplayModePropertiesKHR} {@link #displayModeProperties};
 * }</code></pre>
 */
public class VkDisplayModeProperties2KHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DISPLAYMODEPROPERTIES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkDisplayModePropertiesKHR.SIZEOF, VkDisplayModePropertiesKHR.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DISPLAYMODEPROPERTIES = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkDisplayModeProperties2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDisplayModeProperties2KHR(ByteBuffer container) {
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
    /** a {@link VkDisplayModePropertiesKHR} structure. */
    public VkDisplayModePropertiesKHR displayModeProperties() { return ndisplayModeProperties(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkDisplayModeProperties2KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRGetDisplayProperties2#VK_STRUCTURE_TYPE_DISPLAY_MODE_PROPERTIES_2_KHR STRUCTURE_TYPE_DISPLAY_MODE_PROPERTIES_2_KHR} value to the {@link #sType} field. */
    public VkDisplayModeProperties2KHR sType$Default() { return sType(KHRGetDisplayProperties2.VK_STRUCTURE_TYPE_DISPLAY_MODE_PROPERTIES_2_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDisplayModeProperties2KHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDisplayModeProperties2KHR set(
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
    public VkDisplayModeProperties2KHR set(VkDisplayModeProperties2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDisplayModeProperties2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDisplayModeProperties2KHR malloc() {
        return wrap(VkDisplayModeProperties2KHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDisplayModeProperties2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDisplayModeProperties2KHR calloc() {
        return wrap(VkDisplayModeProperties2KHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDisplayModeProperties2KHR} instance allocated with {@link BufferUtils}. */
    public static VkDisplayModeProperties2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDisplayModeProperties2KHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDisplayModeProperties2KHR} instance for the specified memory address. */
    public static VkDisplayModeProperties2KHR create(long address) {
        return wrap(VkDisplayModeProperties2KHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDisplayModeProperties2KHR createSafe(long address) {
        return address == NULL ? null : wrap(VkDisplayModeProperties2KHR.class, address);
    }

    /**
     * Returns a new {@link VkDisplayModeProperties2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayModeProperties2KHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDisplayModeProperties2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayModeProperties2KHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDisplayModeProperties2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayModeProperties2KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDisplayModeProperties2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDisplayModeProperties2KHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDisplayModeProperties2KHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDisplayModeProperties2KHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDisplayModeProperties2KHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDisplayModeProperties2KHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDisplayModeProperties2KHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDisplayModeProperties2KHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDisplayModeProperties2KHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDisplayModeProperties2KHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDisplayModeProperties2KHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDisplayModeProperties2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDisplayModeProperties2KHR malloc(MemoryStack stack) {
        return wrap(VkDisplayModeProperties2KHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDisplayModeProperties2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDisplayModeProperties2KHR calloc(MemoryStack stack) {
        return wrap(VkDisplayModeProperties2KHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDisplayModeProperties2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDisplayModeProperties2KHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDisplayModeProperties2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDisplayModeProperties2KHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDisplayModeProperties2KHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDisplayModeProperties2KHR.PNEXT); }
    /** Unsafe version of {@link #displayModeProperties}. */
    public static VkDisplayModePropertiesKHR ndisplayModeProperties(long struct) { return VkDisplayModePropertiesKHR.create(struct + VkDisplayModeProperties2KHR.DISPLAYMODEPROPERTIES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDisplayModeProperties2KHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDisplayModeProperties2KHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkDisplayModeProperties2KHR} structs. */
    public static class Buffer extends StructBuffer<VkDisplayModeProperties2KHR, Buffer> implements NativeResource {

        private static final VkDisplayModeProperties2KHR ELEMENT_FACTORY = VkDisplayModeProperties2KHR.create(-1L);

        /**
         * Creates a new {@code VkDisplayModeProperties2KHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDisplayModeProperties2KHR#SIZEOF}, and its mark will be undefined.
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
        protected VkDisplayModeProperties2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDisplayModeProperties2KHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDisplayModeProperties2KHR.nsType(address()); }
        /** @return the value of the {@link VkDisplayModeProperties2KHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkDisplayModeProperties2KHR.npNext(address()); }
        /** @return a {@link VkDisplayModePropertiesKHR} view of the {@link VkDisplayModeProperties2KHR#displayModeProperties} field. */
        public VkDisplayModePropertiesKHR displayModeProperties() { return VkDisplayModeProperties2KHR.ndisplayModeProperties(address()); }

        /** Sets the specified value to the {@link VkDisplayModeProperties2KHR#sType} field. */
        public VkDisplayModeProperties2KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkDisplayModeProperties2KHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRGetDisplayProperties2#VK_STRUCTURE_TYPE_DISPLAY_MODE_PROPERTIES_2_KHR STRUCTURE_TYPE_DISPLAY_MODE_PROPERTIES_2_KHR} value to the {@link VkDisplayModeProperties2KHR#sType} field. */
        public VkDisplayModeProperties2KHR.Buffer sType$Default() { return sType(KHRGetDisplayProperties2.VK_STRUCTURE_TYPE_DISPLAY_MODE_PROPERTIES_2_KHR); }
        /** Sets the specified value to the {@link VkDisplayModeProperties2KHR#pNext} field. */
        public VkDisplayModeProperties2KHR.Buffer pNext(@NativeType("void *") long value) { VkDisplayModeProperties2KHR.npNext(address(), value); return this; }

    }

}