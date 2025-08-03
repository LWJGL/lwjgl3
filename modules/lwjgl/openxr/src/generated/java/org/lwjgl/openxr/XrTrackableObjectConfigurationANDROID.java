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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrTrackableObjectConfigurationANDROID {
 *     XrStructureType type;
 *     void * next;
 *     uint32_t labelCount;
 *     XrObjectLabelANDROID const * activeLabels;
 * }}</pre>
 */
public class XrTrackableObjectConfigurationANDROID extends Struct<XrTrackableObjectConfigurationANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        LABELCOUNT,
        ACTIVELABELS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        LABELCOUNT = layout.offsetof(2);
        ACTIVELABELS = layout.offsetof(3);
    }

    protected XrTrackableObjectConfigurationANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrTrackableObjectConfigurationANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrTrackableObjectConfigurationANDROID(address, container);
    }

    /**
     * Creates a {@code XrTrackableObjectConfigurationANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrTrackableObjectConfigurationANDROID(ByteBuffer container) {
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
    /** @return the value of the {@code labelCount} field. */
    @NativeType("uint32_t")
    public int labelCount() { return nlabelCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code activeLabels} field. */
    @NativeType("XrObjectLabelANDROID const *")
    public IntBuffer activeLabels() { return nactiveLabels(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrTrackableObjectConfigurationANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDTrackablesObject#XR_TYPE_TRACKABLE_OBJECT_CONFIGURATION_ANDROID TYPE_TRACKABLE_OBJECT_CONFIGURATION_ANDROID} value to the {@code type} field. */
    public XrTrackableObjectConfigurationANDROID type$Default() { return type(ANDROIDTrackablesObject.XR_TYPE_TRACKABLE_OBJECT_CONFIGURATION_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrTrackableObjectConfigurationANDROID next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code activeLabels} field. */
    public XrTrackableObjectConfigurationANDROID activeLabels(@NativeType("XrObjectLabelANDROID const *") IntBuffer value) { nactiveLabels(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrTrackableObjectConfigurationANDROID set(
        int type,
        long next,
        IntBuffer activeLabels
    ) {
        type(type);
        next(next);
        activeLabels(activeLabels);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrTrackableObjectConfigurationANDROID set(XrTrackableObjectConfigurationANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrTrackableObjectConfigurationANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrTrackableObjectConfigurationANDROID malloc() {
        return new XrTrackableObjectConfigurationANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrTrackableObjectConfigurationANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrTrackableObjectConfigurationANDROID calloc() {
        return new XrTrackableObjectConfigurationANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrTrackableObjectConfigurationANDROID} instance allocated with {@link BufferUtils}. */
    public static XrTrackableObjectConfigurationANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrTrackableObjectConfigurationANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrTrackableObjectConfigurationANDROID} instance for the specified memory address. */
    public static XrTrackableObjectConfigurationANDROID create(long address) {
        return new XrTrackableObjectConfigurationANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrTrackableObjectConfigurationANDROID createSafe(long address) {
        return address == NULL ? null : new XrTrackableObjectConfigurationANDROID(address, null);
    }

    /**
     * Returns a new {@link XrTrackableObjectConfigurationANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrTrackableObjectConfigurationANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrTrackableObjectConfigurationANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrTrackableObjectConfigurationANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrTrackableObjectConfigurationANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrTrackableObjectConfigurationANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrTrackableObjectConfigurationANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrTrackableObjectConfigurationANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrTrackableObjectConfigurationANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrTrackableObjectConfigurationANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrTrackableObjectConfigurationANDROID malloc(MemoryStack stack) {
        return new XrTrackableObjectConfigurationANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrTrackableObjectConfigurationANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrTrackableObjectConfigurationANDROID calloc(MemoryStack stack) {
        return new XrTrackableObjectConfigurationANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrTrackableObjectConfigurationANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrTrackableObjectConfigurationANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrTrackableObjectConfigurationANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrTrackableObjectConfigurationANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrTrackableObjectConfigurationANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrTrackableObjectConfigurationANDROID.NEXT); }
    /** Unsafe version of {@link #labelCount}. */
    public static int nlabelCount(long struct) { return memGetInt(struct + XrTrackableObjectConfigurationANDROID.LABELCOUNT); }
    /** Unsafe version of {@link #activeLabels() activeLabels}. */
    public static IntBuffer nactiveLabels(long struct) { return memIntBuffer(memGetAddress(struct + XrTrackableObjectConfigurationANDROID.ACTIVELABELS), nlabelCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrTrackableObjectConfigurationANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrTrackableObjectConfigurationANDROID.NEXT, value); }
    /** Sets the specified value to the {@code labelCount} field of the specified {@code struct}. */
    public static void nlabelCount(long struct, int value) { memPutInt(struct + XrTrackableObjectConfigurationANDROID.LABELCOUNT, value); }
    /** Unsafe version of {@link #activeLabels(IntBuffer) activeLabels}. */
    public static void nactiveLabels(long struct, IntBuffer value) { memPutAddress(struct + XrTrackableObjectConfigurationANDROID.ACTIVELABELS, memAddress(value)); nlabelCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrTrackableObjectConfigurationANDROID.ACTIVELABELS));
    }

    // -----------------------------------

    /** An array of {@link XrTrackableObjectConfigurationANDROID} structs. */
    public static class Buffer extends StructBuffer<XrTrackableObjectConfigurationANDROID, Buffer> implements NativeResource {

        private static final XrTrackableObjectConfigurationANDROID ELEMENT_FACTORY = XrTrackableObjectConfigurationANDROID.create(-1L);

        /**
         * Creates a new {@code XrTrackableObjectConfigurationANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrTrackableObjectConfigurationANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrTrackableObjectConfigurationANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrTrackableObjectConfigurationANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrTrackableObjectConfigurationANDROID.nnext(address()); }
        /** @return the value of the {@code labelCount} field. */
        @NativeType("uint32_t")
        public int labelCount() { return XrTrackableObjectConfigurationANDROID.nlabelCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code activeLabels} field. */
        @NativeType("XrObjectLabelANDROID const *")
        public IntBuffer activeLabels() { return XrTrackableObjectConfigurationANDROID.nactiveLabels(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrTrackableObjectConfigurationANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrTrackableObjectConfigurationANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDTrackablesObject#XR_TYPE_TRACKABLE_OBJECT_CONFIGURATION_ANDROID TYPE_TRACKABLE_OBJECT_CONFIGURATION_ANDROID} value to the {@code type} field. */
        public XrTrackableObjectConfigurationANDROID.Buffer type$Default() { return type(ANDROIDTrackablesObject.XR_TYPE_TRACKABLE_OBJECT_CONFIGURATION_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrTrackableObjectConfigurationANDROID.Buffer next(@NativeType("void *") long value) { XrTrackableObjectConfigurationANDROID.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code activeLabels} field. */
        public XrTrackableObjectConfigurationANDROID.Buffer activeLabels(@NativeType("XrObjectLabelANDROID const *") IntBuffer value) { XrTrackableObjectConfigurationANDROID.nactiveLabels(address(), value); return this; }

    }

}