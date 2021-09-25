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
 * Describe a display event to create.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDisplayControl#VK_STRUCTURE_TYPE_DISPLAY_EVENT_INFO_EXT STRUCTURE_TYPE_DISPLAY_EVENT_INFO_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code displayEvent} <b>must</b> be a valid {@code VkDisplayEventTypeEXT} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link EXTDisplayControl#vkRegisterDisplayEventEXT RegisterDisplayEventEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDisplayEventInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkDisplayEventTypeEXT {@link #displayEvent};
 * }</code></pre>
 */
public class VkDisplayEventInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DISPLAYEVENT;

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
        DISPLAYEVENT = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkDisplayEventInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDisplayEventInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** a {@code VkDisplayEventTypeEXT} specifying when the fence will be signaled. */
    @NativeType("VkDisplayEventTypeEXT")
    public int displayEvent() { return ndisplayEvent(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkDisplayEventInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDisplayControl#VK_STRUCTURE_TYPE_DISPLAY_EVENT_INFO_EXT STRUCTURE_TYPE_DISPLAY_EVENT_INFO_EXT} value to the {@link #sType} field. */
    public VkDisplayEventInfoEXT sType$Default() { return sType(EXTDisplayControl.VK_STRUCTURE_TYPE_DISPLAY_EVENT_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDisplayEventInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #displayEvent} field. */
    public VkDisplayEventInfoEXT displayEvent(@NativeType("VkDisplayEventTypeEXT") int value) { ndisplayEvent(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDisplayEventInfoEXT set(
        int sType,
        long pNext,
        int displayEvent
    ) {
        sType(sType);
        pNext(pNext);
        displayEvent(displayEvent);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDisplayEventInfoEXT set(VkDisplayEventInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDisplayEventInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDisplayEventInfoEXT malloc() {
        return wrap(VkDisplayEventInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDisplayEventInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDisplayEventInfoEXT calloc() {
        return wrap(VkDisplayEventInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDisplayEventInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkDisplayEventInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDisplayEventInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDisplayEventInfoEXT} instance for the specified memory address. */
    public static VkDisplayEventInfoEXT create(long address) {
        return wrap(VkDisplayEventInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDisplayEventInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkDisplayEventInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkDisplayEventInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayEventInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDisplayEventInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayEventInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDisplayEventInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayEventInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDisplayEventInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDisplayEventInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDisplayEventInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDisplayEventInfoEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDisplayEventInfoEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDisplayEventInfoEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDisplayEventInfoEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDisplayEventInfoEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDisplayEventInfoEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDisplayEventInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDisplayEventInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDisplayEventInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDisplayEventInfoEXT malloc(MemoryStack stack) {
        return wrap(VkDisplayEventInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDisplayEventInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDisplayEventInfoEXT calloc(MemoryStack stack) {
        return wrap(VkDisplayEventInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDisplayEventInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDisplayEventInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDisplayEventInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDisplayEventInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDisplayEventInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDisplayEventInfoEXT.PNEXT); }
    /** Unsafe version of {@link #displayEvent}. */
    public static int ndisplayEvent(long struct) { return UNSAFE.getInt(null, struct + VkDisplayEventInfoEXT.DISPLAYEVENT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDisplayEventInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDisplayEventInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #displayEvent(int) displayEvent}. */
    public static void ndisplayEvent(long struct, int value) { UNSAFE.putInt(null, struct + VkDisplayEventInfoEXT.DISPLAYEVENT, value); }

    // -----------------------------------

    /** An array of {@link VkDisplayEventInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkDisplayEventInfoEXT, Buffer> implements NativeResource {

        private static final VkDisplayEventInfoEXT ELEMENT_FACTORY = VkDisplayEventInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkDisplayEventInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDisplayEventInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkDisplayEventInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDisplayEventInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDisplayEventInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkDisplayEventInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDisplayEventInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkDisplayEventInfoEXT#displayEvent} field. */
        @NativeType("VkDisplayEventTypeEXT")
        public int displayEvent() { return VkDisplayEventInfoEXT.ndisplayEvent(address()); }

        /** Sets the specified value to the {@link VkDisplayEventInfoEXT#sType} field. */
        public VkDisplayEventInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkDisplayEventInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDisplayControl#VK_STRUCTURE_TYPE_DISPLAY_EVENT_INFO_EXT STRUCTURE_TYPE_DISPLAY_EVENT_INFO_EXT} value to the {@link VkDisplayEventInfoEXT#sType} field. */
        public VkDisplayEventInfoEXT.Buffer sType$Default() { return sType(EXTDisplayControl.VK_STRUCTURE_TYPE_DISPLAY_EVENT_INFO_EXT); }
        /** Sets the specified value to the {@link VkDisplayEventInfoEXT#pNext} field. */
        public VkDisplayEventInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkDisplayEventInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkDisplayEventInfoEXT#displayEvent} field. */
        public VkDisplayEventInfoEXT.Buffer displayEvent(@NativeType("VkDisplayEventTypeEXT") int value) { VkDisplayEventInfoEXT.ndisplayEvent(address(), value); return this; }

    }

}