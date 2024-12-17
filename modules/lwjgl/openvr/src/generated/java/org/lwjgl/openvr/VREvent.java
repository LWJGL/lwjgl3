/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VREvent_t {
 *     uint32_t eventType;
 *     TrackedDeviceIndex_t trackedDeviceIndex;
 *     float eventAgeSeconds;
 *     {@link VREventData VREvent_Data_t} data;
 * }}</pre>
 */
@NativeType("struct VREvent_t")
public class VREvent extends Struct<VREvent> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        EVENTTYPE,
        TRACKEDDEVICEINDEX,
        EVENTAGESECONDS,
        DATA;

    static {
        Layout layout = __struct(
            Platform.get() == Platform.LINUX || Platform.get() == Platform.MACOSX ? 4 : DEFAULT_PACK_ALIGNMENT, DEFAULT_ALIGN_AS,
            __member(4),
            __member(4),
            __member(4),
            __member(VREventData.SIZEOF, VREventData.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        EVENTTYPE = layout.offsetof(0);
        TRACKEDDEVICEINDEX = layout.offsetof(1);
        EVENTAGESECONDS = layout.offsetof(2);
        DATA = layout.offsetof(3);
    }

    protected VREvent(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VREvent create(long address, @Nullable ByteBuffer container) {
        return new VREvent(address, container);
    }

    /**
     * Creates a {@code VREvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREvent(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code eventType} field. */
    @NativeType("uint32_t")
    public int eventType() { return neventType(address()); }
    /** @return the value of the {@code trackedDeviceIndex} field. */
    @NativeType("TrackedDeviceIndex_t")
    public int trackedDeviceIndex() { return ntrackedDeviceIndex(address()); }
    /** @return the value of the {@code eventAgeSeconds} field. */
    public float eventAgeSeconds() { return neventAgeSeconds(address()); }
    /** @return a {@link VREventData} view of the {@code data} field. */
    @NativeType("VREvent_Data_t")
    public VREventData data() { return ndata(address()); }

    // -----------------------------------

    /** Returns a new {@code VREvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VREvent malloc() {
        return new VREvent(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VREvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VREvent calloc() {
        return new VREvent(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VREvent} instance allocated with {@link BufferUtils}. */
    public static VREvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VREvent(memAddress(container), container);
    }

    /** Returns a new {@code VREvent} instance for the specified memory address. */
    public static VREvent create(long address) {
        return new VREvent(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VREvent createSafe(long address) {
        return address == NULL ? null : new VREvent(address, null);
    }

    /**
     * Returns a new {@link VREvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VREvent.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VREvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VREvent.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VREvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VREvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VREvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VREvent.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VREvent.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VREvent mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VREvent callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VREvent mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VREvent callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VREvent.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VREvent.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VREvent.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VREvent.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VREvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VREvent malloc(MemoryStack stack) {
        return new VREvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VREvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VREvent calloc(MemoryStack stack) {
        return new VREvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VREvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VREvent.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VREvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VREvent.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #eventType}. */
    public static int neventType(long struct) { return memGetInt(struct + VREvent.EVENTTYPE); }
    /** Unsafe version of {@link #trackedDeviceIndex}. */
    public static int ntrackedDeviceIndex(long struct) { return memGetInt(struct + VREvent.TRACKEDDEVICEINDEX); }
    /** Unsafe version of {@link #eventAgeSeconds}. */
    public static float neventAgeSeconds(long struct) { return memGetFloat(struct + VREvent.EVENTAGESECONDS); }
    /** Unsafe version of {@link #data}. */
    public static VREventData ndata(long struct) { return VREventData.create(struct + VREvent.DATA); }

    // -----------------------------------

    /** An array of {@link VREvent} structs. */
    public static class Buffer extends StructBuffer<VREvent, Buffer> implements NativeResource {

        private static final VREvent ELEMENT_FACTORY = VREvent.create(-1L);

        /**
         * Creates a new {@code VREvent.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VREvent#SIZEOF}, and its mark will be undefined.</p>
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
        protected VREvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code eventType} field. */
        @NativeType("uint32_t")
        public int eventType() { return VREvent.neventType(address()); }
        /** @return the value of the {@code trackedDeviceIndex} field. */
        @NativeType("TrackedDeviceIndex_t")
        public int trackedDeviceIndex() { return VREvent.ntrackedDeviceIndex(address()); }
        /** @return the value of the {@code eventAgeSeconds} field. */
        public float eventAgeSeconds() { return VREvent.neventAgeSeconds(address()); }
        /** @return a {@link VREventData} view of the {@code data} field. */
        @NativeType("VREvent_Data_t")
        public VREventData data() { return VREvent.ndata(address()); }

    }

}