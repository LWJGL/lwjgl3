/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrBatteryStateDisplayEXT {
 *     XrStructureType type;
 *     void * next;
 *     XrBatteryStateDisplayStateFlagsEXT stateFlags;
 *     float batteryLevel;
 * }}</pre>
 */
public class XrBatteryStateDisplayEXT extends Struct<XrBatteryStateDisplayEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        STATEFLAGS,
        BATTERYLEVEL;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        STATEFLAGS = layout.offsetof(2);
        BATTERYLEVEL = layout.offsetof(3);
    }

    protected XrBatteryStateDisplayEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrBatteryStateDisplayEXT create(long address, @Nullable ByteBuffer container) {
        return new XrBatteryStateDisplayEXT(address, container);
    }

    /**
     * Creates a {@code XrBatteryStateDisplayEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrBatteryStateDisplayEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code stateFlags} field. */
    @NativeType("XrBatteryStateDisplayStateFlagsEXT")
    public long stateFlags() { return nstateFlags(address()); }
    /** @return the value of the {@code batteryLevel} field. */
    public float batteryLevel() { return nbatteryLevel(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrBatteryStateDisplayEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTInteractionProfileBatteryStateDisplay#XR_TYPE_BATTERY_STATE_DISPLAY_EXT TYPE_BATTERY_STATE_DISPLAY_EXT} value to the {@code type} field. */
    public XrBatteryStateDisplayEXT type$Default() { return type(EXTInteractionProfileBatteryStateDisplay.XR_TYPE_BATTERY_STATE_DISPLAY_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrBatteryStateDisplayEXT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code stateFlags} field. */
    public XrBatteryStateDisplayEXT stateFlags(@NativeType("XrBatteryStateDisplayStateFlagsEXT") long value) { nstateFlags(address(), value); return this; }
    /** Sets the specified value to the {@code batteryLevel} field. */
    public XrBatteryStateDisplayEXT batteryLevel(float value) { nbatteryLevel(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrBatteryStateDisplayEXT set(
        int type,
        long next,
        long stateFlags,
        float batteryLevel
    ) {
        type(type);
        next(next);
        stateFlags(stateFlags);
        batteryLevel(batteryLevel);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrBatteryStateDisplayEXT set(XrBatteryStateDisplayEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrBatteryStateDisplayEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrBatteryStateDisplayEXT malloc() {
        return new XrBatteryStateDisplayEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrBatteryStateDisplayEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrBatteryStateDisplayEXT calloc() {
        return new XrBatteryStateDisplayEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrBatteryStateDisplayEXT} instance allocated with {@link BufferUtils}. */
    public static XrBatteryStateDisplayEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrBatteryStateDisplayEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrBatteryStateDisplayEXT} instance for the specified memory address. */
    public static XrBatteryStateDisplayEXT create(long address) {
        return new XrBatteryStateDisplayEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrBatteryStateDisplayEXT createSafe(long address) {
        return address == NULL ? null : new XrBatteryStateDisplayEXT(address, null);
    }

    /**
     * Returns a new {@link XrBatteryStateDisplayEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBatteryStateDisplayEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrBatteryStateDisplayEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBatteryStateDisplayEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBatteryStateDisplayEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrBatteryStateDisplayEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrBatteryStateDisplayEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrBatteryStateDisplayEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrBatteryStateDisplayEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrBatteryStateDisplayEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBatteryStateDisplayEXT malloc(MemoryStack stack) {
        return new XrBatteryStateDisplayEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrBatteryStateDisplayEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBatteryStateDisplayEXT calloc(MemoryStack stack) {
        return new XrBatteryStateDisplayEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrBatteryStateDisplayEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBatteryStateDisplayEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBatteryStateDisplayEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBatteryStateDisplayEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrBatteryStateDisplayEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrBatteryStateDisplayEXT.NEXT); }
    /** Unsafe version of {@link #stateFlags}. */
    public static long nstateFlags(long struct) { return memGetLong(struct + XrBatteryStateDisplayEXT.STATEFLAGS); }
    /** Unsafe version of {@link #batteryLevel}. */
    public static float nbatteryLevel(long struct) { return memGetFloat(struct + XrBatteryStateDisplayEXT.BATTERYLEVEL); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrBatteryStateDisplayEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrBatteryStateDisplayEXT.NEXT, value); }
    /** Unsafe version of {@link #stateFlags(long) stateFlags}. */
    public static void nstateFlags(long struct, long value) { memPutLong(struct + XrBatteryStateDisplayEXT.STATEFLAGS, value); }
    /** Unsafe version of {@link #batteryLevel(float) batteryLevel}. */
    public static void nbatteryLevel(long struct, float value) { memPutFloat(struct + XrBatteryStateDisplayEXT.BATTERYLEVEL, value); }

    // -----------------------------------

    /** An array of {@link XrBatteryStateDisplayEXT} structs. */
    public static class Buffer extends StructBuffer<XrBatteryStateDisplayEXT, Buffer> implements NativeResource {

        private static final XrBatteryStateDisplayEXT ELEMENT_FACTORY = XrBatteryStateDisplayEXT.create(-1L);

        /**
         * Creates a new {@code XrBatteryStateDisplayEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrBatteryStateDisplayEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrBatteryStateDisplayEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrBatteryStateDisplayEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrBatteryStateDisplayEXT.nnext(address()); }
        /** @return the value of the {@code stateFlags} field. */
        @NativeType("XrBatteryStateDisplayStateFlagsEXT")
        public long stateFlags() { return XrBatteryStateDisplayEXT.nstateFlags(address()); }
        /** @return the value of the {@code batteryLevel} field. */
        public float batteryLevel() { return XrBatteryStateDisplayEXT.nbatteryLevel(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrBatteryStateDisplayEXT.Buffer type(@NativeType("XrStructureType") int value) { XrBatteryStateDisplayEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTInteractionProfileBatteryStateDisplay#XR_TYPE_BATTERY_STATE_DISPLAY_EXT TYPE_BATTERY_STATE_DISPLAY_EXT} value to the {@code type} field. */
        public XrBatteryStateDisplayEXT.Buffer type$Default() { return type(EXTInteractionProfileBatteryStateDisplay.XR_TYPE_BATTERY_STATE_DISPLAY_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrBatteryStateDisplayEXT.Buffer next(@NativeType("void *") long value) { XrBatteryStateDisplayEXT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code stateFlags} field. */
        public XrBatteryStateDisplayEXT.Buffer stateFlags(@NativeType("XrBatteryStateDisplayStateFlagsEXT") long value) { XrBatteryStateDisplayEXT.nstateFlags(address(), value); return this; }
        /** Sets the specified value to the {@code batteryLevel} field. */
        public XrBatteryStateDisplayEXT.Buffer batteryLevel(float value) { XrBatteryStateDisplayEXT.nbatteryLevel(address(), value); return this; }

    }

}