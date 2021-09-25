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
 * Describe a device event to create.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDisplayControl#VK_STRUCTURE_TYPE_DEVICE_EVENT_INFO_EXT STRUCTURE_TYPE_DEVICE_EVENT_INFO_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code deviceEvent} <b>must</b> be a valid {@code VkDeviceEventTypeEXT} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link EXTDisplayControl#vkRegisterDeviceEventEXT RegisterDeviceEventEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDeviceEventInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkDeviceEventTypeEXT deviceEvent;
 * }</code></pre>
 */
public class VkDeviceEventInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DEVICEEVENT;

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
        DEVICEEVENT = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkDeviceEventInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceEventInfoEXT(ByteBuffer container) {
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
    /** @return the value of the {@code deviceEvent} field. */
    @NativeType("VkDeviceEventTypeEXT")
    public int deviceEvent() { return ndeviceEvent(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkDeviceEventInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDisplayControl#VK_STRUCTURE_TYPE_DEVICE_EVENT_INFO_EXT STRUCTURE_TYPE_DEVICE_EVENT_INFO_EXT} value to the {@link #sType} field. */
    public VkDeviceEventInfoEXT sType$Default() { return sType(EXTDisplayControl.VK_STRUCTURE_TYPE_DEVICE_EVENT_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDeviceEventInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code deviceEvent} field. */
    public VkDeviceEventInfoEXT deviceEvent(@NativeType("VkDeviceEventTypeEXT") int value) { ndeviceEvent(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDeviceEventInfoEXT set(
        int sType,
        long pNext,
        int deviceEvent
    ) {
        sType(sType);
        pNext(pNext);
        deviceEvent(deviceEvent);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceEventInfoEXT set(VkDeviceEventInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceEventInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceEventInfoEXT malloc() {
        return wrap(VkDeviceEventInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDeviceEventInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceEventInfoEXT calloc() {
        return wrap(VkDeviceEventInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDeviceEventInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkDeviceEventInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDeviceEventInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceEventInfoEXT} instance for the specified memory address. */
    public static VkDeviceEventInfoEXT create(long address) {
        return wrap(VkDeviceEventInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceEventInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkDeviceEventInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkDeviceEventInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceEventInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceEventInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceEventInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceEventInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceEventInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDeviceEventInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceEventInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceEventInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceEventInfoEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceEventInfoEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceEventInfoEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceEventInfoEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceEventInfoEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceEventInfoEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceEventInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceEventInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDeviceEventInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceEventInfoEXT malloc(MemoryStack stack) {
        return wrap(VkDeviceEventInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDeviceEventInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceEventInfoEXT calloc(MemoryStack stack) {
        return wrap(VkDeviceEventInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDeviceEventInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceEventInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceEventInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceEventInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDeviceEventInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDeviceEventInfoEXT.PNEXT); }
    /** Unsafe version of {@link #deviceEvent}. */
    public static int ndeviceEvent(long struct) { return UNSAFE.getInt(null, struct + VkDeviceEventInfoEXT.DEVICEEVENT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceEventInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDeviceEventInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #deviceEvent(int) deviceEvent}. */
    public static void ndeviceEvent(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceEventInfoEXT.DEVICEEVENT, value); }

    // -----------------------------------

    /** An array of {@link VkDeviceEventInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkDeviceEventInfoEXT, Buffer> implements NativeResource {

        private static final VkDeviceEventInfoEXT ELEMENT_FACTORY = VkDeviceEventInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkDeviceEventInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceEventInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkDeviceEventInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDeviceEventInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDeviceEventInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkDeviceEventInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDeviceEventInfoEXT.npNext(address()); }
        /** @return the value of the {@code deviceEvent} field. */
        @NativeType("VkDeviceEventTypeEXT")
        public int deviceEvent() { return VkDeviceEventInfoEXT.ndeviceEvent(address()); }

        /** Sets the specified value to the {@link VkDeviceEventInfoEXT#sType} field. */
        public VkDeviceEventInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceEventInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDisplayControl#VK_STRUCTURE_TYPE_DEVICE_EVENT_INFO_EXT STRUCTURE_TYPE_DEVICE_EVENT_INFO_EXT} value to the {@link VkDeviceEventInfoEXT#sType} field. */
        public VkDeviceEventInfoEXT.Buffer sType$Default() { return sType(EXTDisplayControl.VK_STRUCTURE_TYPE_DEVICE_EVENT_INFO_EXT); }
        /** Sets the specified value to the {@link VkDeviceEventInfoEXT#pNext} field. */
        public VkDeviceEventInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkDeviceEventInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code deviceEvent} field. */
        public VkDeviceEventInfoEXT.Buffer deviceEvent(@NativeType("VkDeviceEventTypeEXT") int value) { VkDeviceEventInfoEXT.ndeviceEvent(address(), value); return this; }

    }

}